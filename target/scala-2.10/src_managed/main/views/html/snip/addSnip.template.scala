
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
object addSnip extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.lang.Boolean,models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, user: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""

        <div class="row">
            <h1>Add Snip</h1>
        </div>
        <div class="row">
            <div class="input-group">
                <span class="input-group-addon">Paste URL:</span>
                    <input id="url-input" type="text" class="form-control" placeholder="www.youtube.com/watch?v=XXXXXXXXXXX">
                <span class="input-group-btn">
                    <button id="url-input-btn" class="btn btn-primary" type="button">Go!</button>
                </span>
            </div>
        </div>
        <section class="row embeded-video">

            <div class="player-container">

                <video id="player" width="640" height="360" controls="control" preload="none" class="mejs-sniplist">
                    <source src="https://www.youtube.com/watch?v=BB7R0ZY9w94" type="video/youtube" />
                </video>
            </div>
                <div id="slider" class="slider-bar"></div>
                <button id="play-snip-button" type="button" class="btn btn-primary btn-large bottom-buffer-sm center-block">Play Snip</button>
        </section>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <img width="126" height="126" id="snip-thumbnail" src=""/>
            </div>
            <div class="col-md-3"></div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="input-group col-md-6">
                <span class="input-group-addon">Title</span>
                <input id="title-input" type="text" class="form-control" placeholder="Ex. Your English is Good">
            </div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="input-group col-md-6">
                <span class="input-group-addon">Artist</span>
                <input id="artist-input" type="text" class="form-control" placeholder="Ex. Tokyo Police Club">
            </div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="input-group col-md-6">
                <span class="input-group-addon">Album</span>
                <input id="album-input" type="text" class="form-control" placeholder="Ex. Elephant Shell">
            </div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="centered col-md-6 top-buffer-sm">
                <button id="save_snip_btn" type="button" class="btn btn-primary">Save Snip</button>
                <form id="hidden-add-snip-form" action=""""),_display_(Seq[Any](/*60.58*/routes/*60.64*/.SnipController.createSnip())),format.raw/*60.92*/("""" enctype="multipart/form-data">
                    <div class="hidden">
                        <input name="snip_title" type="text" value="">
                        <input name="snip_video_id" type="text" value="">
                        <input name="snip_artist" type="text" value="">
                        <input name="snip_album" type="text" value="">
                        <input name="time_min" type="text" value="">
                        <input name="time_max" type="text" value="">
                    </div>

                </form>

            </div>
            <div class="col-md-3"></div>
        </div>

""")))};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*76.2*/("""

"""),_display_(Seq[Any](/*78.2*/if(!js)/*78.9*/ {_display_(Seq[Any](format.raw/*78.11*/("""
    """),_display_(Seq[Any](/*79.6*/main("Add Snip", "addSnip")/*79.33*/(content))),format.raw/*79.42*/("""
""")))}/*80.3*/else/*80.8*/{_display_(Seq[Any](format.raw/*80.9*/("""
    """),_display_(Seq[Any](/*81.6*/content)),format.raw/*81.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,user:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,user)
    
    def f:((java.lang.Boolean,models.User) => play.api.templates.HtmlFormat.Appendable) = (js,user) => apply(js,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:55:01 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/addSnip.scala.html
                    HASH: d31c64661595ee0a425db053bfcd9cbf8f880459
                    MATRIX: 804->1|930->53|944->60|1028->64|3662->2662|3677->2668|3727->2696|4396->50|4425->3326|4463->3329|4478->3336|4518->3338|4559->3344|4595->3371|4626->3380|4646->3383|4658->3388|4696->3389|4737->3395|4766->3402
                    LINES: 26->1|28->3|28->3|30->3|87->60|87->60|87->60|104->1|106->76|108->78|108->78|108->78|109->79|109->79|109->79|110->80|110->80|110->80|111->81|111->81
                    -- GENERATED --
                */
            