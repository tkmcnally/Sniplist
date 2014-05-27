
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(testing: String):play.api.templates.HtmlFormat.Appendable = {
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
            <h3>"""),_display_(Seq[Any](/*16.18*/testing)),format.raw/*16.25*/("""</h3>
            <img style="padding-right: 3%" src=""""),_display_(Seq[Any](/*17.50*/routes/*17.56*/.Assets.at("images/music.png"))),format.raw/*17.86*/("""">
        </div>
    </body>
</html>


"""))}
    }
    
    def render(testing:String): play.api.templates.HtmlFormat.Appendable = apply(testing)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (testing) => apply(testing)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 26 17:46:04 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index.scala.html
                    HASH: 36ed7cc7736960ae951145f38117e8ca7c10acff
                    MATRIX: 774->1|885->18|963->61|977->67|1032->101|1142->176|1156->182|1209->214|1429->398|1458->405|1549->460|1564->466|1616->496
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|44->16|44->16|45->17|45->17|45->17
                    -- GENERATED --
                */
            