
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
            <div class="col-lg-8">
                <h4>Just Get In Touch!</h4>
                <div class="hline"></div>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>
                <form role="form">
                    <div class="form-group">
                        <label for="InputName1">Your Name</label>
                        <input type="email" class="form-control" id="exampleInputEmail1">
                    </div>
                    <div class="form-group">
                        <label for="InputEmail1">Email address</label>
                        <input type="email" class="form-control" id="exampleInputEmail1">
                    </div>
                    <div class="form-group">
                        <label for="InputSubject1">Subject</label>
                        <input type="email" class="form-control" id="exampleInputEmail1">
                    </div>
                    <div class="form-group">
                        <label for="message1">Message</label>
                        <textarea class="form-control" id="message1" rows="3"></textarea>
                    </div>
                    <button type="submit" class="btn btn-theme">Submit</button>
                </form>
            </div><! --/col-lg-8 -->

            <div class="col-lg-4">
                <h4>Our Address</h4>
                <div class="hline"></div>
                <p>
                    Some Ave, 987,<br/>
                    23890, New York,<br/>
                    United States.<br/>
                </p>
                <p>
                    Email: hello@solidtheme.com<br/>
                    Tel: +34 8493-4893
                </p>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>
            </div>
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
                    DATE: Fri Jun 06 01:40:28 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/contact.scala.html
                    HASH: 7f42369e623155e69a55e990f01287b50a4ac5c6
                    MATRIX: 866->1|903->30|942->32
                    LINES: 29->1|29->1|29->1
                    -- GENERATED --
                */
            