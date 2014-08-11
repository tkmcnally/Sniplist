
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
object password_reset_en extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
Howdy """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You or someone else requested a password reset for your account.<br />
	If that was not you or your intention, just relax and ignore this email.<br />
</p>
<p>
	If you wish to reset your password, all you need to do is <a href=""""),_display_(Seq[Any](/*10.70*/url)),format.raw/*10.73*/("""">follow this link to reset your password</a>.
</p>
<p>
	Cheers,<br /> 
	<i>The Sniplist Team</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 18:15:28 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/email/password_reset_en.scala.html
                    HASH: 23ae973b8b9433a980683147d3a80ba9eb289a84
                    MATRIX: 821->1|972->58|1015->67|1040->71|1334->329|1359->332
                    LINES: 26->1|29->1|30->2|30->2|38->10|38->10
                    -- GENERATED --
                */
            