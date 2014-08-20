
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

                            <div id="realContent" class="col-xs-12">
                                <div class="row">
                                    <div class="col-lg-12 col-lg-offset-0 col-md-12 col-md-offset-0 col-xs-12 col-sm-offset-0">
                                        <h1>Sign In</h1>
                                    </div>

                                </div>
                                <div class="row">
                                    <section class="col-lg-12 col-lg-offset-0 col-md-12 col-md-offset-0 col-xs-12 col-sm-offset-0">
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
                                                                <li><a href=""""),_display_(Seq[Any](/*32.79*/com/*32.82*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("google"))),format.raw/*32.157*/("""" title="Sign in with Google" rel="nofollow"><i class="fa fa-google-plus-square fa-5x go-color"></i></a></li>
                                                                <li><a href=""""),_display_(Seq[Any](/*33.79*/com/*33.82*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("twitter"))),format.raw/*33.158*/("""" title="Sign in with Twitter" rel="nofollow"><i class="fa fa-twitter-square fa-5x tw-color"></i></a></li>
                                                                <li><a href=""""),_display_(Seq[Any](/*34.79*/com/*34.82*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("facebook"))),format.raw/*34.159*/("""" title="Sign in with Facebook" rel="nofollow"><i class="fa fa-facebook-square fa-5x fb-color"></i></a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-xs-12"><h3>Log In with E-mail</h3>
                                                            """),_display_(Seq[Any](/*42.62*/if(loginForm.hasGlobalErrors)/*42.91*/ {_display_(Seq[Any](format.raw/*42.93*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*43.98*/loginForm/*43.107*/.globalError.message)),format.raw/*43.127*/("""</div>
                                                            """)))})),format.raw/*44.62*/("""
                                                            """),_display_(Seq[Any](/*45.62*/if(flash.contains(Application.FLASH_ERROR_KEY))/*45.109*/ {_display_(Seq[Any](format.raw/*45.111*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*46.98*/flash()/*46.105*/.get(Application.FLASH_ERROR_KEY))),format.raw/*46.138*/("""</div>
                                                            """)))})),format.raw/*47.62*/("""


                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <form id="loginForm" method="POST" action=""""),_display_(Seq[Any](/*54.105*/routes/*54.111*/.Application.doLogin())),format.raw/*54.133*/("""" accept-charset="UTF-8">


                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-envelope fa-2x"></i></span>
                                                                    <input id="email" class="form-control input-lg" placeholder="Email" required="required" maxlength="100" type="email" name="email" value="">
                                                                </div>
                                                                """),_display_(Seq[Any](/*61.66*/if(loginForm.error("email") != null)/*61.102*/ {_display_(Seq[Any](format.raw/*61.104*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*62.100*/Messages(loginForm.error("email").message, loginForm.error("email").arguments: _*))),format.raw/*62.182*/("""</span>
                                                                """)))})),format.raw/*63.66*/("""
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-asterisk fa-2x"></i></span>
                                                                    <input id="password" class="form-control input-lg" placeholder="Password" required="required" minLength="5" maxlength="60" type="password" name="password">
                                                                </div>

                                                                """),_display_(Seq[Any](/*69.66*/if(loginForm.error("password") != null)/*69.105*/ {_display_(Seq[Any](format.raw/*69.107*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*70.100*/Messages(loginForm.error("password").message, loginForm.error("password").arguments: _*))),format.raw/*70.188*/("""</span>
                                                                """)))})),format.raw/*71.66*/("""

                                                                <div class="form-group">
                                                                    <button type="submit" id="btn-signin" class="btn btn-block btn-primary btn-lg">Log In</button>
                                                                </div>
                                                            </form>
                                                            <div class="form-group">
                                                                <div class="topCushion">Not a member? <a href=""""),_display_(Seq[Any](/*78.113*/routes/*78.119*/.Application.signup())),format.raw/*78.140*/("""">Sign up</a></div>
                                                            </div>
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
                    DATE: Sat Aug 16 17:21:54 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/login.scala.html
                    HASH: 43c7953ec0db35f2cce3e15a76cb753c494dcf90
                    MATRIX: 848->1|971->52|992->65|1061->21|1091->43|1126->104|1167->111|1229->165|1268->167|2966->1829|2978->1832|3076->1907|3301->2096|3313->2099|3412->2175|3634->2361|3646->2364|3746->2441|4461->3120|4499->3149|4539->3151|4674->3250|4693->3259|4736->3279|4837->3348|4936->3411|4993->3458|5034->3460|5169->3559|5186->3566|5242->3599|5343->3668|5766->4054|5782->4060|5827->4082|6485->4704|6531->4740|6572->4742|6710->4843|6815->4925|6921->4999|7568->5610|7617->5649|7658->5651|7796->5752|7907->5840|8013->5914|8647->6511|8663->6517|8707->6538
                    LINES: 28->1|31->6|31->6|32->1|34->4|36->6|39->9|39->9|39->9|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|72->42|72->42|72->42|73->43|73->43|73->43|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|84->54|84->54|84->54|91->61|91->61|91->61|92->62|92->62|93->63|99->69|99->69|99->69|100->70|100->70|101->71|108->78|108->78|108->78
                    -- GENERATED --
                */
            