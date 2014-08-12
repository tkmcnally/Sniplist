
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
            <h1 style="display: inline-block;">"""),_display_(Seq[Any](/*5.49*/userProfile/*5.60*/.name)),format.raw/*5.65*/("""
                """),_display_(Seq[Any](/*6.18*/if(localUser.id.eq(userProfile.id))/*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
                    """),_display_(Seq[Any](/*7.22*/if(localUser.following != null && localUser.following.contains(userProfile.id))/*7.101*/ {_display_(Seq[Any](format.raw/*7.103*/("""
                        <button type="button" class="btn btn-success follow-user-btn" value=""""),_display_(Seq[Any](/*8.95*/userProfile/*8.106*/.id.toString())),format.raw/*8.120*/("""">
                            Following</button>
                    """)))}/*10.23*/else/*10.28*/{_display_(Seq[Any](format.raw/*10.29*/("""
                        <button type="button" class="btn btn-primary follow-user-btn" value=""""),_display_(Seq[Any](/*11.95*/userProfile/*11.106*/.id.toString())),format.raw/*11.120*/("""">
                            Follow</button>
                    """)))})),format.raw/*13.22*/("""
                """)))})),format.raw/*14.18*/("""
            </h1>
        </div>
        <div class="row">
            <h2>Snips</h2>
            """),_display_(Seq[Any](/*19.14*/snip/*19.18*/.arraySnips(true, localUser, userSnips))),format.raw/*19.57*/("""
        </div>
        <div class="row">
            <h2>Sniplists</h2>
            """),_display_(Seq[Any](/*23.14*/views/*23.19*/.html.sniplist.arraySniplists(true, localUser, mySnips, mySniplists, userSniplists))),format.raw/*23.102*/("""
        </div>
""")))};
Seq[Any](format.raw/*1.230*/("""

"""),format.raw/*25.2*/("""

"""),_display_(Seq[Any](/*27.2*/if(!js)/*27.9*/ {_display_(Seq[Any](format.raw/*27.11*/("""
    """),_display_(Seq[Any](/*28.6*/main("User Profile", "userProfile")/*28.41*/(content))),format.raw/*28.50*/("""
""")))}/*29.3*/else/*29.8*/{_display_(Seq[Any](format.raw/*29.9*/("""
    """),_display_(Seq[Any](/*30.6*/content)),format.raw/*30.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userProfile:models.User,userSnips:models.SnipCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.User,models.SnipCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists) => apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:57:32 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/userProfile.scala.html
                    HASH: 5a267bae11fc254c7bae780d3f046130fa954b57
                    MATRIX: 919->1|1224->232|1238->239|1322->243|1439->325|1458->336|1484->341|1537->359|1580->394|1619->396|1676->418|1764->497|1804->499|1934->594|1954->605|1990->619|2080->691|2093->696|2132->697|2263->792|2284->803|2321->817|2421->885|2471->903|2607->1003|2620->1007|2681->1046|2803->1132|2817->1137|2923->1220|2980->229|3009->1237|3047->1240|3062->1247|3102->1249|3143->1255|3187->1290|3218->1299|3238->1302|3250->1307|3288->1308|3329->1314|3358->1321
                    LINES: 26->1|28->3|28->3|30->3|32->5|32->5|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|37->10|38->11|38->11|38->11|40->13|41->14|46->19|46->19|46->19|50->23|50->23|50->23|53->1|55->25|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30
                    -- GENERATED --
                */
            