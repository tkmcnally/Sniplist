
package views.html.account.signup.email

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
object verify_email_en extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""
Howdy """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You recently signed up for <b>Sniplist</b>.<br />
	<br />
	Follow this link to <a href=""""),_display_(Seq[Any](/*8.32*/verificationUrl)),format.raw/*8.47*/("""">activate your account</a>.
</p>
<br />
<p>
	Cheers,<br /> 
	<i>The <b>Sniplist</b> Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 16:01:00 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/signup/email/verify_email_en.scala.html
                    HASH: 307ae785e22c0fb0a11e6c04f63d94f0e19efe75
                    MATRIX: 826->1|989->70|1032->79|1057->83|1208->199|1244->214
                    LINES: 26->1|29->1|30->2|30->2|36->8|36->8
                    -- GENERATED --
                */
            