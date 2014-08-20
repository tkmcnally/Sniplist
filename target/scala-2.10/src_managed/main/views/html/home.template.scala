
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
                    <div class="albumPlayOverlay">
                        """),_display_(Seq[Any](/*23.26*/if(snip.thumbnail_url != null)/*23.56*/ {_display_(Seq[Any](format.raw/*23.58*/("""
                            <img class="img-thumbnail" src=""""),_display_(Seq[Any](/*24.62*/snip/*24.66*/.thumbnail_url)),format.raw/*24.80*/(""""/>
                        """)))}/*25.27*/else/*25.32*/{_display_(Seq[Any](format.raw/*25.33*/("""
                            <img class="img-thumbnail" src="http://media.virbcdn.com/cdn_images/crop_300x300/cd/default_song_album.jpg"/>
                        """)))})),format.raw/*27.26*/("""
                        <i class="fa fa-play"></i>
                        </div>
                    <p>"""),_display_(Seq[Any](/*30.25*/snip/*30.29*/.song_name)),format.raw/*30.39*/(""" <br> by """),_display_(Seq[Any](/*30.49*/snip/*30.53*/.artist_name)),format.raw/*30.65*/(""" <br> <a class="dynamic-link" href=""""),_display_(Seq[Any](/*30.102*/routes/*30.108*/.Application.getUserProfile(snip.user.id.toString))),format.raw/*30.158*/("""">"""),_display_(Seq[Any](/*30.161*/snip/*30.165*/.user.name)),format.raw/*30.175*/("""</a></p>
                </div>
                """),_display_(Seq[Any](/*32.18*/if(i % 6 == 0)/*32.32*/ {_display_(Seq[Any](format.raw/*32.34*/("""
                    </div>
                    <div class="row">
                """)))})),format.raw/*35.18*/("""
            """)))})),format.raw/*36.14*/("""
        </div>
        <div class="row">
            <h2>Popular Sniplists</h2>
            """),_display_(Seq[Any](/*40.14*/for(sniplist <- topSniplists) yield /*40.43*/ {_display_(Seq[Any](format.raw/*40.45*/("""
                <i class="fa fa-heart red"></i>&nbsp"""),_display_(Seq[Any](/*41.54*/sniplist/*41.62*/.favouriteCount)),format.raw/*41.77*/("""<br>
                <p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*42.51*/routes/*42.57*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*42.115*/("""">"""),_display_(Seq[Any](/*42.118*/sniplist/*42.126*/.name)),format.raw/*42.131*/("""</a> by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*42.170*/routes/*42.176*/.Application.getUserProfile(sniplist.id.toString))),format.raw/*42.225*/("""">"""),_display_(Seq[Any](/*42.228*/sniplist/*42.236*/.user.name)),format.raw/*42.246*/("""</a> </p>
            """)))})),format.raw/*43.14*/("""
        </div>

""")))};
Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*46.2*/("""


"""),_display_(Seq[Any](/*49.2*/if(!js)/*49.9*/ {_display_(Seq[Any](format.raw/*49.11*/("""
    """),_display_(Seq[Any](/*50.6*/main("Home", "home")/*50.26*/(content))),format.raw/*50.35*/("""
""")))}/*51.3*/else/*51.8*/{_display_(Seq[Any](format.raw/*51.9*/("""
    """),_display_(Seq[Any](/*52.6*/content)),format.raw/*52.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User],topSnips:List[models.Snip],topSniplists:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList,topSnips,topSniplists)
    
    def f:((java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList,topSnips,topSniplists) => apply(js,localUser,followingList,topSnips,topSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:54 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: 15a0d386e0841ddda97156e09bf613c339eaba9b
                    MATRIX: 854->1|1116->190|1130->197|1214->201|1413->364|1435->377|1462->382|1525->409|1568->436|1608->438|1672->466|1687->472|1759->522|1907->633|1923->639|1992->685|2032->688|2047->693|2075->698|2125->716|2251->806|2288->827|2328->829|2382->847|2412->855|2545->952|2558->956|2595->971|2712->1052|2751->1082|2791->1084|2889->1146|2902->1150|2938->1164|2986->1194|2999->1199|3038->1200|3234->1364|3377->1471|3390->1475|3422->1485|3468->1495|3481->1499|3515->1511|3589->1548|3605->1554|3678->1604|3718->1607|3732->1611|3765->1621|3850->1670|3873->1684|3913->1686|4028->1769|4074->1783|4204->1877|4249->1906|4289->1908|4379->1962|4396->1970|4433->1985|4524->2040|4539->2046|4620->2104|4660->2107|4678->2115|4706->2120|4782->2159|4798->2165|4870->2214|4910->2217|4928->2225|4961->2235|5016->2258|5074->148|5101->188|5129->2276|5168->2280|5183->2287|5223->2289|5264->2295|5293->2315|5324->2324|5344->2327|5356->2332|5394->2333|5435->2339|5464->2346
                    LINES: 26->1|29->4|29->4|31->4|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|45->18|45->18|45->18|46->19|46->19|48->21|48->21|48->21|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|54->27|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|57->30|59->32|59->32|59->32|62->35|63->36|67->40|67->40|67->40|68->41|68->41|68->41|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|69->42|70->43|74->1|75->3|76->46|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52
                    -- GENERATED --
                */
            