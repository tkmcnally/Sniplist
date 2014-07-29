
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
object arraySniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*3.1*/("""
    <div class="row ">
    """),_display_(Seq[Any](/*5.6*/if(userSniplists != null)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
        """),_display_(Seq[Any](/*6.10*/for(sniplist <- userSniplists.savedSniplists) yield /*6.55*/ {_display_(Seq[Any](format.raw/*6.57*/("""
            """),_display_(Seq[Any](/*7.14*/(i += 1))),format.raw/*7.22*/("""
            <div class="col-lg-6">
                <table class="table table-default table-bordered table-striped" value=""""),_display_(Seq[Any](/*9.89*/sniplist/*9.97*/.id)),format.raw/*9.100*/("""">
                    <thead>
                        <tr>
                            <th title="Name" colspan="5" align="right"><h4 style="display: inline;">"""),_display_(Seq[Any](/*12.102*/sniplist/*12.110*/.name)),format.raw/*12.115*/(""" </h4>

                                <p style="display: inline;">by """),_display_(Seq[Any](/*14.65*/sniplist/*14.73*/.user.name)),format.raw/*14.83*/("""</p> <span class="alert-danger badge">"""),_display_(Seq[Any](/*14.122*/sniplist/*14.130*/.favouriteCount)),format.raw/*14.145*/("""</span> </span>

                                """),_display_(Seq[Any](/*16.34*/if(localUser.id != userSniplists.user.id)/*16.75*/ {_display_(Seq[Any](format.raw/*16.77*/("""
                                    """),_display_(Seq[Any](/*17.38*/if(!sniplist.localUserFavourited)/*17.71*/ {_display_(Seq[Any](format.raw/*17.73*/("""
                                        <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                    """)))}/*19.39*/else/*19.44*/{_display_(Seq[Any](format.raw/*19.45*/("""
                                        <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                    """)))})),format.raw/*21.38*/("""
                                """)))}/*22.35*/else/*22.40*/{_display_(Seq[Any](format.raw/*22.41*/("""
                                    <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                """)))})),format.raw/*24.34*/("""
                            </th>

                        </tr>
                        <tr>
                            <th title="Song" align="right">Song</th>
                            <th title="Artist" align="right">Artist</th>
                            <th title="Album" align="right">Album</th>
                            <th class=""""),format.raw/*32.40*/("""{"""),format.raw/*32.41*/("""sorter: false"""),format.raw/*32.54*/("""}"""),format.raw/*32.55*/("""" title="Play" align="right">Play</th>

                            """),_display_(Seq[Any](/*34.30*/if(localUser.id == userSniplists.user.id)/*34.71*/ {_display_(Seq[Any](format.raw/*34.73*/("""
                                <th title="Remove"></th>
                            """)))}/*36.31*/else/*36.36*/{_display_(Seq[Any](format.raw/*36.37*/("""
                                <th title="Favourite"></th>
                            """)))})),format.raw/*38.30*/("""
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(Seq[Any](/*42.22*/for(snip <- sniplist.snips) yield /*42.49*/ {_display_(Seq[Any](format.raw/*42.51*/("""
                        <tr>
                            <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*44.71*/snip/*44.75*/.song_name)),format.raw/*44.85*/("""</td>
                            <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*45.72*/snip/*45.76*/.artist_name)),format.raw/*45.88*/("""</td>
                            <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*46.71*/snip/*46.75*/.album_name)),format.raw/*46.86*/("""</td>
                            <td align="center" class="center">
                                <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                            </td>
                            <td class="center">
                            """),_display_(Seq[Any](/*51.30*/if(localUser.id == sniplist.user.id)/*51.66*/ {_display_(Seq[Any](format.raw/*51.68*/("""
                                <span style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*52.140*/snip/*52.144*/.id)),format.raw/*52.147*/(""""></span>
                            """)))}/*53.31*/else/*53.36*/{_display_(Seq[Any](format.raw/*53.37*/("""
                                """),_display_(Seq[Any](/*54.34*/if(snip.localUserFavourited)/*54.62*/ {_display_(Seq[Any](format.raw/*54.64*/("""
                                    <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip red"></span>
                                """)))}/*56.35*/else/*56.40*/{_display_(Seq[Any](format.raw/*56.41*/("""
                                    <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip black"></span>
                                """)))})),format.raw/*58.34*/("""
                            """)))})),format.raw/*59.30*/("""
                            </td>
                            <td class="hidden snip-id" id=""""),_display_(Seq[Any](/*61.61*/snip/*61.65*/.id)),format.raw/*61.68*/("""" ></td>
                            <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*62.70*/snip/*62.74*/.url)),format.raw/*62.78*/(""""></td>
                            <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*63.77*/snip/*63.81*/.time_min)),format.raw/*63.90*/(""""></td>
                            <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*64.75*/snip/*64.79*/.time_max)),format.raw/*64.88*/(""""></td>
                        </tr>
                    """)))})),format.raw/*66.22*/("""
                    </tbody>

                </table>
            </div>
            """),_display_(Seq[Any](/*71.14*/if(i % 2 == 0)/*71.28*/ {_display_(Seq[Any](format.raw/*71.30*/("""
            </div>
    <div class="row">
    """)))})),format.raw/*74.6*/("""
    """)))})),format.raw/*75.6*/("""
    </div>
""")))})),format.raw/*77.2*/("""

    </div>"""))}
    }
    
    def render(localUser:models.User,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(localUser,userSniplists)
    
    def f:((models.User,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (localUser,userSniplists) => apply(localUser,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 29 18:31:16 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/arraySniplists.scala.html
                    HASH: 2005494a3157fa5610d5c58201d15dca04d7d61f
                    MATRIX: 817->1|1015->67|1042->107|1105->136|1138->161|1177->163|1222->173|1282->218|1321->220|1370->234|1399->242|1558->366|1574->374|1599->377|1797->538|1815->546|1843->551|1951->623|1968->631|2000->641|2076->680|2094->688|2132->703|2218->753|2268->794|2308->796|2382->834|2424->867|2464->869|2677->1064|2690->1069|2729->1070|2953->1262|3006->1297|3019->1302|3058->1303|3289->1502|3664->1849|3693->1850|3734->1863|3763->1864|3868->1933|3918->1974|3958->1976|4064->2064|4077->2069|4116->2070|4238->2160|4383->2269|4426->2296|4466->2298|4602->2398|4615->2402|4647->2412|4760->2489|4773->2493|4807->2505|4919->2581|4932->2585|4965->2596|5312->2907|5357->2943|5397->2945|5574->3085|5588->3089|5614->3092|5672->3132|5685->3137|5724->3138|5794->3172|5831->3200|5871->3202|6054->3367|6067->3372|6106->3373|6304->3539|6366->3569|6497->3664|6510->3668|6535->3671|6649->3749|6662->3753|6688->3757|6808->3841|6821->3845|6852->3854|6970->3936|6983->3940|7014->3949|7105->4008|7229->4096|7252->4110|7292->4112|7370->4159|7407->4165|7451->4178
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|42->14|42->14|42->14|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|49->21|50->22|50->22|50->22|52->24|60->32|60->32|60->32|60->32|62->34|62->34|62->34|64->36|64->36|64->36|66->38|70->42|70->42|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|84->56|84->56|84->56|86->58|87->59|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|94->66|99->71|99->71|99->71|102->74|103->75|105->77
                    -- GENERATED --
                */
            