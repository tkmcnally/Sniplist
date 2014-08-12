
package views.html.account.email

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
	To verify your e-mail address, <a href=""""),_display_(Seq[Any](/*6.43*/verificationUrl)),format.raw/*6.58*/(""""> click this link</a>.
</p>
<br />
<p>
	Thanks,<br />
	<i>The Sniplist Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 19:11:07 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/email/verify_email_en.scala.html
                    HASH: e513b0070d0ced8c44a7add33a6d372c95bbc4f9
                    MATRIX: 819->1|982->70|1025->79|1050->83|1151->149|1187->164
                    LINES: 26->1|29->1|30->2|30->2|34->6|34->6
                    -- GENERATED --
                */
            