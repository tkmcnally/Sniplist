
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
            </div>
            <div class="col-md-3"></div>
        </div>
        <form id="hidden-add-snip-form" class="hidden" enctype="multipart/form-data">
            <input name="snip_title" type="text" value="">
            <input name="snip_video_id" type="text" value="">
            <input name="snip_artist" type="text" value="">
            <input name="snip_album" type="text" value="">
            <input name="time_min" type="text" value="">
            <input name="time_max" type="text" value="">
        </form>
""")))};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*71.2*/("""

"""),_display_(Seq[Any](/*73.2*/if(!js)/*73.9*/ {_display_(Seq[Any](format.raw/*73.11*/("""
    """),_display_(Seq[Any](/*74.6*/main("Add Snip", "addSnip")/*74.33*/(content))),format.raw/*74.42*/("""
""")))}/*75.3*/else/*75.8*/{_display_(Seq[Any](format.raw/*75.9*/("""
    """),_display_(Seq[Any](/*76.6*/content)),format.raw/*76.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,user:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,user)
    
    def f:((java.lang.Boolean,models.User) => play.api.templates.HtmlFormat.Appendable) = (js,user) => apply(js,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:41:46 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/addSnip.scala.html
                    HASH: e0f8d733b21cacafc081bbfded31c22b86d2623c
                    MATRIX: 804->1|930->53|944->60|1028->64|4140->50|4169->3137|4207->3140|4222->3147|4262->3149|4303->3155|4339->3182|4370->3191|4390->3194|4402->3199|4440->3200|4481->3206|4510->3213
                    LINES: 26->1|28->3|28->3|30->3|99->1|101->71|103->73|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|106->76|106->76
                    -- GENERATED --
                */
            