
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
object viewPopular extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User, followingList: List[models.User], topSnips: List[models.Snip], topSniplists: List[models.Sniplist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

def /*4.6*/content/*4.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.17*/("""

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
            <div class="playlist-container" data-sniplist-id="popular-snips">
                """),_display_(Seq[Any](/*19.18*/for(snip <- topSnips) yield /*19.39*/ {_display_(Seq[Any](format.raw/*19.41*/("""
                    """),_display_(Seq[Any](/*20.22*/(i += 1))),format.raw/*20.30*/("""
                    <!-- Snip Track Wrapper -->
                    <div class="col-md-2 snip-module">
                        <div class="action-controls">
                            <i class="fa fa-heart """),_display_(Seq[Any](/*24.52*/if(localUser.favouriteSnips.contains(snip.id.toString))/*24.107*/{_display_(Seq[Any](format.raw/*24.108*/("""red""")))})),format.raw/*24.112*/(""" """),_display_(Seq[Any](/*24.114*/if(!localUser.id.equals(snip.user.id))/*24.152*/{_display_(Seq[Any](format.raw/*24.153*/("""fav""")))})),format.raw/*24.157*/(""" favourite-snip" data-snip-id=""""),_display_(Seq[Any](/*24.189*/snip/*24.193*/.id)),format.raw/*24.196*/(""""></i>&nbsp"""),_display_(Seq[Any](/*24.208*/snip/*24.212*/.favouriteCount)),format.raw/*24.227*/("""<br>

                        </div>
                        <div class="album-overlay-wrapper">

                            """),_display_(Seq[Any](/*29.30*/if(snip.thumbnail_url != null)/*29.60*/ {_display_(Seq[Any](format.raw/*29.62*/("""
                                <img width="100" height="100" class="img-thumbnail" src=""""),_display_(Seq[Any](/*30.91*/snip/*30.95*/.thumbnail_url)),format.raw/*30.109*/(""""/>
                            """)))}/*31.31*/else/*31.36*/{_display_(Seq[Any](format.raw/*31.37*/("""
                                <img width="100" height="100" class="img-thumbnail" src="http://media.virbcdn.com/cdn_images/crop_300x300/cd/default_song_album.jpg"/>
                            """)))})),format.raw/*33.30*/("""
                        <div class="action-controls">
                            <i class="fa fa-play fa-2x fa-inverse play-snippet" data-snip-id=""""),_display_(Seq[Any](/*35.96*/snip/*35.100*/.id)),format.raw/*35.103*/(""""></i>
                        </div>
                        </div>
                        <p>"""),_display_(Seq[Any](/*38.29*/snip/*38.33*/.song_name)),format.raw/*38.43*/(""" <br> by """),_display_(Seq[Any](/*38.53*/snip/*38.57*/.artist_name)),format.raw/*38.69*/(""" <br> <a class="dynamic-link" href=""""),_display_(Seq[Any](/*38.106*/routes/*38.112*/.Application.getUserProfile(snip.user.id.toString))),format.raw/*38.162*/("""">"""),_display_(Seq[Any](/*38.165*/snip/*38.169*/.user.name)),format.raw/*38.179*/("""</a></p>
                    </div>
                    """),_display_(Seq[Any](/*40.22*/if(i % 6 == 0)/*40.36*/ {_display_(Seq[Any](format.raw/*40.38*/("""
                        </div>
                        <div class="row">
                    """)))})),format.raw/*43.22*/("""
                """)))})),format.raw/*44.18*/("""
            </div>
        </div>
        <div class="row">
            <h2>Popular Sniplists</h2>
            """),_display_(Seq[Any](/*49.14*/for(sniplist <- topSniplists) yield /*49.43*/ {_display_(Seq[Any](format.raw/*49.45*/("""
                <div class="action-controls">
                    <i class="fa fa-heart fav favourite-sniplist red" data-sniplist-id=""""),_display_(Seq[Any](/*51.90*/sniplist/*51.98*/.id)),format.raw/*51.101*/(""""></i>&nbsp"""),_display_(Seq[Any](/*51.113*/sniplist/*51.121*/.favouriteCount)),format.raw/*51.136*/("""<br>
                </div>
                <p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*53.51*/routes/*53.57*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*53.115*/("""">"""),_display_(Seq[Any](/*53.118*/sniplist/*53.126*/.name)),format.raw/*53.131*/("""</a> by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*53.170*/routes/*53.176*/.Application.getUserProfile(sniplist.user.id.toString))),format.raw/*53.230*/("""">"""),_display_(Seq[Any](/*53.233*/sniplist/*53.241*/.user.name)),format.raw/*53.251*/("""</a> </p>
            """)))})),format.raw/*54.14*/("""
        </div>

    """)))};
Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""
    """),format.raw/*57.6*/("""


"""),_display_(Seq[Any](/*60.2*/if(!js)/*60.9*/ {_display_(Seq[Any](format.raw/*60.11*/("""
    """),_display_(Seq[Any](/*61.6*/main("Popular", "popular")/*61.32*/(content))),format.raw/*61.41*/("""
""")))}/*62.3*/else/*62.8*/{_display_(Seq[Any](format.raw/*62.9*/("""
    """),_display_(Seq[Any](/*63.6*/content)),format.raw/*63.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User],topSnips:List[models.Snip],topSniplists:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList,topSnips,topSniplists)
    
    def f:((java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList,topSnips,topSniplists) => apply(js,localUser,followingList,topSnips,topSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 20 17:23:40 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/viewPopular.scala.html
                    HASH: 83bf45040f8d043c748c8b9acac5513d23cddb1e
                    MATRIX: 861->1|1123->194|1138->201|1222->205|1421->368|1443->381|1470->386|1533->413|1576->440|1616->442|1680->470|1695->476|1767->526|1915->637|1931->643|2000->689|2040->692|2055->697|2083->702|2133->720|2341->892|2378->913|2418->915|2476->937|2506->945|2751->1154|2816->1209|2856->1210|2893->1214|2932->1216|2980->1254|3020->1255|3057->1259|3126->1291|3140->1295|3166->1298|3215->1310|3229->1314|3267->1329|3430->1456|3469->1486|3509->1488|3636->1579|3649->1583|3686->1597|3738->1631|3751->1636|3790->1637|4019->1834|4205->1984|4219->1988|4245->1991|4378->2088|4391->2092|4423->2102|4469->2112|4482->2116|4516->2128|4590->2165|4606->2171|4679->2221|4719->2224|4733->2228|4766->2238|4859->2295|4882->2309|4922->2311|5049->2406|5099->2424|5248->2537|5293->2566|5333->2568|5505->2704|5522->2712|5548->2715|5597->2727|5615->2735|5653->2750|5767->2828|5782->2834|5863->2892|5903->2895|5921->2903|5949->2908|6025->2947|6041->2953|6118->3007|6158->3010|6176->3018|6209->3028|6264->3051|6326->148|6353->188|6385->3073|6424->3077|6439->3084|6479->3086|6520->3092|6555->3118|6586->3127|6606->3130|6618->3135|6656->3136|6697->3142|6726->3149
                    LINES: 26->1|29->4|29->4|31->4|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|40->13|41->14|46->19|46->19|46->19|47->20|47->20|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|51->24|56->29|56->29|56->29|57->30|57->30|57->30|58->31|58->31|58->31|60->33|62->35|62->35|62->35|65->38|65->38|65->38|65->38|65->38|65->38|65->38|65->38|65->38|65->38|65->38|65->38|67->40|67->40|67->40|70->43|71->44|76->49|76->49|76->49|78->51|78->51|78->51|78->51|78->51|78->51|80->53|80->53|80->53|80->53|80->53|80->53|80->53|80->53|80->53|80->53|80->53|80->53|81->54|85->1|86->3|87->57|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63
                    -- GENERATED --
                */
            