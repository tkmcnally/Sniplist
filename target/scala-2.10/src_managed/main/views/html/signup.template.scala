
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
                    """),format.raw/*96.23*/("""

                    <div id="contentContainer" class="container">

                        <div class="row">
                            <div id="realContent" class="col-xs-12">
                                <div class="row">
                                    <div class="col-lg-10 col-lg-offset-1 col-md-10 col-md-offset-1 col-xs-12 col-sm-offset-0">
                                        <h1>Sign Up</h1>
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
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*122.95*/com/*122.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("google"))),format.raw/*122.173*/("""" title="Sign in with Google" rel="nofollow"><i class="icon-google-plus-sign icon-5x go-color"></i></a></li>
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*123.95*/com/*123.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("twitter"))),format.raw/*123.174*/("""" title="Sign in with Twitter" rel="nofollow"><i class="icon-twitter-sign icon-5x tw-color"></i></a></li>
                                                                <li><a target="_blank" href=""""),_display_(Seq[Any](/*124.95*/com/*124.98*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("facebook"))),format.raw/*124.175*/("""" title="Sign in with Facebook" rel="nofollow"><i class="icon-facebook-sign icon-5x fb-color"></i></a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-xs-12"><h3>Sign Up Old School</h3>
                                                            """),_display_(Seq[Any](/*132.62*/if(signupForm.hasGlobalErrors)/*132.92*/ {_display_(Seq[Any](format.raw/*132.94*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*133.98*/signupForm/*133.108*/.globalError.message)),format.raw/*133.128*/("""</div>
                                                            """)))})),format.raw/*134.62*/("""
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <form id="signUpForm" method="POST" action=""""),_display_(Seq[Any](/*139.106*/routes/*139.112*/.Application.doSignup())),format.raw/*139.135*/("""" accept-charset="UTF-8">

                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="icon-user icon-2x"></i></span>

                                                                    <input id="name" class="form-control input-lg" placeholder="Name" required="required" maxlength="100" type="text" name="name" value="">
                                                                </div>
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="icon-envelope icon-2x"></i></span>
                                                                    <input id="email" class="form-control input-lg" placeholder="Email" required="required" maxlength="100" type="email" name="email" value="">
                                                                </div>
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="icon-asterisk icon-2x"></i></span>
                                                                    <input id="password" class="form-control input-lg" placeholder="Password" required="required" minLength="5" maxlength="60" type="password" name="password">
                                                                </div>
                                                                <div class="input-group  """),_display_(Seq[Any](/*154.91*/if(signupForm.error("repeatPassword") != null)/*154.137*/ {_display_(Seq[Any](format.raw/*154.139*/(""" has-error """)))})),format.raw/*154.151*/("""">
                                                                        <span class="input-group-addon talign-m"><i class="icon-asterisk icon-2x"></i></span>
                                                                        <input id="repeatPassword" class="form-control input-lg" placeholder="Confirm Password" required="required" minLength="5" maxlength="60" type="password" name="repeatPassword">

                                                                </div>
                                                                """),_display_(Seq[Any](/*159.66*/if(signupForm.error("repeatPassword") != null)/*159.112*/ {_display_(Seq[Any](format.raw/*159.114*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*160.100*/Messages(signupForm.error("repeatPassword").message, signupForm.error("repeatPassword").arguments: _*))),format.raw/*160.202*/("""</span>
                                                                """)))})),format.raw/*161.66*/("""

                                                                <div class="form-group">
                                                                    <button type="submit" id="btn-signup" class="btn btn-block btn-primary btn-lg">Sign Up</button>
                                                                </div>
                                                            </form>
                                                            <div class="form-group">
                                                                <div class="topCushion">Already a member? <a href="#login">Login</a></div>
                                                            </div>
                                                            <div class="form-group">
                                                                <p>By clicking on "Sign Up", you agree to the <a href="#terms-of-service" target="_blank">Terms of Service</a> and the <a href="#privacy" target="_blank">Privacy Policy</a>.</p>
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
                    DATE: Mon Aug 11 17:33:11 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/signup.scala.html
                    HASH: 48b81a4986262c13d27f2e6dd63190a145487643
                    MATRIX: 849->1|973->47|994->60|1063->22|1093->44|1122->99|1163->106|1195->130|1234->132|1420->3815|3251->5609|3264->5612|3363->5687|3604->5891|3617->5894|3717->5970|3955->6171|3968->6174|4069->6251|4784->6929|4824->6959|4865->6961|5001->7060|5022->7070|5066->7090|5168->7159|5589->7542|5606->7548|5653->7571|7400->9281|7457->9327|7499->9329|7545->9341|8133->9892|8190->9938|8232->9940|8371->10041|8497->10143|8604->10217
                    LINES: 28->1|31->5|31->5|32->1|34->4|35->5|38->8|38->8|38->8|43->96|69->122|69->122|69->122|70->123|70->123|70->123|71->124|71->124|71->124|79->132|79->132|79->132|80->133|80->133|80->133|81->134|86->139|86->139|86->139|101->154|101->154|101->154|101->154|106->159|106->159|106->159|107->160|107->160|108->161
                    -- GENERATED --
                */
            