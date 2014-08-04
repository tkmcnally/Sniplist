
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
object viewSniplistDirect extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.SnipList,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, sniplist: models.SnipList):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.6*/content/*3.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        <div class="container mtb">
            <div id="global-message" class="alert alert-danger hidden">

            </div>
            <div class="row">
                <div class="col-md-12">
                    <h1>Direct Sniplist</h1>
                </div>
            </div>

            <div id="sniplist-array" value=""""),_display_(Seq[Any](/*14.46*/localUser/*14.55*/.id)),format.raw/*14.58*/("""">
                <div class="row ">
                        <div class="col-lg-6">
                            <table class="table table-default table-bordered table-striped"  value="sniplist" id=""""),_display_(Seq[Any](/*17.116*/sniplist/*17.124*/.id)),format.raw/*17.127*/("""" >
                                <thead>
                                    <tr>
                                        <th title="Name" colspan="5" align="right"><h4 style="display: inline;">"""),_display_(Seq[Any](/*20.114*/sniplist/*20.122*/.name)),format.raw/*20.127*/(""" </h4>

                                            <p style="display: inline;">by """),_display_(Seq[Any](/*22.77*/sniplist/*22.85*/.user.name)),format.raw/*22.95*/("""</p> <span class="alert-danger badge">"""),_display_(Seq[Any](/*22.134*/sniplist/*22.142*/.favouriteCount)),format.raw/*22.157*/("""</span> </span>

                                            """),_display_(Seq[Any](/*24.46*/if(localUser.id != sniplist.user.id)/*24.82*/ {_display_(Seq[Any](format.raw/*24.84*/("""
                                                """),_display_(Seq[Any](/*25.50*/if(!sniplist.localUserFavourited)/*25.83*/ {_display_(Seq[Any](format.raw/*25.85*/("""
                                                    <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                                """)))}/*27.51*/else/*27.56*/{_display_(Seq[Any](format.raw/*27.57*/("""
                                                    <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                                """)))})),format.raw/*29.50*/("""
                                            """)))}/*30.47*/else/*30.52*/{_display_(Seq[Any](format.raw/*30.53*/("""
                                                <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                            """)))})),format.raw/*32.46*/("""
                                        </th>

                                    </tr>
                                    <tr>
                                        <th title="Song" align="right">Song</th>
                                        <th title="Artist" align="right">Artist</th>
                                        <th title="Album" align="right">Album</th>
                                        <th class=""""),format.raw/*40.52*/("""{"""),format.raw/*40.53*/("""sorter: false"""),format.raw/*40.66*/("""}"""),format.raw/*40.67*/("""" title="Play" align="right">Play</th>

                                        """),_display_(Seq[Any](/*42.42*/if(localUser.id == sniplist.user.id)/*42.78*/ {_display_(Seq[Any](format.raw/*42.80*/("""
                                            <th title="Remove"></th>
                                        """)))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""
                                            <th title="Favourite"></th>
                                        """)))})),format.raw/*46.42*/("""
                                    </tr>
                                </thead>
                                <tbody>
                                """),_display_(Seq[Any](/*50.34*/for(snip <- sniplist.snips) yield /*50.61*/ {_display_(Seq[Any](format.raw/*50.63*/("""
                                    <tr>
                                        <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*52.83*/snip/*52.87*/.song_name)),format.raw/*52.97*/("""</td>
                                        <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*53.84*/snip/*53.88*/.artist_name)),format.raw/*53.100*/("""</td>
                                        <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*54.83*/snip/*54.87*/.album_name)),format.raw/*54.98*/("""</td>
                                        <td align="center" class="center">
                                            <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                        </td>
                                        <td class="center">
                                        """),_display_(Seq[Any](/*59.42*/if(localUser.id == sniplist.user.id)/*59.78*/ {_display_(Seq[Any](format.raw/*59.80*/("""
                                            <span style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*60.152*/snip/*60.156*/.id)),format.raw/*60.159*/(""""></span>
                                        """)))}/*61.43*/else/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""
                                            """),_display_(Seq[Any](/*62.46*/if(snip.localUserFavourited)/*62.74*/ {_display_(Seq[Any](format.raw/*62.76*/("""
                                                <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip red"></span>
                                            """)))}/*64.47*/else/*64.52*/{_display_(Seq[Any](format.raw/*64.53*/("""
                                                <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip black"></span>
                                            """)))})),format.raw/*66.46*/("""
                                        """)))})),format.raw/*67.42*/("""
                                        </td>
                                        <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*69.76*/snip/*69.80*/.id)),format.raw/*69.83*/("""" ></td>
                                        <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*70.82*/snip/*70.86*/.url)),format.raw/*70.90*/(""""></td>
                                        <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*71.89*/snip/*71.93*/.time_min)),format.raw/*71.102*/(""""></td>
                                        <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*72.87*/snip/*72.91*/.time_max)),format.raw/*72.100*/(""""></td>
                                    </tr>
                                """)))})),format.raw/*74.34*/("""
                                </tbody>

                            </table>
                        </div>
                    </div>
                </div>
    """)))};
Seq[Any](format.raw/*1.83*/("""

    """),format.raw/*81.6*/("""

"""),_display_(Seq[Any](/*83.2*/if(!js)/*83.9*/ {_display_(Seq[Any](format.raw/*83.11*/("""
    """),_display_(Seq[Any](/*84.6*/main("My SnipLists", "mySnipLists")/*84.41*/(content))),format.raw/*84.50*/("""
""")))}/*85.3*/else/*85.8*/{_display_(Seq[Any](format.raw/*85.9*/("""
    """),_display_(Seq[Any](/*86.6*/content)),format.raw/*86.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,sniplist:models.SnipList): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,sniplist)
    
    def f:((java.lang.Boolean,models.User,models.SnipList) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,sniplist) => apply(js,localUser,sniplist)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 16:01:01 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/viewSniplistDirect.scala.html
                    HASH: 944a9d09dfcee12feeb3e159df7064817da534d4
                    MATRIX: 836->1|994->89|1009->96|1093->100|1461->432|1479->441|1504->444|1741->644|1759->652|1785->655|2020->853|2038->861|2066->866|2186->950|2203->958|2235->968|2311->1007|2329->1015|2367->1030|2465->1092|2510->1128|2550->1130|2636->1180|2678->1213|2718->1215|2955->1434|2968->1439|3007->1440|3255->1656|3320->1703|3333->1708|3372->1709|3627->1932|4086->2363|4115->2364|4156->2377|4185->2378|4302->2459|4347->2495|4387->2497|4517->2609|4530->2614|4569->2615|4715->2729|4908->2886|4951->2913|4991->2915|5151->3039|5164->3043|5196->3053|5321->3142|5334->3146|5369->3158|5493->3246|5506->3250|5539->3261|5946->3632|5991->3668|6031->3670|6220->3822|6234->3826|6260->3829|6330->3881|6343->3886|6382->3887|6464->3933|6501->3961|6541->3963|6748->4152|6761->4157|6800->4158|7022->4348|7096->4390|7254->4512|7267->4516|7292->4519|7418->4609|7431->4613|7457->4617|7589->4713|7602->4717|7634->4726|7764->4820|7777->4824|7809->4833|7924->4916|8129->82|8162->5082|8200->5085|8215->5092|8255->5094|8296->5100|8340->5135|8371->5144|8391->5147|8403->5152|8441->5153|8482->5159|8511->5166
                    LINES: 26->1|28->3|28->3|30->3|41->14|41->14|41->14|44->17|44->17|44->17|47->20|47->20|47->20|49->22|49->22|49->22|49->22|49->22|49->22|51->24|51->24|51->24|52->25|52->25|52->25|54->27|54->27|54->27|56->29|57->30|57->30|57->30|59->32|67->40|67->40|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|77->50|77->50|77->50|79->52|79->52|79->52|80->53|80->53|80->53|81->54|81->54|81->54|86->59|86->59|86->59|87->60|87->60|87->60|88->61|88->61|88->61|89->62|89->62|89->62|91->64|91->64|91->64|93->66|94->67|96->69|96->69|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|101->74|109->1|111->81|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|116->86|116->86
                    -- GENERATED --
                */
            