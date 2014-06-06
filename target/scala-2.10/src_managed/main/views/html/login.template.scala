
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
                    <h3>Use a sniplist account</h3>
                    """),_display_(Seq[Any](/*16.22*/helper/*16.28*/.form(routes.Application.doLogin)/*16.61*/ {_display_(Seq[Any](format.raw/*16.63*/("""

                        """),_display_(Seq[Any](/*18.26*/if(loginForm.hasGlobalErrors)/*18.55*/ {_display_(Seq[Any](format.raw/*18.57*/("""

                            <div class="alert alert-danger">"""),_display_(Seq[Any](/*20.62*/loginForm/*20.71*/.globalError.message)),format.raw/*20.91*/("""</div>

                        """)))})),format.raw/*22.26*/("""


                        """),_display_(Seq[Any](/*25.26*/inputText(
                            loginForm("email"),
                            '_showConstraints -> false,
                            '_label -> Messages("playauthenticate.login.email.placeholder"),
                            'type -> "email"
                        ))),format.raw/*30.26*/("""
                        """),_display_(Seq[Any](/*31.26*/inputPassword(
                            loginForm("password"),
                            '_showConstraints -> false,
                            '_label -> Messages("playauthenticate.login.password.placeholder")
                        ))),format.raw/*35.26*/("""

                        <input type="submit" value=""""),_display_(Seq[Any](/*37.54*/Messages("playauthenticate.login.now"))),format.raw/*37.92*/("""" class="btn btn-primary top-buffer-sm"><br/>
                        <br/>
                        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(Seq[Any](/*39.174*/Messages("playauthenticate.login.forgot.password"))),format.raw/*39.224*/("""</a>

                    """)))})),format.raw/*41.22*/("""

                 </div>
                <div class="col-md-6">
                    <h3>Use another account</h3>
                    """),format.raw/*46.62*/("""
                    """),_display_(Seq[Any](/*47.22*/_providerPartial(skipCurrent=false))),format.raw/*47.57*/("""
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
                    DATE: Fri Jun 06 02:03:30 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/login.scala.html
                    HASH: 447db9f666b7f68d132a3857d7cabc73c70c2c9e
                    MATRIX: 848->1|971->52|992->65|1061->21|1091->43|1126->104|1167->111|1229->165|1268->167|1576->439|1591->445|1633->478|1673->480|1738->509|1776->538|1816->540|1917->605|1935->614|1977->634|2044->669|2111->700|2416->983|2479->1010|2747->1256|2840->1313|2900->1351|3188->1602|3261->1652|3322->1681|3489->1861|3548->1884|3605->1919
                    LINES: 28->1|31->6|31->6|32->1|34->4|36->6|39->9|39->9|39->9|46->16|46->16|46->16|46->16|48->18|48->18|48->18|50->20|50->20|50->20|52->22|55->25|60->30|61->31|65->35|67->37|67->37|69->39|69->39|71->41|76->46|77->47|77->47
                    -- GENERATED --
                */
            