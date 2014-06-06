
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitField/*5.15*/ = {{ FieldConstructor(signupField.f) }};
Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.54*/("""


"""),_display_(Seq[Any](/*8.2*/main("Signup", "signup")/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""
    <div class="container mt">
        <div class="row">
            <div class="centered">
                <div class="col-md-12">
                    <h1>"""),_display_(Seq[Any](/*13.26*/Messages("playauthenticate.signup.title"))),format.raw/*13.67*/("""</h1>
                    """),format.raw/*14.57*/("""
                    """),_display_(Seq[Any](/*15.22*/form(routes.Application.doSignup, 'id -> "signUpForm", 'class -> "col-md-12 form-inline form-horizontal")/*15.127*/ {_display_(Seq[Any](format.raw/*15.129*/("""

                        """),_display_(Seq[Any](/*17.26*/if(signupForm.hasGlobalErrors)/*17.56*/ {_display_(Seq[Any](format.raw/*17.58*/("""

                            <div class="alert alert-danger">"""),_display_(Seq[Any](/*19.62*/signupForm/*19.72*/.globalError.message)),format.raw/*19.92*/("""</div>

                        """)))})),format.raw/*21.26*/("""
                        """),_display_(Seq[Any](/*22.26*/signUpFormFields(signupForm))),format.raw/*22.54*/("""
                        """),_display_(Seq[Any](/*23.26*/signupForm/*23.36*/.error("password"))),format.raw/*23.54*/("""
                        <input type="submit" value=""""),_display_(Seq[Any](/*24.54*/Messages("playauthenticate.signup.now"))),format.raw/*24.93*/("""" class="btn btn-primary top-buffer-sm">
                        """)))})),format.raw/*25.26*/("""

                </div>
            </div>
            <div class="row">
                <div class="centered mt">
                    <div class="col-md-12">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="hline"><h4 class="top-buffer-sm bottom-buffer-sm">or</h4></div>
                            <h3 class="top-buffer-sm bottom-buffer-sm">Connect using:</h3>

                            <ul>
                            """),_display_(Seq[Any](/*38.30*/_providerPartial(skipCurrent=false))),format.raw/*38.65*/("""
                            </ul>
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                </div>
            </div>
        </div><! --/row -->
    </div>
""")))})))}
    }
    
    def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 06 01:40:03 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/signup.scala.html
                    HASH: 7f2ca99ee5489c788b8fb21619ded906311a3da4
                    MATRIX: 849->1|973->47|994->60|1063->22|1093->44|1122->99|1163->106|1195->130|1234->132|1433->295|1496->336|1551->399|1610->422|1725->527|1766->529|1831->558|1870->588|1910->590|2011->655|2030->665|2072->685|2139->720|2202->747|2252->775|2315->802|2334->812|2374->830|2465->885|2526->924|2625->991|3192->1522|3249->1557
                    LINES: 28->1|31->5|31->5|32->1|34->4|35->5|38->8|38->8|38->8|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|47->17|49->19|49->19|49->19|51->21|52->22|52->22|53->23|53->23|53->23|54->24|54->24|55->25|68->38|68->38
                    -- GENERATED --
                */
            