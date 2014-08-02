
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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.MySnips,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, userSnips: models.MySnips):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mtb">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1> <h4 style="display : inline ;">by """),_display_(Seq[Any](/*10.67*/userSnips/*10.76*/.user.name)),format.raw/*10.86*/("""</h4>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
                <table class="table table-default table-striped" value="user" id=""""),_display_(Seq[Any](/*16.84*/userSnips/*16.93*/.id)),format.raw/*16.96*/("""" style="border : black ;">
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
                    """),_display_(Seq[Any](/*29.22*/for(snip <- userSnips.savedSnips) yield /*29.55*/ {_display_(Seq[Any](format.raw/*29.57*/("""
                        <tr class="evenrow table-snip" data-toggle="tooltip" data-placement="right" title="Saved!">
                            <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*31.71*/snip/*31.75*/.song_name)),format.raw/*31.85*/("""</td>
                            <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*32.72*/snip/*32.76*/.artist_name)),format.raw/*32.88*/("""</td>
                            <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*33.71*/snip/*33.75*/.album_name)),format.raw/*33.86*/("""</td>
                            <td align="left" class="left">
                                <div class="dropdown">

                                    <a id=""""),_display_(Seq[Any](/*37.45*/snip/*37.49*/.id)),format.raw/*37.52*/("""" class="btn btn-sm dropdown-toggle center" data-toggle="dropdown" href="#">
                                        <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                                    </a>

                                    <ul class="dropdown-menu" id="menu1">
                                        <li>
                                                <!-- Button trigger modal -->
                                            <a class="add-to-playlist-a" href="" align="left" data-toggle="modal" data-target="#add-to-playlist-modal">
                                                    Add to playlist
                                            </a></li>
                                        <li><a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*47.150*/routes/*47.156*/.Snips.viewSnipById(snip.id.toString))),format.raw/*47.193*/("""">
                                            Share Snip</a></li>
                                        """),_display_(Seq[Any](/*49.42*/if(localUser.id != userSnips.user.id)/*49.79*/ {_display_(Seq[Any](format.raw/*49.81*/("""
                                            <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>
                                                Favourite Snip</a></li>
                                        """)))}/*52.43*/else/*52.48*/{_display_(Seq[Any](format.raw/*52.49*/("""
                                            <li class="divider"></li>
                                            <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>
                                                Delete</a></li>
                                        """)))})),format.raw/*56.42*/("""

                                    </ul>
                                </div>
                            </td>
                            <td align="center" class="center valign-m ">
                                <span style="cursor : pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                    <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
                            </td>
                            <td align="left" style="vertical-align : middle" class="left snip-favourite-count"><span class="alert-danger badge">"""),_display_(Seq[Any](/*65.146*/snip/*65.150*/.favouriteCount)),format.raw/*65.165*/("""</span></td>
                            <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*66.64*/snip/*66.68*/.id)),format.raw/*66.71*/("""" ></td>
                            <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*67.70*/snip/*67.74*/.url)),format.raw/*67.78*/(""""></td>
                            <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*68.77*/snip/*68.81*/.time_min)),format.raw/*68.90*/(""""></td>
                            <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*69.75*/snip/*69.79*/.time_max)),format.raw/*69.88*/(""""></td>

                        </tr>
                    """)))})),format.raw/*72.22*/("""
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
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
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


    <!-- Modal -->
    <div class="modal fade" id="share-link-modal" tabindex="-1" role="dialog" aria-labelledby="shareLinkModal" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="share-link-modal-header">Share with friends!</h4>
                </div>
                <div class="modal-body">
                    <div class="input-group input-group-sm">
                        <span class="input-group-addon">Link:</span>
                            <input id="share-link-modal-input" type="text" class="form-control" placeholder="">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*127.2*/("""


 """),_display_(Seq[Any](/*130.3*/if(!js)/*130.10*/ {_display_(Seq[Any](format.raw/*130.12*/("""
    """),_display_(Seq[Any](/*131.6*/main("My Snips", "mySnips")/*131.33*/(content))),format.raw/*131.42*/("""
""")))}/*132.3*/else/*132.8*/{_display_(Seq[Any](format.raw/*132.9*/("""
    """),_display_(Seq[Any](/*133.6*/content)),format.raw/*133.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.MySnips): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.MySnips) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 01 22:22:40 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: 3a792e3e8403ba68e2d35326e53d511c78ae40f4
                    MATRIX: 822->1|980->85|994->92|1078->96|1359->341|1377->350|1409->360|1630->545|1648->554|1673->557|2038->894|2067->895|2108->908|2137->909|2238->982|2267->983|2308->996|2337->997|2443->1075|2472->1076|2513->1089|2542->1090|2728->1240|2777->1273|2817->1275|3040->1462|3053->1466|3085->1476|3198->1553|3211->1557|3245->1569|3357->1645|3370->1649|3403->1660|3604->1825|3617->1829|3642->1832|4531->2684|4547->2690|4607->2727|4751->2835|4797->2872|4837->2874|5085->3104|5098->3109|5137->3110|5472->3413|6134->4038|6148->4042|6186->4057|6298->4133|6311->4137|6336->4140|6450->4218|6463->4222|6489->4226|6609->4310|6622->4314|6653->4323|6771->4405|6784->4409|6815->4418|6907->4478|9149->82|9179->6681|9220->6686|9237->6693|9278->6695|9320->6701|9357->6728|9389->6737|9410->6740|9423->6745|9462->6746|9504->6752|9534->6759
                    LINES: 26->1|28->3|28->3|30->3|37->10|37->10|37->10|43->16|43->16|43->16|49->22|49->22|49->22|49->22|50->23|50->23|50->23|50->23|51->24|51->24|51->24|51->24|56->29|56->29|56->29|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|64->37|64->37|64->37|74->47|74->47|74->47|76->49|76->49|76->49|79->52|79->52|79->52|83->56|92->65|92->65|92->65|93->66|93->66|93->66|94->67|94->67|94->67|95->68|95->68|95->68|96->69|96->69|96->69|99->72|155->1|157->127|160->130|160->130|160->130|161->131|161->131|161->131|162->132|162->132|162->132|163->133|163->133
                    -- GENERATED --
                */
            