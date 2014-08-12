
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

        <div class="row">
            <h1>Popular</h1>
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
                    <i class="fa fa-heart red"></i>&nbsp"""),_display_(Seq[Any](/*21.58*/snip/*21.62*/.favouriteCount)),format.raw/*21.77*/("""<br>
                    <img class="img-thumbnail" src=""""),_display_(Seq[Any](/*22.54*/snip/*22.58*/.thumbnail_url)),format.raw/*22.72*/(""""/>
                    <p>"""),_display_(Seq[Any](/*23.25*/snip/*23.29*/.song_name)),format.raw/*23.39*/(""" <br> by """),_display_(Seq[Any](/*23.49*/snip/*23.53*/.artist_name)),format.raw/*23.65*/(""" <br> <a class="dynamic-link" href=""""),_display_(Seq[Any](/*23.102*/routes/*23.108*/.Application.getUserProfile(snip.user.id.toString))),format.raw/*23.158*/("""">"""),_display_(Seq[Any](/*23.161*/snip/*23.165*/.user.name)),format.raw/*23.175*/("""</a></p>
                </div>
                """),_display_(Seq[Any](/*25.18*/if(i % 6 == 0)/*25.32*/ {_display_(Seq[Any](format.raw/*25.34*/("""
                    </div>
                    <div class="row">
                """)))})),format.raw/*28.18*/("""
            """)))})),format.raw/*29.14*/("""
        </div>
        <div class="row">
            <h2>Popular Sniplists</h2>
            """),_display_(Seq[Any](/*33.14*/for(sniplist <- topSniplists) yield /*33.43*/ {_display_(Seq[Any](format.raw/*33.45*/("""
                <i class="fa fa-heart red"></i>&nbsp"""),_display_(Seq[Any](/*34.54*/sniplist/*34.62*/.favouriteCount)),format.raw/*34.77*/("""<br>
                <p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*35.51*/routes/*35.57*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*35.115*/("""">"""),_display_(Seq[Any](/*35.118*/sniplist/*35.126*/.name)),format.raw/*35.131*/("""</a> by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*35.170*/routes/*35.176*/.Application.getUserProfile(sniplist.id.toString))),format.raw/*35.225*/("""">"""),_display_(Seq[Any](/*35.228*/sniplist/*35.236*/.user.name)),format.raw/*35.246*/("""</a> </p>
            """)))})),format.raw/*36.14*/("""
        </div>

""")))};
Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*39.2*/("""


"""),_display_(Seq[Any](/*42.2*/if(!js)/*42.9*/ {_display_(Seq[Any](format.raw/*42.11*/("""
    """),_display_(Seq[Any](/*43.6*/main("Home", "home")/*43.26*/(content))),format.raw/*43.35*/("""
""")))}/*44.3*/else/*44.8*/{_display_(Seq[Any](format.raw/*44.9*/("""
    """),_display_(Seq[Any](/*45.6*/content)),format.raw/*45.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User],topSnips:List[models.Snip],topSniplists:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList,topSnips,topSniplists)
    
    def f:((java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList,topSnips,topSniplists) => apply(js,localUser,followingList,topSnips,topSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 03:15:33 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: 78c00264a3ed64baa94d48cf9c74402176e8b000
                    MATRIX: 854->1|1116->190|1130->197|1214->201|1413->364|1435->377|1462->382|1525->409|1568->436|1608->438|1692->486|1707->492|1776->538|1816->541|1831->546|1859->551|1909->569|2035->659|2072->680|2112->682|2166->700|2196->708|2329->805|2342->809|2379->824|2473->882|2486->886|2522->900|2586->928|2599->932|2631->942|2677->952|2690->956|2724->968|2798->1005|2814->1011|2887->1061|2927->1064|2941->1068|2974->1078|3059->1127|3082->1141|3122->1143|3237->1226|3283->1240|3413->1334|3458->1363|3498->1365|3588->1419|3605->1427|3642->1442|3733->1497|3748->1503|3829->1561|3869->1564|3887->1572|3915->1577|3991->1616|4007->1622|4079->1671|4119->1674|4137->1682|4170->1692|4225->1715|4283->148|4310->188|4338->1733|4377->1737|4392->1744|4432->1746|4473->1752|4502->1772|4533->1781|4553->1784|4565->1789|4603->1790|4644->1796|4673->1803
                    LINES: 26->1|29->4|29->4|31->4|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|41->14|45->18|45->18|45->18|46->19|46->19|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|52->25|52->25|52->25|55->28|56->29|60->33|60->33|60->33|61->34|61->34|61->34|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|63->36|67->1|68->3|69->39|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45
                    -- GENERATED --
                */
            