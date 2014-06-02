
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
object index1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(testing: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

<!DOCTYPE html>

<head>
    <link href=""""),_display_(Seq[Any](/*6.18*/routes/*6.24*/.Assets.at("../../public/stylesheets/main_one.css"))),format.raw/*6.75*/("""" rel="stylesheet" type="text/css" />
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
                    DATE: Fri May 30 10:15:30 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index1.scala.html
                    HASH: ae646c51cfed0109730cbfa2f4840cdcd0d12127
                    MATRIX: 775->1|886->18|964->61|978->67|1050->118|1160->193|1174->199|1227->231|1447->415|1476->422|1567->477|1582->483|1634->513
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|44->16|44->16|45->17|45->17|45->17
                    -- GENERATED --
                */
            