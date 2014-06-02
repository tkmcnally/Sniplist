
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
object unverified extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.verify.account.title"))/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

	<h1>"""),_display_(Seq[Any](/*4.7*/Messages("playauthenticate.verify.account.title"))),format.raw/*4.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*6.3*/Messages("playauthenticate.verify.account.before"))),format.raw/*6.53*/(""" <a href=""""),_display_(Seq[Any](/*6.64*/routes/*6.70*/.Account.verifyEmail)),format.raw/*6.90*/("""">"""),_display_(Seq[Any](/*6.93*/Messages("playauthenticate.verify.account.first"))),format.raw/*6.142*/("""</a>.<br/>
	</p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 30 10:15:31 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/unverified.scala.html
                    HASH: 27c005b15d50bc1b0d3acbfc8bfe66f78c7b85f1
                    MATRIX: 877->3|940->58|979->60|1023->70|1093->119|1142->134|1213->184|1259->195|1273->201|1314->221|1352->224|1423->273
                    LINES: 29->2|29->2|29->2|31->4|31->4|33->6|33->6|33->6|33->6|33->6|33->6|33->6
                    -- GENERATED --
                */
            