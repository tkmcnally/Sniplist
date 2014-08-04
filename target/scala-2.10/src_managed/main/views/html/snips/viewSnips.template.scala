
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
object viewSnips extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,models.MySnips,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, userSnips: models.MySnips):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mtb">
        <div id="global-message" class="alert alert-danger hidden">

        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>Snips</h1> <h4 style="display : inline ;">by <a class="dynamic-link" href=""""),_display_(Seq[Any](/*10.97*/routes/*10.103*/.Application.getUserProfile(userSnips.user.id.toString))),format.raw/*10.158*/("""">"""),_display_(Seq[Any](/*10.161*/userSnips/*10.170*/.user.name)),format.raw/*10.180*/("""</a></h4>
            </div>
        </div>
        <div class="row">

            <div class="col-md-8">
                """),_display_(Seq[Any](/*16.18*/views/*16.23*/.html.snips.arraySnips(true, localUser, userSnips))),format.raw/*16.73*/("""
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
    </div>
""")))};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*67.2*/("""


 """),_display_(Seq[Any](/*70.3*/if(!js)/*70.10*/ {_display_(Seq[Any](format.raw/*70.12*/("""
    """),_display_(Seq[Any](/*71.6*/main("My Snips", "mySnips")/*71.33*/(content))),format.raw/*71.42*/("""
""")))}/*72.3*/else/*72.8*/{_display_(Seq[Any](format.raw/*72.9*/("""
    """),_display_(Seq[Any](/*73.6*/content)),format.raw/*73.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,userSnips:models.MySnips): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,userSnips)
    
    def f:((java.lang.Boolean,models.User,models.MySnips) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,userSnips) => apply(js,localUser,userSnips)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 19:10:38 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/viewSnips.scala.html
                    HASH: 0f121d730700b727703084d577e64be59ea9c644
                    MATRIX: 822->1|980->85|994->92|1078->96|1389->371|1405->377|1483->432|1523->435|1542->444|1575->454|1734->577|1748->582|1820->632|4006->82|4035->2779|4075->2784|4091->2791|4131->2793|4172->2799|4208->2826|4239->2835|4259->2838|4271->2843|4309->2844|4350->2850|4379->2857
                    LINES: 26->1|28->3|28->3|30->3|37->10|37->10|37->10|37->10|37->10|37->10|43->16|43->16|43->16|95->1|97->67|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|103->73|103->73
                    -- GENERATED --
                */
            