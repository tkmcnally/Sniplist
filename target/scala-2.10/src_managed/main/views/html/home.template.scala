
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User, followingList: List[models.User], topSnips: List[models.Snip], topSniplists: List[models.Sniplist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

def /*4.2*/content/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    <div class="container">
        <div class="row">
            <h1>News Feed</h1>
            <div class="hline"></div>
        </div>
        <div class="row">
            <h2>Following """),_display_(Seq[Any](/*11.28*/followingList/*11.41*/.size)),format.raw/*11.46*/(""" user(s)</h2>
            """),_display_(Seq[Any](/*12.14*/for(fUser <- followingList) yield /*12.41*/ {_display_(Seq[Any](format.raw/*12.43*/("""
                <a class="dynamic-link" href=""""),_display_(Seq[Any](/*13.48*/routes/*13.54*/.Application.getUserProfile(fUser.id.toString))),format.raw/*13.100*/("""">"""),_display_(Seq[Any](/*13.103*/fUser/*13.108*/.name)),format.raw/*13.113*/("""</a>
            """)))})),format.raw/*14.14*/("""
        </div>
        <div class="row">
            <h2>Popular Snips</h2>
            """),_display_(Seq[Any](/*18.14*/for(snip <- topSnips) yield /*18.35*/ {_display_(Seq[Any](format.raw/*18.37*/("""
                """),_display_(Seq[Any](/*19.18*/(i += 1))),format.raw/*19.26*/("""
                <div class="col-md-2">
                    <i class="icon-heart red"></i>"""),_display_(Seq[Any](/*21.52*/snip/*21.56*/.favouriteCount)),format.raw/*21.71*/("""<br>
                    <img src=""""),_display_(Seq[Any](/*22.32*/snip/*22.36*/.thumbnail_url)),format.raw/*22.50*/(""""/>
                    <p>"""),_display_(Seq[Any](/*23.25*/snip/*23.29*/.song_name)),format.raw/*23.39*/(""" <br> by """),_display_(Seq[Any](/*23.49*/snip/*23.53*/.artist_name)),format.raw/*23.65*/(""" <br> <a class="dynamic-link" href=""""),_display_(Seq[Any](/*23.102*/routes/*23.108*/.Application.getUserProfile(snip.user.id.toString))),format.raw/*23.158*/("""">"""),_display_(Seq[Any](/*23.161*/snip/*23.165*/.user.name)),format.raw/*23.175*/("""</a></p>
                </div>
                """),_display_(Seq[Any](/*25.18*/if(i % 6 == 0)/*25.32*/ {_display_(Seq[Any](format.raw/*25.34*/("""
                    </div>
                    <div class="row">
                """)))})),format.raw/*28.18*/("""

            """)))})),format.raw/*30.14*/("""
        </div>
        <div class="row">
            <h2>Popular Sniplists</h2>
            """),_display_(Seq[Any](/*34.14*/for(sniplist <- topSniplists) yield /*34.43*/ {_display_(Seq[Any](format.raw/*34.45*/("""
                <i class="icon-heart red"></i>"""),_display_(Seq[Any](/*35.48*/sniplist/*35.56*/.favouriteCount)),format.raw/*35.71*/("""<br>
                <p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*36.51*/routes/*36.57*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*36.115*/("""">"""),_display_(Seq[Any](/*36.118*/sniplist/*36.126*/.name)),format.raw/*36.131*/("""</a> by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*36.170*/routes/*36.176*/.Application.getUserProfile(sniplist.id.toString))),format.raw/*36.225*/("""">"""),_display_(Seq[Any](/*36.228*/sniplist/*36.236*/.user.name)),format.raw/*36.246*/("""</a> </p>
            """)))})),format.raw/*37.14*/("""
        </div>

    </div>
""")))};
Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*41.2*/("""


"""),_display_(Seq[Any](/*44.2*/if(!js)/*44.9*/ {_display_(Seq[Any](format.raw/*44.11*/("""
    """),_display_(Seq[Any](/*45.6*/main("Home", "home")/*45.26*/(content))),format.raw/*45.35*/("""
""")))}/*46.3*/else/*46.8*/{_display_(Seq[Any](format.raw/*46.9*/("""
    """),_display_(Seq[Any](/*47.6*/content)),format.raw/*47.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User],topSnips:List[models.Snip],topSniplists:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList,topSnips,topSniplists)
    
    def f:((java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList,topSnips,topSniplists) => apply(js,localUser,followingList,topSnips,topSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 20:41:37 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: d626966f6c306982ee4d24ce7489fa19ae71d121
                    MATRIX: 854->1|1116->190|1130->197|1214->201|1442->393|1464->406|1491->411|1554->438|1597->465|1637->467|1721->515|1736->521|1805->567|1845->570|1860->575|1888->580|1938->598|2064->688|2101->709|2141->711|2195->729|2225->737|2352->828|2365->832|2402->847|2474->883|2487->887|2523->901|2587->929|2600->933|2632->943|2678->953|2691->957|2725->969|2799->1006|2815->1012|2888->1062|2928->1065|2942->1069|2975->1079|3060->1128|3083->1142|3123->1144|3238->1227|3285->1242|3415->1336|3460->1365|3500->1367|3584->1415|3601->1423|3638->1438|3729->1493|3744->1499|3825->1557|3865->1560|3883->1568|3911->1573|3987->1612|4003->1618|4075->1667|4115->1670|4133->1678|4166->1688|4221->1711|4290->148|4317->188|4345->1740|4384->1744|4399->1751|4439->1753|4480->1759|4509->1779|4540->1788|4560->1791|4572->1796|4610->1797|4651->1803|4680->1810
                    LINES: 26->1|29->4|29->4|31->4|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|41->14|45->18|45->18|45->18|46->19|46->19|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|52->25|52->25|52->25|55->28|57->30|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|63->36|63->36|63->36|63->36|63->36|63->36|63->36|63->36|63->36|64->37|69->1|70->3|71->41|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47
                    -- GENERATED --
                */
            