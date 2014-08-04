
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
object arraySniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,models.MySnips,models.MySniplists,models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, mySnips: models.MySnips, mySniplists: models.MySniplists, userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""

      <div id="sniplist-array" value=""""),_display_(Seq[Any](/*5.40*/localUser/*5.49*/.id)),format.raw/*5.52*/("""">
        <div class="row ">
        """),_display_(Seq[Any](/*7.10*/if(userSniplists != null)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
            """),_display_(Seq[Any](/*8.14*/for(sniplist <- userSniplists.savedSniplists) yield /*8.59*/ {_display_(Seq[Any](format.raw/*8.61*/("""
                """),_display_(Seq[Any](/*9.18*/(i += 1))),format.raw/*9.26*/("""
                <div class="col-lg-6">
                    <table class="table table-default table-bordered table-striped"  value="sniplist" id=""""),_display_(Seq[Any](/*11.108*/sniplist/*11.116*/.id)),format.raw/*11.119*/("""" >
                        <thead>
                            <tr>
                                <th title="Name" colspan="5" align="right"><h4 style="display: inline;"><a href=""""),_display_(Seq[Any](/*14.115*/routes/*14.121*/.SnipLists.viewSniplistById(sniplist.id.toString))),format.raw/*14.170*/("""" class="dynamic-link"> """),_display_(Seq[Any](/*14.195*/sniplist/*14.203*/.name)),format.raw/*14.208*/(""" </a></h4>

                                    <p style="display: inline;">by </p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*16.103*/routes/*16.109*/.Application.getUserProfile(sniplist.user.id.toString))),format.raw/*16.163*/("""" style="display: inline;">"""),_display_(Seq[Any](/*16.191*/sniplist/*16.199*/.user.name)),format.raw/*16.209*/("""</a> <span class="alert-danger badge">"""),_display_(Seq[Any](/*16.248*/sniplist/*16.256*/.favouriteCount)),format.raw/*16.271*/("""</span> </span>

                                    """),_display_(Seq[Any](/*18.38*/if(localUser.id != userSniplists.user.id)/*18.79*/ {_display_(Seq[Any](format.raw/*18.81*/("""
                                        """),_display_(Seq[Any](/*19.42*/if(MySniplists.isFavourited(mySniplists, sniplist))/*19.93*/ {_display_(Seq[Any](format.raw/*19.95*/("""
                                            <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                        """)))}/*21.43*/else/*21.48*/{_display_(Seq[Any](format.raw/*21.49*/("""
                                            <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                        """)))})),format.raw/*23.42*/("""
                                    """)))}/*24.39*/else/*24.44*/{_display_(Seq[Any](format.raw/*24.45*/("""
                                        <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                    """)))})),format.raw/*26.38*/("""

                                    <a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*28.142*/routes/*28.148*/.SnipLists.viewSniplistById(sniplist.id.toString))),format.raw/*28.197*/("""">
                                        <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                                    </a>
                                </th>

                            </tr>
                            <tr>
                                <th title="Song" align="right">Song</th>
                                <th title="Artist" align="right">Artist</th>
                                <th title="Album" align="right">Album</th>
                                <th class=""""),format.raw/*38.44*/("""{"""),format.raw/*38.45*/("""sorter: false"""),format.raw/*38.58*/("""}"""),format.raw/*38.59*/("""" title="Play" align="right">Play</th>

                                """),_display_(Seq[Any](/*40.34*/if(localUser.id == userSniplists.user.id)/*40.75*/ {_display_(Seq[Any](format.raw/*40.77*/("""
                                    <th title="Remove"></th>
                                """)))}/*42.35*/else/*42.40*/{_display_(Seq[Any](format.raw/*42.41*/("""
                                    <th title="Favourite"></th>
                                """)))})),format.raw/*44.34*/("""
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*48.26*/for(snip <- sniplist.snips) yield /*48.53*/ {_display_(Seq[Any](format.raw/*48.55*/("""
                            <tr>
                                <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*50.75*/snip/*50.79*/.song_name)),format.raw/*50.89*/("""</td>
                                <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*51.76*/snip/*51.80*/.artist_name)),format.raw/*51.92*/("""</td>
                                <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*52.75*/snip/*52.79*/.album_name)),format.raw/*52.90*/("""</td>
                                <td align="center" class="center">
                                    <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                </td>
                                <td class="center">
                                """),_display_(Seq[Any](/*57.34*/if(localUser.id == sniplist.user.id)/*57.70*/ {_display_(Seq[Any](format.raw/*57.72*/("""
                                    <span style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*58.144*/snip/*58.148*/.id)),format.raw/*58.151*/(""""></span>
                                """)))}/*59.35*/else/*59.40*/{_display_(Seq[Any](format.raw/*59.41*/("""
                                    """),_display_(Seq[Any](/*60.38*/if(MySnips.isFavourited(mySnips, snip))/*60.77*/ {_display_(Seq[Any](format.raw/*60.79*/("""
                                        <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip red"></span>
                                    """)))}/*62.39*/else/*62.44*/{_display_(Seq[Any](format.raw/*62.45*/("""
                                        <span style="cursor : pointer ;" class="glyphicon glyphicon-heart favourite-snip black"></span>
                                    """)))})),format.raw/*64.38*/("""
                                """)))})),format.raw/*65.34*/("""
                                </td>
                                <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*67.68*/snip/*67.72*/.id)),format.raw/*67.75*/("""" ></td>
                                <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*68.74*/snip/*68.78*/.url)),format.raw/*68.82*/(""""></td>
                                <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*69.81*/snip/*69.85*/.time_min)),format.raw/*69.94*/(""""></td>
                                <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*70.79*/snip/*70.83*/.time_max)),format.raw/*70.92*/(""""></td>
                            </tr>
                        """)))})),format.raw/*72.26*/("""
                        </tbody>

                    </table>
                </div>
                """),_display_(Seq[Any](/*77.18*/if(i % 2 == 0)/*77.32*/ {_display_(Seq[Any](format.raw/*77.34*/("""
                </div>
        <div class="row">
        """)))})),format.raw/*80.10*/("""
        """)))})),format.raw/*81.10*/("""
        </div>
        """)))})),format.raw/*83.10*/("""

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
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.MySnips,mySniplists:models.MySniplists,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.MySnips,models.MySniplists,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userSniplists) => apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 17:36:03 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/arraySniplists.scala.html
                    HASH: 5170da6136a69533db3f4dd3b9516081a77175e7
                    MATRIX: 869->1|1149->148|1176->188|1252->229|1269->238|1293->241|1367->280|1400->305|1439->307|1488->321|1548->366|1587->368|1640->386|1669->394|1853->541|1871->549|1897->552|2117->735|2133->741|2205->790|2267->815|2285->823|2313->828|2464->942|2480->948|2557->1002|2622->1030|2640->1038|2673->1048|2749->1087|2767->1095|2805->1110|2895->1164|2945->1205|2985->1207|3063->1249|3123->1300|3163->1302|3382->1503|3395->1508|3434->1509|3668->1711|3725->1750|3738->1755|3777->1756|4016->1963|4196->2106|4212->2112|4284->2161|4843->2692|4872->2693|4913->2706|4942->2707|5051->2780|5101->2821|5141->2823|5255->2919|5268->2924|5307->2925|5437->3023|5598->3148|5641->3175|5681->3177|5825->3285|5838->3289|5870->3299|5987->3380|6000->3384|6034->3396|6150->3476|6163->3480|6196->3491|6563->3822|6608->3858|6648->3860|6829->4004|6843->4008|6869->4011|6931->4055|6944->4060|6983->4061|7057->4099|7105->4138|7145->4140|7336->4313|7349->4318|7388->4319|7594->4493|7660->4527|7802->4633|7815->4637|7840->4640|7958->4722|7971->4726|7997->4730|8121->4818|8134->4822|8165->4831|8287->4917|8300->4921|8331->4930|8430->4997|8570->5101|8593->5115|8633->5117|8724->5176|8766->5186|8823->5211
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|42->14|42->14|42->14|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|51->23|52->24|52->24|52->24|54->26|56->28|56->28|56->28|66->38|66->38|66->38|66->38|68->40|68->40|68->40|70->42|70->42|70->42|72->44|76->48|76->48|76->48|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|92->64|93->65|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|100->72|105->77|105->77|105->77|108->80|109->81|111->83
                    -- GENERATED --
                */
            