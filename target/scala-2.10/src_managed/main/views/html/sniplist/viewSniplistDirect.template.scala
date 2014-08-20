
package views.html.sniplist

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
object viewSniplistDirect extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.Sniplist,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, sniplist: models.Sniplist):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>Direct Sniplist</h1>
            </div>
        </div>

        <div id="sniplist-array" value=""""),_display_(Seq[Any](/*14.42*/localUser/*14.51*/.id)),format.raw/*14.54*/("""">
            <div class="row ">
                <div class="col-lg-6">
                    <table class="table table-default table-bordered table-striped"  value="sniplist" id=""""),_display_(Seq[Any](/*17.108*/sniplist/*17.116*/.id)),format.raw/*17.119*/("""" >
                        <thead>
                            <tr>
                                <th title="Name" colspan="5" align="right"><h4 style="display: inline;"><a href=""""),_display_(Seq[Any](/*20.115*/routes/*20.121*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*20.179*/("""" class="dynamic-link"> """),_display_(Seq[Any](/*20.204*/sniplist/*20.212*/.name)),format.raw/*20.217*/(""" </a></h4>

                                    <p style="display: inline;">by </p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*22.103*/routes/*22.109*/.Application.getUserProfile(sniplist.user.id.toString))),format.raw/*22.163*/("""" style="display: inline;">"""),_display_(Seq[Any](/*22.191*/sniplist/*22.199*/.user.name)),format.raw/*22.209*/("""</a> <span class="alert-danger badge">"""),_display_(Seq[Any](/*22.248*/sniplist/*22.256*/.favouriteCount)),format.raw/*22.271*/("""</span>

                                    """),_display_(Seq[Any](/*24.38*/if(localUser.id != sniplist.user.id)/*24.74*/ {_display_(Seq[Any](format.raw/*24.76*/("""
                                        """),_display_(Seq[Any](/*25.42*/if(!sniplist.localUserFavourited)/*25.75*/ {_display_(Seq[Any](format.raw/*25.77*/("""
                                            <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                        """)))}/*27.43*/else/*27.48*/{_display_(Seq[Any](format.raw/*27.49*/("""
                                            <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                        """)))})),format.raw/*29.42*/("""
                                    """)))}/*30.39*/else/*30.44*/{_display_(Seq[Any](format.raw/*30.45*/("""
                                        <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                    """)))})),format.raw/*32.38*/("""
                                </th>

                            </tr>
                            <tr>
                                <th title="Song" align="right">Song</th>
                                <th title="Artist" align="right">Artist</th>
                                <th title="Album" align="right">Album</th>
                                <th class=""""),format.raw/*40.44*/("""{"""),format.raw/*40.45*/("""sorter: false"""),format.raw/*40.58*/("""}"""),format.raw/*40.59*/("""" title="Play" align="right">Play</th>

                                """),_display_(Seq[Any](/*42.34*/if(localUser.id == sniplist.user.id)/*42.70*/ {_display_(Seq[Any](format.raw/*42.72*/("""
                                    <th title="Remove"></th>
                                """)))}/*44.35*/else/*44.40*/{_display_(Seq[Any](format.raw/*44.41*/("""
                                    <th title="Favourite"></th>
                                """)))})),format.raw/*46.34*/("""
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*50.26*/for(snip <- sniplist.snips) yield /*50.53*/ {_display_(Seq[Any](format.raw/*50.55*/("""
                            <tr>
                                <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*52.75*/snip/*52.79*/.song_name)),format.raw/*52.89*/("""</td>
                                <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*53.76*/snip/*53.80*/.artist_name)),format.raw/*53.92*/("""</td>
                                <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*54.75*/snip/*54.79*/.album_name)),format.raw/*54.90*/("""</td>
                                <td align="center" class="center">
                                    <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                </td>
                                <td class="center">
                                """),_display_(Seq[Any](/*59.34*/if(localUser.id == sniplist.user.id)/*59.70*/ {_display_(Seq[Any](format.raw/*59.72*/("""
                                    <span style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*60.144*/snip/*60.148*/.id)),format.raw/*60.151*/(""""></span>
                                """)))}/*61.35*/else/*61.40*/{_display_(Seq[Any](format.raw/*61.41*/("""
                                    """),_display_(Seq[Any](/*62.38*/if(snip.localUserFavourited)/*62.66*/ {_display_(Seq[Any](format.raw/*62.68*/("""
                                        <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip red"></span>
                                    """)))}/*64.39*/else/*64.44*/{_display_(Seq[Any](format.raw/*64.45*/("""
                                        <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip black"></span>
                                    """)))})),format.raw/*66.38*/("""
                                """)))})),format.raw/*67.34*/("""
                                </td>
                                <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*69.68*/snip/*69.72*/.id)),format.raw/*69.75*/("""" ></td>
                                <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*70.74*/snip/*70.78*/.url)),format.raw/*70.82*/(""""></td>
                                <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*71.81*/snip/*71.85*/.time_min)),format.raw/*71.94*/(""""></td>
                                <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*72.79*/snip/*72.83*/.time_max)),format.raw/*72.92*/(""""></td>
                            </tr>
                        """)))})),format.raw/*74.26*/("""
                        </tbody>

                    </table>
                </div>
            </div>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*82.2*/("""

"""),_display_(Seq[Any](/*84.2*/if(!js)/*84.9*/ {_display_(Seq[Any](format.raw/*84.11*/("""
    """),_display_(Seq[Any](/*85.6*/main("My SnipLists", "mySnipLists")/*85.41*/(content))),format.raw/*85.50*/("""
""")))}/*86.3*/else/*86.8*/{_display_(Seq[Any](format.raw/*86.9*/("""
    """),_display_(Seq[Any](/*87.6*/content)),format.raw/*87.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,sniplist:models.Sniplist): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,sniplist)
    
    def f:((java.lang.Boolean,models.User,models.Sniplist) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,sniplist) => apply(js,localUser,sniplist)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/viewSniplistDirect.scala.html
                    HASH: b06b5c653e395492fc7f2232a9980f8dc26bb5dc
                    MATRIX: 835->1|993->85|1007->92|1091->96|1419->388|1437->397|1462->400|1679->580|1697->588|1723->591|1943->774|1959->780|2040->838|2102->863|2120->871|2148->876|2299->990|2315->996|2392->1050|2457->1078|2475->1086|2508->1096|2584->1135|2602->1143|2640->1158|2722->1204|2767->1240|2807->1242|2885->1284|2927->1317|2967->1319|3188->1522|3201->1527|3240->1528|3472->1728|3529->1767|3542->1772|3581->1773|3820->1980|4223->2355|4252->2356|4293->2369|4322->2370|4431->2443|4476->2479|4516->2481|4630->2577|4643->2582|4682->2583|4812->2681|4973->2806|5016->2833|5056->2835|5200->2943|5213->2947|5245->2957|5362->3038|5375->3042|5409->3054|5525->3134|5538->3138|5571->3149|5938->3480|5983->3516|6023->3518|6204->3662|6218->3666|6244->3669|6306->3713|6319->3718|6358->3719|6432->3757|6469->3785|6509->3787|6700->3960|6713->3965|6752->3966|6958->4140|7024->4174|7166->4280|7179->4284|7204->4287|7322->4369|7335->4373|7361->4377|7485->4465|7498->4469|7529->4478|7651->4564|7664->4568|7695->4577|7794->4644|7966->82|7995->4777|8033->4780|8048->4787|8088->4789|8129->4795|8173->4830|8204->4839|8224->4842|8236->4847|8274->4848|8315->4854|8344->4861
                    LINES: 26->1|28->3|28->3|30->3|41->14|41->14|41->14|44->17|44->17|44->17|47->20|47->20|47->20|47->20|47->20|47->20|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|51->24|51->24|51->24|52->25|52->25|52->25|54->27|54->27|54->27|56->29|57->30|57->30|57->30|59->32|67->40|67->40|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|77->50|77->50|77->50|79->52|79->52|79->52|80->53|80->53|80->53|81->54|81->54|81->54|86->59|86->59|86->59|87->60|87->60|87->60|88->61|88->61|88->61|89->62|89->62|89->62|91->64|91->64|91->64|93->66|94->67|96->69|96->69|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|99->72|99->72|101->74|110->1|112->82|114->84|114->84|114->84|115->85|115->85|115->85|116->86|116->86|116->86|117->87|117->87
                    -- GENERATED --
                */
            