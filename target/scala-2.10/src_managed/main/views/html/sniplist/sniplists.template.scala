
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
object sniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[java.lang.Boolean,java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, owned: java.lang.Boolean, localUser: models.User = null, mySnips: models.SnipCollection, mySniplists: models.SniplistCollection, userSniplists: models.SniplistCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

def /*4.2*/content/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
        <div class="row">
            <div class="col-md-12">
                <h1>SnipLists</h1>
            </div>
        </div>
        """),_display_(Seq[Any](/*10.10*/if(owned)/*10.19*/ {_display_(Seq[Any](format.raw/*10.21*/("""
            <div class="row">
                <div class="col-md-12" style="padding-bottom : 10px ;">
                    <button id="new-playlist" type="button" class="btn btn-primary" data-toggle="popover" data-placement="right">
                        New Playlist
                    </button>
                </div>
            </div>
        """)))})),format.raw/*18.10*/("""
        """),_display_(Seq[Any](/*19.10*/views/*19.15*/.html.sniplist.arraySniplists(true, localUser, mySnips, mySniplists, userSniplists))),format.raw/*19.98*/("""


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

""")))};
Seq[Any](format.raw/*1.196*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*42.2*/("""

"""),_display_(Seq[Any](/*44.2*/if(!js)/*44.9*/ {_display_(Seq[Any](format.raw/*44.11*/("""
    """),_display_(Seq[Any](/*45.6*/main("My SnipLists", "mySnipLists")/*45.41*/(content))),format.raw/*45.50*/("""
""")))}/*46.3*/else/*46.8*/{_display_(Seq[Any](format.raw/*46.9*/("""
    """),_display_(Seq[Any](/*47.6*/content)),format.raw/*47.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,owned:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,owned,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,owned,localUser,mySnips,mySniplists,userSniplists) => apply(js,owned,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 20 17:28:17 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/sniplists.scala.html
                    HASH: fb2a9680324c67c6193d6066e35f9a845e946279
                    MATRIX: 902->1|1211->237|1225->244|1309->248|1486->389|1504->398|1544->400|1927->751|1973->761|1987->766|2092->849|3080->195|3107->235|3135->1797|3173->1800|3188->1807|3228->1809|3269->1815|3313->1850|3344->1859|3364->1862|3376->1867|3414->1868|3455->1874|3484->1881
                    LINES: 26->1|29->4|29->4|31->4|37->10|37->10|37->10|45->18|46->19|46->19|46->19|70->1|71->3|72->42|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47
                    -- GENERATED --
                */
            