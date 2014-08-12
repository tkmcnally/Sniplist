
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
object _providerIcon extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(providerKey: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<img width="64" height="64" alt=""""),_display_(Seq[Any](/*2.35*/providerKey)),format.raw/*2.46*/(""" icon" title=""""),_display_(Seq[Any](/*2.61*/providerKey)),format.raw/*2.72*/("""" src=""""),_display_(Seq[Any](/*2.80*/routes/*2.86*/.Assets.at("img/icons/64-" +providerKey+".png"))),format.raw/*2.133*/("""">"""))}
    }
    
    def render(providerKey:String): play.api.templates.HtmlFormat.Appendable = apply(providerKey)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:05:44 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/_providerIcon.scala.html
                    HASH: 8d1d34d5b74dbf02e22bc6f2e0e2d82ba3cb2834
                    MATRIX: 782->1|897->22|968->58|1000->69|1050->84|1082->95|1125->103|1139->109|1208->156
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                    -- GENERATED --
                */
            