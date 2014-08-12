
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
object contact extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[java.lang.Boolean,play.api.templates.HtmlFormat.Appendable] {

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
                <h3>Contact.</h3>
            </div><!-- /row -->
        </div> <!-- /container -->
    </div> <!-- /blue -->

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
                    Email: noreply.sniplist@gmail.com<br/>
                </p>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean
                    massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
            </div>
            <div class="col-lg-2"></div>
        </div><! --/row -->
    </div><! --/container -->
""")))};
Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*44.2*/("""
    """),_display_(Seq[Any](/*45.6*/if(!js)/*45.13*/ {_display_(Seq[Any](format.raw/*45.15*/("""
        """),_display_(Seq[Any](/*46.10*/main("Contact Us", "contact")/*46.39*/(content))),format.raw/*46.48*/("""
    """)))}/*47.7*/else/*47.12*/{_display_(Seq[Any](format.raw/*47.13*/("""
        """),_display_(Seq[Any](/*48.10*/content)),format.raw/*48.17*/("""
    """)))})))}
    }
    
    def render(js:java.lang.Boolean): play.api.templates.HtmlFormat.Appendable = apply(js)
    
    def f:((java.lang.Boolean) => play.api.templates.HtmlFormat.Appendable) = (js) => apply(js)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:05:43 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/contact.scala.html
                    HASH: a1f301fafa3ca527b302cdc469201a2219c8ae5f
                    MATRIX: 787->1|887->29|901->36|985->40|2838->24|2869->1855|2911->1862|2927->1869|2967->1871|3014->1882|3052->1911|3083->1920|3108->1928|3121->1933|3160->1934|3207->1945|3236->1952
                    LINES: 26->1|28->3|28->3|30->3|72->1|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48
                    -- GENERATED --
                */
            