
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
object navbarMenu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.mvc.Call,String,Boolean,play.api.mvc.RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(uri: play.api.mvc.Call, text: String, dynamic: Boolean)(implicit request: play.api.mvc.RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.104*/("""
<li """),_display_(Seq[Any](/*2.6*/if(uri.url.equals(request.path))/*2.38*/{})),format.raw/*2.40*/("""><a class=""""),_display_(Seq[Any](/*2.52*/if(dynamic)/*2.63*/{_display_(Seq[Any](format.raw/*2.64*/("""dynamic-link""")))})),format.raw/*2.77*/("""" href=""""),_display_(Seq[Any](/*2.86*/uri)),format.raw/*2.89*/("""">"""),_display_(Seq[Any](/*2.92*/text)),format.raw/*2.96*/("""</a></li>"""))}
    }
    
    def render(uri:play.api.mvc.Call,text:String,dynamic:Boolean,request:play.api.mvc.RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(uri,text,dynamic)(request)
    
    def f:((play.api.mvc.Call,String,Boolean) => (play.api.mvc.RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (uri,text,dynamic) => (request) => apply(uri,text,dynamic)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 19:11:08 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/generators/navbarMenu.scala.html
                    HASH: 8710d606c5af6890149280f377b0281a673805cf
                    MATRIX: 843->1|1040->103|1080->109|1120->141|1143->143|1190->155|1209->166|1247->167|1291->180|1335->189|1359->192|1397->195|1422->199
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                    -- GENERATED --
                */
            