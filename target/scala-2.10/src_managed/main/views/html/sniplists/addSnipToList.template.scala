
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
object addSnipToList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

"""),_display_(Seq[Any](/*3.2*/for(snipList <- userSniplists.savedSniplists) yield /*3.47*/ {_display_(Seq[Any](format.raw/*3.49*/("""
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
    
    def render(userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(userSniplists)
    
    def f:((models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (userSniplists) => apply(userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 16:01:00 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/addSnipToList.scala.html
                    HASH: c0def35c059c4f8477fe02d41dd286977772a82d
                    MATRIX: 804->1|933->36|970->39|1030->84|1069->86|1212->194|1228->202|1252->205|1303->221|1340->250|1378->251|1465->303|1481->311|1515->324|1554->346|1566->351|1604->352|1690->403|1706->411|1740->424|1793->445|1843->459|1860->467|1887->472
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|39->11|39->11
                    -- GENERATED --
                */
            