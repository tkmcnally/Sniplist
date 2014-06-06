
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

    <div class="container mtb">
        """),_display_(Seq[Any](/*8.10*/if(flash.contains(Application.FLASH_ERROR_KEY))/*8.57*/ {_display_(Seq[Any](format.raw/*8.59*/("""
            <div class="alert alert-danger">
            """),_display_(Seq[Any](/*10.14*/flash()/*10.21*/.get(Application.FLASH_ERROR_KEY))),format.raw/*10.54*/("""
            </div>
        """)))})),format.raw/*12.10*/("""
        """),_display_(Seq[Any](/*13.10*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*13.59*/ {_display_(Seq[Any](format.raw/*13.61*/("""
            <div class="alert alert-success">
            """),_display_(Seq[Any](/*15.14*/flash()/*15.21*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*15.56*/("""
            </div>
        """)))})),format.raw/*17.10*/("""
        <h1>"""),_display_(Seq[Any](/*18.14*/Messages("playauthenticate.profile.title"))),format.raw/*18.56*/("""</h1>
        <p>
        Your name is """),_display_(Seq[Any](/*20.23*/localUser/*20.32*/.name)),format.raw/*20.37*/(""" and your email address is """),_display_(Seq[Any](/*20.65*/if(!localUser.email)/*20.85*/ {_display_(Seq[Any](format.raw/*20.87*/("""<em>&lt;unknown&gt;</em>.""")))}/*20.114*/else/*20.119*/{_display_(Seq[Any](format.raw/*20.120*/("""
            """),_display_(Seq[Any](/*21.14*/localUser/*21.23*/.email)),format.raw/*21.29*/(""".
            <i>
            """),_display_(Seq[Any](/*23.14*/if(!localUser.emailValidated && localUser.email)/*23.62*/ {_display_(Seq[Any](format.raw/*23.64*/("""
              (<a href=""""),_display_(Seq[Any](/*24.26*/routes/*24.32*/.Account.verifyEmail)),format.raw/*24.52*/("""">unverified - click to verify</a>)
            """)))}/*25.15*/else/*25.20*/{_display_(Seq[Any](format.raw/*25.21*/("""
              (verified)
            """)))})),format.raw/*27.14*/("""</i>
        """)))})),format.raw/*28.10*/("""
        <br />
            """),_display_(Seq[Any](/*30.14*/if(localUser.firstName && localUser.lastName)/*30.59*/ {_display_(Seq[Any](format.raw/*30.61*/("""
                Your first name is """),_display_(Seq[Any](/*31.37*/localUser/*31.46*/.firstName)),format.raw/*31.56*/(""" and your last name is """),_display_(Seq[Any](/*31.80*/localUser/*31.89*/.lastName)),format.raw/*31.98*/("""
                <br/>
            """)))})),format.raw/*33.14*/("""
        """),_display_(Seq[Any](/*34.10*/defining(localUser.getProviders())/*34.44*/ { providers =>_display_(Seq[Any](format.raw/*34.59*/("""
            """),_display_(Seq[Any](/*35.14*/if(providers.size() > 0)/*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/("""
            """),_display_(Seq[Any](/*36.14*/if(providers.size() ==1)/*36.38*/ {_display_(Seq[Any](format.raw/*36.40*/("""
                """),_display_(Seq[Any](/*37.18*/Messages("playauthenticate.profile.providers_one"))),format.raw/*37.68*/("""
            """)))}/*38.15*/else/*38.20*/{_display_(Seq[Any](format.raw/*38.21*/("""
                """),_display_(Seq[Any](/*39.18*/Messages("playauthenticate.profile.providers_many",providers.size().toString()))),format.raw/*39.97*/("""
            """)))})),format.raw/*40.14*/("""
            """),_display_(Seq[Any](/*41.14*/for(p <- providers) yield /*41.33*/ {_display_(Seq[Any](format.raw/*41.35*/("""
                """),_display_(Seq[Any](/*42.18*/_providerIcon(p))),format.raw/*42.34*/("""
            """)))})),format.raw/*43.14*/("""
            <br/>
            """)))})),format.raw/*45.14*/("""
        """)))})),format.raw/*46.10*/("""

        <br/>
        """),_display_(Seq[Any](/*49.10*/currentAuth()/*49.23*/ { auth =>_display_(Seq[Any](format.raw/*49.33*/("""
            """),_display_(Seq[Any](/*50.14*/Messages("playauthenticate.profile.logged"))),format.raw/*50.57*/(""" """),_display_(Seq[Any](/*50.59*/_providerIcon(auth.getProvider()))),format.raw/*50.92*/("""<br/>
            """),_display_(Seq[Any](/*51.14*/if(auth.expires() != -1)/*51.38*/{_display_(Seq[Any](format.raw/*51.39*/("""
                """),_display_(Seq[Any](/*52.18*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires())))),format.raw/*52.121*/("""
            """)))}/*53.15*/else/*53.20*/{_display_(Seq[Any](format.raw/*53.21*/("""
                """),_display_(Seq[Any](/*54.18*/Messages("playauthenticate.profile.session_endless", auth.getId()))),format.raw/*54.84*/("""
            """)))})),format.raw/*55.14*/("""
        """)))})),format.raw/*56.10*/("""
        <br/>
        <ul>
            <li><a href=""""),_display_(Seq[Any](/*59.27*/routes/*59.33*/.Account.changePassword)),format.raw/*59.56*/("""">"""),_display_(Seq[Any](/*59.59*/Messages("playauthenticate.profile.password_change"))),format.raw/*59.111*/("""</a></li>
            <li><a href=""""),_display_(Seq[Any](/*60.27*/routes/*60.33*/.Account.link)),format.raw/*60.46*/("""">Add/Remove Authentication Providers</a></li>
        </ul>
        </p>
    </div>
""")))})),format.raw/*64.2*/("""
"""))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 06 02:10:16 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/profile.scala.html
                    HASH: cba3843cd7e9c01d6f8d570b3bf5b373d31c9bf7
                    MATRIX: 781->1|951->32|981->82|1018->85|1084->143|1123->145|1204->191|1259->238|1298->240|1395->301|1411->308|1466->341|1529->372|1576->383|1634->432|1674->434|1772->496|1788->503|1845->538|1908->569|1959->584|2023->626|2101->668|2119->677|2146->682|2210->710|2239->730|2279->732|2325->759|2339->764|2379->765|2430->780|2448->789|2476->795|2545->828|2602->876|2642->878|2705->905|2720->911|2762->931|2831->982|2844->987|2883->988|2956->1029|3003->1044|3070->1075|3124->1120|3164->1122|3238->1160|3256->1169|3288->1179|3348->1203|3366->1212|3397->1221|3467->1259|3514->1270|3557->1304|3610->1319|3661->1334|3694->1358|3734->1360|3785->1375|3818->1399|3858->1401|3913->1420|3985->1470|4019->1486|4032->1491|4071->1492|4126->1511|4227->1590|4274->1605|4325->1620|4360->1639|4400->1641|4455->1660|4493->1676|4540->1691|4606->1725|4649->1736|4713->1764|4735->1777|4783->1787|4834->1802|4899->1845|4937->1847|4992->1880|5048->1900|5081->1924|5120->1925|5175->1944|5301->2047|5335->2063|5348->2068|5387->2069|5442->2088|5530->2154|5577->2169|5620->2180|5713->2237|5728->2243|5773->2266|5812->2269|5887->2321|5960->2358|5975->2364|6010->2377|6131->2467
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|38->10|38->10|38->10|40->12|41->13|41->13|41->13|43->15|43->15|43->15|45->17|46->18|46->18|48->20|48->20|48->20|48->20|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|56->28|58->30|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|66->38|66->38|66->38|67->39|67->39|68->40|69->41|69->41|69->41|70->42|70->42|71->43|73->45|74->46|77->49|77->49|77->49|78->50|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|81->53|81->53|81->53|82->54|82->54|83->55|84->56|87->59|87->59|87->59|87->59|87->59|88->60|88->60|88->60|92->64
                    -- GENERATED --
                */
            