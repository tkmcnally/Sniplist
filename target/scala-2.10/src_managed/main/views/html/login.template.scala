
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
"""),format.raw/*65.7*/("""
    <div class="container mt">
        <div class="row">
            <div class="centered">
                <div class="col-md-12">
                    <div id="contentContainer" class="container">

                        <div class="row">
                            <div id="realContent" class="col-xs-12">
                                <div class="row">
                                    <div class="col-lg-10 col-lg-offset-1 col-md-10 col-md-offset-1 col-xs-12 col-sm-offset-0">
                                        <h1>Sign In</h1>
                                    </div>

                                </div>
                                <div class="row">
                                    <section class="col-lg-10 col-lg-offset-1 col-md-10 col-md-offset-1 col-xs-12 col-sm-offset-0">
                                        <div class="well well-lg">
                                            <div class="row">
                                                <div class="col-sm-6 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-xs-12"><h3>Social Sign In</h3></div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12"><p><b>Use one of your social networks to connect!</b></p></div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <ul id="social-sign-in" class="inline-block list-unstyled">
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*94.95*/com/*94.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("google"))),format.raw/*94.173*/("""" title="Sign in with Google" rel="nofollow"><i class="icon-google-plus-sign icon-5x go-color"></i></a></li>
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*95.95*/com/*95.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("twitter"))),format.raw/*95.174*/("""" title="Sign in with Twitter" rel="nofollow"><i class="icon-twitter-sign icon-5x tw-color"></i></a></li>
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*96.95*/com/*96.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("facebook"))),format.raw/*96.175*/("""" title="Sign in with Facebook" rel="nofollow"><i class="icon-facebook-sign icon-5x fb-color"></i></a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-xs-12"><h3>Log In with E-mail</h3>
                                                            """),_display_(Seq[Any](/*104.62*/if(loginForm.hasGlobalErrors)/*104.91*/ {_display_(Seq[Any](format.raw/*104.93*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*105.98*/loginForm/*105.107*/.globalError.message)),format.raw/*105.127*/("""</div>
                                                            """)))})),format.raw/*106.62*/("""
                                                            """),_display_(Seq[Any](/*107.62*/if(flash.contains(Application.FLASH_ERROR_KEY))/*107.109*/ {_display_(Seq[Any](format.raw/*107.111*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*108.98*/flash()/*108.105*/.get(Application.FLASH_ERROR_KEY))),format.raw/*108.138*/("""</div>
                                                            """)))})),format.raw/*109.62*/("""


                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <form id="loginForm" method="POST" action=""""),_display_(Seq[Any](/*116.105*/routes/*116.111*/.Application.doLogin())),format.raw/*116.133*/("""" accept-charset="UTF-8">


                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="icon-envelope icon-2x"></i></span>
                                                                    <input id="email" class="form-control input-lg" placeholder="Email" required="required" maxlength="100" type="email" name="email" value="">
                                                                </div>
                                                                """),_display_(Seq[Any](/*123.66*/if(loginForm.error("email") != null)/*123.102*/ {_display_(Seq[Any](format.raw/*123.104*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*124.100*/Messages(loginForm.error("email").message, loginForm.error("email").arguments: _*))),format.raw/*124.182*/("""</span>
                                                                """)))})),format.raw/*125.66*/("""
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="icon-asterisk icon-2x"></i></span>
                                                                    <input id="password" class="form-control input-lg" placeholder="Password" required="required" minLength="5" maxlength="60" type="password" name="password">
                                                                </div>

                                                                """),_display_(Seq[Any](/*131.66*/if(loginForm.error("password") != null)/*131.105*/ {_display_(Seq[Any](format.raw/*131.107*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*132.100*/Messages(loginForm.error("password").message, loginForm.error("password").arguments: _*))),format.raw/*132.188*/("""</span>
                                                                """)))})),format.raw/*133.66*/("""

                                                                <div class="form-group">
                                                                    <button type="submit" id="btn-signin" class="btn btn-block btn-primary btn-lg">Log In</button>
                                                                </div>
                                                            </form>
                                                            <div class="form-group">
                                                                <div class="topCushion"><a href="#login">Forgot your password?</a></div>
                                                            </div>
                                                        </div><!-- end of column -->
                                                    </div><!-- end of row -->
                                                </div><!-- end of column 2 -->
                                            </div><!-- end of well row -->
                                        </div><!-- end of well -->
                                    </section>
                                </div><!-- end of row -->
                            </div>
                        </div>
                    </div>

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
                    DATE: Mon Aug 11 18:15:27 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/login.scala.html
                    HASH: b5c08ee8d70c81293fa8d55e68c8c3170b8c330e
                    MATRIX: 848->1|971->52|992->65|1061->21|1091->43|1126->104|1167->111|1229->165|1268->167|1297->2440|3257->4364|3269->4367|3367->4442|3607->4646|3619->4649|3718->4725|3955->4926|3967->4929|4067->5006|4782->5684|4821->5713|4862->5715|4998->5814|5018->5823|5062->5843|5164->5912|5264->5975|5322->6022|5364->6024|5500->6123|5518->6130|5575->6163|5677->6232|6101->6618|6118->6624|6164->6646|6824->7269|6871->7305|6913->7307|7052->7408|7158->7490|7265->7564|7914->8176|7964->8215|8006->8217|8145->8318|8257->8406|8364->8480
                    LINES: 28->1|31->6|31->6|32->1|34->4|36->6|39->9|39->9|39->9|40->65|69->94|69->94|69->94|70->95|70->95|70->95|71->96|71->96|71->96|79->104|79->104|79->104|80->105|80->105|80->105|81->106|82->107|82->107|82->107|83->108|83->108|83->108|84->109|91->116|91->116|91->116|98->123|98->123|98->123|99->124|99->124|100->125|106->131|106->131|106->131|107->132|107->132|108->133
                    -- GENERATED --
                */
            