
package views.html.generators

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
object navbarMenu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.mvc.Call,String,play.api.mvc.RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(uri: play.api.mvc.Call, text: String)(implicit request: play.api.mvc.RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.86*/("""
<li """),_display_(Seq[Any](/*2.6*/if(uri.url.equals(request.path))/*2.38*/{})),format.raw/*2.40*/("""><a class="dynamic-link" href=""""),_display_(Seq[Any](/*2.72*/uri)),format.raw/*2.75*/("""">"""),_display_(Seq[Any](/*2.78*/text)),format.raw/*2.82*/("""</a></li>"""))}
    }
    
    def render(uri:play.api.mvc.Call,text:String,request:play.api.mvc.RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(uri,text)(request)
    
    def f:((play.api.mvc.Call,String) => (play.api.mvc.RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (uri,text) => (request) => apply(uri,text)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 30 19:40:19 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/generators/navbarMenu.scala.html
                    HASH: 9390c27298924decb75059fe09dc95b6bbfcc85a
                    MATRIX: 835->1|1013->85|1053->91|1093->123|1116->125|1183->157|1207->160|1245->163|1270->167
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                    -- GENERATED --
                */
            