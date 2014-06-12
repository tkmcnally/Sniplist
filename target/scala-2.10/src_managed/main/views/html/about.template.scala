
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
                <img class="img-responsive" src="http://placehold.it/800x600" alt="">
            </div>

            <div class="col-lg-6">
                <h4>Who we are.</h4>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.
                Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis,
                ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel,
                aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam
                dictum felis eu pede mollis pretium.</p>

                <p>Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi.
                Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim.
                Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius
                laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper
                ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam
                semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit
                id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus.</p>
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
                    <img src=""""),_display_(Seq[Any](/*54.32*/routes/*54.38*/.Assets.at("img/team/thomas.jpg"))),format.raw/*54.71*/("""" alt="">
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
                    <img src=""""),_display_(Seq[Any](/*72.32*/routes/*72.38*/.Assets.at("img/team/mathew.jpg"))),format.raw/*72.71*/("""" alt="">
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
                    DATE: Thu Jun 12 15:13:51 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/about.scala.html
                    HASH: b93605626b7e2203fd2f24ceb3c34624cfd9b5a6
                    MATRIX: 864->1|897->26|936->28|4020->3076|4035->3082|4090->3115|5083->4072|5098->4078|5153->4111
                    LINES: 29->1|29->1|29->1|82->54|82->54|82->54|100->72|100->72|100->72
                    -- GENERATED --
                */
            