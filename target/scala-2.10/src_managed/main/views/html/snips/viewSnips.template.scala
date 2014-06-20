
package views.html.snips

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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,List[models.Snip],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, snipList: List[models.Snip]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(Seq[Any](/*3.2*/main("My Snips", "mySnips")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <div class="container mtb">
        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
                <table class="table table-dark table-bordered table-stripeds" style="border: black;">
                <thead>
                        <tr>
                            <th title="Song" align="right">Song</th>
                            <th title="Artist" align="right">Artist</th>
                            <th class=""""),format.raw/*18.40*/("""{"""),format.raw/*18.41*/("""sorter: false"""),format.raw/*18.54*/("""}"""),format.raw/*18.55*/("""" title="Sniplists" align="right">Sniplists</th>
                            <th class=""""),format.raw/*19.40*/("""{"""),format.raw/*19.41*/("""sorter: false"""),format.raw/*19.54*/("""}"""),format.raw/*19.55*/("""" title="*" align="center">*</th>
                            <th class=""""),format.raw/*20.40*/("""{"""),format.raw/*20.41*/("""sorter: false"""),format.raw/*20.54*/("""}"""),format.raw/*20.55*/("""" title="Play" align="right">Play</th>
                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(Seq[Any](/*24.26*/for(snip <- snipList) yield /*24.47*/ {_display_(Seq[Any](format.raw/*24.49*/("""
                            <tr class="evenrow">
                                <td align="center" class="right">"""),_display_(Seq[Any](/*26.67*/snip/*26.71*/.song_name)),format.raw/*26.81*/("""</td>
                                <td align="right" class="right">"""),_display_(Seq[Any](/*27.66*/snip/*27.70*/.artist_name)),format.raw/*27.82*/("""</td>
                                <td align="right" class="right">-></td>
                                <td align="right" class="right">
                                    <div class="dropdown">
                                        <a class="btn btn-sm dropdown-toggle" data-toggle="dropdown" href="#">+
                                        </a>

                                        <ul class="dropdown-menu">
                                            <li><a align="left" href="">Add to Playlist -></a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Save as Snip</a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Share on Sniplist</a></li>
                                            <li><a align="left" href=""><i class="icon-off"></i>Share on -></a></li>
                                        </ul>
                                    </div>



                                </td>
                                <td align="right" class="right"><a href="http://www.youtube.com/watch?v="""),_display_(Seq[Any](/*45.106*/snip/*45.110*/.url)),format.raw/*45.114*/("""">Play!</a></td>
                            </tr>
                        """)))})),format.raw/*47.26*/("""
                    </tbody>


                </table>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>



""")))})))}
    }
    
    def render(localUser:models.User,snipList:List[models.Snip]): play.api.templates.HtmlFormat.Appendable = apply(localUser,snipList)
    
    def f:((models.User,List[models.Snip]) => play.api.templates.HtmlFormat.Appendable) = (localUser,snipList) => apply(localUser,snipList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 20 00:47:41 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: 0e151494b518303117ae514d839498e71134e538
                    MATRIX: 807->1|961->61|998->64|1033->91|1072->93|1658->651|1687->652|1728->665|1757->666|1873->754|1902->755|1943->768|1972->769|2073->842|2102->843|2143->856|2172->857|2359->1008|2396->1029|2436->1031|2588->1147|2601->1151|2633->1161|2740->1232|2753->1236|2787->1248|3944->2368|3958->2372|3985->2376|4093->2452
                    LINES: 26->1|29->1|31->3|31->3|31->3|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|73->45|73->45|73->45|75->47
                    -- GENERATED --
                */
            