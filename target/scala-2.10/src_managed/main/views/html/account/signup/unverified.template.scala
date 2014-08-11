
package views.html.account.signup

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
object unverified extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.verify.email.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""
    <div class="container mtb">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <h1>"""),_display_(Seq[Any](/*7.22*/Messages("playauthenticate.verify.email.title"))),format.raw/*7.69*/("""</h1>
                <p>
                    """),_display_(Seq[Any](/*9.22*/Messages("playauthenticate.verify.email.requirement"))),format.raw/*9.75*/("""</br>
                    """),_display_(Seq[Any](/*10.22*/Messages("playauthenticate.verify.email.cta"))),format.raw/*10.67*/("""
                <br/>

                </p>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 10 22:10:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/signup/unverified.scala.html
                    HASH: 145f08c812b510ec2cbed8b803be0d9f15dd8ea8
                    MATRIX: 884->3|945->56|984->58|1180->219|1248->266|1332->315|1406->368|1470->396|1537->441
                    LINES: 29->2|29->2|29->2|34->7|34->7|36->9|36->9|37->10|37->10
                    -- GENERATED --
                */
            