
package views.html.account

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
object link extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.link.account.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""
    
    <h1>"""),_display_(Seq[Any](/*4.10*/Messages("playauthenticate.link.account.title"))),format.raw/*4.57*/("""</h1>
    
    <p>
	"""),_display_(Seq[Any](/*7.3*/_providerPartial())),format.raw/*7.21*/("""
    <br/>
    </p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 15:29:05 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/link.scala.html
                    HASH: c074184c683ea19be1c2e20d2c975596d44a7d85
                    MATRIX: 871->3|932->56|971->58|1023->75|1091->122|1149->146|1188->164
                    LINES: 29->2|29->2|29->2|31->4|31->4|34->7|34->7
                    -- GENERATED --
                */
            