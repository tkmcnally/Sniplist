
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.login.title"),"login")/*6.56*/ {_display_(Seq[Any](format.raw/*6.58*/("""

  <div class="row">
    <div class="span6">
      <h1>"""),_display_(Seq[Any](/*10.12*/Messages("playauthenticate.login.title"))),format.raw/*10.52*/("""</h1>
    </div>
  </div>
    
  <div id="login" class="row">

    <div class="span3">
      """),format.raw/*17.43*/("""
    	"""),_display_(Seq[Any](/*18.7*/helper/*18.13*/.form(routes.Application.doLogin)/*18.46*/ {_display_(Seq[Any](format.raw/*18.48*/("""
    	
        """),_display_(Seq[Any](/*20.10*/if(loginForm.hasGlobalErrors)/*20.39*/ {_display_(Seq[Any](format.raw/*20.41*/(""" 
          <p class="error">
            <span class="label label-important">"""),_display_(Seq[Any](/*22.50*/loginForm/*22.59*/.globalError.message)),format.raw/*22.79*/("""</span>
          </p>
        """)))})),format.raw/*24.10*/("""
        
        """),_display_(Seq[Any](/*26.10*/_emailPartial(loginForm))),format.raw/*26.34*/("""
          
        """),_display_(Seq[Any](/*28.10*/inputPassword(
          loginForm("password"),
          '_showConstraints -> false,
          '_label -> Messages("playauthenticate.login.password.placeholder")
        ))),format.raw/*32.10*/("""
          
        <input type="submit" value=""""),_display_(Seq[Any](/*34.38*/Messages("playauthenticate.login.now"))),format.raw/*34.76*/("""" class="btn btn-primary"><br/>
        <br/>
        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(Seq[Any](/*36.158*/Messages("playauthenticate.login.forgot.password"))),format.raw/*36.208*/("""</a>

    	""")))})),format.raw/*38.7*/("""
    </div>

    <div class="span3">
      """),_display_(Seq[Any](/*42.8*/Messages("playauthenticate.login.oauth"))),format.raw/*42.48*/("""
      """),format.raw/*43.48*/("""
      """),_display_(Seq[Any](/*44.8*/_providerPartial(skipCurrent=false))),format.raw/*44.43*/("""
    </div>

  </div>

""")))})))}
    }
    
    def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 15:29:04 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/login.scala.html
                    HASH: 1ba52292e6d63eda0c7b27aaa43cf7ab8a09a86e
                    MATRIX: 848->1|1014->21|1044->78|1081->81|1143->135|1182->137|1279->198|1341->238|1469->374|1512->382|1527->388|1569->421|1609->423|1663->441|1701->470|1741->472|1858->553|1876->562|1918->582|1984->616|2041->637|2087->661|2146->684|2344->860|2431->911|2491->949|2733->1154|2806->1204|2851->1218|2934->1266|2996->1306|3032->1355|3076->1364|3133->1399
                    LINES: 28->1|34->1|36->5|37->6|37->6|37->6|41->10|41->10|48->17|49->18|49->18|49->18|49->18|51->20|51->20|51->20|53->22|53->22|53->22|55->24|57->26|57->26|59->28|63->32|65->34|65->34|67->36|67->36|69->38|73->42|73->42|74->43|75->44|75->44
                    -- GENERATED --
                */
            