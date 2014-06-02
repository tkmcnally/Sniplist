
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
object _emailPartial extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(f: Form[_], constraints: Boolean = false):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/inputText(
  f("email"),
  '_showConstraints -> constraints,
  '_label -> Messages("playauthenticate.login.email.placeholder")
))))}
    }
    
    def render(f:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},constraints:Boolean): play.api.templates.HtmlFormat.Appendable = apply(f,constraints)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean) => play.api.templates.HtmlFormat.Appendable) = (f,constraints) => apply(f,constraints)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 30 10:15:30 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/_emailPartial.scala.html
                    HASH: a44a2ce8d6673bbedf1d3b87e6aac977f73f3106
                    MATRIX: 864->1|1052->43|1082->100|1119->103
                    LINES: 28->1|34->1|36->5|37->6
                    -- GENERATED --
                */
            