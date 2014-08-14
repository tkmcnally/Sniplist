
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
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[java.lang.Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
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


        <div class="row centered">
            <h3 class="mb">MEET OUR TEAM</h3>
            <div class="col-lg-3 col-md-3 col-sm-3"></div>
            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="he-wrap tpl6">
                    <img src=""""),_display_(Seq[Any](/*55.32*/routes/*55.38*/.Assets.at("img/team/thomas.jpg"))),format.raw/*55.71*/("""" alt="">
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
                    <img src=""""),_display_(Seq[Any](/*73.32*/routes/*73.38*/.Assets.at("img/team/mathew.jpg"))),format.raw/*73.71*/("""" alt="">
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

""")))};
Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*90.2*/("""

"""),_display_(Seq[Any](/*92.2*/if(!js)/*92.9*/ {_display_(Seq[Any](format.raw/*92.11*/("""
    """),_display_(Seq[Any](/*93.6*/main("About Us", "about")/*93.31*/(content))),format.raw/*93.40*/("""
""")))}/*94.3*/else/*94.8*/{_display_(Seq[Any](format.raw/*94.9*/("""
    """),_display_(Seq[Any](/*95.6*/content)),format.raw/*95.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean): play.api.templates.HtmlFormat.Appendable = apply(js)
    
    def f:((java.lang.Boolean) => play.api.templates.HtmlFormat.Appendable) = (js) => apply(js)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 13 18:41:40 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/about.scala.html
                    HASH: f4afe2199eb3d7eee75b8e530dd7df294477bc58
                    MATRIX: 785->1|885->29|899->36|983->40|4034->3055|4049->3061|4104->3094|5097->4051|5112->4057|5167->4090|6120->24|6151->5004|6191->5009|6206->5016|6246->5018|6288->5025|6322->5050|6353->5059|6374->5063|6386->5068|6424->5069|6466->5076|6495->5083
                    LINES: 26->1|28->3|28->3|30->3|82->55|82->55|82->55|100->73|100->73|100->73|118->1|120->90|122->92|122->92|122->92|123->93|123->93|123->93|124->94|124->94|124->94|125->95|125->95
                    -- GENERATED --
                */
            