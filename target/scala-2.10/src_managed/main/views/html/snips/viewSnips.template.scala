
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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[models.User,List[models.Snip],List[models.SnipList],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, snips: List[models.Snip], snipLists: List[models.SnipList]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.93*/("""

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
                <table class="table table-default table-striped" style="border: black;">
                <thead>
                        <tr>
                            <th title="Song" align="right">Song</th>
                            <th title="Artist" align="right">Artist</th>
                            <th title="Album" align="right">Album</th>
                            <th class=""""),format.raw/*22.40*/("""{"""),format.raw/*22.41*/("""sorter: false"""),format.raw/*22.54*/("""}"""),format.raw/*22.55*/("""" title="*" align="center">*</th>
                            <th class=""""),format.raw/*23.40*/("""{"""),format.raw/*23.41*/("""sorter: false"""),format.raw/*23.54*/("""}"""),format.raw/*23.55*/("""" title="Play" align="right">Play</th>

                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(Seq[Any](/*28.26*/for(snip <- snips) yield /*28.44*/ {_display_(Seq[Any](format.raw/*28.46*/("""
                            <tr class="evenrow table-snip" data-toggle="tooltip" data-placement="right" title="Saved!">
                                <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*30.75*/snip/*30.79*/.song_name)),format.raw/*30.89*/("""</td>
                                <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*31.76*/snip/*31.80*/.artist_name)),format.raw/*31.92*/("""</td>
                                <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*32.75*/snip/*32.79*/.album_name)),format.raw/*32.90*/("""</td>
                                <td align="left" class="left">
                                    <div class="dropdown">

                                        <a id=""""),_display_(Seq[Any](/*36.49*/snip/*36.53*/.id)),format.raw/*36.56*/("""" class="btn btn-sm dropdown-toggle center" data-toggle="dropdown" href="#">
                                            <span style="cursor:pointer" class="glyphicon glyphicon-share"></span>
                                        </a>

                                        <ul class="dropdown-menu" id="menu1">
                                            <li>
                                                <!-- Button trigger modal -->
                                                <a class="add-to-playlist-a" href="" align="left" data-toggle="modal" data-target="#add-to-playlist-modal">
                                                    Add to playlist
                                                </a></li>
                                            <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>Save Snip</a></li>
                                            <!--<li><a align="left" href=""><i class="icon-off"></i>Share on Sniplist</a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Share on -></a></li>-->
                                            <li class="divider"></li>
                                            <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>Delete</a></li>
                                        </ul>
                                    </div>
                                </td>
                                <td align="center" class="center valign-m ">
                                    <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                        <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
                                </td>
                                <td class="hidden snip-id" id=""""),_display_(Seq[Any](/*58.65*/snip/*58.69*/.id)),format.raw/*58.72*/("""" ></td>
                                <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*59.74*/snip/*59.78*/.url)),format.raw/*59.82*/(""""></td>
                                <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*60.81*/snip/*60.85*/.time_min)),format.raw/*60.94*/(""""></td>
                                <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*61.79*/snip/*61.83*/.time_max)),format.raw/*61.92*/(""""></td>

                            </tr>
                        """)))})),format.raw/*64.26*/("""
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
                        """),_display_(Seq[Any](/*87.26*/for(snipList <- snipLists) yield /*87.52*/ {_display_(Seq[Any](format.raw/*87.54*/("""
                            <ul class="list-group">
                                <li class="list-group-item playlist-li" style="cursor:pointer" value=""""),_display_(Seq[Any](/*89.104*/snipList/*89.112*/.id)),format.raw/*89.115*/("""">
                                    """),_display_(Seq[Any](/*90.38*/if(snipList.snips.size() < 6)/*90.67*/{_display_(Seq[Any](format.raw/*90.68*/("""
                                        <span class="badge alert-success">"""),_display_(Seq[Any](/*91.76*/snipList/*91.84*/.snips.size())),format.raw/*91.97*/("""</span>
                                    """)))}/*92.39*/else/*92.44*/{_display_(Seq[Any](format.raw/*92.45*/("""
                                        <span class="badge alert-danger">"""),_display_(Seq[Any](/*93.75*/snipList/*93.83*/.snips.size())),format.raw/*93.96*/("""</span>
                                    """)))})),format.raw/*94.38*/("""
                                    """),_display_(Seq[Any](/*95.38*/snipList/*95.46*/.name)),format.raw/*95.51*/("""
                                </li>
                            </ul>
                        """)))})),format.raw/*98.26*/("""
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
    
    def render(localUser:models.User,snips:List[models.Snip],snipLists:List[models.SnipList]): play.api.templates.HtmlFormat.Appendable = apply(localUser,snips,snipLists)
    
    def f:((models.User,List[models.Snip],List[models.SnipList]) => play.api.templates.HtmlFormat.Appendable) = (localUser,snips,snipLists) => apply(localUser,snips,snipLists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 29 00:44:20 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: 2ee33427d53ded4259f956d86c41b3e52acbcf24
                    MATRIX: 829->1|1014->92|1051->95|1086->122|1125->124|1853->824|1882->825|1923->838|1952->839|2053->912|2082->913|2123->926|2152->927|2340->1079|2374->1097|2414->1099|2645->1294|2658->1298|2690->1308|2807->1389|2820->1393|2854->1405|2970->1485|2983->1489|3016->1500|3229->1677|3242->1681|3267->1684|5188->3569|5201->3573|5226->3576|5344->3658|5357->3662|5383->3666|5507->3754|5520->3758|5551->3767|5673->3853|5686->3857|5717->3866|5817->3934|6767->4848|6809->4874|6849->4876|7042->5032|7060->5040|7086->5043|7162->5083|7200->5112|7239->5113|7351->5189|7368->5197|7403->5210|7467->5256|7480->5261|7519->5262|7630->5337|7647->5345|7682->5358|7759->5403|7833->5441|7850->5449|7877->5454|8007->5552
                    LINES: 26->1|29->1|31->3|31->3|31->3|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|64->36|64->36|64->36|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|92->64|115->87|115->87|115->87|117->89|117->89|117->89|118->90|118->90|118->90|119->91|119->91|119->91|120->92|120->92|120->92|121->93|121->93|121->93|122->94|123->95|123->95|123->95|126->98
                    -- GENERATED --
                */
            