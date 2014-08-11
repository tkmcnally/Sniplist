
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
object ask_link extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/label/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(Seq[Any](/*7.3*/_providerIcon(newAccount.getProvider()))),format.raw/*7.42*/(""" """),_display_(Seq[Any](/*7.44*/Messages("playauthenticate.link.account.question",newAccount))),format.raw/*7.105*/("""
""")))};
Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(Messages("playauthenticate.link.account.title"))/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""

    <div class="container mtb">
        <div class="row">
            <h1>"""),_display_(Seq[Any](/*14.18*/Messages("playauthenticate.link.account.title"))),format.raw/*14.65*/("""</h1>
            <p>
            """),_display_(Seq[Any](/*16.14*/form(routes.Account.doLink)/*16.41*/ {_display_(Seq[Any](format.raw/*16.43*/("""

                    """),_display_(Seq[Any](/*18.22*/if(acceptForm.hasGlobalErrors)/*18.52*/ {_display_(Seq[Any](format.raw/*18.54*/("""
                        <p class="error">
                            <span class="label label-important">"""),_display_(Seq[Any](/*20.66*/acceptForm/*20.76*/.globalError.message)),format.raw/*20.96*/("""</span>
                        </p>
                    """)))})),format.raw/*22.22*/("""

               """),_display_(Seq[Any](/*24.17*/inputRadioGroup(
                    acceptForm("accept"),
                    options = Seq(
                        "true"-> Messages("playauthenticate.link.account.true"),
                        "false"->Messages("playauthenticate.link.account.false")
                    ),
                    '_label -> label,
                    '_showConstraints -> false
                ))),format.raw/*32.18*/("""

                <input type="submit" value=""""),_display_(Seq[Any](/*34.46*/Messages("playauthenticate.link.account.ok"))),format.raw/*34.90*/("""" class="btn btn-primary">
            """)))})),format.raw/*35.14*/("""
            </p>
        </div>
    </div>
""")))})))}
    }
    
    def render(acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser): play.api.templates.HtmlFormat.Appendable = apply(acceptForm,newAccount)
    
    def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.api.templates.HtmlFormat.Appendable) = (acceptForm,newAccount) => apply(acceptForm,newAccount)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 17:33:11 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/ask_link.scala.html
                    HASH: e93b0589cae444592562e3fd9cbd0f5ca6dd5039
                    MATRIX: 837->1|1051->146|1063->151|1147->155|1185->159|1245->198|1282->200|1365->261|1407->86|1437->143|1465->264|1505->269|1567->322|1607->324|1724->405|1793->452|1866->489|1902->516|1942->518|2003->543|2042->573|2082->575|2228->685|2247->695|2289->715|2381->775|2437->795|2848->1184|2933->1233|2999->1277|3072->1318
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|51->20|51->20|51->20|53->22|55->24|63->32|65->34|65->34|66->35
                    -- GENERATED --
                */
            