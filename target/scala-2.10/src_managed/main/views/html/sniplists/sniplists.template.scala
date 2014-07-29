
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
object sniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("My SnipLists", "mySnipLists")/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""
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
                            <table class="table table-default table-bordered table-striped" value=""""),_display_(Seq[Any](/*27.101*/sniplist/*27.109*/.id)),format.raw/*27.112*/("""">
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
                                        </th>

                                    </tr>
                                    <tr>
                                        <th title="Song" align="right">Song</th>
                                        <th title="Artist" align="right">Artist</th>
                                        <th title="Album" align="right">Album</th>
                                        <th class=""""),format.raw/*50.52*/("""{"""),format.raw/*50.53*/("""sorter: false"""),format.raw/*50.66*/("""}"""),format.raw/*50.67*/("""" title="Play" align="right">Play</th>

                                        """),_display_(Seq[Any](/*52.42*/if(localUser.id == userSniplists.user.id)/*52.83*/ {_display_(Seq[Any](format.raw/*52.85*/("""
                                            <th title="Remove"></th>
                                        """)))}/*54.43*/else/*54.48*/{_display_(Seq[Any](format.raw/*54.49*/("""
                                            <th title="Favourite"></th>
                                        """)))})),format.raw/*56.42*/("""
                                    </tr>
                                </thead>
                                <tbody>
                                """),_display_(Seq[Any](/*60.34*/for(snip <- sniplist.snips) yield /*60.61*/ {_display_(Seq[Any](format.raw/*60.63*/("""
                                    <tr>
                                        <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*62.83*/snip/*62.87*/.song_name)),format.raw/*62.97*/("""</td>
                                        <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*63.84*/snip/*63.88*/.artist_name)),format.raw/*63.100*/("""</td>
                                        <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*64.83*/snip/*64.87*/.album_name)),format.raw/*64.98*/("""</td>
                                        <td align="center" class="center">
                                            <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                        </td>
                                        <td class="center">
                                        """),_display_(Seq[Any](/*69.42*/if(localUser.id == sniplist.user.id)/*69.78*/ {_display_(Seq[Any](format.raw/*69.80*/("""
                                                <span style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*70.156*/snip/*70.160*/.id)),format.raw/*70.163*/(""""></span>
                                        """)))}/*71.43*/else/*71.48*/{_display_(Seq[Any](format.raw/*71.49*/("""
                                            """),_display_(Seq[Any](/*72.46*/if(snip.localUserFavourited)/*72.74*/ {_display_(Seq[Any](format.raw/*72.76*/("""
                                                <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip red"></span>
                                            """)))}/*74.47*/else/*74.52*/{_display_(Seq[Any](format.raw/*74.53*/("""
                                                <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip black"></span>
                                            """)))})),format.raw/*76.46*/("""
                                        """)))})),format.raw/*77.42*/("""
                                        </td>
                                        <td class="hidden snip-id" id=""""),_display_(Seq[Any](/*79.73*/snip/*79.77*/.id)),format.raw/*79.80*/("""" ></td>
                                        <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*80.82*/snip/*80.86*/.url)),format.raw/*80.90*/(""""></td>
                                        <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*81.89*/snip/*81.93*/.time_min)),format.raw/*81.102*/(""""></td>
                                        <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*82.87*/snip/*82.91*/.time_max)),format.raw/*82.100*/(""""></td>
                                    </tr>
                                """)))})),format.raw/*84.34*/("""
                                </tbody>

                            </table>
                        </div>
                        """),_display_(Seq[Any](/*89.26*/if(i % 2 == 0)/*89.40*/ {_display_(Seq[Any](format.raw/*89.42*/("""
                        </div>
                    <div class="row">
                    """)))})),format.raw/*92.22*/("""
                    """)))})),format.raw/*93.22*/("""
                    </div>
            """)))})),format.raw/*95.14*/("""

        </div>

    </div>
""")))})))}
    }
    
    def render(localUser:models.User,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(localUser,userSniplists)
    
    def f:((models.User,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (localUser,userSniplists) => apply(localUser,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 29 18:15:54 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/sniplists.scala.html
                    HASH: c5719412e3b7a79d11b2bf27d5b37410df6408cd
                    MATRIX: 812->1|1010->67|1037->107|1073->109|1116->144|1155->146|1792->747|1810->756|1835->759|1922->810|1956->835|1996->837|2054->859|2115->904|2155->906|2217->932|2247->940|2432->1088|2450->1096|2476->1099|2710->1296|2728->1304|2756->1309|2876->1393|2893->1401|2925->1411|3001->1450|3019->1458|3057->1473|3155->1535|3205->1576|3245->1578|3331->1628|3373->1661|3413->1663|3650->1882|3663->1887|3702->1888|3950->2104|4015->2151|4028->2156|4067->2157|4322->2380|4781->2811|4810->2812|4851->2825|4880->2826|4997->2907|5047->2948|5087->2950|5217->3062|5230->3067|5269->3068|5415->3182|5608->3339|5651->3366|5691->3368|5851->3492|5864->3496|5896->3506|6021->3595|6034->3599|6069->3611|6193->3699|6206->3703|6239->3714|6646->4085|6691->4121|6731->4123|6924->4279|6938->4283|6964->4286|7034->4338|7047->4343|7086->4344|7168->4390|7205->4418|7245->4420|7452->4609|7465->4614|7504->4615|7726->4805|7800->4847|7955->4966|7968->4970|7993->4973|8119->5063|8132->5067|8158->5071|8290->5167|8303->5171|8335->5180|8465->5274|8478->5278|8510->5287|8625->5370|8797->5506|8820->5520|8860->5522|8983->5613|9037->5635|9110->5676
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|55->27|55->27|55->27|58->30|58->30|58->30|60->32|60->32|60->32|60->32|60->32|60->32|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|67->39|68->40|68->40|68->40|70->42|78->50|78->50|78->50|78->50|80->52|80->52|80->52|82->54|82->54|82->54|84->56|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|102->74|102->74|102->74|104->76|105->77|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|110->82|110->82|110->82|112->84|117->89|117->89|117->89|120->92|121->93|123->95
                    -- GENERATED --
                */
            