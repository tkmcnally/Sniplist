
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
    <div class="container">
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
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*38.95*/com/*38.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("google"))),format.raw/*38.173*/("""" title="Sign in with Google" rel="nofollow"><i class="fa fa-google-plus-square fa-5x go-color"></i></a></li>
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*39.95*/com/*39.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("twitter"))),format.raw/*39.174*/("""" title="Sign in with Twitter" rel="nofollow"><i class="fa fa-twitter-square fa-5x tw-color"></i></a></li>
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*40.95*/com/*40.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("facebook"))),format.raw/*40.175*/("""" title="Sign in with Facebook" rel="nofollow"><i class="fa fa-facebook-square fa-5x fb-color"></i></a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-xs-12"><h3>Log In with E-mail</h3>
                                                            """),_display_(Seq[Any](/*48.62*/if(loginForm.hasGlobalErrors)/*48.91*/ {_display_(Seq[Any](format.raw/*48.93*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*49.98*/loginForm/*49.107*/.globalError.message)),format.raw/*49.127*/("""</div>
                                                            """)))})),format.raw/*50.62*/("""
                                                            """),_display_(Seq[Any](/*51.62*/if(flash.contains(Application.FLASH_ERROR_KEY))/*51.109*/ {_display_(Seq[Any](format.raw/*51.111*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*52.98*/flash()/*52.105*/.get(Application.FLASH_ERROR_KEY))),format.raw/*52.138*/("""</div>
                                                            """)))})),format.raw/*53.62*/("""


                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <form id="loginForm" method="POST" action=""""),_display_(Seq[Any](/*60.105*/routes/*60.111*/.Application.doLogin())),format.raw/*60.133*/("""" accept-charset="UTF-8">


                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-envelope fa-2x"></i></span>
                                                                    <input id="email" class="form-control input-lg" placeholder="Email" required="required" maxlength="100" type="email" name="email" value="">
                                                                </div>
                                                                """),_display_(Seq[Any](/*67.66*/if(loginForm.error("email") != null)/*67.102*/ {_display_(Seq[Any](format.raw/*67.104*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*68.100*/Messages(loginForm.error("email").message, loginForm.error("email").arguments: _*))),format.raw/*68.182*/("""</span>
                                                                """)))})),format.raw/*69.66*/("""
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-asterisk fa-2x"></i></span>
                                                                    <input id="password" class="form-control input-lg" placeholder="Password" required="required" minLength="5" maxlength="60" type="password" name="password">
                                                                </div>

                                                                """),_display_(Seq[Any](/*75.66*/if(loginForm.error("password") != null)/*75.105*/ {_display_(Seq[Any](format.raw/*75.107*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*76.100*/Messages(loginForm.error("password").message, loginForm.error("password").arguments: _*))),format.raw/*76.188*/("""</span>
                                                                """)))})),format.raw/*77.66*/("""

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
                    DATE: Tue Aug 12 02:42:43 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/login.scala.html
                    HASH: a3ee93c94ccb061f819962adbd835653f6352d2f
                    MATRIX: 848->1|971->52|992->65|1061->21|1091->43|1126->104|1167->111|1229->165|1268->167|3225->2088|3237->2091|3335->2166|3576->2371|3588->2374|3687->2450|3925->2652|3937->2655|4037->2732|4752->3411|4790->3440|4830->3442|4965->3541|4984->3550|5027->3570|5128->3639|5227->3702|5284->3749|5325->3751|5460->3850|5477->3857|5533->3890|5634->3959|6057->4345|6073->4351|6118->4373|6776->4995|6822->5031|6863->5033|7001->5134|7106->5216|7212->5290|7859->5901|7908->5940|7949->5942|8087->6043|8198->6131|8304->6205
                    LINES: 28->1|31->6|31->6|32->1|34->4|36->6|39->9|39->9|39->9|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|78->48|78->48|78->48|79->49|79->49|79->49|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|90->60|90->60|90->60|97->67|97->67|97->67|98->68|98->68|99->69|105->75|105->75|105->75|106->76|106->76|107->77
                    -- GENERATED --
                */
            