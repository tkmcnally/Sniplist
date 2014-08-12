
package views.html.sniplist

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
object addSnipToList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.SniplistCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userSniplists: models.SniplistCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""

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
    
    def render(userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(userSniplists)
    
    def f:((models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (userSniplists) => apply(userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 19:11:08 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/addSnipToList.scala.html
                    HASH: 3c107660ee50bc679a28a7174146b3216f892fae
                    MATRIX: 810->1|946->43|983->46|1043->91|1082->93|1225->201|1241->209|1265->212|1316->228|1353->257|1391->258|1478->310|1494->318|1528->331|1567->353|1579->358|1617->359|1703->410|1719->418|1753->431|1806->452|1856->466|1873->474|1900->479
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|39->11|39->11
                    -- GENERATED --
                */
            