
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
object index1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""

<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*8.14*/lang()/*8.20*/.code())),format.raw/*8.27*/("""">
    <head>
        <title>"""),_display_(Seq[Any](/*10.17*/title)),format.raw/*10.22*/("""</title>

        <!-- Meta values -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Favicon -->
        <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*20.42*/routes/*20.48*/.Assets.at("ico/favicon.ico"))),format.raw/*20.77*/("""">

        <!-- Bootstrap core CSS -->
        <link href=""""),_display_(Seq[Any](/*23.22*/routes/*23.28*/.Assets.at("css/bootstrap.css"))),format.raw/*23.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.Assets.at("css/font-awesome.min.css"))),format.raw/*24.66*/("""" rel="stylesheet">

        <link href=""""),_display_(Seq[Any](/*26.22*/routes/*26.28*/.Assets.at("css/transparent.css"))),format.raw/*26.61*/("""" rel="stylesheet"/>

        <!-- Custom styles for this template -->
        <link href=""""),_display_(Seq[Any](/*29.22*/routes/*29.28*/.Assets.at("css/style.css"))),format.raw/*29.55*/("""" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
                <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
                <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

            <!-- Fixed navbar -->
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(Seq[Any](/*51.52*/routes/*51.58*/.Application.index())),format.raw/*51.78*/("""">SNIPLIST.</a>
                </div>
                <div class="navbar-collapse collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <!-- Determine which page is currently active -->
                        """),_display_(Seq[Any](/*56.26*/generators/*56.36*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*56.83*/("""
                        """),_display_(Seq[Any](/*57.26*/generators/*57.36*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*57.84*/("""
                        """),_display_(Seq[Any](/*58.26*/generators/*58.36*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*58.88*/("""
                        """),_display_(Seq[Any](/*59.26*/subjectPresentOr()/*59.44*/ {_display_(Seq[Any](format.raw/*59.46*/("""
                            """),_display_(Seq[Any](/*60.30*/defining(Application.getLocalUser(session()))/*60.75*/ { user =>_display_(Seq[Any](format.raw/*60.85*/("""
                                <li><div class="dropdown">
                                    <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                        <i class="icon-user"></i> """),_display_(Seq[Any](/*63.68*/user/*63.72*/.name.toUpperCase())),format.raw/*63.91*/("""
                                        <span class="caret"></span>
                                    </a>

                                <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(Seq[Any](/*68.51*/routes/*68.57*/.Application.profile())),format.raw/*68.79*/("""">"""),_display_(Seq[Any](/*68.82*/Messages("playauthenticate.navigation.profile")/*68.129*/.toUpperCase())),format.raw/*68.143*/("""</a></li>
                                    <li class="divider"></li>
                                    <li><a href=""""),_display_(Seq[Any](/*70.51*/com/*70.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*70.115*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*70.143*/Messages("playauthenticate.navigation.logout")/*70.189*/.toUpperCase())),format.raw/*70.203*/("""</a></li>
                                </ul>
                                </div>
                              </li>
                            """)))})),format.raw/*74.30*/("""
                        """)))}/*75.26*/{_display_(Seq[Any](format.raw/*75.27*/("""
                            """),_display_(Seq[Any](/*76.30*/generators/*76.40*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*76.90*/("""
                        """)))})),format.raw/*77.26*/("""

                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>

        <div id="wrapper-content">
            <div id="container">

            <!-- INSERTED CONTENT GOES HERE -->
                """),_display_(Seq[Any](/*88.18*/content)),format.raw/*88.25*/("""
            </div>
        </div>
        <!-- *****************************************************************************************************************
        FOOTER
        ***************************************************************************************************************** -->
        <div id="footerwrap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <h4>About</h4>
                        <div class="hline-w"></div>
                        <p>Created in 2014, Sniplist provides a new way of sharing music with your friends.</p>
                    </div>
                    <div class="col-lg-4">
                        <h4>Social Links</h4>
                        <div class="hline-w"></div>
                        <p>
                            <a href="http://www.facebook.com"><i class="fa fa-facebook"></i></a>
                            <a href="http://www.twitter.com"><i class="fa fa-twitter"></i></a>
                            <a href="http://www.instagram.com"><i class="fa fa-instagram"></i></a>
                        </p>
                    </div>
                    <div class="col-lg-4">
                        <h4>Our Location</h4>
                        <div class="hline-w"></div>
                        <p>
                            Ottawa, Canada
                        </p>
                    </div>
                </div><! --/row -->
            </div><! --/container -->
        </div><! --/footerwrap -->

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*126.23*/routes/*126.29*/.Assets.at("js/bootstrap.min.js"))),format.raw/*126.62*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*127.23*/routes/*127.29*/.Assets.at("js/retina-1.1.0.js"))),format.raw/*127.61*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*128.23*/routes/*128.29*/.Assets.at("js/jquery.hoverdir.js"))),format.raw/*128.64*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*129.23*/routes/*129.29*/.Assets.at("js/jquery.hoverex.min.js"))),format.raw/*129.67*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*130.23*/routes/*130.29*/.Assets.at("js/jquery.prettyPhoto.js"))),format.raw/*130.67*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*131.23*/routes/*131.29*/.Assets.at("js/jquery.isotope.min.js"))),format.raw/*131.67*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*132.23*/routes/*132.29*/.Assets.at("js/custom.js"))),format.raw/*132.55*/(""""></script>

        <script>
        // Portfolio
        (function($) """),format.raw/*136.22*/("""{"""),format.raw/*136.23*/("""
        "use strict";
        var $container = $('.portfolio'),
        $items = $container.find('.portfolio-item'),
        portfolioLayout = 'fitRows';

        if( $container.hasClass('portfolio-centered') ) """),format.raw/*142.57*/("""{"""),format.raw/*142.58*/("""
        portfolioLayout = 'masonry';
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/("""

        $container.isotope("""),format.raw/*146.28*/("""{"""),format.raw/*146.29*/("""
        filter: '*',
        animationEngine: 'best-available',
        layoutMode: portfolioLayout,
        animationOptions: """),format.raw/*150.27*/("""{"""),format.raw/*150.28*/("""
        duration: 750,
        easing: 'linear',
        queue: false
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""",
        masonry: """),format.raw/*155.18*/("""{"""),format.raw/*155.19*/("""
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""
        """),format.raw/*157.9*/("""}"""),format.raw/*157.10*/(""", refreshWaypoints());

        function refreshWaypoints() """),format.raw/*159.37*/("""{"""),format.raw/*159.38*/("""
        setTimeout(function() """),format.raw/*160.31*/("""{"""),format.raw/*160.32*/("""
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/(""", 1000);
        """),format.raw/*162.9*/("""}"""),format.raw/*162.10*/("""

        $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*164.63*/("""{"""),format.raw/*164.64*/("""
        var selector = $(this).attr('data-filter');
        $container.isotope("""),format.raw/*166.28*/("""{"""),format.raw/*166.29*/(""" filter: selector """),format.raw/*166.47*/("""}"""),format.raw/*166.48*/(""", refreshWaypoints());
        $('nav.portfolio-filter ul a').removeClass('active');
        $(this).addClass('active');
        return false;
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/(""");

        function getColumnNumber() """),format.raw/*172.36*/("""{"""),format.raw/*172.37*/("""
        var winWidth = $(window).width(),
        columnNumber = 1;

        if (winWidth > 1200) """),format.raw/*176.30*/("""{"""),format.raw/*176.31*/("""
        columnNumber = 5;
        """),format.raw/*178.9*/("""}"""),format.raw/*178.10*/(""" else if (winWidth > 950) """),format.raw/*178.36*/("""{"""),format.raw/*178.37*/("""
        columnNumber = 4;
        """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/(""" else if (winWidth > 600) """),format.raw/*180.36*/("""{"""),format.raw/*180.37*/("""
        columnNumber = 3;
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/(""" else if (winWidth > 400) """),format.raw/*182.36*/("""{"""),format.raw/*182.37*/("""
        columnNumber = 2;
        """),format.raw/*184.9*/("""}"""),format.raw/*184.10*/(""" else if (winWidth > 250) """),format.raw/*184.36*/("""{"""),format.raw/*184.37*/("""
        columnNumber = 1;
        """),format.raw/*186.9*/("""}"""),format.raw/*186.10*/("""
        return columnNumber;
        """),format.raw/*188.9*/("""}"""),format.raw/*188.10*/("""

        function setColumns() """),format.raw/*190.31*/("""{"""),format.raw/*190.32*/("""
        var winWidth = $(window).width(),
        columnNumber = getColumnNumber(),
        itemWidth = Math.floor(winWidth / columnNumber);

        $container.find('.portfolio-item').each(function() """),format.raw/*195.60*/("""{"""),format.raw/*195.61*/("""
        $(this).css( """),format.raw/*196.22*/("""{"""),format.raw/*196.23*/("""
        width : itemWidth + 'px'
        """),format.raw/*198.9*/("""}"""),format.raw/*198.10*/(""");
        """),format.raw/*199.9*/("""}"""),format.raw/*199.10*/(""");
        """),format.raw/*200.9*/("""}"""),format.raw/*200.10*/("""

        function setPortfolio() """),format.raw/*202.33*/("""{"""),format.raw/*202.34*/("""
        setColumns();
        $container.isotope('reLayout');
        """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/("""

        $container.imagesLoaded(function () """),format.raw/*207.45*/("""{"""),format.raw/*207.46*/("""
        setPortfolio();
        """),format.raw/*209.9*/("""}"""),format.raw/*209.10*/(""");

        $(window).on('resize', function () """),format.raw/*211.44*/("""{"""),format.raw/*211.45*/("""
        setPortfolio();
        """),format.raw/*213.9*/("""}"""),format.raw/*213.10*/(""");
        """),format.raw/*214.9*/("""}"""),format.raw/*214.10*/(""")(jQuery);
        </script>
    </body>
</html>"""))}
    }
    
    def render(title:String,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 06 01:21:44 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index1.scala.html
                    HASH: 29022e500b0a5fa057264a46e6e793e80a7a9c4a
                    MATRIX: 787->1|1033->49|1061->156|1127->187|1141->193|1169->200|1235->230|1262->235|1659->596|1674->602|1725->631|1822->692|1837->698|1890->729|1967->770|1982->776|2042->814|2120->856|2135->862|2190->895|2318->987|2333->993|2382->1020|3429->2031|3444->2037|3486->2057|3776->2311|3795->2321|3864->2368|3926->2394|3945->2404|4015->2452|4077->2478|4096->2488|4170->2540|4232->2566|4259->2584|4299->2586|4365->2616|4419->2661|4467->2671|4730->2898|4743->2902|4784->2921|5040->3141|5055->3147|5099->3169|5138->3172|5195->3219|5232->3233|5390->3355|5402->3358|5486->3419|5551->3447|5607->3493|5644->3507|5828->3659|5873->3685|5912->3686|5978->3716|5997->3726|6069->3776|6127->3802|6405->4044|6434->4051|8339->5919|8355->5925|8411->5958|8482->5992|8498->5998|8553->6030|8624->6064|8640->6070|8698->6105|8769->6139|8785->6145|8846->6183|8917->6217|8933->6223|8994->6261|9065->6295|9081->6301|9142->6339|9213->6373|9229->6379|9278->6405|9379->6477|9409->6478|9650->6690|9680->6691|9754->6737|9784->6738|9842->6767|9872->6768|10029->6896|10059->6897|10166->6976|10196->6977|10244->6996|10274->6997|10311->7006|10341->7007|10378->7016|10408->7017|10497->7077|10527->7078|10587->7109|10617->7110|10654->7119|10684->7120|10729->7137|10759->7138|10852->7202|10882->7203|10991->7283|11021->7284|11068->7302|11098->7303|11277->7454|11307->7455|11375->7494|11405->7495|11533->7594|11563->7595|11626->7630|11656->7631|11711->7657|11741->7658|11804->7693|11834->7694|11889->7720|11919->7721|11982->7756|12012->7757|12067->7783|12097->7784|12160->7819|12190->7820|12245->7846|12275->7847|12338->7882|12368->7883|12434->7921|12464->7922|12525->7954|12555->7955|12786->8157|12816->8158|12867->8180|12897->8181|12967->8223|12997->8224|13036->8235|13066->8236|13105->8247|13135->8248|13198->8282|13228->8283|13327->8354|13357->8355|13432->8401|13462->8402|13523->8435|13553->8436|13629->8483|13659->8484|13720->8517|13750->8518|13789->8529|13819->8530
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|55->26|55->26|55->26|58->29|58->29|58->29|80->51|80->51|80->51|85->56|85->56|85->56|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|92->63|92->63|92->63|97->68|97->68|97->68|97->68|97->68|97->68|99->70|99->70|99->70|99->70|99->70|99->70|103->74|104->75|104->75|105->76|105->76|105->76|106->77|117->88|117->88|155->126|155->126|155->126|156->127|156->127|156->127|157->128|157->128|157->128|158->129|158->129|158->129|159->130|159->130|159->130|160->131|160->131|160->131|161->132|161->132|161->132|165->136|165->136|171->142|171->142|173->144|173->144|175->146|175->146|179->150|179->150|183->154|183->154|184->155|184->155|185->156|185->156|186->157|186->157|188->159|188->159|189->160|189->160|190->161|190->161|191->162|191->162|193->164|193->164|195->166|195->166|195->166|195->166|199->170|199->170|201->172|201->172|205->176|205->176|207->178|207->178|207->178|207->178|209->180|209->180|209->180|209->180|211->182|211->182|211->182|211->182|213->184|213->184|213->184|213->184|215->186|215->186|217->188|217->188|219->190|219->190|224->195|224->195|225->196|225->196|227->198|227->198|228->199|228->199|229->200|229->200|231->202|231->202|234->205|234->205|236->207|236->207|238->209|238->209|240->211|240->211|242->213|242->213|243->214|243->214
                    -- GENERATED --
                */
            