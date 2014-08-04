
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
object arraySnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.MySnips,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, userSnips: models.MySnips):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.83*/("""

<table class="table table-default table-striped" value="user" id=""""),_display_(Seq[Any](/*3.68*/userSnips/*3.77*/.id)),format.raw/*3.80*/("""" style="border : black ;">
    <thead>
        <tr>
            <th title="Song" align="right">Song</th>
            <th title="Artist" align="right">Artist</th>
            <th title="Album" align="right">Album</th>
            <th class=""""),format.raw/*9.24*/("""{"""),format.raw/*9.25*/("""sorter: false"""),format.raw/*9.38*/("""}"""),format.raw/*9.39*/("""" title="*" align="center">*</th>
            <th class=""""),format.raw/*10.24*/("""{"""),format.raw/*10.25*/("""sorter: false"""),format.raw/*10.38*/("""}"""),format.raw/*10.39*/("""" title="Play" align="right">Play</th>
            <th class=""""),format.raw/*11.24*/("""{"""),format.raw/*11.25*/("""sorter: false"""),format.raw/*11.38*/("""}"""),format.raw/*11.39*/("""" title="Favourites" align="right"></th>

        </tr>
    </thead>
    <tbody>
    """),_display_(Seq[Any](/*16.6*/for(snip <- userSnips.savedSnips) yield /*16.39*/ {_display_(Seq[Any](format.raw/*16.41*/("""
        <tr class="evenrow table-snip" data-toggle="tooltip" data-placement="right" title="Saved!">
            <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*18.55*/snip/*18.59*/.song_name)),format.raw/*18.69*/("""</td>
            <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*19.56*/snip/*19.60*/.artist_name)),format.raw/*19.72*/("""</td>
            <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*20.55*/snip/*20.59*/.album_name)),format.raw/*20.70*/("""</td>
            <td align="left" class="left">
                <div class="dropdown">

                    <a id=""""),_display_(Seq[Any](/*24.29*/snip/*24.33*/.id)),format.raw/*24.36*/("""" class="btn btn-sm dropdown-toggle center" data-toggle="dropdown" href="#">
                        <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                    </a>

                    <ul class="dropdown-menu" id="menu1">
                        <li>
                                <!-- Button trigger modal -->
                            <a class="add-to-playlist-a" href="" align="left" data-toggle="modal" data-target="#add-to-playlist-modal">
                                Add to playlist
                            </a></li>
                        <li><a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*34.134*/routes/*34.140*/.Snips.viewSnipById(snip.id.toString))),format.raw/*34.177*/("""">
                        Share Snip</a></li>
                        """),_display_(Seq[Any](/*36.26*/if(localUser.id != userSnips.user.id)/*36.63*/ {_display_(Seq[Any](format.raw/*36.65*/("""
                            <li><a align="left" href="" class="save-snip"><i class="icon-off"></i>
                                Favourite Snip</a></li>
                        """)))}/*39.27*/else/*39.32*/{_display_(Seq[Any](format.raw/*39.33*/("""
                            <li class="divider"></li>
                            <li><a align="left" href="#" class="dropdown-delete-snip"><i class="icon-off"></i>
                                Delete</a></li>
                        """)))})),format.raw/*43.26*/("""

                    </ul>
                </div>
            </td>
            <td align="center" class="center valign-m ">
                <span style="cursor : pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                    <!--<button type="button" class="btn-primary btn btn-sm play-snippet">Play</button>-->
            </td>
            <td align="left" style="vertical-align : middle" class="left snip-favourite-count"><span class="alert-danger badge">"""),_display_(Seq[Any](/*52.130*/snip/*52.134*/.favouriteCount)),format.raw/*52.149*/("""</span></td>
            <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*53.48*/snip/*53.52*/.id)),format.raw/*53.55*/("""" ></td>
            <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*54.54*/snip/*54.58*/.url)),format.raw/*54.62*/(""""></td>
            <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*55.61*/snip/*55.65*/.time_min)),format.raw/*55.74*/(""""></td>
            <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*56.59*/snip/*56.63*/.time_max)),format.raw/*56.72*/(""""></td>

        </tr>
    """)))})),format.raw/*59.6*/("""
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
"""))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.MySnips): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.MySnips) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 16:57:57 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/arraySnips.scala.html
                    HASH: f99f77a4d74e9249e73cad3b0be1cc0f0967bbf5
                    MATRIX: 823->1|998->82|1102->151|1119->160|1143->163|1411->404|1439->405|1479->418|1507->419|1592->476|1621->477|1662->490|1691->491|1781->553|1810->554|1851->567|1880->568|2001->654|2050->687|2090->689|2281->844|2294->848|2326->858|2423->919|2436->923|2470->935|2566->995|2579->999|2612->1010|2765->1127|2778->1131|2803->1134|3544->1838|3560->1844|3620->1881|3728->1953|3774->1990|3814->1992|4014->2174|4027->2179|4066->2180|4337->2419|4871->2916|4885->2920|4923->2935|5019->2995|5032->2999|5057->3002|5155->3064|5168->3068|5194->3072|5298->3140|5311->3144|5342->3153|5444->3219|5457->3223|5488->3232|5547->3260
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|52->24|52->24|52->24|62->34|62->34|62->34|64->36|64->36|64->36|67->39|67->39|67->39|71->43|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|87->59
                    -- GENERATED --
                */
            