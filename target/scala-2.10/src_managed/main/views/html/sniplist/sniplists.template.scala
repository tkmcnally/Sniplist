
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

        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>SnipLists</h1>
            </div>
        </div>
        """),_display_(Seq[Any](/*14.10*/if(localUser.id == userSniplists.user.id)/*14.51*/ {_display_(Seq[Any](format.raw/*14.53*/("""
            <div class="row">
                <div class="col-md-12" style="padding-bottom : 10px ;">
                    <button id="new-playlist" type="button" class="btn btn-primary" data-toggle="popover" data-placement="right">
                        New Playlist
                    </button>
                </div>
            </div>
        """)))})),format.raw/*22.10*/("""
        """),_display_(Seq[Any](/*23.10*/views/*23.15*/.html.sniplist.arraySniplists(true, localUser, mySnips, mySniplists, userSniplists))),format.raw/*23.98*/("""
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

""")))};
Seq[Any](format.raw/*1.170*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*45.2*/("""

"""),_display_(Seq[Any](/*47.2*/if(!js)/*47.9*/ {_display_(Seq[Any](format.raw/*47.11*/("""
    """),_display_(Seq[Any](/*48.6*/main("My SnipLists", "mySnipLists")/*48.41*/(content))),format.raw/*48.50*/("""
""")))}/*49.3*/else/*49.8*/{_display_(Seq[Any](format.raw/*49.9*/("""
    """),_display_(Seq[Any](/*50.6*/content)),format.raw/*50.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,mySnips:models.SnipCollection,mySniplists:models.SniplistCollection,userSniplists:models.SniplistCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection,models.SniplistCollection,models.SniplistCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,mySnips,mySniplists,userSniplists) => apply(js,localUser,mySnips,mySniplists,userSniplists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:56:24 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/sniplist/sniplists.scala.html
                    HASH: 267b089a04ab731d75304624c57c2c2107d9d30c
                    MATRIX: 884->1|1167->211|1181->218|1265->222|1527->448|1577->489|1617->491|2000->842|2046->852|2060->857|2165->940|3152->169|3179->209|3207->1887|3245->1890|3260->1897|3300->1899|3341->1905|3385->1940|3416->1949|3436->1952|3448->1957|3486->1958|3527->1964|3556->1971
                    LINES: 26->1|29->4|29->4|31->4|41->14|41->14|41->14|49->22|50->23|50->23|50->23|73->1|74->3|75->45|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50
                    -- GENERATED --
                */
            