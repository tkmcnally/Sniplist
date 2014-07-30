
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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.MySnips,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, userSnips: models.MySnips):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(Seq[Any](/*3.2*/main("My Snips", "mySnips")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <div class="container mtb">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1> <h4 style="display: inline;">by """),_display_(Seq[Any](/*10.65*/userSnips/*10.74*/.user.name)),format.raw/*10.84*/("""</h4>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
                <table class="table table-default table-striped" style="border: black;">
                <thead>
                        <tr>
                            <th title="Song" align="right">Song</th>
                            <th title="Artist" align="right">Artist</th>
                            <th title="Album" align="right">Album</th>
                            <th class=""""),format.raw/*22.40*/("""{"""),format.raw/*22.41*/("""sorter: false"""),format.raw/*22.54*/("""}"""),format.raw/*22.55*/("""" title="*" align="center">*</th>
                            <th class=""""),format.raw/*23.40*/("""{"""),format.raw/*23.41*/("""sorter: false"""),format.raw/*23.54*/("""}"""),format.raw/*23.55*/("""" title="Play" align="right">Play</th>
                            <th class=""""),format.raw/*24.40*/("""{"""),format.raw/*24.41*/("""sorter: false"""),format.raw/*24.54*/("""}"""),format.raw/*24.55*/("""" title="Favourites" align="right"></th>

                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(Seq[Any](/*29.26*/for(snip <- userSnips.savedSnips) yield /*29.59*/ {_display_(Seq[Any](format.raw/*29.61*/("""
                            <tr class="evenrow table-snip" data-toggle="tooltip" data-placement="right" title="Saved!">
                                <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*31.75*/snip/*31.79*/.song_name)),format.raw/*31.89*/("""</td>
                                <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*32.76*/snip/*32.80*/.artist_name)),format.raw/*32.92*/("""</td>
                                <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*33.75*/snip/*33.79*/.album_name)),format.raw/*33.90*/("""</td>
                                <td align="left" class="left">
                                    <div class="dropdown">

                                        <a id=""""),_display_(Seq[Any](/*37.49*/snip/*37.53*/.id)),format.raw/*37.56*/("""" class="btn btn-sm dropdown-toggle center" data-toggle="dropdown" href="#">
                                            <span style="cursor:pointer" class="glyphicon glyphicon-share"></span>
                                        </a>

                                        <ul class="dropdown-menu" id="menu1">
                                            <li>
                                                <!-- Button trigger modal -->
                                                <a class="add-to-playlist-a" href="" align="left" data-toggle="modal" data-target="#add-to-playlist-modal">
                                                    Add to playlist
                                                </a></li>
                                            """),_display_(Seq[Any](/*47.46*/if(localUser.id != userSnips.user.id)/*47.83*/ {_display_(Seq[Any](format.raw/*47.85*/("""
                                                <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>Favourite Snip</a></li>
                                            """)))}/*49.47*/else/*49.52*/{_display_(Seq[Any](format.raw/*49.53*/("""
                                                <li class="divider"></li>
                                                <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>Delete</a></li>
                                            """)))})),format.raw/*52.46*/("""

                                        </ul>
                                    </div>
                                </td>
                                <td align="center" class="center valign-m ">
                                    <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                        <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
                                </td>
                                <td align="left" style="vertical-align: middle" class="left snip-favourite-count"><span class="alert-danger badge">"""),_display_(Seq[Any](/*61.149*/snip/*61.153*/.favouriteCount)),format.raw/*61.168*/("""</span></td>
                                <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*62.68*/snip/*62.72*/.id)),format.raw/*62.75*/("""" ></td>
                                <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*63.74*/snip/*63.78*/.url)),format.raw/*63.82*/(""""></td>
                                <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*64.81*/snip/*64.85*/.time_min)),format.raw/*64.94*/(""""></td>
                                <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*65.79*/snip/*65.83*/.time_max)),format.raw/*65.92*/(""""></td>

                            </tr>
                        """)))})),format.raw/*68.26*/("""
                    </tbody>


                </table>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="add-to-playlist-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="add-to-playlist-modal-title">Add to playlist</h4>
                </div>
                <div class="modal-body">
                    <div id="modal-message" class="alert alert-danger hidden">

                    </div>
                    <div id="modal-content">

                    </div>
                </div>
                <input id="selected-snip-id" type="text" hidden value=""/>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>



""")))})))}
    }
    
    def render(localUser:models.User,userSnips:models.MySnips): play.api.templates.HtmlFormat.Appendable = apply(localUser,userSnips)
    
    def f:((models.User,models.MySnips) => play.api.templates.HtmlFormat.Appendable) = (localUser,userSnips) => apply(localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 30 16:46:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: 13e4e259f623b2d1f4a987c3063e804c072af004
                    MATRIX: 804->1|956->59|993->62|1028->89|1067->91|1346->334|1364->343|1396->353|1920->849|1949->850|1990->863|2019->864|2120->937|2149->938|2190->951|2219->952|2325->1030|2354->1031|2395->1044|2424->1045|2614->1199|2663->1232|2703->1234|2934->1429|2947->1433|2979->1443|3096->1524|3109->1528|3143->1540|3259->1620|3272->1624|3305->1635|3518->1812|3531->1816|3556->1819|4362->2589|4408->2626|4448->2628|4655->2817|4668->2822|4707->2823|5005->3089|5696->3743|5710->3747|5748->3762|5864->3842|5877->3846|5902->3849|6020->3931|6033->3935|6059->3939|6183->4027|6196->4031|6227->4040|6349->4126|6362->4130|6393->4139|6493->4207
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|65->37|65->37|65->37|75->47|75->47|75->47|77->49|77->49|77->49|80->52|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|96->68
                    -- GENERATED --
                */
            