
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
    <div class="container mtb">
        <div class="row inline">
            <h1 style="display: inline-block;">"""),_display_(Seq[Any](/*6.49*/userProfile/*6.60*/.name)),format.raw/*6.65*/("""
                """),_display_(Seq[Any](/*7.18*/if(localUser.id.eq(userProfile.id))/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""
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
    </div>

""")))};
Seq[Any](format.raw/*1.230*/("""

"""),format.raw/*28.2*/("""

"""),_display_(Seq[Any](/*30.2*/if(!js)/*30.9*/ {_display_(Seq[Any](format.raw/*30.11*/("""
    """),_display_(Seq[Any](/*31.6*/main("User Profile", "userProfile")/*31.41*/(content))),format.raw/*31.50*/("""
""")))}/*32.3*/else/*32.8*/{_display_(Seq[Any](format.raw/*32.9*/("""
    """),_display_(Seq[Any](/*33.6*/content)),format.raw/*33.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userProfile:models.User,userSnips:models.SnipCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.User,models.SnipCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists) => apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 18:07:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/userProfile.scala.html
                    HASH: e3534c9325fa7f0acbdbc88a3864530a5ad0595b
                    MATRIX: 919->1|1224->232|1238->239|1322->243|1471->357|1490->368|1516->373|1569->391|1612->426|1651->428|1708->450|1796->529|1836->531|1966->626|1986->637|2022->651|2112->723|2125->728|2164->729|2295->824|2316->835|2353->849|2453->917|2503->935|2639->1035|2652->1039|2713->1078|2835->1164|2849->1169|2955->1252|3024->229|3053->1281|3091->1284|3106->1291|3146->1293|3187->1299|3231->1334|3262->1343|3282->1346|3294->1351|3332->1352|3373->1358|3402->1365
                    LINES: 26->1|28->3|28->3|30->3|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|38->11|38->11|38->11|39->12|39->12|39->12|41->14|42->15|47->20|47->20|47->20|51->24|51->24|51->24|56->1|58->28|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33
                    -- GENERATED --
                */
            