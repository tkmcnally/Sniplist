
package views.html.sniplists

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
object arraySniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,List[models.SnipList],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, snipLists: List[models.SnipList]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*3.1*/("""
<div class="row ">
"""),_display_(Seq[Any](/*5.2*/for(sniplist <- snipLists) yield /*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),_display_(Seq[Any](/*6.6*/(i += 1))),format.raw/*6.14*/("""
    <div class="col-lg-6">
        <table class="table table-default table-striped" style="border: black;" value=""""),_display_(Seq[Any](/*8.89*/sniplist/*8.97*/.id)),format.raw/*8.100*/("""">
            <thead>
                <tr>
                    <th title="Name" colspan="5" align="right">"""),_display_(Seq[Any](/*11.65*/sniplist/*11.73*/.name)),format.raw/*11.78*/(""" <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span> </th>
                </tr>
                <tr>
                    <th title="Song" align="right">Song</th>
                    <th title="Artist" align="right">Artist</th>
                    <th title="Album" align="right">Album</th>
                    <th class=""""),format.raw/*17.32*/("""{"""),format.raw/*17.33*/("""sorter: false"""),format.raw/*17.46*/("""}"""),format.raw/*17.47*/("""" title="Play" align="right">Play</th>
                    <th title="Remove"></th>
                </tr>
            </thead>
            <tbody>
            """),_display_(Seq[Any](/*22.14*/for(snip <- sniplist.snips) yield /*22.41*/ {_display_(Seq[Any](format.raw/*22.43*/("""
                <tr>
                    <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*24.63*/snip/*24.67*/.song_name)),format.raw/*24.77*/("""</td>
                    <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*25.64*/snip/*25.68*/.artist_name)),format.raw/*25.80*/("""</td>
                    <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*26.63*/snip/*26.67*/.album_name)),format.raw/*26.78*/("""</td>
                    <td align="left" class="left valign-m">
                        <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                            <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
                    </td>
                    <td class="center valign-m">
                        <span style="cursor:pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*32.130*/snip/*32.134*/.id)),format.raw/*32.137*/(""""></span>
                    </td>
                    <td class="hidden snip-id" id=""""),_display_(Seq[Any](/*34.53*/snip/*34.57*/.id)),format.raw/*34.60*/("""" ></td>
                    <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*35.62*/snip/*35.66*/.url)),format.raw/*35.70*/(""""></td>
                    <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*36.69*/snip/*36.73*/.time_min)),format.raw/*36.82*/(""""></td>
                    <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*37.67*/snip/*37.71*/.time_max)),format.raw/*37.80*/(""""></td>
                </tr>
            """)))})),format.raw/*39.14*/("""
            </tbody>
        </table>
    </div>
    """),_display_(Seq[Any](/*43.6*/if(i % 2 == 0)/*43.20*/ {_display_(Seq[Any](format.raw/*43.22*/("""
    </div>
<div class="row">
""")))})),format.raw/*46.2*/("""
""")))})),format.raw/*47.2*/("""
</div>
"""))}
    }
    
    def render(localUser:models.User,snipLists:List[models.SnipList]): play.api.templates.HtmlFormat.Appendable = apply(localUser,snipLists)
    
    def f:((models.User,List[models.SnipList]) => play.api.templates.HtmlFormat.Appendable) = (localUser,snipLists) => apply(localUser,snipLists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 29 00:19:32 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/arraySniplists.scala.html
                    HASH: 5e57a1b4577ad8bf7fd9d9b30131b1538c357a6c
                    MATRIX: 820->1|1017->66|1044->106|1099->127|1140->153|1179->155|1219->161|1248->169|1399->285|1415->293|1440->296|1584->404|1601->412|1628->417|2055->816|2084->817|2125->830|2154->831|2350->991|2393->1018|2433->1020|2553->1104|2566->1108|2598->1118|2703->1187|2716->1191|2750->1203|2854->1271|2867->1275|2900->1286|3445->1794|3459->1798|3485->1801|3609->1889|3622->1893|3647->1896|3753->1966|3766->1970|3792->1974|3904->2050|3917->2054|3948->2063|4058->2137|4071->2141|4102->2150|4177->2193|4267->2248|4290->2262|4330->2264|4392->2295|4425->2297
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|60->32|60->32|60->32|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|67->39|71->43|71->43|71->43|74->46|75->47
                    -- GENERATED --
                */
            