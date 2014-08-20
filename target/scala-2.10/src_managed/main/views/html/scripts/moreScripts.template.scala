
package views.html.scripts

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
object moreScripts extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- Sniplist core JavaScript -->
<script src=""""),_display_(Seq[Any](/*2.15*/routes/*2.21*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*2.57*/(""""></script>
<script src=""""),_display_(Seq[Any](/*3.15*/routes/*3.21*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*3.59*/(""""></script>
<script src=""""),_display_(Seq[Any](/*4.15*/routes/*4.21*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*4.68*/(""""></script>
<script src=""""),_display_(Seq[Any](/*5.15*/routes/*5.21*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*5.63*/(""""></script>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/scripts/moreScripts.scala.html
                    HASH: 044c13d39db04f205578b0506bd2307d33148b77
                    MATRIX: 869->0|952->48|966->54|1023->90|1084->116|1098->122|1157->160|1218->186|1232->192|1300->239|1361->265|1375->271|1438->313
                    LINES: 29->1|30->2|30->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5
                    -- GENERATED --
                */
            