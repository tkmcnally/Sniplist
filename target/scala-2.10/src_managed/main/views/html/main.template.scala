
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*7.14*/lang()/*7.20*/.code())),format.raw/*7.27*/("""">
  <head>
    <title>"""),_display_(Seq[Any](/*9.13*/title)),format.raw/*9.18*/("""</title>
    
    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">
    
    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(Seq[Any](/*19.16*/routes/*19.22*/.Assets.at("js/bootstrap.min.js"))),format.raw/*19.55*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*20.16*/routes/*20.22*/.Application.jsRoutes)),format.raw/*20.43*/("""" defer="defer"></script>
	
    <!-- Le styles -->
    <link href=""""),_display_(Seq[Any](/*23.18*/routes/*23.24*/.Assets.at("stylesheets/main.min.css"))),format.raw/*23.62*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*24.18*/routes/*24.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*24.59*/("""" rel="stylesheet">
    

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href=""""),_display_(Seq[Any](/*44.35*/routes/*44.41*/.Application.index())),format.raw/*44.61*/("""">Play! Authenticate</a>
          
          <div class="btn-group pull-right">
          """),_display_(Seq[Any](/*47.12*/subjectPresentOr()/*47.30*/ {_display_(Seq[Any](format.raw/*47.32*/("""
          	"""),_display_(Seq[Any](/*48.13*/defining(Application.getLocalUser(session()))/*48.58*/ { user =>_display_(Seq[Any](format.raw/*48.68*/("""
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(Seq[Any](/*50.42*/user/*50.46*/.name)),format.raw/*50.51*/("""
              <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(Seq[Any](/*54.29*/routes/*54.35*/.Application.profile())),format.raw/*54.57*/("""">"""),_display_(Seq[Any](/*54.60*/Messages("playauthenticate.navigation.profile"))),format.raw/*54.107*/("""</a></li>
              <li><a href=""""),_display_(Seq[Any](/*55.29*/routes/*55.35*/.Account.link())),format.raw/*55.50*/("""">"""),_display_(Seq[Any](/*55.53*/Messages("playauthenticate.navigation.link_more"))),format.raw/*55.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(Seq[Any](/*57.29*/com/*57.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*57.93*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*57.121*/Messages("playauthenticate.navigation.logout"))),format.raw/*57.167*/("""</a></li>
            </ul>
            """)))})),format.raw/*59.14*/("""
          """)))}/*60.12*/{_display_(Seq[Any](format.raw/*60.13*/("""
            <a href=""""),_display_(Seq[Any](/*61.23*/routes/*61.29*/.Application.login())),format.raw/*61.49*/("""" class="btn btn-primary btn-mini """),_display_(Seq[Any](/*61.84*/("disabled".when(nav == "login")))),format.raw/*61.117*/("""">"""),_display_(Seq[Any](/*61.120*/Messages("playauthenticate.navigation.login"))),format.raw/*61.165*/("""</a>
          """)))})),format.raw/*62.12*/("""
          </div>

          
          <div class="nav-collapse">
            <ul class="nav">
              <li class=""""),_display_(Seq[Any](/*68.27*/("active".when(nav == "")))),format.raw/*68.53*/(""""><a href=""""),_display_(Seq[Any](/*68.65*/routes/*68.71*/.Application.index())),format.raw/*68.91*/("""">"""),_display_(Seq[Any](/*68.94*/Messages("playauthenticate.navigation.home"))),format.raw/*68.138*/("""</a></li>
              <li class=""""),_display_(Seq[Any](/*69.27*/("active".when(nav == "restricted")))),format.raw/*69.63*/(""""><a href=""""),_display_(Seq[Any](/*69.75*/routes/*69.81*/.Application.restricted())),format.raw/*69.106*/("""">"""),_display_(Seq[Any](/*69.109*/Messages("playauthenticate.navigation.restricted"))),format.raw/*69.159*/("""</a></li>
                
                """),_display_(Seq[Any](/*71.18*/subjectNotPresent()/*71.37*/ {_display_(Seq[Any](format.raw/*71.39*/("""
			    	<li class=""""),_display_(Seq[Any](/*72.21*/("active".when(nav == "signup")))),format.raw/*72.53*/(""""><a href=""""),_display_(Seq[Any](/*72.65*/routes/*72.71*/.Application.signup())),format.raw/*72.92*/("""">"""),_display_(Seq[Any](/*72.95*/Messages("playauthenticate.navigation.signup"))),format.raw/*72.141*/("""</a></li>
			    """)))})),format.raw/*73.9*/("""
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(Seq[Any](/*81.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*81.54*/ {_display_(Seq[Any](format.raw/*81.56*/("""
	      <div class="alert alert-error">
	      	"""),_display_(Seq[Any](/*83.10*/flash()/*83.17*/.get(Application.FLASH_ERROR_KEY))),format.raw/*83.50*/("""
	      </div>
	    """)))})),format.raw/*85.7*/("""
	    """),_display_(Seq[Any](/*86.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*86.56*/ {_display_(Seq[Any](format.raw/*86.58*/("""
	      <div class="alert alert-success">
	      	"""),_display_(Seq[Any](/*88.10*/flash()/*88.17*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*88.52*/("""
	      </div>
	    """)))})),format.raw/*90.7*/("""
		"""),_display_(Seq[Any](/*91.4*/content)),format.raw/*91.11*/("""
		
    <hr>

      <footer>
        <p>&copy; 2012-2013 Play! Authenticate. Licensed under Apache License, Version 2.0. View details <a href="https://github.com/joscha/play-authenticate/blob/master/LICENSE">here</a>.</p>
        <p>
        <small>Styles by <a href="http://twitter.github.com/bootstrap/index.html" target="_blank">Twitter Bootstrap</a> &middot; Provider icons by <a href="https://github.com/paulrobertlloyd/socialmediaicons/" target="_blank">Paul Robert Lloyd</a></small></p>
      </footer>
    </div> <!-- /container -->

  </body>
</html>
"""))}
    }
    
    def render(title:String,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 30 10:15:30 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: ac3ed5ba0414d7e192bb4851e8dc09fd847c2909
                    MATRIX: 785->1|1033->49|1063->160|1130->192|1144->198|1172->205|1233->231|1259->236|1745->686|1760->692|1815->725|1879->753|1894->759|1937->780|2044->851|2059->857|2119->895|2193->933|2208->939|2265->974|2926->1599|2941->1605|2983->1625|3114->1720|3141->1738|3181->1740|3231->1754|3285->1799|3333->1809|3489->1929|3502->1933|3529->1938|3696->2069|3711->2075|3755->2097|3794->2100|3864->2147|3939->2186|3954->2192|3991->2207|4030->2210|4102->2259|4218->2339|4230->2342|4313->2403|4378->2431|4447->2477|4522->2520|4554->2533|4593->2534|4653->2558|4668->2564|4710->2584|4781->2619|4837->2652|4877->2655|4945->2700|4994->2717|5158->2845|5206->2871|5254->2883|5269->2889|5311->2909|5350->2912|5417->2956|5490->2993|5548->3029|5596->3041|5611->3047|5659->3072|5699->3075|5772->3125|5854->3171|5882->3190|5922->3192|5980->3214|6034->3246|6082->3258|6097->3264|6140->3285|6179->3288|6248->3334|6298->3353|6473->3493|6529->3540|6569->3542|6656->3593|6672->3600|6727->3633|6781->3656|6824->3664|6882->3713|6922->3715|7011->3768|7027->3775|7084->3810|7138->3833|7178->3838|7207->3845
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|48->19|48->19|48->19|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|73->44|73->44|73->44|76->47|76->47|76->47|77->48|77->48|77->48|79->50|79->50|79->50|83->54|83->54|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|86->57|86->57|86->57|86->57|86->57|88->59|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|90->61|91->62|97->68|97->68|97->68|97->68|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|98->69|100->71|100->71|100->71|101->72|101->72|101->72|101->72|101->72|101->72|101->72|102->73|110->81|110->81|110->81|112->83|112->83|112->83|114->85|115->86|115->86|115->86|117->88|117->88|117->88|119->90|120->91|120->91
                    -- GENERATED --
                */
            