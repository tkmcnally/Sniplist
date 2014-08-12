
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
object unverified extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.verify.account.title"))/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

    <div class="container">
	<h1>"""),_display_(Seq[Any](/*5.7*/Messages("playauthenticate.verify.account.title"))),format.raw/*5.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*7.3*/Messages("playauthenticate.verify.account.before"))),format.raw/*7.53*/(""" <a href=""""),_display_(Seq[Any](/*7.64*/routes/*7.70*/.Account.verifyEmail)),format.raw/*7.90*/("""">"""),_display_(Seq[Any](/*7.93*/Messages("playauthenticate.verify.account.first"))),format.raw/*7.142*/("""</a>.<br/>
	</p>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:05:44 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/unverified.scala.html
                    HASH: 8213e94adc742d5d35e27cce14ca13f60ed773fe
                    MATRIX: 877->3|940->58|979->60|1052->99|1122->148|1171->163|1242->213|1288->224|1302->230|1343->250|1381->253|1452->302
                    LINES: 29->2|29->2|29->2|32->5|32->5|34->7|34->7|34->7|34->7|34->7|34->7|34->7
                    -- GENERATED --
                */
            