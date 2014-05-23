
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

<!DOCTYPE html>

<head>
    <link href=""""),_display_(Seq[Any](/*6.18*/routes/*6.24*/.Assets.at("stylesheets/main.css"))),format.raw/*6.58*/("""" rel="stylesheet" type="text/css" />
    <title>Sniplist</title>
</head>

<html>
    <body>
        <div class="middle-wrapper">
           <h1>Sniplist</h1>
           <h2>under construction.</h2><br>
            <img style="padding-right: 3%" src=""""),_display_(Seq[Any](/*15.50*/routes/*15.56*/.Assets.at("images/music.png"))),format.raw/*15.86*/("""">
        </div>
    </body>
</html>


"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 23 18:06:24 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index.scala.html
                    HASH: bc42e18d7b4d6baf2b797ad101599f5c0dda7fca
                    MATRIX: 556->1|667->18|745->61|759->67|814->101|1102->353|1117->359|1169->389
                    LINES: 19->1|22->1|27->6|27->6|27->6|36->15|36->15|36->15
                    -- GENERATED --
                */
            