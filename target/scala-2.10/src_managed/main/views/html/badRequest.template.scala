
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
object badRequest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.lang.Boolean,com.fasterxml.jackson.databind.node.ObjectNode,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, json: com.fasterxml.jackson.databind.node.ObjectNode):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container">
        <div class="row">
            <div class="alert alert-danger">"""),_display_(Seq[Any](/*6.46*/json/*6.50*/.get("error"))),format.raw/*6.63*/("""</div>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/if(!js)/*11.9*/ {_display_(Seq[Any](format.raw/*11.11*/("""
    """),_display_(Seq[Any](/*12.6*/main("Error", "error")/*12.28*/(content))),format.raw/*12.37*/("""
""")))}/*13.3*/else/*13.8*/{_display_(Seq[Any](format.raw/*13.9*/("""
    """),_display_(Seq[Any](/*14.6*/content)),format.raw/*14.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,json:com.fasterxml.jackson.databind.node.ObjectNode): play.api.templates.HtmlFormat.Appendable = apply(js,json)
    
    def f:((java.lang.Boolean,com.fasterxml.jackson.databind.node.ObjectNode) => play.api.templates.HtmlFormat.Appendable) = (js,json) => apply(js,json)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 21:04:00 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/badRequest.scala.html
                    HASH: fddf8398584234e44112dae7408dd249b50377ce
                    MATRIX: 837->1|991->83|1005->90|1089->94|1227->197|1239->201|1273->214|1349->78|1379->251|1419->256|1434->263|1474->265|1516->272|1547->294|1578->303|1599->307|1611->312|1649->313|1691->320|1720->327
                    LINES: 26->1|28->3|28->3|30->3|33->6|33->6|33->6|37->1|39->9|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14
                    -- GENERATED --
                */
            