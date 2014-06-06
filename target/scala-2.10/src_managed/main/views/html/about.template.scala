
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
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("About Us", "about")/*1.27*/ {_display_(Seq[Any](format.raw/*1.29*/("""

        <!-- *****************************************************************************************************************
 BLUE WRAP
 ***************************************************************************************************************** -->
    <div id="blue">
        <div class="container">
            <div class="row">
                <h3>About.</h3>
            </div><!-- /row -->
        </div> <!-- /container -->
    </div><!-- /blue -->


    <!-- *****************************************************************************************************************
 AGENCY ABOUT
 ***************************************************************************************************************** -->

    <div class="container mtb">
        <div class="row">
            <div class="col-lg-6">
                <img class="img-responsive" src="assets/img/agency.jpg" alt="">
            </div>

            <div class="col-lg-6">
                <h4>More About Our Agency.</h4>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. </p>
                <p>It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                <p>Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.</p>
                <p><br/><a href="contact.html" class="btn btn-theme">Contact Us</a></p>
            </div>
        </div><! --/row -->
    </div><! --/container -->

    <!-- *****************************************************************************************************************
 TEEAM MEMBERS
 ***************************************************************************************************************** -->

    <div class="container mtb">
        <div class="row centered">
            <h3 class="mb">MEET OUR TEAM</h3>
            <div class="col-lg-3 col-md-3 col-sm-3"></div>
            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="he-wrap tpl6">
                    <img src=""""),_display_(Seq[Any](/*45.32*/routes/*45.38*/.Assets.at("img/team/thomas.jpg"))),format.raw/*45.71*/("""" alt="">
                    <div class="he-view">
                        <div class="bg a0" data-animate="fadeIn">
                            <h3 class="a1" data-animate="fadeInDown">Contact Me:</h3>
                            <a href="#" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-envelope"></i></a>
                            <a href="#" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-twitter"></i></a>
                        </div><!-- he bg -->
                    </div><!-- he view -->
                </div><!-- he wrap -->
                <h4>Thomas McNally</h4>
                <h5 class="ctitle">Co-Founder / Developer</h5>
                <p>Is watching you through your webcam.</p>
                <div class="hline"></div>
            </div><! --/col-lg-3 -->


            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="he-wrap tpl6">
                    <img src=""""),_display_(Seq[Any](/*63.32*/routes/*63.38*/.Assets.at("img/team/mathew.jpg"))),format.raw/*63.71*/("""" alt="">
                    <div class="he-view">
                        <div class="bg a0" data-animate="fadeIn">
                            <h3 class="a1" data-animate="fadeInDown">Contact Me:</h3>
                            <a href="#" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-envelope"></i></a>
                            <a href="#" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-twitter"></i></a>
                        </div><!-- he bg -->
                    </div><!-- he view -->
                </div><!-- he wrap -->
                <h4>Mathew Kaminski</h4>
                <h5 class="ctitle">Co-Founder / Business</h5>
                <p>Earned his first million at age 9.</p>
                <div class="hline"></div>
            </div><! --/col-lg-3 -->
            <div class="col-lg-3 col-md-3 col-sm-3"></div>
        </div><! --/row -->
    </div><! --/container -->
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 06 01:56:56 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/about.scala.html
                    HASH: ec2f3ab9efd522db3450a1a5c768c15ed0b79ff2
                    MATRIX: 864->1|897->26|936->28|3649->2705|3664->2711|3719->2744|4712->3701|4727->3707|4782->3740
                    LINES: 29->1|29->1|29->1|73->45|73->45|73->45|91->63|91->63|91->63
                    -- GENERATED --
                */
            