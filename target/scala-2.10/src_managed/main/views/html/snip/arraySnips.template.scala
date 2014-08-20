
package views.html.snip

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
object arraySnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.SnipCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, userSnips: models.SnipCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.90*/("""

<div class="playlist-container" data-sniplist-id=""""),_display_(Seq[Any](/*3.52*/userSnips/*3.61*/.id)),format.raw/*3.64*/("""">
    <table class="table table-default table-striped" value="user" style="border : black ;">
        <thead>
            <tr>
                <th title="Song" align="right">Song</th>
                <th title="Artist" align="right">Artist</th>
                <th title="Album" align="right">Album</th>
                <th class=""""),format.raw/*10.28*/("""{"""),format.raw/*10.29*/("""sorter: false"""),format.raw/*10.42*/("""}"""),format.raw/*10.43*/("""" title="*" align="center">*</th>
                <th class=""""),format.raw/*11.28*/("""{"""),format.raw/*11.29*/("""sorter: false"""),format.raw/*11.42*/("""}"""),format.raw/*11.43*/("""" title="Play" align="right">Play</th>
                <th class=""""),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""sorter: false"""),format.raw/*12.42*/("""}"""),format.raw/*12.43*/("""" title="Favourites" align="right"></th>

            </tr>
        </thead>
        <tbody>
        """),_display_(Seq[Any](/*17.10*/for(snip <- userSnips.savedSnips) yield /*17.43*/ {_display_(Seq[Any](format.raw/*17.45*/("""
            <div class="snip-module">
                <tr class="evenrow table-snip" data-toggle="tooltip" data-placement="right" title="Saved!">
                    <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*20.63*/snip/*20.67*/.song_name)),format.raw/*20.77*/("""</td>
                    <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*21.64*/snip/*21.68*/.artist_name)),format.raw/*21.80*/("""</td>
                    <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*22.63*/snip/*22.67*/.album_name)),format.raw/*22.78*/("""</td>
                    <td align="left" class="left">
                        <div class="dropdown">

                            <a id=""""),_display_(Seq[Any](/*26.37*/snip/*26.41*/.id)),format.raw/*26.44*/("""" class="btn btn-sm dropdown-toggle center" data-toggle="dropdown" href="#">
                                <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                            </a>

                            <ul class="dropdown-menu" id="menu1">
                                <li>
                                        <!-- Button trigger modal -->
                                    <a class="add-to-playlist-a" href="" align="left" data-toggle="modal" data-target="#add-to-playlist-modal">
                                        Add to playlist
                                    </a></li>
                                <li><a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*36.142*/routes/*36.148*/.SnipController.viewSnipById(snip.id.toString))),format.raw/*36.194*/("""">
                                Share Snip</a></li>
                                """),_display_(Seq[Any](/*38.34*/if(localUser.id != userSnips.user.id)/*38.71*/ {_display_(Seq[Any](format.raw/*38.73*/("""
                                    <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>
                                        Favourite Snip</a></li>
                                """)))}/*41.35*/else/*41.40*/{_display_(Seq[Any](format.raw/*41.41*/("""
                                    <li class="divider"></li>
                                    <li><a align="left" href="#" class="dropdown-delete-snip" data-snip-id=""""),_display_(Seq[Any](/*43.110*/snip/*43.114*/.id)),format.raw/*43.117*/(""""><i class="icon-off"></i>
                                        Delete</a></li>
                                """)))})),format.raw/*45.34*/("""

                            </ul>
                        </div>
                    </td>

                        <td align="center" class="center valign-m ">
                            <div class="action-controls">
                                <i class="fa fa-play fa-2x play-snippet green" data-snip-id=""""),_display_(Seq[Any](/*53.95*/snip/*53.99*/.id)),format.raw/*53.102*/(""""></i>
                            </div>
                        </td>

                    <td align="left" style="vertical-align : middle" class="left snip-favourite-count"><span class="alert-danger badge">"""),_display_(Seq[Any](/*57.138*/snip/*57.142*/.favouriteCount)),format.raw/*57.157*/("""</span></td>
                    <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*58.56*/snip/*58.60*/.id)),format.raw/*58.63*/("""" ></td>
                    <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*59.62*/snip/*59.66*/.url)),format.raw/*59.70*/(""""></td>
                    <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*60.69*/snip/*60.73*/.time_min)),format.raw/*60.82*/(""""></td>
                    <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*61.67*/snip/*61.71*/.time_max)),format.raw/*61.80*/(""""></td>

                </tr>
            </div>
        """)))})),format.raw/*65.10*/("""
        </tbody>


    </table>

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
</div>
"""))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.SnipCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 18 20:51:33 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/arraySnips.scala.html
                    HASH: 07999e193670ef65db7f4d27faa22c9ba2357403
                    MATRIX: 829->1|1011->89|1099->142|1116->151|1140->154|1500->486|1529->487|1570->500|1599->501|1688->562|1717->563|1758->576|1787->577|1881->643|1910->644|1951->657|1980->658|2118->760|2167->793|2207->795|2452->1004|2465->1008|2497->1018|2602->1087|2615->1091|2649->1103|2753->1171|2766->1175|2799->1186|2976->1327|2989->1331|3014->1334|3827->2110|3843->2116|3912->2162|4036->2250|4082->2287|4122->2289|4346->2495|4359->2500|4398->2501|4607->2673|4621->2677|4647->2680|4795->2796|5146->3111|5159->3115|5185->3118|5432->3328|5446->3332|5484->3347|5588->3415|5601->3419|5626->3422|5732->3492|5745->3496|5771->3500|5883->3576|5896->3580|5927->3589|6037->3663|6050->3667|6081->3676|6172->3735
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|54->26|54->26|54->26|64->36|64->36|64->36|66->38|66->38|66->38|69->41|69->41|69->41|71->43|71->43|71->43|73->45|81->53|81->53|81->53|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|93->65
                    -- GENERATED --
                */
            