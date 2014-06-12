
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
object contact extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Contact Us", "contact")/*1.31*/ {_display_(Seq[Any](format.raw/*1.33*/("""
            <!-- *****************************************************************************************************************
	 BLUE WRAP
	 ***************************************************************************************************************** -->
        <div id="blue">
            <div class="container">
                <div class="row">
                    <h3>Contact.</h3>
                </div><!-- /row -->
            </div> <!-- /container -->
        </div><!-- /blue -->

        <!-- *****************************************************************************************************************
	 CONTACT WRAP
	 ***************************************************************************************************************** -->

        <div id="contactwrap"></div>

            <!-- *****************************************************************************************************************
	 CONTACT FORMS
	 ***************************************************************************************************************** -->

    <div class="container mtb">
        <div class="row">
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
                <h4>Our location</h4>
                <div class="hline"></div>
                <p>
                    Ottawa, Ontario, Canada
                </p>
                <p>
                    Email: tk.mcnally@gmail.com<br/>
                </p>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean
                massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
            </div>
            <div class="col-lg-2"></div>
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
                    DATE: Thu Jun 12 15:15:32 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/contact.scala.html
                    HASH: c9fa8a3b1a03b4a3e48a99e231d932814341b3c2
                    MATRIX: 866->1|903->30|942->32
                    LINES: 29->1|29->1|29->1
                    -- GENERATED --
                */
            