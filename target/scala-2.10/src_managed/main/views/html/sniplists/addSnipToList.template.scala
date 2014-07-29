
package views.html.sniplists

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
object addSnipToList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.SnipList],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(snipLists: List[models.SnipList]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(Seq[Any](/*3.2*/for(snipList <- snipLists) yield /*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    <ul class="list-group">
        <li class="list-group-item playlist-li" style="cursor:pointer" value=""""),_display_(Seq[Any](/*5.80*/snipList/*5.88*/.id)),format.raw/*5.91*/("""">
            """),_display_(Seq[Any](/*6.14*/if(snipList.snips.size() < 6)/*6.43*/{_display_(Seq[Any](format.raw/*6.44*/("""
                <span class="badge alert-success">"""),_display_(Seq[Any](/*7.52*/snipList/*7.60*/.snips.size())),format.raw/*7.73*/("""</span>
            """)))}/*8.15*/else/*8.20*/{_display_(Seq[Any](format.raw/*8.21*/("""
                <span class="badge alert-danger">"""),_display_(Seq[Any](/*9.51*/snipList/*9.59*/.snips.size())),format.raw/*9.72*/("""</span>
            """)))})),format.raw/*10.14*/("""
            """),_display_(Seq[Any](/*11.14*/snipList/*11.22*/.name)),format.raw/*11.27*/("""
        </li>
    </ul>
""")))})))}
    }
    
    def render(snipLists:List[models.SnipList]): play.api.templates.HtmlFormat.Appendable = apply(snipLists)
    
    def f:((List[models.SnipList]) => play.api.templates.HtmlFormat.Appendable) = (snipLists) => apply(snipLists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 17:05:21 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/addSnipToList.scala.html
                    HASH: 8b142837980b0dde0211e7207781025193ff2dbd
                    MATRIX: 807->1|935->35|972->38|1013->64|1052->66|1195->174|1211->182|1235->185|1286->201|1323->230|1361->231|1448->283|1464->291|1498->304|1537->326|1549->331|1587->332|1673->383|1689->391|1723->404|1776->425|1826->439|1843->447|1870->452
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|39->11|39->11
                    -- GENERATED --
                */
            