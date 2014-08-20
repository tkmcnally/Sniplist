
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
            <div class="alert alert-danger alert-dismissable">
                <a class="panel-close close" data-dismiss="alert">×</a>
                <i class="fa fa-exclamation-triangle"></i>
                """),_display_(Seq[Any](/*9.18*/json/*9.22*/.get("error"))),format.raw/*9.35*/("""
            </div>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/if(!js)/*15.9*/ {_display_(Seq[Any](format.raw/*15.11*/("""
    """),_display_(Seq[Any](/*16.6*/main("Error", "error")/*16.28*/(content))),format.raw/*16.37*/("""
""")))}/*17.3*/else/*17.8*/{_display_(Seq[Any](format.raw/*17.9*/("""
    """),_display_(Seq[Any](/*18.6*/content)),format.raw/*18.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,json:com.fasterxml.jackson.databind.node.ObjectNode): play.api.templates.HtmlFormat.Appendable = apply(js,json)
    
    def f:((java.lang.Boolean,com.fasterxml.jackson.databind.node.ObjectNode) => play.api.templates.HtmlFormat.Appendable) = (js,json) => apply(js,json)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:54 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/badRequest.scala.html
                    HASH: 9ab4f602d0fa7c86f23cd1e7e78d54d14063a7f1
                    MATRIX: 837->1|991->83|1005->90|1089->94|1396->366|1408->370|1442->383|1532->78|1563->434|1603->439|1618->446|1658->448|1700->455|1731->477|1762->486|1783->490|1795->495|1833->496|1875->503|1904->510
                    LINES: 26->1|28->3|28->3|30->3|36->9|36->9|36->9|41->1|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18
                    -- GENERATED --
                */
            