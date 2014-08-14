
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

                    """),format.raw/*93.23*/("""

                    <div id="contentContainer">

                        <div class="row">
                            <div id="realContent" class="col-xs-12">
                                <div class="row">
                                    <div class="col-lg-12 col-lg-offset-0 col-md-12 col-md-offset-0 col-xs-12 col-sm-offset-0">
                                        <h1>Sign Up</h1>
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
                                                                <li><a href=""""),_display_(Seq[Any](/*119.79*/com/*119.82*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("google"))),format.raw/*119.157*/("""" title="Sign in with Google" rel="nofollow"><i class="fa fa-google-plus-square fa-5x go-color"></i></a></li>
                                                                <li><a href=""""),_display_(Seq[Any](/*120.79*/com/*120.82*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("twitter"))),format.raw/*120.158*/("""" title="Sign in with Twitter" rel="nofollow"><i class="fa fa-twitter-square fa-5x tw-color"></i></a></li>
                                                                <li><a href=""""),_display_(Seq[Any](/*121.79*/com/*121.82*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("facebook"))),format.raw/*121.159*/("""" title="Sign in with Facebook" rel="nofollow"><i class="fa fa-facebook-square fa-5x fb-color"></i></a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-sm-6 col-xs-12">
                                                    <div class="row">
                                                        <div class="col-xs-12"><h3>Sign Up Old School</h3>
                                                            """),_display_(Seq[Any](/*129.62*/if(signupForm.hasGlobalErrors)/*129.92*/ {_display_(Seq[Any](format.raw/*129.94*/("""
                                                                <div class="alert alert-danger">"""),_display_(Seq[Any](/*130.98*/signupForm/*130.108*/.globalError.message)),format.raw/*130.128*/("""</div>
                                                            """)))})),format.raw/*131.62*/("""
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <form id="signUpForm" method="POST" action=""""),_display_(Seq[Any](/*136.106*/routes/*136.112*/.Application.doSignup())),format.raw/*136.135*/("""" accept-charset="UTF-8">

                                                                <div class="input-group form-inline">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-user fa-2x"></i></span>
                                                                    <div class="row">
                                                                        <div class="col-xs-5 signUpInline">
                                                                            <input id="firstName" class="form-control input-lg" placeholder="First Name" required="required" maxlength="20" type="text" name="name" value="">
                                                                        </div>
                                                                        <div class="col-xs-7">
                                                                            <input id="lastName" class="form-control input-lg" placeholder="Last Name" required="required" maxlength="20" type="text" name="name" value="">
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-envelope fa-2x"></i></span>
                                                                    <input id="email" class="form-control input-lg" placeholder="Email" required="required" maxlength="100" type="email" name="email" value="">
                                                                </div>
                                                                <div class="input-group">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-asterisk fa-2x"></i></span>
                                                                    <input id="password" class="form-control input-lg" placeholder="Password" required="required" minLength="5" maxlength="60" type="password" name="password">
                                                                </div>
                                                                <div class="input-group  """),_display_(Seq[Any](/*157.91*/if(signupForm.error("repeatPassword") != null)/*157.137*/ {_display_(Seq[Any](format.raw/*157.139*/(""" has-error """)))})),format.raw/*157.151*/("""">
                                                                    <span class="input-group-addon talign-m"><i class="fa fa-asterisk fa-2x"></i></span>
                                                                    <input id="repeatPassword" class="form-control input-lg" placeholder="Confirm Password" required="required" minLength="5" maxlength="60" type="password" name="repeatPassword">
                                                                </div>
                                                                """),_display_(Seq[Any](/*161.66*/if(signupForm.error("repeatPassword") != null)/*161.112*/ {_display_(Seq[Any](format.raw/*161.114*/("""
                                                                    <span class="help-inline red">"""),_display_(Seq[Any](/*162.100*/Messages(signupForm.error("repeatPassword").message, signupForm.error("repeatPassword").arguments: _*))),format.raw/*162.202*/("""</span>
                                                                """)))})),format.raw/*163.66*/("""
                                                                <div class="form-group">
                                                                    <button type="submit" id="btn-signup" class="btn btn-block btn-primary btn-lg">Sign Up</button>
                                                                </div>
                                                            </form>
                                                            <div class="form-group">
                                                                <div class="topCushion">Already a member? <a href=""""),_display_(Seq[Any](/*169.117*/routes/*169.123*/.Application.login())),format.raw/*169.143*/("""">Login</a></div>
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
                    DATE: Wed Aug 13 21:22:58 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/signup.scala.html
                    HASH: 14fc4f478477ec0ac6c2f09ffefceeef1d96d7ae
                    MATRIX: 849->1|973->47|994->60|1063->22|1093->44|1122->99|1163->106|1195->130|1234->132|1286->3681|3083->5441|3096->5444|3195->5519|3421->5708|3434->5711|3534->5787|3757->5973|3770->5976|3871->6053|4587->6732|4627->6762|4668->6764|4804->6863|4825->6873|4869->6893|4971->6962|5392->7345|5409->7351|5456->7374|7977->9858|8034->9904|8076->9906|8122->9918|8699->10458|8756->10504|8798->10506|8937->10607|9063->10709|9170->10783|9808->11383|9825->11389|9869->11409
                    LINES: 28->1|31->5|31->5|32->1|34->4|35->5|38->8|38->8|38->8|40->93|66->119|66->119|66->119|67->120|67->120|67->120|68->121|68->121|68->121|76->129|76->129|76->129|77->130|77->130|77->130|78->131|83->136|83->136|83->136|104->157|104->157|104->157|104->157|108->161|108->161|108->161|109->162|109->162|110->163|116->169|116->169|116->169
                    -- GENERATED --
                */
            