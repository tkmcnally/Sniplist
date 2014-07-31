
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
                <table class="table table-default table-striped" value="default" style="border : black ;">
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
                                        """),_display_(Seq[Any](/*47.42*/if(localUser.id != userSnips.user.id)/*47.79*/ {_display_(Seq[Any](format.raw/*47.81*/("""
                                            <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>
                                                Favourite Snip</a></li>
                                        """)))}/*50.43*/else/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/("""
                                            <li class="divider"></li>
                                            <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>
                                                Delete</a></li>
                                        """)))})),format.raw/*54.42*/("""

                                    </ul>
                                </div>
                            </td>
                            <td align="center" class="center valign-m ">
                                <span style="cursor : pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                    <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
                            </td>
                            <td align="left" style="vertical-align : middle" class="left snip-favourite-count"><span class="alert-danger badge">"""),_display_(Seq[Any](/*63.146*/snip/*63.150*/.favouriteCount)),format.raw/*63.165*/("""</span></td>
                            <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*64.64*/snip/*64.68*/.id)),format.raw/*64.71*/("""" ></td>
                            <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*65.70*/snip/*65.74*/.url)),format.raw/*65.78*/(""""></td>
                            <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*66.77*/snip/*66.81*/.time_min)),format.raw/*66.90*/(""""></td>
                            <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*67.75*/snip/*67.79*/.time_max)),format.raw/*67.88*/(""""></td>

                        </tr>
                    """)))})),format.raw/*70.22*/("""
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
""")))};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*104.2*/("""


 """),_display_(Seq[Any](/*107.3*/if(!js)/*107.10*/ {_display_(Seq[Any](format.raw/*107.12*/("""
    """),_display_(Seq[Any](/*108.6*/main("My Snips", "mySnips")/*108.33*/(content))),format.raw/*108.42*/("""
""")))}/*109.3*/else/*109.8*/{_display_(Seq[Any](format.raw/*109.9*/("""
    """),_display_(Seq[Any](/*110.6*/content)),format.raw/*110.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.MySnips): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.MySnips) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 31 02:29:37 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: ce2644750fdf8ed18678b13a0ecc5014776218d0
                    MATRIX: 822->1|980->85|994->92|1078->96|1359->341|1377->350|1409->360|1955->878|1984->879|2025->892|2054->893|2155->966|2184->967|2225->980|2254->981|2360->1059|2389->1060|2430->1073|2459->1074|2645->1224|2694->1257|2734->1259|2957->1446|2970->1450|3002->1460|3115->1537|3128->1541|3162->1553|3274->1629|3287->1633|3320->1644|3521->1809|3534->1813|3559->1816|4339->2560|4385->2597|4425->2599|4673->2829|4686->2834|4725->2835|5060->3138|5722->3763|5736->3767|5774->3782|5886->3858|5899->3862|5924->3865|6038->3943|6051->3947|6077->3951|6197->4035|6210->4039|6241->4048|6359->4130|6372->4134|6403->4143|6495->4203|7788->82|7818->5457|7859->5462|7876->5469|7917->5471|7959->5477|7996->5504|8028->5513|8049->5516|8062->5521|8101->5522|8143->5528|8173->5535
                    LINES: 26->1|28->3|28->3|30->3|37->10|37->10|37->10|49->22|49->22|49->22|49->22|50->23|50->23|50->23|50->23|51->24|51->24|51->24|51->24|56->29|56->29|56->29|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|64->37|64->37|64->37|74->47|74->47|74->47|77->50|77->50|77->50|81->54|90->63|90->63|90->63|91->64|91->64|91->64|92->65|92->65|92->65|93->66|93->66|93->66|94->67|94->67|94->67|97->70|132->1|134->104|137->107|137->107|137->107|138->108|138->108|138->108|139->109|139->109|139->109|140->110|140->110
                    -- GENERATED --
                */
            