
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
object addSnip extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.lang.Boolean,models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, user: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""

    <div class="container mtb">
        <div class="row">
            <div id="global-message" class="alert alert-danger hidden"></div>
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




    </div>
""")))};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*74.2*/("""

"""),_display_(Seq[Any](/*76.2*/if(!js)/*76.9*/ {_display_(Seq[Any](format.raw/*76.11*/("""
    """),_display_(Seq[Any](/*77.6*/main("Add Snip", "addSnip")/*77.33*/(content))),format.raw/*77.42*/("""
""")))}/*78.3*/else/*78.8*/{_display_(Seq[Any](format.raw/*78.9*/("""
    """),_display_(Seq[Any](/*79.6*/content)),format.raw/*79.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,user:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,user)
    
    def f:((java.lang.Boolean,models.User) => play.api.templates.HtmlFormat.Appendable) = (js,user) => apply(js,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 03 16:01:01 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/addSnip.scala.html
                    HASH: 03eb3b03c55d6218a9790962628d834727c8c869
                    MATRIX: 805->1|931->53|945->60|1029->64|4017->50|4046->3013|4084->3016|4099->3023|4139->3025|4180->3031|4216->3058|4247->3067|4267->3070|4279->3075|4317->3076|4358->3082|4387->3089
                    LINES: 26->1|28->3|28->3|30->3|102->1|104->74|106->76|106->76|106->76|107->77|107->77|107->77|108->78|108->78|108->78|109->79|109->79
                    -- GENERATED --
                */
            