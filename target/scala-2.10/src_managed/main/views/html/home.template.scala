
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
    <div class="container mtb">
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
                <p>"""),_display_(Seq[Any](/*35.21*/sniplist/*35.29*/.name)),format.raw/*35.34*/(""" by """),_display_(Seq[Any](/*35.39*/sniplist/*35.47*/.user.name)),format.raw/*35.57*/(""" FavCount: """),_display_(Seq[Any](/*35.69*/sniplist/*35.77*/.favouriteCount)),format.raw/*35.92*/("""</p>
            """)))})),format.raw/*36.14*/("""
        </div>

    </div>
""")))};
Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*40.2*/("""


"""),_display_(Seq[Any](/*43.2*/if(!js)/*43.9*/ {_display_(Seq[Any](format.raw/*43.11*/("""
    """),_display_(Seq[Any](/*44.6*/main("Home", "home")/*44.26*/(content))),format.raw/*44.35*/("""
""")))}/*45.3*/else/*45.8*/{_display_(Seq[Any](format.raw/*45.9*/("""
    """),_display_(Seq[Any](/*46.6*/content)),format.raw/*46.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User],topSnips:List[models.Snip],topSniplists:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList,topSnips,topSniplists)
    
    def f:((java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList,topSnips,topSniplists) => apply(js,localUser,followingList,topSnips,topSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 18:07:54 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: 9618eb803a477a2f7eaba1c4d76733ff834ae7a8
                    MATRIX: 854->1|1116->190|1130->197|1214->201|1446->397|1468->410|1495->415|1558->442|1601->469|1641->471|1725->519|1740->525|1809->571|1849->574|1864->579|1892->584|1942->602|2068->692|2105->713|2145->715|2199->733|2229->741|2356->832|2369->836|2406->851|2478->887|2491->891|2527->905|2591->933|2604->937|2636->947|2682->957|2695->961|2729->973|2803->1010|2819->1016|2892->1066|2932->1069|2946->1073|2979->1083|3064->1132|3087->1146|3127->1148|3242->1231|3289->1246|3419->1340|3464->1369|3504->1371|3561->1392|3578->1400|3605->1405|3646->1410|3663->1418|3695->1428|3743->1440|3760->1448|3797->1463|3847->1481|3916->148|3943->188|3971->1510|4010->1514|4025->1521|4065->1523|4106->1529|4135->1549|4166->1558|4186->1561|4198->1566|4236->1567|4277->1573|4306->1580
                    LINES: 26->1|29->4|29->4|31->4|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|41->14|45->18|45->18|45->18|46->19|46->19|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|50->23|52->25|52->25|52->25|55->28|57->30|61->34|61->34|61->34|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|62->35|63->36|68->1|69->3|70->40|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46
                    -- GENERATED --
                */
            