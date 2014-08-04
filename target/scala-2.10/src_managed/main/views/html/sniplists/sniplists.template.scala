
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
object sniplists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[java.lang.Boolean,models.User,models.MySnips,models.MySniplists,models.MySniplists,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, mySnips: models.MySnips, mySniplists: models.MySniplists, userSniplists: models.MySniplists):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;

def /*4.2*/content/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    <div class="container mtb">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>SnipLists</h1>
            </div>
        </div>
        """),_display_(Seq[Any](/*14.10*/if(localUser.id.eq(userSniplists.id))/*14.47*/ {_display_(Seq[Any](format.raw/*14.49*/("""
            <div class="row">
                <div class="col-md-12" style="padding-bottom : 10px ;">
                    <button id="new-playlist" type="button" class="btn btn-primary" data-toggle="popover" data-placement="right">
                        New Playlist
                    </button>
                </div>
            </div>
        """)))})),format.raw/*22.10*/("""
        """),_display_(Seq[Any](/*23.10*/views/*23.15*/.html.sniplists.arraySniplists(true, localUser, mySnips, mySniplists, userSniplists))),format.raw/*23.99*/("""
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
""")))};
Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*45.2*/("""

"""),_display_(Seq[Any](/*47.2*/if(!js)/*47.9*/ {_display_(Seq[Any](format.raw/*47.11*/("""
    """),_display_(Seq[Any](/*48.6*/main("My SnipLists", "mySnipLists")/*48.41*/(content))),format.raw/*48.50*/("""
""")))}/*49.3*/else/*49.8*/{_display_(Seq[Any](format.raw/*49.9*/("""
    """),_display_(Seq[Any](/*50.6*/content)),format.raw/*50.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.MySnips,mySniplists:models.MySniplists,userSniplists:models.MySniplists): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.MySnips,models.MySniplists,models.MySniplists) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userSniplists) => apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 17:35:19 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplists/sniplists.scala.html
                    HASH: 4b79af5dadb72277bb1cd97c7ca35ef103c8c8bd
                    MATRIX: 864->1|1126->190|1140->197|1224->201|1517->458|1563->495|1603->497|1986->848|2032->858|2046->863|2152->947|3149->148|3176->188|3204->1904|3242->1907|3257->1914|3297->1916|3338->1922|3382->1957|3413->1966|3433->1969|3445->1974|3483->1975|3524->1981|3553->1988
                    LINES: 26->1|29->4|29->4|31->4|41->14|41->14|41->14|49->22|50->23|50->23|50->23|73->1|74->3|75->45|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50
                    -- GENERATED --
                */
            