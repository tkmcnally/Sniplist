
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*6.6*/implicitField/*6.19*/ = {{ FieldConstructor(signupField.f) }};
Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*4.1*/("""

    """),format.raw/*6.58*/("""


"""),_display_(Seq[Any](/*9.2*/main(Messages("playauthenticate.login.title"),"login")/*9.56*/ {_display_(Seq[Any](format.raw/*9.58*/("""

    <div class="container mtb">
        <div class="row">
            <div class="centered">
                <div class="col-md-6" style="padding-right:20px; border-right: 1px solid #ccc;">
                    """),_display_(Seq[Any](/*15.22*/if(loginForm.hasGlobalErrors)/*15.51*/ {_display_(Seq[Any](format.raw/*15.53*/("""
                        <p>asdasda</p>
                        <div class="alert alert-danger">"""),_display_(Seq[Any](/*17.58*/loginForm/*17.67*/.globalError.message)),format.raw/*17.87*/("""</div>

                    """)))})),format.raw/*19.22*/("""

                    """),_display_(Seq[Any](/*21.22*/if(ctx().flash().size() > 0)/*21.50*/ {_display_(Seq[Any](format.raw/*21.52*/("""
                        <div class="alert alert-danger">
                            """),_display_(Seq[Any](/*23.30*/ctx()/*23.35*/.flash().get("error"))),format.raw/*23.56*/("""
                        </div>
                    """)))})),format.raw/*25.22*/("""


                    <h3>Use a sniplist account</h3>
                    """),_display_(Seq[Any](/*29.22*/helper/*29.28*/.form(routes.Application.doLogin)/*29.61*/ {_display_(Seq[Any](format.raw/*29.63*/("""

                        """),_display_(Seq[Any](/*31.26*/if(loginForm.hasGlobalErrors)/*31.55*/ {_display_(Seq[Any](format.raw/*31.57*/("""

                            <div class="alert alert-danger">"""),_display_(Seq[Any](/*33.62*/loginForm/*33.71*/.globalError.message)),format.raw/*33.91*/("""</div>

                        """)))})),format.raw/*35.26*/("""


                        """),_display_(Seq[Any](/*38.26*/inputText(
                            loginForm("email"),
                            '_showConstraints -> false,
                            '_label -> Messages("playauthenticate.login.email.placeholder"),
                            'type -> "email"
                        ))),format.raw/*43.26*/("""
                        """),_display_(Seq[Any](/*44.26*/inputPassword(
                            loginForm("password"),
                            '_showConstraints -> false,
                            '_label -> Messages("playauthenticate.login.password.placeholder")
                        ))),format.raw/*48.26*/("""

                        <input type="submit" value=""""),_display_(Seq[Any](/*50.54*/Messages("playauthenticate.login.now"))),format.raw/*50.92*/("""" class="btn btn-primary top-buffer-sm"><br/>
                        <br/>
                        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(Seq[Any](/*52.174*/Messages("playauthenticate.login.forgot.password"))),format.raw/*52.224*/("""</a>

                    """)))})),format.raw/*54.22*/("""

                 </div>
                <div class="col-md-6">
                    <h3>Use another account</h3>
                    """),format.raw/*59.62*/("""
                    """),_display_(Seq[Any](/*60.22*/_providerPartial(skipCurrent=false))),format.raw/*60.57*/("""
                </div>
            </div>
        </div>
    </div>

""")))})))}
    }
    
    def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 17:05:20 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/login.scala.html
                    HASH: 1601342b82bb651ba53edd2de974e11295208c3e
                    MATRIX: 848->1|971->52|992->65|1061->21|1091->43|1126->104|1167->111|1229->165|1268->167|1523->386|1561->415|1601->417|1736->516|1754->525|1796->545|1859->576|1920->601|1957->629|1997->631|2122->720|2136->725|2179->746|2266->801|2382->881|2397->887|2439->920|2479->922|2544->951|2582->980|2622->982|2723->1047|2741->1056|2783->1076|2850->1111|2917->1142|3222->1425|3285->1452|3553->1698|3646->1755|3706->1793|3994->2044|4067->2094|4128->2123|4295->2303|4354->2326|4411->2361
                    LINES: 28->1|31->6|31->6|32->1|34->4|36->6|39->9|39->9|39->9|45->15|45->15|45->15|47->17|47->17|47->17|49->19|51->21|51->21|51->21|53->23|53->23|53->23|55->25|59->29|59->29|59->29|59->29|61->31|61->31|61->31|63->33|63->33|63->33|65->35|68->38|73->43|74->44|78->48|80->50|80->50|82->52|82->52|84->54|89->59|90->60|90->60
                    -- GENERATED --
                */
            