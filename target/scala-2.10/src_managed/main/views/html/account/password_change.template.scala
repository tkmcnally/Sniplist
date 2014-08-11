
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
object password_change extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Account.PasswordChange],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.change.password.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
    <div class="container mtb">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <h1>"""),_display_(Seq[Any](/*11.22*/Messages("playauthenticate.change.password.title"))),format.raw/*11.72*/("""</h1>
                <p>
                """),_display_(Seq[Any](/*13.18*/form(routes.Account.doChangePassword)/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""

                   """),_display_(Seq[Any](/*15.21*/if(changeForm.hasGlobalErrors)/*15.51*/ {_display_(Seq[Any](format.raw/*15.53*/("""
                    <p class="error">
                      <span class="label label-important">"""),_display_(Seq[Any](/*17.60*/changeForm/*17.70*/.globalError.message)),format.raw/*17.90*/("""</span>
                    </p>
                   """)))})),format.raw/*19.21*/("""

                   """),_display_(Seq[Any](/*21.21*/_passwordPartial(changeForm))),format.raw/*21.49*/("""

                    <input type="submit" value=""""),_display_(Seq[Any](/*23.50*/Messages("playauthenticate.change.password.cta"))),format.raw/*23.98*/("""" class="btn btn-primary">
                """)))})),format.raw/*24.18*/("""
                </p>

            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
""")))})))}
    }
    
    def render(changeForm:Form[controllers.Account.PasswordChange]): play.api.templates.HtmlFormat.Appendable = apply(changeForm)
    
    def f:((Form[controllers.Account.PasswordChange]) => play.api.templates.HtmlFormat.Appendable) = (changeForm) => apply(changeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 10 22:10:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/password_change.scala.html
                    HASH: 95762e150a4fcba6a919b670406bbd62a9dfa09e
                    MATRIX: 826->1|1026->55|1056->112|1093->115|1157->171|1196->173|1393->334|1465->384|1546->429|1592->466|1632->468|1692->492|1731->522|1771->524|1907->624|1926->634|1968->654|2055->709|2115->733|2165->761|2254->814|2324->862|2401->907
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|40->11|40->11|42->13|42->13|42->13|44->15|44->15|44->15|46->17|46->17|46->17|48->19|50->21|50->21|52->23|52->23|53->24
                    -- GENERATED --
                */
            