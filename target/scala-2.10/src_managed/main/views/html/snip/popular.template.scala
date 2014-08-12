
package views.html.snip

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
object popular extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,List[models.Snip],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, topList: List[models.Snip]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mt">
        """),_display_(Seq[Any](/*5.10*/for(snip <- topList) yield /*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
            <div class="row">
                <p>"""),_display_(Seq[Any](/*7.21*/snip/*7.25*/.song_name)),format.raw/*7.35*/(""" by """),_display_(Seq[Any](/*7.40*/snip/*7.44*/.artist_name)),format.raw/*7.56*/(""" ["""),_display_(Seq[Any](/*7.59*/snip/*7.63*/.id)),format.raw/*7.66*/("""] FavCount: """),_display_(Seq[Any](/*7.79*/snip/*7.83*/.favouriteCount)),format.raw/*7.98*/("""</p>
            </div>
        """)))})),format.raw/*9.10*/("""
    </div>

""")))};
Seq[Any](format.raw/*1.84*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/if(js)/*14.8*/ {_display_(Seq[Any](format.raw/*14.10*/("""
    """),_display_(Seq[Any](/*15.6*/content)),format.raw/*15.13*/("""
""")))}/*16.3*/else/*16.8*/{_display_(Seq[Any](format.raw/*16.9*/("""
    """),_display_(Seq[Any](/*17.6*/main("Popular, popular")/*17.30*/(content))),format.raw/*17.39*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,topList:List[models.Snip]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,topList)
    
    def f:((java.lang.Boolean,models.User,List[models.Snip]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,topList) => apply(js,localUser,topList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 19:11:08 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/popular.scala.html
                    HASH: 9dd333f875e405203249b3b96a6eefc86b86a2b1
                    MATRIX: 822->1|981->86|995->93|1079->97|1155->138|1190->158|1229->160|1315->211|1327->215|1358->225|1398->230|1410->234|1443->246|1481->249|1493->253|1517->256|1565->269|1577->273|1613->288|1677->321|1730->83|1759->335|1797->338|1811->344|1851->346|1892->352|1921->359|1941->362|1953->367|1991->368|2032->374|2065->398|2096->407
                    LINES: 26->1|28->3|28->3|30->3|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|36->9|40->1|42->12|44->14|44->14|44->14|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17
                    -- GENERATED --
                */
            