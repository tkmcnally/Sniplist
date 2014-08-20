
package views.html.account.signup

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
object password_forgot extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.password.forgot.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	<h1>"""),_display_(Seq[Any](/*8.7*/Messages("playauthenticate.password.forgot.title"))),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*10.3*/form(routes.Signup.doForgotPassword)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
	   
            """),_display_(Seq[Any](/*12.14*/if(emailForm.hasGlobalErrors)/*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*14.52*/emailForm/*14.61*/.globalError.message)),format.raw/*14.81*/("""</span>
		        </p>
            """)))})),format.raw/*16.14*/("""
	   
	   """),_display_(Seq[Any](/*18.6*/_emailPartial(emailForm))),format.raw/*18.30*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*20.32*/Messages("playauthenticate.password.forgot.cta"))),format.raw/*20.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*21.3*/("""
	</p>
""")))})))}
    }
    
    def render(emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]): play.api.templates.HtmlFormat.Appendable = apply(emailForm)
    
    def f:((Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.api.templates.HtmlFormat.Appendable) = (emailForm) => apply(emailForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/signup/password_forgot.scala.html
                    HASH: e43a63d8ea3376663eee77506f81669eaf8ba805
                    MATRIX: 850->1|1066->71|1096->128|1133->131|1197->187|1236->189|1280->199|1351->249|1401->264|1446->300|1486->302|1543->323|1581->352|1621->354|1746->443|1764->452|1806->472|1876->510|1924->523|1970->547|2052->593|2122->641|2184->672
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|47->18|47->18|49->20|49->20|50->21
                    -- GENERATED --
                */
            