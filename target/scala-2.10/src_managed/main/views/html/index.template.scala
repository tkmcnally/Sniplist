
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
    <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*7.38*/routes/*7.44*/.Assets.at("images/favicon.ico"))),format.raw/*7.76*/(""""/>
    <title>Sniplist</title>
</head>

<html>
    <body>
        <div class="middle-wrapper">
            <h1>Sniplist</h1>
            <h2>under construction.</h2>
            <img style="padding-right: 3%" src=""""),_display_(Seq[Any](/*16.50*/routes/*16.56*/.Assets.at("images/music.png"))),format.raw/*16.86*/("""">
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
                    DATE: Fri May 23 18:19:58 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index.scala.html
                    HASH: 88d9dac482fa3a7fe4b28d01733a73e8d00f3710
                    MATRIX: 556->1|667->18|745->61|759->67|814->101|924->176|938->182|991->214|1243->430|1258->436|1310->466
                    LINES: 19->1|22->1|27->6|27->6|27->6|28->7|28->7|28->7|37->16|37->16|37->16
                    -- GENERATED --
                */
            