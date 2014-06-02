
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.signup.title"),"signup")/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
    
  <div class="row">
    <div class="span6">
      <h1>"""),_display_(Seq[Any](/*10.12*/Messages("playauthenticate.signup.title"))),format.raw/*10.53*/("""</h1>
    </div>
  </div>

  <div id="signup" class="row">

    <div class="span3">
        """),format.raw/*17.45*/("""
    	"""),_display_(Seq[Any](/*18.7*/helper/*18.13*/.form(routes.Application.doSignup)/*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
    	
            """),_display_(Seq[Any](/*20.14*/if(signupForm.hasGlobalErrors)/*20.44*/ {_display_(Seq[Any](format.raw/*20.46*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*22.52*/signupForm/*22.62*/.globalError.message)),format.raw/*22.82*/("""</span>
		        </p>
            """)))})),format.raw/*24.14*/("""
            
             """),_display_(Seq[Any](/*26.15*/inputText(
                signupForm("name"),
                '_label -> Messages("playauthenticate.signup.name")
             ))),format.raw/*29.15*/("""
             
             """),_display_(Seq[Any](/*31.15*/_emailPartial(signupForm))),format.raw/*31.40*/("""
             
             """),_display_(Seq[Any](/*33.15*/_passwordPartial(signupForm))),format.raw/*33.43*/("""

            <input type="submit" value=""""),_display_(Seq[Any](/*35.42*/Messages("playauthenticate.signup.now"))),format.raw/*35.81*/("""" class="btn btn-primary">
    	""")))})),format.raw/*36.7*/("""
    </div>

    <div class="span3">
        """),_display_(Seq[Any](/*40.10*/Messages("playauthenticate.signup.oauth"))),format.raw/*40.51*/("""
        """),format.raw/*41.50*/("""
        """),_display_(Seq[Any](/*42.10*/_providerPartial(skipCurrent=false))),format.raw/*42.45*/("""
    </div>

  </div>

""")))})))}
    }
    
    def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 01 21:40:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/signup.scala.html
                    HASH: 0a79e5b94de36579dc1836e3d5e4a49efc094903
                    MATRIX: 849->1|1016->22|1046->79|1083->82|1147->138|1186->140|1287->205|1350->246|1477->381|1520->389|1535->395|1578->429|1618->431|1676->453|1715->483|1755->485|1880->574|1899->584|1941->604|2011->642|2077->672|2231->804|2298->835|2345->860|2412->891|2462->919|2543->964|2604->1003|2669->1037|2755->1087|2818->1128|2856->1179|2903->1190|2960->1225
                    LINES: 28->1|34->1|36->5|37->6|37->6|37->6|41->10|41->10|48->17|49->18|49->18|49->18|49->18|51->20|51->20|51->20|53->22|53->22|53->22|55->24|57->26|60->29|62->31|62->31|64->33|64->33|66->35|66->35|67->36|71->40|71->40|72->41|73->42|73->42
                    -- GENERATED --
                */
            