
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

<div id="sniplist-array" value=""""),_display_(Seq[Any](/*5.34*/localUser/*5.43*/.id)),format.raw/*5.46*/("""">
    <div class="row ">
    """),_display_(Seq[Any](/*7.6*/if(userSniplists != null)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
        """),_display_(Seq[Any](/*8.10*/for(sniplist <- userSniplists.savedSniplists) yield /*8.55*/ {_display_(Seq[Any](format.raw/*8.57*/("""
            """),_display_(Seq[Any](/*9.14*/(i += 1))),format.raw/*9.22*/("""
            <div class="col-lg-6">
                <div class="playlist-container" data-sniplist-id=""""),_display_(Seq[Any](/*11.68*/sniplist/*11.76*/.id)),format.raw/*11.79*/("""">
                <table class="table table-default table-bordered table-striped"  value="sniplist">
                    <thead>
                        <tr>
                            <th title="Name" colspan="5" align="right"><h4 style="display: inline;"><a href=""""),_display_(Seq[Any](/*15.111*/routes/*15.117*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*15.175*/("""" class="dynamic-link"> """),_display_(Seq[Any](/*15.200*/sniplist/*15.208*/.name)),format.raw/*15.213*/(""" </a></h4>

                                <p style="display: inline;">by </p><a class="dynamic-link" href=""""),_display_(Seq[Any](/*17.99*/routes/*17.105*/.Application.getUserProfile(sniplist.user.id.toString))),format.raw/*17.159*/("""" style="display: inline;">"""),_display_(Seq[Any](/*17.187*/sniplist/*17.195*/.user.name)),format.raw/*17.205*/("""</a> <span class="alert-danger badge">"""),_display_(Seq[Any](/*17.244*/sniplist/*17.252*/.favouriteCount)),format.raw/*17.267*/("""</span>

                                """),_display_(Seq[Any](/*19.34*/if(localUser.id != userSniplists.user.id)/*19.75*/ {_display_(Seq[Any](format.raw/*19.77*/("""
                                    """),_display_(Seq[Any](/*20.38*/if(SniplistCollection.isFavourited(mySniplists, sniplist))/*20.96*/ {_display_(Seq[Any](format.raw/*20.98*/("""
                                        <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist red"></span>
                                    """)))}/*22.39*/else/*22.44*/{_display_(Seq[Any](format.raw/*22.45*/("""
                                        <span style="float : right ; cursor : pointer ;" class="glyphicon glyphicon-heart favourite-sniplist black"></span>
                                    """)))})),format.raw/*24.38*/("""
                                """)))}/*25.35*/else/*25.40*/{_display_(Seq[Any](format.raw/*25.41*/("""
                                    <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span>
                                """)))})),format.raw/*27.34*/("""

                                <a class="share-link-a" href="" align="left" data-toggle="modal" data-target="#share-link-modal" value=""""),_display_(Seq[Any](/*29.138*/routes/*29.144*/.SniplistController.viewSniplistById(sniplist.id.toString))),format.raw/*29.202*/("""">
                                    <span style="cursor : pointer" class="glyphicon glyphicon-share"></span>
                                </a>
                            </th>
                        </tr>
                        <tr>
                            <th title="Song" align="right">Song</th>
                            <th title="Artist" align="right">Artist</th>
                            <th title="Album" align="right">Album</th>
                            <th class=""""),format.raw/*38.40*/("""{"""),format.raw/*38.41*/("""sorter: false"""),format.raw/*38.54*/("""}"""),format.raw/*38.55*/("""" title="Play" align="right">Play</th>

                            """),_display_(Seq[Any](/*40.30*/if(localUser.id == userSniplists.user.id)/*40.71*/ {_display_(Seq[Any](format.raw/*40.73*/("""
                                <th title="Remove"></th>
                            """)))}/*42.31*/else/*42.36*/{_display_(Seq[Any](format.raw/*42.37*/("""
                                <th title="Favourite"></th>
                            """)))})),format.raw/*44.30*/("""
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(Seq[Any](/*48.22*/for(snip <- sniplist.snips) yield /*48.49*/ {_display_(Seq[Any](format.raw/*48.51*/("""
                        <div class="snip-module">
                            <tr>
                                <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*51.75*/snip/*51.79*/.song_name)),format.raw/*51.89*/("""</td>
                                <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*52.76*/snip/*52.80*/.artist_name)),format.raw/*52.92*/("""</td>
                                <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*53.75*/snip/*53.79*/.album_name)),format.raw/*53.90*/("""</td>
                                <td align="center" class="center">
                                    <div class="action-controls">
                                        <i class="fa fa-play fa-2x play-snippet green" data-snip-id=""""),_display_(Seq[Any](/*56.103*/snip/*56.107*/.id)),format.raw/*56.110*/(""""></i>
                                    </div>
                                </td>
                                <td class="center">
                                """),_display_(Seq[Any](/*60.34*/if(localUser.id == sniplist.user.id)/*60.70*/ {_display_(Seq[Any](format.raw/*60.72*/("""
                                    <i style="cursor : pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" data-snip-id=""""),_display_(Seq[Any](/*61.148*/snip/*61.152*/.id)),format.raw/*61.155*/(""""></i>
                                """)))}/*62.35*/else/*62.40*/{_display_(Seq[Any](format.raw/*62.41*/("""
                                    <div class="action-controls">
                                        <i class="fa fa-heart """),_display_(Seq[Any](/*64.64*/if(SnipCollection.isFavourited(mySnips, snip))/*64.110*/{_display_(Seq[Any](format.raw/*64.111*/("""red""")))})),format.raw/*64.115*/(""" """),_display_(Seq[Any](/*64.117*/if(!localUser.id.equals(snip.user.id))/*64.155*/{_display_(Seq[Any](format.raw/*64.156*/("""fav""")))})),format.raw/*64.160*/(""" favourite-snip" data-snip-id=""""),_display_(Seq[Any](/*64.192*/snip/*64.196*/.id)),format.raw/*64.199*/(""""></i>
                                    </div>
                                """)))})),format.raw/*66.34*/("""
                                </td>
                                <td class="hidden snip-id" value=""""),_display_(Seq[Any](/*68.68*/snip/*68.72*/.id)),format.raw/*68.75*/("""" ></td>
                                <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*69.74*/snip/*69.78*/.url)),format.raw/*69.82*/(""""></td>
                                <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*70.81*/snip/*70.85*/.time_min)),format.raw/*70.94*/(""""></td>
                                <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*71.79*/snip/*71.83*/.time_max)),format.raw/*71.92*/(""""></td>
                            </tr>
                        </div>
                    """)))})),format.raw/*74.22*/("""
                    </tbody>

                </table>
            </div>
            """),_display_(Seq[Any](/*79.14*/if(i % 2 == 0)/*79.28*/ {_display_(Seq[Any](format.raw/*79.30*/("""
                </div>
                <div class="row">
            """)))})),format.raw/*82.14*/("""
        """)))})),format.raw/*83.10*/("""
    </div>
    """)))})),format.raw/*85.6*/("""
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
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userSniplists) => apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 20 13:47:06 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/arraySniplists.scala.html
                    HASH: 958f160096d349d8f7ef9787c2c4813d68e06511
                    MATRIX: 889->1|1190->169|1217->209|1287->244|1304->253|1328->256|1393->287|1426->312|1465->314|1510->324|1570->369|1609->371|1658->385|1687->393|1826->496|1843->504|1868->507|2174->776|2190->782|2271->840|2333->865|2351->873|2379->878|2525->988|2541->994|2618->1048|2683->1076|2701->1084|2734->1094|2810->1133|2828->1141|2866->1156|2944->1198|2994->1239|3034->1241|3108->1279|3175->1337|3215->1339|3426->1532|3439->1537|3478->1538|3704->1732|3757->1767|3770->1772|3809->1773|4040->1972|4216->2111|4232->2117|4313->2175|4835->2669|4864->2670|4905->2683|4934->2684|5039->2753|5089->2794|5129->2796|5235->2884|5248->2889|5287->2890|5409->2980|5554->3089|5597->3116|5637->3118|5831->3276|5844->3280|5876->3290|5993->3371|6006->3375|6040->3387|6156->3467|6169->3471|6202->3482|6480->3723|6494->3727|6520->3730|6729->3903|6774->3939|6814->3941|6999->4089|7013->4093|7039->4096|7098->4137|7111->4142|7150->4143|7316->4273|7372->4319|7412->4320|7449->4324|7488->4326|7536->4364|7576->4365|7613->4369|7682->4401|7696->4405|7722->4408|7837->4491|7979->4597|7992->4601|8017->4604|8135->4686|8148->4690|8174->4694|8298->4782|8311->4786|8342->4795|8464->4881|8477->4885|8508->4894|8634->4988|8758->5076|8781->5090|8821->5092|8924->5163|8966->5173|9014->5190
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|39->11|39->11|39->11|43->15|43->15|43->15|43->15|43->15|43->15|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|52->24|53->25|53->25|53->25|55->27|57->29|57->29|57->29|66->38|66->38|66->38|66->38|68->40|68->40|68->40|70->42|70->42|70->42|72->44|76->48|76->48|76->48|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|84->56|84->56|84->56|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|92->64|94->66|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|102->74|107->79|107->79|107->79|110->82|111->83|113->85
                    -- GENERATED --
                */
            