
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
object viewRecent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User, followingList: List[models.User], recentSnips: List[models.Snip], recentSniplists: List[models.Sniplist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

import util.SniplistUtil;

def /*4.6*/content/*4.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.17*/("""

        <div class="row">
            <h1>Recent</h1>
            <div class="hline"></div>
        </div>
        <div class="row">
            <h2>Recent Snips</h2>
            <div class="playlist-container" data-sniplist-id="recent-snips">
                """),_display_(Seq[Any](/*13.18*/for(snip <- recentSnips) yield /*13.42*/ {_display_(Seq[Any](format.raw/*13.44*/("""
                    """),_display_(Seq[Any](/*14.22*/(i += 1))),format.raw/*14.30*/("""
                        <!-- Snip Track Wrapper -->
                    <div class="col-md-2 snip-module">
                        <div class="action-controls">
                            <i class="fa fa-heart """),_display_(Seq[Any](/*18.52*/if(localUser.favouriteSnips.contains(snip.id.toString))/*18.107*/{_display_(Seq[Any](format.raw/*18.108*/("""red""")))})),format.raw/*18.112*/(""" """),_display_(Seq[Any](/*18.114*/if(!localUser.id.equals(snip.user.id))/*18.152*/{_display_(Seq[Any](format.raw/*18.153*/("""fav""")))})),format.raw/*18.157*/(""" favourite-snip" data-snip-id=""""),_display_(Seq[Any](/*18.189*/snip/*18.193*/.id)),format.raw/*18.196*/(""""></i>&nbsp"""),_display_(Seq[Any](/*18.208*/snip/*18.212*/.favouriteCount)),format.raw/*18.227*/("""<br><i>"""),_display_(Seq[Any](/*18.235*/SniplistUtil/*18.247*/.timeElapsed(snip.creation_date))),format.raw/*18.279*/("""</i>

                        </div>
                        <div class="album-overlay-wrapper">

                            """),_display_(Seq[Any](/*23.30*/if(snip.thumbnail_url != null)/*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
                                <img width="100" height="100" class="img-thumbnail" src=""""),_display_(Seq[Any](/*24.91*/snip/*24.95*/.thumbnail_url)),format.raw/*24.109*/(""""/>
                            """)))}/*25.31*/else/*25.36*/{_display_(Seq[Any](format.raw/*25.37*/("""
                                <img width="100" height="100" class="img-thumbnail" src="http://media.virbcdn.com/cdn_images/crop_300x300/cd/default_song_album.jpg"/>
                            """)))})),format.raw/*27.30*/("""
                        <div class="action-controls">
                            <i class="fa fa-play fa-2x fa-inverse play-snippet" data-snip-id=""""),_display_(Seq[Any](/*29.96*/snip/*29.100*/.id)),format.raw/*29.103*/(""""></i>
                        </div>
                        </div>
                        <p>"""),_display_(Seq[Any](/*32.29*/snip/*32.33*/.song_name)),format.raw/*32.43*/(""" <br> by """),_display_(Seq[Any](/*32.53*/snip/*32.57*/.artist_name)),format.raw/*32.69*/(""" <br> <a class="dynamic-link" href=""""),_display_(Seq[Any](/*32.106*/routes/*32.112*/.Application.getUserProfile(snip.user.id.toString))),format.raw/*32.162*/("""">"""),_display_(Seq[Any](/*32.165*/snip/*32.169*/.user.name)),format.raw/*32.179*/("""</a></p>
                    </div>
                    """),_display_(Seq[Any](/*34.22*/if(i % 6 == 0)/*34.36*/ {_display_(Seq[Any](format.raw/*34.38*/("""
                        </div>
                        <div class="row">
                    """)))})),format.raw/*37.22*/("""
                """)))})),format.raw/*38.18*/("""
            </div>
        </div>
        <div class="row">
            <h2>Recent Sniplists</h2>
            """),_display_(Seq[Any](/*43.14*/for(sniplist <- recentSniplists) yield /*43.46*/ {_display_(Seq[Any](format.raw/*43.48*/("""
                <i class="fa fa-heart red"></i>&nbsp"""),_display_(Seq[Any](/*44.54*/sniplist/*44.62*/.favouriteCount)),format.raw/*44.77*/(""" <br><i>"""),_display_(Seq[Any](/*44.86*/SniplistUtil/*44.98*/.timeElapsed(sniplist.creation_date))),format.raw/*44.134*/("""</i><br>
                <p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*45.51*/routes/*45.57*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*45.115*/("""">"""),_display_(Seq[Any](/*45.118*/sniplist/*45.126*/.name)),format.raw/*45.131*/("""</a> by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*45.170*/routes/*45.176*/.Application.getUserProfile(sniplist.id.toString))),format.raw/*45.225*/("""">"""),_display_(Seq[Any](/*45.228*/sniplist/*45.236*/.user.name)),format.raw/*45.246*/("""</a> </p>
            """)))})),format.raw/*46.14*/("""
        </div>

    """)))};
Seq[Any](format.raw/*1.155*/("""
"""),format.raw/*4.1*/("""    """),format.raw/*49.6*/("""


"""),_display_(Seq[Any](/*52.2*/if(!js)/*52.9*/ {_display_(Seq[Any](format.raw/*52.11*/("""
    """),_display_(Seq[Any](/*53.6*/main("Recent", "recent")/*53.30*/(content))),format.raw/*53.39*/("""
""")))}/*54.3*/else/*54.8*/{_display_(Seq[Any](format.raw/*54.9*/("""
    """),_display_(Seq[Any](/*55.6*/content)),format.raw/*55.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User],recentSnips:List[models.Snip],recentSniplists:List[models.Sniplist]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList,recentSnips,recentSniplists)
    
    def f:((java.lang.Boolean,models.User,List[models.User],List[models.Snip],List[models.Sniplist]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList,recentSnips,recentSniplists) => apply(js,localUser,followingList,recentSnips,recentSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 18 13:58:50 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/viewRecent.scala.html
                    HASH: 22e4ace2369df0afd78a66a7032931b183d2c871
                    MATRIX: 860->1|1155->226|1170->233|1254->237|1553->500|1593->524|1633->526|1691->548|1721->556|1970->769|2035->824|2075->825|2112->829|2151->831|2199->869|2239->870|2276->874|2345->906|2359->910|2385->913|2434->925|2448->929|2486->944|2531->952|2553->964|2608->996|2771->1123|2810->1153|2850->1155|2977->1246|2990->1250|3027->1264|3079->1298|3092->1303|3131->1304|3360->1501|3546->1651|3560->1655|3586->1658|3719->1755|3732->1759|3764->1769|3810->1779|3823->1783|3857->1795|3931->1832|3947->1838|4020->1888|4060->1891|4074->1895|4107->1905|4200->1962|4223->1976|4263->1978|4390->2073|4440->2091|4588->2203|4636->2235|4676->2237|4766->2291|4783->2299|4820->2314|4865->2323|4886->2335|4945->2371|5040->2430|5055->2436|5136->2494|5176->2497|5194->2505|5222->2510|5298->2549|5314->2555|5386->2604|5426->2607|5444->2615|5477->2625|5532->2648|5594->154|5621->221|5652->2670|5691->2674|5706->2681|5746->2683|5787->2689|5820->2713|5851->2722|5871->2725|5883->2730|5921->2731|5962->2737|5991->2744
                    LINES: 26->1|31->4|31->4|33->4|42->13|42->13|42->13|43->14|43->14|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|47->18|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|56->27|58->29|58->29|58->29|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|63->34|63->34|63->34|66->37|67->38|72->43|72->43|72->43|73->44|73->44|73->44|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|74->45|74->45|74->45|74->45|74->45|74->45|74->45|75->46|79->1|80->4|80->49|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55
                    -- GENERATED --
                */
            