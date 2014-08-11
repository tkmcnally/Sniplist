
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




    </div>
""")))};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*81.2*/("""

"""),_display_(Seq[Any](/*83.2*/if(!js)/*83.9*/ {_display_(Seq[Any](format.raw/*83.11*/("""
    """),_display_(Seq[Any](/*84.6*/main("Add Snip", "addSnip")/*84.33*/(content))),format.raw/*84.42*/("""
""")))}/*85.3*/else/*85.8*/{_display_(Seq[Any](format.raw/*85.9*/("""
    """),_display_(Seq[Any](/*86.6*/content)),format.raw/*86.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,user:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,user)
    
    def f:((java.lang.Boolean,models.User) => play.api.templates.HtmlFormat.Appendable) = (js,user) => apply(js,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 10 23:33:51 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snip/addSnip.scala.html
                    HASH: ab7fee54a1b7454afad0962453d28aab23239306
                    MATRIX: 804->1|930->53|944->60|1028->64|4268->50|4297->3265|4335->3268|4350->3275|4390->3277|4431->3283|4467->3310|4498->3319|4518->3322|4530->3327|4568->3328|4609->3334|4638->3341
                    LINES: 26->1|28->3|28->3|30->3|109->1|111->81|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|116->86|116->86
                    -- GENERATED --
                */
            