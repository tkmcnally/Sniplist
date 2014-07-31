
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.lang.Boolean,models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._

def /*5.2*/content/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    <div class="container mtb">
        """),_display_(Seq[Any](/*7.10*/if(flash.contains(Application.FLASH_ERROR_KEY))/*7.57*/ {_display_(Seq[Any](format.raw/*7.59*/("""
            <div class="alert alert-danger">
            """),_display_(Seq[Any](/*9.14*/flash()/*9.21*/.get(Application.FLASH_ERROR_KEY))),format.raw/*9.54*/("""
            </div>
        """)))})),format.raw/*11.10*/("""
        """),_display_(Seq[Any](/*12.10*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*12.59*/ {_display_(Seq[Any](format.raw/*12.61*/("""
            <div class="alert alert-success">
            """),_display_(Seq[Any](/*14.14*/flash()/*14.21*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*14.56*/("""
            </div>
        """)))})),format.raw/*16.10*/("""
        <h1>"""),_display_(Seq[Any](/*17.14*/Messages("playauthenticate.profile.title"))),format.raw/*17.56*/("""</h1>
        <p>
            Your name is """),_display_(Seq[Any](/*19.27*/localUser/*19.36*/.name)),format.raw/*19.41*/(""" and your email address is """),_display_(Seq[Any](/*19.69*/if(!localUser.email)/*19.89*/ {_display_(Seq[Any](format.raw/*19.91*/("""
            <em>&lt;unknown&gt;</em>
            .""")))}/*21.16*/else/*21.21*/{_display_(Seq[Any](format.raw/*21.22*/("""
            """),_display_(Seq[Any](/*22.14*/localUser/*22.23*/.email)),format.raw/*22.29*/(""".
            <i>
            """),_display_(Seq[Any](/*24.14*/if(!localUser.emailValidated && localUser.email)/*24.62*/ {_display_(Seq[Any](format.raw/*24.64*/("""
                (<a href=""""),_display_(Seq[Any](/*25.28*/routes/*25.34*/.Account.verifyEmail)),format.raw/*25.54*/("""">unverified - click to verify</a>)
            """)))}/*26.15*/else/*26.20*/{_display_(Seq[Any](format.raw/*26.21*/("""
                (verified)
            """)))})),format.raw/*28.14*/("""</i>
        """)))})),format.raw/*29.10*/("""
            <br />
            """),_display_(Seq[Any](/*31.14*/if(localUser.firstName && localUser.lastName)/*31.59*/ {_display_(Seq[Any](format.raw/*31.61*/("""
                Your first name is """),_display_(Seq[Any](/*32.37*/localUser/*32.46*/.firstName)),format.raw/*32.56*/(""" and your last name is """),_display_(Seq[Any](/*32.80*/localUser/*32.89*/.lastName)),format.raw/*32.98*/("""
                <br/>
            """)))})),format.raw/*34.14*/("""
            """),_display_(Seq[Any](/*35.14*/defining(localUser.getProviders())/*35.48*/ { providers =>_display_(Seq[Any](format.raw/*35.63*/("""
                """),_display_(Seq[Any](/*36.18*/if(providers.size() > 0)/*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""
                    """),_display_(Seq[Any](/*37.22*/if(providers.size() == 1)/*37.47*/ {_display_(Seq[Any](format.raw/*37.49*/("""
                        """),_display_(Seq[Any](/*38.26*/Messages("playauthenticate.profile.providers_one"))),format.raw/*38.76*/("""
                    """)))}/*39.23*/else/*39.28*/{_display_(Seq[Any](format.raw/*39.29*/("""
                        """),_display_(Seq[Any](/*40.26*/Messages("playauthenticate.profile.providers_many", providers.size().toString()))),format.raw/*40.106*/("""
                    """)))})),format.raw/*41.22*/("""
                    """),_display_(Seq[Any](/*42.22*/for(p <- providers) yield /*42.41*/ {_display_(Seq[Any](format.raw/*42.43*/("""
                        """),_display_(Seq[Any](/*43.26*/_providerIcon(p))),format.raw/*43.42*/("""
                    """)))})),format.raw/*44.22*/("""
                    <br/>
                """)))})),format.raw/*46.18*/("""
            """)))})),format.raw/*47.14*/("""

            <br/>
            """),_display_(Seq[Any](/*50.14*/currentAuth()/*50.27*/ { auth =>_display_(Seq[Any](format.raw/*50.37*/("""
                """),_display_(Seq[Any](/*51.18*/Messages("playauthenticate.profile.logged"))),format.raw/*51.61*/(""" """),_display_(Seq[Any](/*51.63*/_providerIcon(auth.getProvider()))),format.raw/*51.96*/(""" <br/>
                """),_display_(Seq[Any](/*52.18*/if(auth.expires() != -1)/*52.42*/ {_display_(Seq[Any](format.raw/*52.44*/("""
                        """),_display_(Seq[Any](/*53.26*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires())))),format.raw/*53.129*/("""
                        <h1> Your USERID is: """),_display_(Seq[Any](/*54.47*/localUser/*54.56*/.id)),format.raw/*54.59*/(""" </h1>
        """)))}/*55.11*/else/*55.16*/{_display_(Seq[Any](format.raw/*55.17*/("""
            """),_display_(Seq[Any](/*56.14*/Messages("playauthenticate.profile.session_endless", auth.getId()))),format.raw/*56.80*/("""
        """)))})),format.raw/*57.10*/("""
    """)))})),format.raw/*58.6*/("""
        <br/>
        <ul>
            <li><a href=""""),_display_(Seq[Any](/*61.27*/routes/*61.33*/.Account.changePassword)),format.raw/*61.56*/("""">"""),_display_(Seq[Any](/*61.59*/Messages("playauthenticate.profile.password_change"))),format.raw/*61.111*/("""</a></li>
            <li><a href=""""),_display_(Seq[Any](/*62.27*/routes/*62.33*/.Account.link)),format.raw/*62.46*/("""">Add/Remove Authentication Providers</a></li>
        </ul>
    </p>
    </div>
""")))};
Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*66.2*/("""
    """),_display_(Seq[Any](/*67.6*/if(!js)/*67.13*/ {_display_(Seq[Any](format.raw/*67.15*/("""
        """),_display_(Seq[Any](/*68.10*/main("About Us", "about")/*68.35*/(content))),format.raw/*68.44*/("""
    """)))}/*69.7*/else/*69.12*/{_display_(Seq[Any](format.raw/*69.13*/("""
        """),_display_(Seq[Any](/*70.10*/content)),format.raw/*70.17*/("""
    """)))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,localUser)
    
    def f:((java.lang.Boolean,models.User) => play.api.templates.HtmlFormat.Appendable) = (js,localUser) => apply(js,localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 31 02:23:01 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/profile.scala.html
                    HASH: fa712d8df107bb1a288e1ba21e61b04bb30cfe1c
                    MATRIX: 799->1|975->108|989->115|1073->119|1152->163|1207->210|1246->212|1342->273|1357->280|1411->313|1474->344|1521->355|1579->404|1619->406|1717->468|1733->475|1790->510|1853->541|1904->556|1968->598|2050->644|2068->653|2095->658|2159->686|2188->706|2228->708|2301->763|2314->768|2353->769|2404->784|2422->793|2450->799|2519->832|2576->880|2616->882|2681->911|2696->917|2738->937|2807->988|2820->993|2859->994|2934->1037|2981->1052|3052->1087|3106->1132|3146->1134|3220->1172|3238->1181|3270->1191|3330->1215|3348->1224|3379->1233|3449->1271|3500->1286|3543->1320|3596->1335|3651->1354|3684->1378|3724->1380|3783->1403|3817->1428|3857->1430|3920->1457|3992->1507|4034->1531|4047->1536|4086->1537|4149->1564|4252->1644|4307->1667|4366->1690|4401->1709|4441->1711|4504->1738|4542->1754|4597->1777|4675->1823|4722->1838|4794->1874|4816->1887|4864->1897|4919->1916|4984->1959|5022->1961|5077->1994|5138->2019|5171->2043|5211->2045|5274->2072|5400->2175|5484->2223|5502->2232|5527->2235|5563->2253|5576->2258|5615->2259|5666->2274|5754->2340|5797->2351|5835->2358|5928->2415|5943->2421|5988->2444|6027->2447|6102->2499|6175->2536|6190->2542|6225->2555|6350->55|6378->103|6409->2641|6451->2648|6467->2655|6507->2657|6554->2668|6588->2693|6619->2702|6644->2710|6657->2715|6696->2716|6743->2727|6772->2734
                    LINES: 26->1|29->5|29->5|31->5|33->7|33->7|33->7|35->9|35->9|35->9|37->11|38->12|38->12|38->12|40->14|40->14|40->14|42->16|43->17|43->17|45->19|45->19|45->19|45->19|45->19|45->19|47->21|47->21|47->21|48->22|48->22|48->22|50->24|50->24|50->24|51->25|51->25|51->25|52->26|52->26|52->26|54->28|55->29|57->31|57->31|57->31|58->32|58->32|58->32|58->32|58->32|58->32|60->34|61->35|61->35|61->35|62->36|62->36|62->36|63->37|63->37|63->37|64->38|64->38|65->39|65->39|65->39|66->40|66->40|67->41|68->42|68->42|68->42|69->43|69->43|70->44|72->46|73->47|76->50|76->50|76->50|77->51|77->51|77->51|77->51|78->52|78->52|78->52|79->53|79->53|80->54|80->54|80->54|81->55|81->55|81->55|82->56|82->56|83->57|84->58|87->61|87->61|87->61|87->61|87->61|88->62|88->62|88->62|93->1|94->3|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70
                    -- GENERATED --
                */
            