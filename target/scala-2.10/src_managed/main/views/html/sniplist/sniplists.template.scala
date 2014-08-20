
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
object sniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, mySnips: models.SnipCollection, mySniplists: models.SniplistCollection, userSniplists: models.SniplistCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

def /*4.2*/content/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
        <div class="row">
            <div class="col-md-12">
                <h1>SnipLists</h1>
            </div>
        </div>
        """),_display_(Seq[Any](/*10.10*/if(localUser.id == userSniplists.user.id)/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
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

""")))};
Seq[Any](format.raw/*1.170*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*41.2*/("""

"""),_display_(Seq[Any](/*43.2*/if(!js)/*43.9*/ {_display_(Seq[Any](format.raw/*43.11*/("""
    """),_display_(Seq[Any](/*44.6*/main("My SnipLists", "mySnipLists")/*44.41*/(content))),format.raw/*44.50*/("""
""")))}/*45.3*/else/*45.8*/{_display_(Seq[Any](format.raw/*45.9*/("""
    """),_display_(Seq[Any](/*46.6*/content)),format.raw/*46.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userSniplists) => apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 18 13:38:26 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/sniplists.scala.html
                    HASH: e35eaf53cb711191e85d2e8c0e8f0cb5d9041d59
                    MATRIX: 884->1|1167->211|1181->218|1265->222|1442->363|1492->404|1532->406|1915->757|1961->767|1975->772|2080->855|3057->169|3084->209|3112->1792|3150->1795|3165->1802|3205->1804|3246->1810|3290->1845|3321->1854|3341->1857|3353->1862|3391->1863|3432->1869|3461->1876
                    LINES: 26->1|29->4|29->4|31->4|37->10|37->10|37->10|45->18|46->19|46->19|46->19|69->1|70->3|71->41|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46
                    -- GENERATED --
                */
            