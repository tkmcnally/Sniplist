
package views.html.snips

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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,List[models.Snip],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, snipList: List[models.Snip]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(Seq[Any](/*3.2*/main("My Snips", "mySnips")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <div class="container mtb">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
                <table class="table table-dark table-bordered table-stripeds" style="border: black;">
                <thead>
                        <tr>
                            <th title="Song" align="right">Song</th>
                            <th title="Artist" align="right">Artist</th>
                            <th title="Album" align="right">Album</th>
                            <th class=""""),format.raw/*22.40*/("""{"""),format.raw/*22.41*/("""sorter: false"""),format.raw/*22.54*/("""}"""),format.raw/*22.55*/("""" title="Sniplists" align="right">Sniplists</th>
                            <th class=""""),format.raw/*23.40*/("""{"""),format.raw/*23.41*/("""sorter: false"""),format.raw/*23.54*/("""}"""),format.raw/*23.55*/("""" title="*" align="center">*</th>
                            <th class=""""),format.raw/*24.40*/("""{"""),format.raw/*24.41*/("""sorter: false"""),format.raw/*24.54*/("""}"""),format.raw/*24.55*/("""" title="Play" align="right">Play</th>

                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(Seq[Any](/*29.26*/for(snip <- snipList) yield /*29.47*/ {_display_(Seq[Any](format.raw/*29.49*/("""
                            <tr class="evenrow">
                                <td align="center" class="right">"""),_display_(Seq[Any](/*31.67*/snip/*31.71*/.song_name)),format.raw/*31.81*/("""</td>
                                <td align="right" class="right">"""),_display_(Seq[Any](/*32.66*/snip/*32.70*/.artist_name)),format.raw/*32.82*/("""</td>
                                <td align="right" class="right">"""),_display_(Seq[Any](/*33.66*/snip/*33.70*/.album_name)),format.raw/*33.81*/("""</td>
                                <td align="right" class="right">-></td>
                                <td align="right" class="right">
                                    <div class="dropdown">

                                        <a id=""""),_display_(Seq[Any](/*38.49*/snip/*38.53*/.id)),format.raw/*38.56*/("""" class="btn btn-sm dropdown-toggle" data-toggle="dropdown" href="#">+
                                        </a>

                                        <ul class="dropdown-menu">

                                            <li><a align="left" href="">Add to Playlist -></a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Save as Snip</a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Share on Sniplist</a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Share on -></a></li>
                                            <li class="divider"></li>
                                            <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>Delete</a></li>
                                        </ul>
                                    </div>
                                </td>
                                <td align="right" class="right"><a href="http://www.youtube.com/v/"""),_display_(Seq[Any](/*52.100*/snip/*52.104*/.url)),format.raw/*52.108*/("""?start="""),_display_(Seq[Any](/*52.116*/snip/*52.120*/.time_min)),format.raw/*52.129*/("""&end="""),_display_(Seq[Any](/*52.135*/snip/*52.139*/.time_max)),format.raw/*52.148*/("""&version=3">Play!</a></td>
                                <td class="hidden snip-id" id=""""),_display_(Seq[Any](/*53.65*/snip/*53.69*/.id)),format.raw/*53.72*/("""" ></td>
                            </tr>
                        """)))})),format.raw/*55.26*/("""
                    </tbody>


                </table>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>



""")))})))}
    }
    
    def render(localUser:models.User,snipList:List[models.Snip]): play.api.templates.HtmlFormat.Appendable = apply(localUser,snipList)
    
    def f:((models.User,List[models.Snip]) => play.api.templates.HtmlFormat.Appendable) = (localUser,snipList) => apply(localUser,snipList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 25 02:57:50 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: 6c7926ec20f0f7c8ce78d260495334949dfe3722
                    MATRIX: 807->1|961->61|998->64|1033->91|1072->93|1813->806|1842->807|1883->820|1912->821|2028->909|2057->910|2098->923|2127->924|2228->997|2257->998|2298->1011|2327->1012|2515->1164|2552->1185|2592->1187|2744->1303|2757->1307|2789->1317|2896->1388|2909->1392|2943->1404|3050->1475|3063->1479|3096->1490|3383->1741|3396->1745|3421->1748|4539->2829|4553->2833|4580->2837|4625->2845|4639->2849|4671->2858|4714->2864|4728->2868|4760->2877|4887->2968|4900->2972|4925->2975|5025->3043
                    LINES: 26->1|29->1|31->3|31->3|31->3|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|66->38|66->38|66->38|80->52|80->52|80->52|80->52|80->52|80->52|80->52|80->52|80->52|81->53|81->53|81->53|83->55
                    -- GENERATED --
                */
            