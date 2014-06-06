
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
<li """),_display_(Seq[Any](/*2.6*/if(uri.url.equals(request.path))/*2.38*/{})),format.raw/*2.40*/("""><a href=""""),_display_(Seq[Any](/*2.51*/uri)),format.raw/*2.54*/("""">"""),_display_(Seq[Any](/*2.57*/text)),format.raw/*2.61*/("""</a></li>"""))}
    }
    
    def render(uri:play.api.mvc.Call,text:String,request:play.api.mvc.RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(uri,text)(request)
    
    def f:((play.api.mvc.Call,String) => (play.api.mvc.RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (uri,text) => (request) => apply(uri,text)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 05 19:51:43 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/generators/navbarMenu.scala.html
                    HASH: cc210e9d0ceb85cb60cd839c54dd8b8d82c88b58
                    MATRIX: 835->1|1013->85|1053->91|1093->123|1116->125|1162->136|1186->139|1224->142|1249->146
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                    -- GENERATED --
                */
            