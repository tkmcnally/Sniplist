
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
object landingPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/mainTwo("Sniplist", "home")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <!-- Header -->
    <div class="intro-header">

        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-message">
                        <h1 class="text-left"><b>A Better Way to Share Music.</b></h1>
                        <h4 class="text-left">Save clips of your favourite songs to share with friends.</h4>
                        <h4 class="text-left">Easy, Quick, and Free.</h4>
                        <ul class="list-inline text-right">
                            <li>
                                <a href=""""),_display_(Seq[Any](/*17.43*/routes/*17.49*/.Application.signup())),format.raw/*17.70*/("""" class="btn btn-default btn-lg bg-clr-red">Get Started</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
            <!-- /.container -->

    </div>

    <div class="content-section-a">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-5">
                    <img class="img-responsive" src=""""),_display_(Seq[Any](/*35.55*/routes/*35.61*/.Assets.at("img/landingPage/stock-workdesk.jpg"))),format.raw/*35.109*/(""""  alt="">
                </div>
                <div class="col-lg-5 col-sm-5">

                    <h2 class="section-heading">Share on youtube</h2>
                    <p class="lead">Integration with YouTube makes it easy to save song snippets. It's like a favourites list for all the music you've heard on YouTube. </p>
                </div>
                <div class="col-lg-2 col-sm-2">
                    <a href=""""),_display_(Seq[Any](/*43.31*/routes/*43.37*/.Application.about())),format.raw/*43.57*/("""" class="btn btn-default btn-lg bottom">Learn More &nbsp <i class="fa fa-long-arrow-right fa-fw clr-red"></i></a>
                </div>

            </div>

        </div>
            <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

    <div class="content-section-b">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-6">

                    <h2 class="section-heading">Save Short Clips</h2>
                    <p class="lead">Save 20 seconds snippets of your favourite songs so you can do more sharing with your friends without overwhelming them with your entire library.</p>
                </div>
                <div class="col-lg-5 col-sm-6">
                    <img class="img-responsive" src="http://lorempixel.com/g/400/200/technics" alt="">
                </div>
            </div>

        </div>
            <!-- /.container -->

    </div>
    <!-- /.content-section-b -->

    <div class="content-section-c">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <img class="img-responsive" src="http://lorempixel.com/g/450/260/technics" alt="">
                </div>
                <div class="col-lg-5 col-sm-6">

                    <h2 class="section-heading">Make Snippet Playlists</h2>
                    <p class="lead">Combine 5 of your snippets to create a playlist of your favourite snips so you can share more of your music at once.</p>
                </div>

            </div>


        </div>
            <!-- /.container -->

    </div>
    <!-- /.content-section-a -->
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 12 22:57:45 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/landingPage.scala.html
                    HASH: 6e690d996cf0637379a1a821b210b8105e306a3e
                    MATRIX: 905->45|941->47|976->74|1015->76|1660->685|1675->691|1718->712|2211->1169|2226->1175|2297->1223|2761->1651|2776->1657|2818->1677
                    LINES: 30->2|31->3|31->3|31->3|45->17|45->17|45->17|63->35|63->35|63->35|71->43|71->43|71->43
                    -- GENERATED --
                */
            