
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
def /*3.6*/content/*3.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""

        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1> <h4 style="display : inline ;">by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*7.97*/routes/*7.103*/.Application.getUserProfile(userSnips.user.id.toString))),format.raw/*7.158*/("""">"""),_display_(Seq[Any](/*7.161*/userSnips/*7.170*/.user.name)),format.raw/*7.180*/("""</a></h4>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
            """),_display_(Seq[Any](/*13.14*/views/*13.19*/.html.snip.arraySnips(true, localUser, userSnips))),format.raw/*13.68*/("""
            </div>
            <div class="col-md-4"></div>
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
        </div>

    """)))};
Seq[Any](format.raw/*1.90*/("""

    """),format.raw/*65.6*/("""


"""),_display_(Seq[Any](/*68.2*/if(!js)/*68.9*/ {_display_(Seq[Any](format.raw/*68.11*/("""
    """),_display_(Seq[Any](/*69.6*/main("My Snips", "mySnips")/*69.33*/(content))),format.raw/*69.42*/("""
""")))}/*70.3*/else/*70.8*/{_display_(Seq[Any](format.raw/*70.9*/("""
    """),_display_(Seq[Any](/*71.6*/content)),format.raw/*71.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.SnipCollection): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.SnipCollection) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 18 20:44:16 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/viewSnips.scala.html
                    HASH: 546aeda6e1ae6e9370e077a2c4008631e56cd448
                    MATRIX: 828->1|993->96|1008->103|1092->107|1287->267|1302->273|1379->328|1418->331|1436->340|1468->350|1623->469|1637->474|1708->523|4049->89|4082->2825|4121->2829|4136->2836|4176->2838|4217->2844|4253->2871|4284->2880|4304->2883|4316->2888|4354->2889|4395->2895|4424->2902
                    LINES: 26->1|28->3|28->3|30->3|34->7|34->7|34->7|34->7|34->7|34->7|40->13|40->13|40->13|93->1|95->65|98->68|98->68|98->68|99->69|99->69|99->69|100->70|100->70|100->70|101->71|101->71
                    -- GENERATED --
                */
            