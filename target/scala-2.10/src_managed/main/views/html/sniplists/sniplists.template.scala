
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
                                        <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*79.76*/snip/*79.80*/.id)),format.raw/*79.83*/("""" ></td>
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
""")))};
Seq[Any](format.raw/*1.91*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*100.2*/("""

"""),_display_(Seq[Any](/*102.2*/if(!js)/*102.9*/ {_display_(Seq[Any](format.raw/*102.11*/("""
    """),_display_(Seq[Any](/*103.6*/main("My SnipLists", "mySnipLists")/*103.41*/(content))),format.raw/*103.50*/("""
""")))}/*104.3*/else/*104.8*/{_display_(Seq[Any](format.raw/*104.9*/("""
    """),_display_(Seq[Any](/*105.6*/content)),format.raw/*105.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSniplists) => apply(js,localUser,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 31 02:21:06 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/sniplists.scala.html
                    HASH: fd0916d07456da2ba642239ec74adcff80d7e01c
                    MATRIX: 830->1|1034->132|1048->139|1132->143|1769->744|1787->753|1812->756|1899->807|1933->832|1973->834|2031->856|2092->901|2132->903|2194->929|2224->937|2409->1085|2427->1093|2453->1096|2687->1293|2705->1301|2733->1306|2853->1390|2870->1398|2902->1408|2978->1447|2996->1455|3034->1470|3132->1532|3182->1573|3222->1575|3308->1625|3350->1658|3390->1660|3627->1879|3640->1884|3679->1885|3927->2101|3992->2148|4005->2153|4044->2154|4299->2377|4758->2808|4787->2809|4828->2822|4857->2823|4974->2904|5024->2945|5064->2947|5194->3059|5207->3064|5246->3065|5392->3179|5585->3336|5628->3363|5668->3365|5828->3489|5841->3493|5873->3503|5998->3592|6011->3596|6046->3608|6170->3696|6183->3700|6216->3711|6623->4082|6668->4118|6708->4120|6901->4276|6915->4280|6941->4283|7011->4335|7024->4340|7063->4341|7145->4387|7182->4415|7222->4417|7429->4606|7442->4611|7481->4612|7703->4802|7777->4844|7935->4966|7948->4970|7973->4973|8099->5063|8112->5067|8138->5071|8270->5167|8283->5171|8315->5180|8445->5274|8458->5278|8490->5287|8605->5370|8777->5506|8800->5520|8840->5522|8963->5613|9017->5635|9090->5676|9159->90|9186->130|9215->5706|9254->5709|9270->5716|9311->5718|9353->5724|9398->5759|9430->5768|9451->5771|9464->5776|9503->5777|9545->5783|9575->5790
                    LINES: 26->1|29->4|29->4|31->4|48->21|48->21|48->21|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|54->27|54->27|54->27|57->30|57->30|57->30|59->32|59->32|59->32|59->32|59->32|59->32|61->34|61->34|61->34|62->35|62->35|62->35|64->37|64->37|64->37|66->39|67->40|67->40|67->40|69->42|77->50|77->50|77->50|77->50|79->52|79->52|79->52|81->54|81->54|81->54|83->56|87->60|87->60|87->60|89->62|89->62|89->62|90->63|90->63|90->63|91->64|91->64|91->64|96->69|96->69|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|101->74|101->74|101->74|103->76|104->77|106->79|106->79|106->79|107->80|107->80|107->80|108->81|108->81|108->81|109->82|109->82|109->82|111->84|116->89|116->89|116->89|119->92|120->93|122->95|128->1|129->3|130->100|132->102|132->102|132->102|133->103|133->103|133->103|134->104|134->104|134->104|135->105|135->105
                    -- GENERATED --
                */
            