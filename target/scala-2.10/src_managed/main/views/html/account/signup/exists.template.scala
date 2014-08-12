
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
object exists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.user.exists.title"))/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
	<h1>"""),_display_(Seq[Any](/*3.7*/Messages("playauthenticate.user.exists.title"))),format.raw/*3.53*/("""</h1>
	<p>"""),_display_(Seq[Any](/*4.6*/Messages("playauthenticate.user.exists.message"))),format.raw/*4.54*/("""</p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 19:11:07 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/signup/exists.scala.html
                    HASH: da7597fa01865a3fbcf9dcb05bf37ffc4805ac25
                    MATRIX: 880->3|940->55|979->57|1021->65|1088->111|1134->123|1203->171
                    LINES: 29->2|29->2|29->2|30->3|30->3|31->4|31->4
                    -- GENERATED --
                */
            