
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
object viewSnipDirect extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.Snip,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, snip: models.Snip):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
<div class="container mtb">
    <div id="global-message" class="alert alert-danger hidden">

    </div>
    <div class="row">
        <div class="col-md-12">
            <h1>Direct Snip</h1> <h4 style="display : inline ;"> """),_display_(Seq[Any](/*10.67*/snip/*10.71*/.user.name)),format.raw/*10.81*/("""</h4>
        </div>
    </div>
    <div class="row">

        <div class="col-md-8">
            <table class="table table-default table-striped" value="user" id=""""),_display_(Seq[Any](/*16.80*/snip/*16.84*/.id)),format.raw/*16.87*/("""" style="border : black ;">
                <thead>
                <tr>
                    <th title="Song" align="right">Song</th>
                    <th title="Artist" align="right">Artist</th>
                    <th title="Album" align="right">Album</th>
                    <th class=""""),format.raw/*22.32*/("""{"""),format.raw/*22.33*/("""sorter: false"""),format.raw/*22.46*/("""}"""),format.raw/*22.47*/("""" title="*" align="center">*</th>
                    <th class=""""),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""sorter: false"""),format.raw/*23.46*/("""}"""),format.raw/*23.47*/("""" title="Play" align="right">Play</th>
                    <th class=""""),format.raw/*24.32*/("""{"""),format.raw/*24.33*/("""sorter: false"""),format.raw/*24.46*/("""}"""),format.raw/*24.47*/("""" title="Favourites" align="right"></th>

                </tr>
                </thead>
                <tbody>

                <tr class="evenrow table-snip" data-toggle="tooltip" data-placement="right" title="Saved!">
                    <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*31.63*/snip/*31.67*/.song_name)),format.raw/*31.77*/("""</td>
                    <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*32.64*/snip/*32.68*/.artist_name)),format.raw/*32.80*/("""</td>
                    <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*33.63*/snip/*33.67*/.album_name)),format.raw/*33.78*/("""</td>
                    <td align="left" class="left">
                        <div class="dropdown">

                            <a id=""""),_display_(Seq[Any](/*37.37*/snip/*37.41*/.id)),format.raw/*37.44*/("""" class="btn btn-sm dropdown-toggle center" data-toggle="dropdown" href="#">
                                <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                            </a>

                            <ul class="dropdown-menu" id="menu1">
                                <li>
                                    <!-- Button trigger modal -->
                                    <a class="add-to-playlist-a" href="" align="left" data-toggle="modal" data-target="#add-to-playlist-modal">
                                        Add to playlist
                                    </a></li>
                                """),_display_(Seq[Any](/*47.34*/if(localUser.id != snip.user.id)/*47.66*/ {_display_(Seq[Any](format.raw/*47.68*/("""
                                <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>
                                    Favourite Snip</a></li>
                                """)))}/*50.35*/else/*50.40*/{_display_(Seq[Any](format.raw/*50.41*/("""
                                <li class="divider"></li>
                                <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>
                                    Delete</a></li>
                                """)))})),format.raw/*54.34*/("""

                            </ul>
                        </div>
                    </td>
                    <td align="center" class="center valign-m ">
                        <span style="cursor : pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                        <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
                    </td>
                    <td align="left" style="vertical-align : middle" class="left snip-favourite-count"><span class="alert-danger badge">"""),_display_(Seq[Any](/*63.138*/snip/*63.142*/.favouriteCount)),format.raw/*63.157*/("""</span></td>
                    <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*64.56*/snip/*64.60*/.id)),format.raw/*64.63*/("""" ></td>
                    <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*65.62*/snip/*65.66*/.url)),format.raw/*65.70*/(""""></td>
                    <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*66.69*/snip/*66.73*/.time_min)),format.raw/*66.82*/(""""></td>
                    <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*67.67*/snip/*67.71*/.time_max)),format.raw/*67.80*/(""""></td>

                </tr>

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
Seq[Any](format.raw/*1.75*/("""

"""),format.raw/*104.2*/("""


"""),_display_(Seq[Any](/*107.2*/if(!js)/*107.9*/ {_display_(Seq[Any](format.raw/*107.11*/("""
"""),_display_(Seq[Any](/*108.2*/main("My Snips", "mySnips")/*108.29*/(content))),format.raw/*108.38*/("""
""")))}/*109.3*/else/*109.8*/{_display_(Seq[Any](format.raw/*109.9*/("""
"""),_display_(Seq[Any](/*110.2*/content)),format.raw/*110.9*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,snip:models.Snip): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,snip)
    
    def f:((java.lang.Boolean,models.User,models.Snip) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,snip) => apply(js,localUser,snip)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 01 02:18:44 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnipDirect.scala.html
                    HASH: 87892fed33d9ff2a5d3e90b831cbf84ca3b0bdb7
                    MATRIX: 824->1|974->77|988->84|1072->88|1333->313|1346->317|1378->327|1579->492|1592->496|1617->499|1938->792|1967->793|2008->806|2037->807|2130->872|2159->873|2200->886|2229->887|2327->957|2356->958|2397->971|2426->972|2746->1256|2759->1260|2791->1270|2896->1339|2909->1343|2943->1355|3047->1423|3060->1427|3093->1438|3270->1579|3283->1583|3308->1586|4008->2250|4049->2282|4089->2284|4305->2482|4318->2487|4357->2488|4648->2747|5242->3304|5256->3308|5294->3323|5398->3391|5411->3395|5436->3398|5542->3468|5555->3472|5581->3476|5693->3552|5706->3556|5737->3565|5847->3639|5860->3643|5891->3652|7107->74|7137->4829|7177->4833|7193->4840|7234->4842|7272->4844|7309->4871|7341->4880|7362->4883|7375->4888|7414->4889|7452->4891|7481->4898
                    LINES: 26->1|28->3|28->3|30->3|37->10|37->10|37->10|43->16|43->16|43->16|49->22|49->22|49->22|49->22|50->23|50->23|50->23|50->23|51->24|51->24|51->24|51->24|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|64->37|64->37|64->37|74->47|74->47|74->47|77->50|77->50|77->50|81->54|90->63|90->63|90->63|91->64|91->64|91->64|92->65|92->65|92->65|93->66|93->66|93->66|94->67|94->67|94->67|132->1|134->104|137->107|137->107|137->107|138->108|138->108|138->108|139->109|139->109|139->109|140->110|140->110
                    -- GENERATED --
                */
            