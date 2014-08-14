
package views.html.account

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object userProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.User,models.SnipCollection,models.SniplistCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, mySnips: models.SnipCollection, mySniplists: models.SniplistCollection, userProfile: models.User, userSnips: models.SnipCollection, userSniplists: models.SniplistCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
        <div class="row inline">
            <img src=""""),_display_(Seq[Any](/*5.24*/routes/*5.30*/.Application.getImage(String.valueOf(userProfile.photo)))),format.raw/*5.86*/("""" class="avatar img-circle img-thumbnail" alt="avatar" width="100" height="100">
            <h1 style="display: inline-block;">"""),_display_(Seq[Any](/*6.49*/userProfile/*6.60*/.name)),format.raw/*6.65*/("""
                """),_display_(Seq[Any](/*7.18*/if(!localUser.id.equals(userProfile.id))/*7.58*/ {_display_(Seq[Any](format.raw/*7.60*/("""
                    """),_display_(Seq[Any](/*8.22*/if(localUser.following != null && localUser.following.contains(userProfile.id))/*8.101*/ {_display_(Seq[Any](format.raw/*8.103*/("""
                        <button type="button" class="btn btn-success follow-user-btn" value=""""),_display_(Seq[Any](/*9.95*/userProfile/*9.106*/.id.toString())),format.raw/*9.120*/("""">
                            Following</button>
                    """)))}/*11.23*/else/*11.28*/{_display_(Seq[Any](format.raw/*11.29*/("""
                        <button type="button" class="btn btn-primary follow-user-btn" value=""""),_display_(Seq[Any](/*12.95*/userProfile/*12.106*/.id.toString())),format.raw/*12.120*/("""">
                            Follow</button>
                    """)))})),format.raw/*14.22*/("""
                """)))})),format.raw/*15.18*/("""
            </h1>
        </div>
        <div class="row">
            <h2>Snips</h2>
            """),_display_(Seq[Any](/*20.14*/snip/*20.18*/.arraySnips(true, localUser, userSnips))),format.raw/*20.57*/("""
        </div>
        <div class="row">
            <h2>Sniplists</h2>
            """),_display_(Seq[Any](/*24.14*/views/*24.19*/.html.sniplist.arraySniplists(true, localUser, mySnips, mySniplists, userSniplists))),format.raw/*24.102*/("""
        </div>
""")))};
Seq[Any](format.raw/*1.230*/("""

"""),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/if(!js)/*28.9*/ {_display_(Seq[Any](format.raw/*28.11*/("""
    """),_display_(Seq[Any](/*29.6*/main("User Profile", "userProfile")/*29.41*/(content))),format.raw/*29.50*/("""
""")))}/*30.3*/else/*30.8*/{_display_(Seq[Any](format.raw/*30.9*/("""
    """),_display_(Seq[Any](/*31.6*/content)),format.raw/*31.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userProfile:models.User,userSnips:models.SnipCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.User,models.SnipCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists) => apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 14 01:48:49 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/userProfile.scala.html
                    HASH: c76dc9f32a2760b181d94ec8e9c4fb3dffc863db
                    MATRIX: 919->1|1224->232|1238->239|1322->243|1414->300|1428->306|1505->362|1669->491|1688->502|1714->507|1767->525|1815->565|1854->567|1911->589|1999->668|2039->670|2169->765|2189->776|2225->790|2315->862|2328->867|2367->868|2498->963|2519->974|2556->988|2656->1056|2706->1074|2842->1174|2855->1178|2916->1217|3038->1303|3052->1308|3158->1391|3215->229|3244->1408|3282->1411|3297->1418|3337->1420|3378->1426|3422->1461|3453->1470|3473->1473|3485->1478|3523->1479|3564->1485|3593->1492
                    LINES: 26->1|28->3|28->3|30->3|32->5|32->5|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|38->11|38->11|38->11|39->12|39->12|39->12|41->14|42->15|47->20|47->20|47->20|51->24|51->24|51->24|54->1|56->26|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31
                    -- GENERATED --
                */
            