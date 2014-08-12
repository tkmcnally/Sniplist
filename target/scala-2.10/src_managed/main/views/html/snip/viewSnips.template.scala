
package views.html.snip

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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.SnipCollection,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, userSnips: models.SnipCollection):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""

        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1> <h4 style="display : inline ;">by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*7.97*/routes/*7.103*/.Application.getUserProfile(userSnips.user.id.toString))),format.raw/*7.158*/("""">"""),_display_(Seq[Any](/*7.161*/userSnips/*7.170*/.user.name)),format.raw/*7.180*/("""</a></h4>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
                """),_display_(Seq[Any](/*13.18*/views/*13.23*/.html.snip.arraySnips(true, localUser, userSnips))),format.raw/*13.72*/("""
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="add-to-playlist-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    <h4 class="modal-title" id="add-to-playlist-modal-title">Add to playlist</h4>
                </div>
                <div class="modal-body">
                    <div id="modal-message" class="alert alert-danger hidden">

                    </div>
                    <div id="modal-content">

                    </div>
                </div>
                <input id="selected-snip-id" type="text" hidden value=""/>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>
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

""")))};
Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*64.2*/("""


 """),_display_(Seq[Any](/*67.3*/if(!js)/*67.10*/ {_display_(Seq[Any](format.raw/*67.12*/("""
    """),_display_(Seq[Any](/*68.6*/main("My Snips", "mySnips")/*68.33*/(content))),format.raw/*68.42*/("""
""")))}/*69.3*/else/*69.8*/{_display_(Seq[Any](format.raw/*69.9*/("""
    """),_display_(Seq[Any](/*70.6*/content)),format.raw/*70.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.SnipCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:56:45 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/viewSnips.scala.html
                    HASH: 9c176afa8d10b935e257e1d8c0873bc24e5ff3b6
                    MATRIX: 828->1|993->92|1007->99|1091->103|1286->263|1301->269|1378->324|1417->327|1435->336|1467->346|1626->469|1640->474|1711->523|3887->89|3916->2660|3956->2665|3972->2672|4012->2674|4053->2680|4089->2707|4120->2716|4140->2719|4152->2724|4190->2725|4231->2731|4260->2738
                    LINES: 26->1|28->3|28->3|30->3|34->7|34->7|34->7|34->7|34->7|34->7|40->13|40->13|40->13|92->1|94->64|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70
                    -- GENERATED --
                */
            