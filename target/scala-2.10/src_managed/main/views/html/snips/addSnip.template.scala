
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
object addSnip extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.28*/("""

"""),_display_(Seq[Any](/*3.2*/main("Add Snip", "addSnip")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
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
            <div class="col-md-2"></div>
            <div class="col-md-8 center-block centered">

                <video id="player1" width="640" height="360" controls="control" preload="none">
                    <source src="http://www.youtube.com/" type="video/youtube" />
                </video>

                <div id="slider" class="slider-bar"></div>
            </div>

            <div class="col-md-2"></div>
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
""")))})))}
    }
    
    def render(user:models.User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 25 02:26:24 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/snips/addSnip.scala.html
                    HASH: e696d31a017f65cfab92787170b7a58e2a835f87
                    MATRIX: 787->1|907->27|944->30|979->57|1018->59
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            