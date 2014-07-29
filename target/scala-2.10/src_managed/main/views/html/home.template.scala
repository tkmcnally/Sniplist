
package views.html

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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Sniplist", "home")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

    <!-- *****************************************************************************************************************
     HEADERWRAP
     ***************************************************************************************************************** -->
    <div id="headerwrap">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">

                    <h1>A Better Way To Share Music. </h1>
                    <h3>Save Clips of Your Favorite Songs to Share <br> with Friends and on Social Media.</h3>
                    <h3><b>Easily, Quickly, and for Free.</b></h3>
                </div>
                <div class="col-lg-8 col-lg-offset-2 himg">
                    <!--<img src="assets/img/browser.png" class="img-responsive">-->
                    <img src="http://placehold.it/800x600" class="img-responsive">
                </div>
            </div><!-- /row -->
        </div> <!-- /container -->
    </div><!-- /headerwrap -->

    <!--
    TESTING
    -->
    <div id="service">
        <div class="container">
            <div class="row centered">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="col-md-4">
                        <img src=""""),_display_(Seq[Any](/*34.36*/routes/*34.42*/.Assets.at("img/youtube-logo.png"))),format.raw/*34.76*/(""""  class="img-youtube img-responsive">
                    </div>
                    <div class="col-md-8">
                        <h4>Share on youtube!</h4>
                        <p>Integration with YouTube makes it easy to save song snippets. It's like a favourite list for all the music you've heard on YouTube!</p>
                    </div>
                </div>
                <div class="col-md-2"> </div>
            </div>
        </div>
    </div>

    <div id="service">
        <div class="container">
            <div class="row centered">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="col-md-8">
                        <h4>Save short clips!</h4>
                        <p>Save 20 second snippets of your favorite songs so you can do more sharing with your friends without overwhelming them with your entire library.</p>
                    </div>
                    <div class="col-md-4">
                        <img src=""""),_display_(Seq[Any](/*56.36*/routes/*56.42*/.Assets.at("img/share-red.png"))),format.raw/*56.73*/(""""  class="img-share img-responsive">
                    </div>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>
    </div>

    <div id="service">
        <div class="container">
            <div class="row centered">
            <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="col-md-4">
                        <img src="http://placehold.it/192x192"  class="img-playlist img-responsive">
                    </div>
                    <div class="col-md-8">
                        <h4>Make snippet playlists!</h4>
                        <p>Combine 5 your snippets to create a playlist of your favourite snips so you can shre more of your music at once. </p>
                    </div>
                </div>
                <div class="col-md-2"></div>
            </div>
        </div>
    </div>

    <!-- *****************************************************************************************************************
    MIDDLE CONTENT
    ***************************************************************************************************************** -->


    <div id="service">
        <div class="container">

            <div class="row centered">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
                    <h3>Create an account now!</h3>
                    <a class="btn btn-primary btn-xl btn-block center-block" href=""""),_display_(Seq[Any](/*94.85*/routes/*94.91*/.Application.signup())),format.raw/*94.112*/("""">Sign Up!</a>
                </div>
                <div class="col-lg-3"></div>
            </div>
        </div>
    </div><! --/container -->

    <div id="service">
        <div class="container">
            <div class="row centered"></div>
        </div>
    </div>


""")))})),format.raw/*108.2*/("""

"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 17:05:20 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: 70665cd555427a1d1ef57dc593ef32f2b07d466e
                    MATRIX: 899->46|936->49|968->73|1007->75|2377->1409|2392->1415|2448->1449|3523->2488|3538->2494|3591->2525|5155->4053|5170->4059|5214->4080|5537->4371
                    LINES: 30->2|31->3|31->3|31->3|62->34|62->34|62->34|84->56|84->56|84->56|122->94|122->94|122->94|136->108
                    -- GENERATED --
                */
            