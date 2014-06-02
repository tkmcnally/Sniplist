
package views.html

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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages("playauthenticate.profile.title"),"profile")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""

    <h1>"""),_display_(Seq[Any](/*7.10*/Messages("playauthenticate.profile.title"))),format.raw/*7.52*/("""</h1>
    <p>
    Your name is """),_display_(Seq[Any](/*9.19*/localUser/*9.28*/.name)),format.raw/*9.33*/(""" and your email address is """),_display_(Seq[Any](/*9.61*/if(!localUser.email)/*9.81*/ {_display_(Seq[Any](format.raw/*9.83*/("""<em>&lt;unknown&gt;</em>.""")))}/*9.110*/else/*9.115*/{_display_(Seq[Any](format.raw/*9.116*/("""
    	"""),_display_(Seq[Any](/*10.7*/localUser/*10.16*/.email)),format.raw/*10.22*/(""".
	    <i>
	    """),_display_(Seq[Any](/*12.7*/if(!localUser.emailValidated && localUser.email)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
	      (<a href=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Account.verifyEmail)),format.raw/*13.45*/("""">unverified - click to verify</a>)
	    """)))}/*14.8*/else/*14.13*/{_display_(Seq[Any](format.raw/*14.14*/("""
	      (verified)
	    """)))})),format.raw/*16.7*/("""</i>
    """)))})),format.raw/*17.6*/("""
    <br />
        """),_display_(Seq[Any](/*19.10*/if(localUser.firstName && localUser.lastName)/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
            Your first name is """),_display_(Seq[Any](/*20.33*/localUser/*20.42*/.firstName)),format.raw/*20.52*/(""" and your last name is """),_display_(Seq[Any](/*20.76*/localUser/*20.85*/.lastName)),format.raw/*20.94*/("""
            <br/>
        """)))})),format.raw/*22.10*/("""
    """),_display_(Seq[Any](/*23.6*/defining(localUser.getProviders())/*23.40*/ { providers =>_display_(Seq[Any](format.raw/*23.55*/("""
        """),_display_(Seq[Any](/*24.10*/if(providers.size() > 0)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
        """),_display_(Seq[Any](/*25.10*/if(providers.size() ==1)/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
            """),_display_(Seq[Any](/*26.14*/Messages("playauthenticate.profile.providers_one"))),format.raw/*26.64*/("""
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),_display_(Seq[Any](/*28.14*/Messages("playauthenticate.profile.providers_many",providers.size().toString()))),format.raw/*28.93*/("""
        """)))})),format.raw/*29.10*/("""
        """),_display_(Seq[Any](/*30.10*/for(p <- providers) yield /*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
            """),_display_(Seq[Any](/*31.14*/_providerIcon(p))),format.raw/*31.30*/("""
        """)))})),format.raw/*32.10*/("""
        <br/>
        """)))})),format.raw/*34.10*/("""
    """)))})),format.raw/*35.6*/("""

    <br/>
    """),_display_(Seq[Any](/*38.6*/currentAuth()/*38.19*/ { auth =>_display_(Seq[Any](format.raw/*38.29*/("""
        """),_display_(Seq[Any](/*39.10*/Messages("playauthenticate.profile.logged"))),format.raw/*39.53*/(""" """),_display_(Seq[Any](/*39.55*/_providerIcon(auth.getProvider()))),format.raw/*39.88*/("""<br/>
        """),_display_(Seq[Any](/*40.10*/if(auth.expires() != -1)/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""
            """),_display_(Seq[Any](/*41.14*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires())))),format.raw/*41.117*/("""
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),_display_(Seq[Any](/*43.14*/Messages("playauthenticate.profile.session_endless", auth.getId()))),format.raw/*43.80*/("""
        """)))})),format.raw/*44.10*/("""
    """)))})),format.raw/*45.6*/("""
    <br/>
    <ul>
    	<li><a href=""""),_display_(Seq[Any](/*48.20*/routes/*48.26*/.Account.changePassword)),format.raw/*48.49*/("""">"""),_display_(Seq[Any](/*48.52*/Messages("playauthenticate.profile.password_change"))),format.raw/*48.104*/("""</a></li>
    </ul>
    </p>
""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 01 21:40:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/profile.scala.html
                    HASH: cf5ba2e57cd6a5e307a7b9b1e2ecb093808b9294
                    MATRIX: 781->1|951->32|981->82|1018->85|1084->143|1123->145|1171->158|1234->200|1303->234|1320->243|1346->248|1409->276|1437->296|1476->298|1521->325|1534->330|1573->331|1616->339|1634->348|1662->354|1716->373|1773->421|1813->423|1869->443|1884->449|1926->469|1987->513|2000->518|2039->519|2097->546|2139->557|2198->580|2252->625|2292->627|2362->661|2380->670|2412->680|2472->704|2490->713|2521->722|2583->752|2625->759|2668->793|2721->808|2768->819|2801->843|2841->845|2888->856|2921->880|2961->882|3012->897|3084->947|3114->959|3127->964|3166->965|3217->980|3318->1059|3361->1070|3408->1081|3443->1100|3483->1102|3534->1117|3572->1133|3615->1144|3673->1170|3711->1177|3766->1197|3788->1210|3836->1220|3883->1231|3948->1274|3986->1276|4041->1309|4093->1325|4126->1349|4165->1350|4216->1365|4342->1468|4372->1480|4385->1485|4424->1486|4475->1501|4563->1567|4606->1578|4644->1585|4722->1627|4737->1633|4782->1656|4821->1659|4896->1711|4960->1744
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|45->17|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|55->27|55->27|55->27|56->28|56->28|57->29|58->30|58->30|58->30|59->31|59->31|60->32|62->34|63->35|66->38|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|70->42|70->42|70->42|71->43|71->43|72->44|73->45|76->48|76->48|76->48|76->48|76->48|79->51
                    -- GENERATED --
                */
            