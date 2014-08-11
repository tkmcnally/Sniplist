
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
object arraySniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, mySnips: models.SnipCollection, mySniplists: models.SniplistCollection, userSniplists: models.SniplistCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.170*/("""
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
                                <th title="Name" colspan="5" align="right"><h4 style="display: inline;"><a href=""""),_display_(Seq[Any](/*14.115*/routes/*14.121*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*14.179*/("""" class="dynamic-link"> """),_display_(Seq[Any](/*14.204*/sniplist/*14.212*/.name)),format.raw/*14.217*/(""" </a></h4>

                                    <p style="display: inline;">by </p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*16.103*/routes/*16.109*/.Application.getUserProfile(sniplist.user.id.toString))),format.raw/*16.163*/("""" style="display: inline;">"""),_display_(Seq[Any](/*16.191*/sniplist/*16.199*/.user.name)),format.raw/*16.209*/("""</a> <span class="alert-danger badge">"""),_display_(Seq[Any](/*16.248*/sniplist/*16.256*/.favouriteCount)),format.raw/*16.271*/("""</span>

                                    """),_display_(Seq[Any](/*18.38*/if(localUser.id != userSniplists.user.id)/*18.79*/ {_display_(Seq[Any](format.raw/*18.81*/("""
                                        """),_display_(Seq[Any](/*19.42*/if(SniplistCollection.isFavourited(mySniplists, sniplist))/*19.100*/ {_display_(Seq[Any](format.raw/*19.102*/("""
                                            <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                        """)))}/*21.43*/else/*21.48*/{_display_(Seq[Any](format.raw/*21.49*/("""
                                            <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                        """)))})),format.raw/*23.42*/("""
                                    """)))}/*24.39*/else/*24.44*/{_display_(Seq[Any](format.raw/*24.45*/("""
                                        <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                    """)))})),format.raw/*26.38*/("""

                                    <a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*28.142*/routes/*28.148*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*28.206*/("""">
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
                                    """),_display_(Seq[Any](/*60.38*/if(SnipCollection.isFavourited(mySnips, snip))/*60.84*/ {_display_(Seq[Any](format.raw/*60.86*/("""
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
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userSniplists) => apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 18:07:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/arraySniplists.scala.html
                    HASH: a843ae8c30495280128c6fe3f9efbdb3716bd6cf
                    MATRIX: 889->1|1190->169|1217->209|1293->250|1310->259|1334->262|1408->301|1441->326|1480->328|1529->342|1589->387|1628->389|1681->407|1710->415|1894->562|1912->570|1938->573|2158->756|2174->762|2255->820|2317->845|2335->853|2363->858|2514->972|2530->978|2607->1032|2672->1060|2690->1068|2723->1078|2799->1117|2817->1125|2855->1140|2937->1186|2987->1227|3027->1229|3105->1271|3173->1329|3214->1331|3433->1532|3446->1537|3485->1538|3719->1740|3776->1779|3789->1784|3828->1785|4067->1992|4247->2135|4263->2141|4344->2199|4903->2730|4932->2731|4973->2744|5002->2745|5111->2818|5161->2859|5201->2861|5315->2957|5328->2962|5367->2963|5497->3061|5658->3186|5701->3213|5741->3215|5885->3323|5898->3327|5930->3337|6047->3418|6060->3422|6094->3434|6210->3514|6223->3518|6256->3529|6623->3860|6668->3896|6708->3898|6889->4042|6903->4046|6929->4049|6991->4093|7004->4098|7043->4099|7117->4137|7172->4183|7212->4185|7403->4358|7416->4363|7455->4364|7661->4538|7727->4572|7869->4678|7882->4682|7907->4685|8025->4767|8038->4771|8064->4775|8188->4863|8201->4867|8232->4876|8354->4962|8367->4966|8398->4975|8497->5042|8637->5146|8660->5160|8700->5162|8791->5221|8833->5231|8890->5256
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|42->14|42->14|42->14|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|51->23|52->24|52->24|52->24|54->26|56->28|56->28|56->28|66->38|66->38|66->38|66->38|68->40|68->40|68->40|70->42|70->42|70->42|72->44|76->48|76->48|76->48|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|92->64|93->65|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|100->72|105->77|105->77|105->77|108->80|109->81|111->83
                    -- GENERATED --
                */
            