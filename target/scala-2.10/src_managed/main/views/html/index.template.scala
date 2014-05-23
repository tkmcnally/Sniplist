
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("SNIPLIST")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

    """),_display_(Seq[Any](/*5.6*/play20/*5.12*/.welcome(message))),format.raw/*5.29*/("""

""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 23 16:43:41 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index.scala.html
                    HASH: 5d8eb9a79d05351dd3f2ba0cbf051638cd235f2d
                    MATRIX: 556->1|667->18|704->21|728->37|767->39|808->46|822->52|860->69|893->72
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|28->7
                    -- GENERATED --
                */
            