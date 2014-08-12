
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
object popular extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,List[models.Sniplist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, topList: List[models.Sniplist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mt">
        """),_display_(Seq[Any](/*5.10*/for(sniplist <- topList) yield /*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
            <div class="row">
                <p>"""),_display_(Seq[Any](/*7.21*/sniplist/*7.29*/.name)),format.raw/*7.34*/(""" by """),_display_(Seq[Any](/*7.39*/sniplist/*7.47*/.user.name)),format.raw/*7.57*/(""" ["""),_display_(Seq[Any](/*7.60*/sniplist/*7.68*/.id)),format.raw/*7.71*/("""] FavCount: """),_display_(Seq[Any](/*7.84*/sniplist/*7.92*/.favouriteCount)),format.raw/*7.107*/("""</p>
            </div>
        """)))})),format.raw/*9.10*/("""
    </div>

""")))};
Seq[Any](format.raw/*1.88*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/if(js)/*14.8*/ {_display_(Seq[Any](format.raw/*14.10*/("""
    """),_display_(Seq[Any](/*15.6*/content)),format.raw/*15.13*/("""
""")))}/*16.3*/else/*16.8*/{_display_(Seq[Any](format.raw/*16.9*/("""
    """),_display_(Seq[Any](/*17.6*/main("Popular, popular")/*17.30*/(content))),format.raw/*17.39*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,topList:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,topList)
    
    def f:((java.lang.Boolean,models.User,List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,topList) => apply(js,localUser,topList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:18:37 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/popular.scala.html
                    HASH: 5e83ab17553d5b584644d26214610f8682a3372b
                    MATRIX: 830->1|993->90|1007->97|1091->101|1167->142|1206->166|1245->168|1331->219|1347->227|1373->232|1413->237|1429->245|1460->255|1498->258|1514->266|1538->269|1586->282|1602->290|1639->305|1703->338|1756->87|1785->352|1823->355|1837->361|1877->363|1918->369|1947->376|1967->379|1979->384|2017->385|2058->391|2091->415|2122->424
                    LINES: 26->1|28->3|28->3|30->3|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|36->9|40->1|42->12|44->14|44->14|44->14|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17
                    -- GENERATED --
                */
            