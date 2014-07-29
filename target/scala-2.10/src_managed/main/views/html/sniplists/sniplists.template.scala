
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
object sniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,List[models.SnipList],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, snipLists: List[models.SnipList]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.67*/("""
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
            """),_display_(Seq[Any](/*23.14*/for(sniplist <- snipLists) yield /*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
                """),_display_(Seq[Any](/*24.18*/(i += 1))),format.raw/*24.26*/("""
                <div class="col-lg-6">
                    <table class="table table-default table-bordered table-striped" value=""""),_display_(Seq[Any](/*26.93*/sniplist/*26.101*/.id)),format.raw/*26.104*/("""">
                        <thead>
                            <tr>
                                <th title="Name" colspan="5" align="right">"""),_display_(Seq[Any](/*29.77*/sniplist/*29.85*/.name)),format.raw/*29.90*/(""" <span style="float: right; text-align: right; cursor: pointer" class="glyphicon glyphicon-remove remove remove-playlist"></span> </th>
                            </tr>
                            <tr>
                                <th title="Song" align="right">Song</th>
                                <th title="Artist" align="right">Artist</th>
                                <th title="Album" align="right">Album</th>
                                <th class=""""),format.raw/*35.44*/("""{"""),format.raw/*35.45*/("""sorter: false"""),format.raw/*35.58*/("""}"""),format.raw/*35.59*/("""" title="Play" align="right">Play</th>
                                <th title="Remove"></th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*40.26*/for(snip <- sniplist.snips) yield /*40.53*/ {_display_(Seq[Any](format.raw/*40.55*/("""
                            <tr>
                                <td align="left" class="left snip-title">"""),_display_(Seq[Any](/*42.75*/snip/*42.79*/.song_name)),format.raw/*42.89*/("""</td>
                                <td align="left" class="left snip-artist">"""),_display_(Seq[Any](/*43.76*/snip/*43.80*/.artist_name)),format.raw/*43.92*/("""</td>
                                <td align="left" class="left snip-album">"""),_display_(Seq[Any](/*44.75*/snip/*44.79*/.album_name)),format.raw/*44.90*/("""</td>
                                <td align="center" class="center">
                                    <span style="cursor:pointer" class="glyphicon glyphicon-play play-snip-table play-snippet"></span>
                                </td>
                                <td class="center">
                                    <span style="cursor:pointer" class="glyphicon remove glyphicon-remove remove-snip-from-sniplist" value=""""),_display_(Seq[Any](/*49.142*/snip/*49.146*/.id)),format.raw/*49.149*/(""""></span>
                                </td>
                                <td class="hidden snip-id" id=""""),_display_(Seq[Any](/*51.65*/snip/*51.69*/.id)),format.raw/*51.72*/("""" ></td>
                                <td class="hidden snip-video-id" value=""""),_display_(Seq[Any](/*52.74*/snip/*52.78*/.url)),format.raw/*52.82*/(""""></td>
                                <td class="hidden snip-video-startTime" value=""""),_display_(Seq[Any](/*53.81*/snip/*53.85*/.time_min)),format.raw/*53.94*/(""""></td>
                                <td class="hidden snip-video-endTime" value=""""),_display_(Seq[Any](/*54.79*/snip/*54.83*/.time_max)),format.raw/*54.92*/(""""></td>
                            </tr>
                        """)))})),format.raw/*56.26*/("""
                        </tbody>

                    </table>
                </div>
                """),_display_(Seq[Any](/*61.18*/if(i % 2 == 0)/*61.32*/ {_display_(Seq[Any](format.raw/*61.34*/("""
                </div>
            <div class="row">
            """)))})),format.raw/*64.14*/("""
            """)))})),format.raw/*65.14*/("""
            </div>

        </div>

    </div>
""")))})))}
    }
    
    def render(localUser:models.User,snipLists:List[models.SnipList]): play.api.templates.HtmlFormat.Appendable = apply(localUser,snipLists)
    
    def f:((models.User,List[models.SnipList]) => play.api.templates.HtmlFormat.Appendable) = (localUser,snipLists) => apply(localUser,snipLists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 19:24:00 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/sniplists.scala.html
                    HASH: d1b224d32cc5f5ff3ca6a00a467d480259c15d77
                    MATRIX: 815->1|1012->66|1039->106|1075->108|1118->143|1157->145|1794->746|1812->755|1837->758|1920->805|1962->831|2002->833|2056->851|2086->859|2254->991|2272->999|2298->1002|2478->1146|2495->1154|2522->1159|3021->1630|3050->1631|3091->1644|3120->1645|3376->1865|3419->1892|3459->1894|3603->2002|3616->2006|3648->2016|3765->2097|3778->2101|3812->2113|3928->2193|3941->2197|3974->2208|4450->2647|4464->2651|4490->2654|4638->2766|4651->2770|4676->2773|4794->2855|4807->2859|4833->2863|4957->2951|4970->2955|5001->2964|5123->3050|5136->3054|5167->3063|5266->3130|5406->3234|5429->3248|5469->3250|5568->3317|5614->3331
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|54->26|54->26|54->26|57->29|57->29|57->29|63->35|63->35|63->35|63->35|68->40|68->40|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|77->49|77->49|77->49|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|84->56|89->61|89->61|89->61|92->64|93->65
                    -- GENERATED --
                */
            