
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
object sniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

def /*4.2*/content/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    <div class="container mtb">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>SnipLists</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12" style="padding-bottom: 10px;">
                <button  id="new-playlist" type="button" class="btn btn-primary" data-toggle="popover" data-placement="right">
                    New Playlist
                </button>
            </div>
        </div>
        <div id="sniplist-array" value=""""),_display_(Seq[Any](/*21.42*/localUser/*21.51*/.id)),format.raw/*21.54*/("""">
            <div class="row ">
                """),_display_(Seq[Any](/*23.18*/if(userSniplists != null)/*23.43*/ {_display_(Seq[Any](format.raw/*23.45*/("""
                    """),_display_(Seq[Any](/*24.22*/for(sniplist <- userSniplists.savedSniplists) yield /*24.67*/ {_display_(Seq[Any](format.raw/*24.69*/("""
                        """),_display_(Seq[Any](/*25.26*/(i += 1))),format.raw/*25.34*/("""
                        <div class="col-lg-6">
                            <table class="table table-default table-bordered table-striped"  value="sniplist" id=""""),_display_(Seq[Any](/*27.116*/sniplist/*27.124*/.id)),format.raw/*27.127*/("""" >
                                <thead>
                                    <tr>
                                        <th title="Name" colspan="5" align="right"><h4 style="display: inline;">"""),_display_(Seq[Any](/*30.114*/sniplist/*30.122*/.name)),format.raw/*30.127*/(""" </h4>

                                            <p style="display: inline;">by """),_display_(Seq[Any](/*32.77*/sniplist/*32.85*/.user.name)),format.raw/*32.95*/("""</p> <span class="alert-danger badge">"""),_display_(Seq[Any](/*32.134*/sniplist/*32.142*/.favouriteCount)),format.raw/*32.157*/("""</span> </span>

                                            """),_display_(Seq[Any](/*34.46*/if(localUser.id != userSniplists.user.id)/*34.87*/ {_display_(Seq[Any](format.raw/*34.89*/("""
                                                """),_display_(Seq[Any](/*35.50*/if(!sniplist.localUserFavourited)/*35.83*/ {_display_(Seq[Any](format.raw/*35.85*/("""
                                                    <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                                """)))}/*37.51*/else/*37.56*/{_display_(Seq[Any](format.raw/*37.57*/("""
                                                    <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                                """)))})),format.raw/*39.50*/("""
                                            """)))}/*40.47*/else/*40.52*/{_display_(Seq[Any](format.raw/*40.53*/("""
                                                <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                            """)))})),format.raw/*42.46*/("""

                                            <a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*44.150*/routes/*44.156*/.SnipLists.viewSniplistById(sniplist.id.toString))),format.raw/*44.205*/("""">
                                                <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                                            </a>
                                        </th>

                                    </tr>
                                    <tr>
                                        <th title="Song" align="right">Song</th>
                                        <th title="Artist" align="right">Artist</th>
                                        <th title="Album" align="right">Album</th>
                                        <th class=""""),format.raw/*54.52*/("""{"""),format.raw/*54.53*/("""sorter: false"""),format.raw/*54.66*/("""}"""),format.raw/*54.67*/("""" title="Play" align="right">Play</th>

                                        """),_display_(Seq[Any](/*56.42*/if(localUser.id == userSniplists.user.id)/*56.83*/ {_display_(Seq[Any](format.raw/*56.85*/("""
                                            <th title="Remove"></th>
                                        """)))}/*58.43*/else/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""
                                            <th title="Favourite"></th>
                                        """)))})),format.raw/*60.42*/("""
                                    </tr>
                                </thead>
                                <tbody>
                                """),_display_(Seq[Any](/*64.34*/for(snip <- sniplist.snips) yield /*64.61*/ {_display_(Seq[Any](format.raw/*64.63*/("""
                                    <tr>
                                        <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*66.83*/snip/*66.87*/.song_name)),format.raw/*66.97*/("""</td>
                                        <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*67.84*/snip/*67.88*/.artist_name)),format.raw/*67.100*/("""</td>
                                        <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*68.83*/snip/*68.87*/.album_name)),format.raw/*68.98*/("""</td>
                                        <td align="center" class="center">
                                            <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                        </td>
                                        <td class="center">
                                        """),_display_(Seq[Any](/*73.42*/if(localUser.id == sniplist.user.id)/*73.78*/ {_display_(Seq[Any](format.raw/*73.80*/("""
                                                <span style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*74.156*/snip/*74.160*/.id)),format.raw/*74.163*/(""""></span>
                                        """)))}/*75.43*/else/*75.48*/{_display_(Seq[Any](format.raw/*75.49*/("""
                                            """),_display_(Seq[Any](/*76.46*/if(snip.localUserFavourited)/*76.74*/ {_display_(Seq[Any](format.raw/*76.76*/("""
                                                <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip red"></span>
                                            """)))}/*78.47*/else/*78.52*/{_display_(Seq[Any](format.raw/*78.53*/("""
                                                <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip black"></span>
                                            """)))})),format.raw/*80.46*/("""
                                        """)))})),format.raw/*81.42*/("""
                                        </td>
                                        <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*83.76*/snip/*83.80*/.id)),format.raw/*83.83*/("""" ></td>
                                        <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*84.82*/snip/*84.86*/.url)),format.raw/*84.90*/(""""></td>
                                        <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*85.89*/snip/*85.93*/.time_min)),format.raw/*85.102*/(""""></td>
                                        <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*86.87*/snip/*86.91*/.time_max)),format.raw/*86.100*/(""""></td>
                                    </tr>
                                """)))})),format.raw/*88.34*/("""
                                </tbody>

                            </table>
                        </div>
                        """),_display_(Seq[Any](/*93.26*/if(i % 2 == 0)/*93.40*/ {_display_(Seq[Any](format.raw/*93.42*/("""
                        </div>
                    <div class="row">
                    """)))})),format.raw/*96.22*/("""
                    """)))})),format.raw/*97.22*/("""
                    </div>
            """)))})),format.raw/*99.14*/("""

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
Seq[Any](format.raw/*1.91*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*124.2*/("""

"""),_display_(Seq[Any](/*126.2*/if(!js)/*126.9*/ {_display_(Seq[Any](format.raw/*126.11*/("""
    """),_display_(Seq[Any](/*127.6*/main("My SnipLists", "mySnipLists")/*127.41*/(content))),format.raw/*127.50*/("""
""")))}/*128.3*/else/*128.8*/{_display_(Seq[Any](format.raw/*128.9*/("""
    """),_display_(Seq[Any](/*129.6*/content)),format.raw/*129.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSniplists) => apply(js,localUser,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 01 22:28:41 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/sniplists.scala.html
                    HASH: 227858be369482d0c6b41e9ecf3768be980ccd43
                    MATRIX: 830->1|1034->132|1048->139|1132->143|1769->744|1787->753|1812->756|1899->807|1933->832|1973->834|2031->856|2092->901|2132->903|2194->929|2224->937|2424->1100|2442->1108|2468->1111|2703->1309|2721->1317|2749->1322|2869->1406|2886->1414|2918->1424|2994->1463|3012->1471|3050->1486|3148->1548|3198->1589|3238->1591|3324->1641|3366->1674|3406->1676|3643->1895|3656->1900|3695->1901|3943->2117|4008->2164|4021->2169|4060->2170|4315->2393|4503->2544|4519->2550|4591->2599|5222->3202|5251->3203|5292->3216|5321->3217|5438->3298|5488->3339|5528->3341|5658->3453|5671->3458|5710->3459|5856->3573|6049->3730|6092->3757|6132->3759|6292->3883|6305->3887|6337->3897|6462->3986|6475->3990|6510->4002|6634->4090|6647->4094|6680->4105|7087->4476|7132->4512|7172->4514|7365->4670|7379->4674|7405->4677|7475->4729|7488->4734|7527->4735|7609->4781|7646->4809|7686->4811|7893->5000|7906->5005|7945->5006|8167->5196|8241->5238|8399->5360|8412->5364|8437->5367|8563->5457|8576->5461|8602->5465|8734->5561|8747->5565|8779->5574|8909->5668|8922->5672|8954->5681|9069->5764|9241->5900|9264->5914|9304->5916|9427->6007|9481->6029|9554->6070|10567->90|10594->130|10623->7044|10662->7047|10678->7054|10719->7056|10761->7062|10806->7097|10838->7106|10859->7109|10872->7114|10911->7115|10953->7121|10983->7128
                    LINES: 26->1|29->4|29->4|31->4|48->21|48->21|48->21|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|54->27|54->27|54->27|57->30|57->30|57->30|59->32|59->32|59->32|59->32|59->32|59->32|61->34|61->34|61->34|62->35|62->35|62->35|64->37|64->37|64->37|66->39|67->40|67->40|67->40|69->42|71->44|71->44|71->44|81->54|81->54|81->54|81->54|83->56|83->56|83->56|85->58|85->58|85->58|87->60|91->64|91->64|91->64|93->66|93->66|93->66|94->67|94->67|94->67|95->68|95->68|95->68|100->73|100->73|100->73|101->74|101->74|101->74|102->75|102->75|102->75|103->76|103->76|103->76|105->78|105->78|105->78|107->80|108->81|110->83|110->83|110->83|111->84|111->84|111->84|112->85|112->85|112->85|113->86|113->86|113->86|115->88|120->93|120->93|120->93|123->96|124->97|126->99|152->1|153->3|154->124|156->126|156->126|156->126|157->127|157->127|157->127|158->128|158->128|158->128|159->129|159->129
                    -- GENERATED --
                */
            