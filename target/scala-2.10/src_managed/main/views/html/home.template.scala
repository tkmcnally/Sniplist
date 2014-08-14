
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
                <img src=""""),_display_(Seq[Any](/*13.28*/routes/*13.34*/.Application.getImage(String.valueOf(fUser.photo)))),format.raw/*13.84*/("""" class="avatar img-circle img-thumbnail" alt="avatar" width="100" height="100"><a class="dynamic-link" href=""""),_display_(Seq[Any](/*13.195*/routes/*13.201*/.Application.getUserProfile(fUser.id.toString))),format.raw/*13.247*/("""">"""),_display_(Seq[Any](/*13.250*/fUser/*13.255*/.name)),format.raw/*13.260*/("""</a>
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
                    DATE: Thu Aug 14 01:49:28 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: dfebcf907187d32a9c393793d7e04962fd6c8ff3
                    MATRIX: 854->1|1116->190|1130->197|1214->201|1413->364|1435->377|1462->382|1525->409|1568->436|1608->438|1672->466|1687->472|1759->522|1907->633|1923->639|1992->685|2032->688|2047->693|2075->698|2125->716|2251->806|2288->827|2328->829|2382->847|2412->855|2545->952|2558->956|2595->971|2689->1029|2702->1033|2738->1047|2802->1075|2815->1079|2847->1089|2893->1099|2906->1103|2940->1115|3014->1152|3030->1158|3103->1208|3143->1211|3157->1215|3190->1225|3275->1274|3298->1288|3338->1290|3453->1373|3499->1387|3629->1481|3674->1510|3714->1512|3804->1566|3821->1574|3858->1589|3949->1644|3964->1650|4045->1708|4085->1711|4103->1719|4131->1724|4207->1763|4223->1769|4295->1818|4335->1821|4353->1829|4386->1839|4441->1862|4499->148|4526->188|4554->1880|4593->1884|4608->1891|4648->1893|4689->1899|4718->1919|4749->1928|4769->1931|4781->1936|4819->1937|4860->1943|4889->1950
                    LINES: 26->1|29->4|29->4|31->4|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|45->18|45->18|45->18|46->19|46->19|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|52->25|52->25|52->25|55->28|56->29|60->33|60->33|60->33|61->34|61->34|61->34|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|63->36|67->1|68->3|69->39|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45
                    -- GENERATED --
                */
            