
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
object userProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[java.lang.Boolean,models.User,models.MySnips,models.MySniplists,models.User,models.MySnips,models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, mySnips: models.MySnips, mySniplists: models.MySniplists, userProfile: models.User, userSnips: models.MySnips, userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mtb">
        <div class="row inline">
            <h1 style="display: inline-block;">"""),_display_(Seq[Any](/*6.49*/userProfile/*6.60*/.name)),format.raw/*6.65*/("""
            """),_display_(Seq[Any](/*7.14*/if(localUser.following != null && localUser.following.contains(userProfile.id))/*7.93*/ {_display_(Seq[Any](format.raw/*7.95*/("""
                <button type="button" class="btn btn-success follow-user-btn" value=""""),_display_(Seq[Any](/*8.87*/userProfile/*8.98*/.id.toString())),format.raw/*8.112*/("""">Following</button>
            """)))}/*9.15*/else/*9.20*/{_display_(Seq[Any](format.raw/*9.21*/("""
                <button type="button" class="btn btn-primary follow-user-btn" value=""""),_display_(Seq[Any](/*10.87*/userProfile/*10.98*/.id.toString())),format.raw/*10.112*/("""">Follow</button>
            """)))})),format.raw/*11.14*/("""
            </h1>
        </div>
        <div class="row">
            <h2>Snips</h2>
            """),_display_(Seq[Any](/*16.14*/snips/*16.19*/.arraySnips(true, localUser, userSnips))),format.raw/*16.58*/("""
        </div>
        <div class="row">
            <h2>Sniplists</h2>
            """),_display_(Seq[Any](/*20.14*/views/*20.19*/.html.sniplists.arraySniplists(true, localUser, mySnips, mySniplists, userSniplists))),format.raw/*20.103*/("""
        </div>
    </div>



""")))};
Seq[Any](format.raw/*1.202*/("""

"""),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/if(!js)/*28.9*/ {_display_(Seq[Any](format.raw/*28.11*/("""
    """),_display_(Seq[Any](/*29.6*/main("User Profile", "userProfile")/*29.41*/(content))),format.raw/*29.50*/("""
""")))}/*30.3*/else/*30.8*/{_display_(Seq[Any](format.raw/*30.9*/("""
    """),_display_(Seq[Any](/*31.6*/content)),format.raw/*31.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.MySnips,mySniplists:models.MySniplists,userProfile:models.User,userSnips:models.MySnips,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.MySnips,models.MySniplists,models.User,models.MySnips,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists) => apply(js,localUser,mySnips,mySniplists,userProfile,userSnips,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 19:38:08 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/userProfile.scala.html
                    HASH: 3605d94455c7e98174d6d835a063493e6194e149
                    MATRIX: 891->1|1168->204|1182->211|1266->215|1415->329|1434->340|1460->345|1509->359|1596->438|1635->440|1757->527|1776->538|1812->552|1864->587|1876->592|1914->593|2037->680|2057->691|2094->705|2157->736|2293->836|2307->841|2368->880|2490->966|2504->971|2611->1055|2682->201|2711->1086|2749->1089|2764->1096|2804->1098|2845->1104|2889->1139|2920->1148|2940->1151|2952->1156|2990->1157|3031->1163|3060->1170
                    LINES: 26->1|28->3|28->3|30->3|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|43->16|43->16|43->16|47->20|47->20|47->20|54->1|56->26|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31
                    -- GENERATED --
                */
            