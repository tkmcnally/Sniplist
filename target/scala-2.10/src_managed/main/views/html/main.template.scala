
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "", moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*5.1*/("""

<!DOCTYPE html>
    <html lang=""""),_display_(Seq[Any](/*8.18*/lang()/*8.24*/.code())),format.raw/*8.31*/("""">
        <head>
            <title>"""),_display_(Seq[Any](/*10.21*/title)),format.raw/*10.26*/("""</title>

                <!-- Meta values -->
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta name="description" content="">
            <meta name="author" content="">


                <!-- Sniplist Favicon -->
            <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*21.46*/routes/*21.52*/.Assets.at("img/icons/favicon.ico"))),format.raw/*21.87*/("""">

                <!-- Bootstrap core CSS -->
            <link href=""""),_display_(Seq[Any](/*24.26*/routes/*24.32*/.Assets.at("css/bootstrap.css"))),format.raw/*24.63*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*25.26*/routes/*25.32*/.Assets.at("css/font-awesome.min.css"))),format.raw/*25.70*/("""" rel="stylesheet">

                <!-- Social Media Icon CSS -->
            <link href=""""),_display_(Seq[Any](/*28.26*/routes/*28.32*/.Assets.at("css/transparent.css"))),format.raw/*28.65*/("""" rel="stylesheet"/>

                <!-- Custom Sniplist Styles -->
            <link href=""""),_display_(Seq[Any](/*31.26*/routes/*31.32*/.Assets.at("css/style.css"))),format.raw/*31.59*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*32.26*/routes/*32.32*/.Assets.at("css/responsive-video.css"))),format.raw/*32.70*/("""" rel="stylesheet">

                <!-- Custom styles for TableclothJs -->
            <link href=""""),_display_(Seq[Any](/*35.26*/routes/*35.32*/.Assets.at("css/prettify.css"))),format.raw/*35.62*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*36.26*/routes/*36.32*/.Assets.at("css/tablecloth.css"))),format.raw/*36.64*/("""" rel="stylesheet">


                <!-- Styles for MediaElementJs
            <link  href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Assets.at("css/mediaelementplayer.css"))),format.raw/*40.73*/("""" rel="Stylesheet" />
            <link  href=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.Assets.at("css/mejs-skins.css"))),format.raw/*41.65*/("""" rel="Stylesheet" />-->

            <link  href=""""),_display_(Seq[Any](/*43.27*/routes/*43.33*/.Assets.at("css/audio-sniplist-skin.css"))),format.raw/*43.74*/("""" rel="Stylesheet" />

                <!-- JQueryUI CSS -->
            <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
            <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*47.59*/routes/*47.65*/.Assets.at("css/iThing.css"))),format.raw/*47.93*/("""">

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
                        <a class=""""),_display_(Seq[Any](/*63.36*/subjectPresent()/*63.52*/{_display_(Seq[Any](format.raw/*63.53*/("""dynamic-link""")))})),format.raw/*63.66*/(""" navbar-brand" href=""""),_display_(Seq[Any](/*63.88*/routes/*63.94*/.Application.index())),format.raw/*63.114*/("""">SNIPLIST.</a>
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav nav-sidebar">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*68.30*/subjectPresentOr()/*68.48*/ {_display_(Seq[Any](format.raw/*68.50*/("""
                                """),_display_(Seq[Any](/*69.34*/generators/*69.44*/.navbarMenu(routes.SnipController.add(), "ADD SNIP", true))),format.raw/*69.102*/("""
                            """)))}/*70.30*/ {_display_(Seq[Any](format.raw/*70.32*/("""
                                """),_display_(Seq[Any](/*71.34*/generators/*71.44*/.navbarMenu(routes.Application.index(), "HOME", false))),format.raw/*71.98*/("""
                            """)))})),format.raw/*72.30*/("""
                            """),_display_(Seq[Any](/*73.30*/subjectNotPresent()/*73.49*/ {_display_(Seq[Any](format.raw/*73.51*/("""
                                """),_display_(Seq[Any](/*74.34*/generators/*74.44*/.navbarMenu(routes.Application.about(), "ABOUT", false))),format.raw/*74.99*/("""
                                """),_display_(Seq[Any](/*75.34*/generators/*75.44*/.navbarMenu(routes.Application.contact(), "CONTACT", false))),format.raw/*75.103*/("""
                            """)))})),format.raw/*76.30*/("""

                            """),_display_(Seq[Any](/*78.30*/subjectPresentOr()/*78.48*/ {_display_(Seq[Any](format.raw/*78.50*/("""
                                """),_display_(Seq[Any](/*79.34*/defining(Application.getLocalUser(session()))/*79.79*/ { user =>_display_(Seq[Any](format.raw/*79.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="fa fa-user"></i> """),_display_(Seq[Any](/*83.77*/user/*83.81*/.name.toUpperCase())),format.raw/*83.100*/("""
                                            <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*88.84*/routes/*88.90*/.Application.profile())),format.raw/*88.112*/("""">"""),_display_(Seq[Any](/*88.115*/Messages("playauthenticate.navigation.profile")/*88.162*/.toUpperCase())),format.raw/*88.176*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*90.63*/com/*90.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*90.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*90.155*/Messages("playauthenticate.navigation.logout")/*90.201*/.toUpperCase())),format.raw/*90.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*94.34*/("""
                                """),_display_(Seq[Any](/*95.34*/generators/*95.44*/.navbarMenu(routes.Application.about(), "ABOUT", true))),format.raw/*95.98*/("""
                            """)))}/*96.30*/{_display_(Seq[Any](format.raw/*96.31*/("""
                                """),_display_(Seq[Any](/*97.34*/generators/*97.44*/.navbarMenu(routes.Application.login(), "SIGN IN", false))),format.raw/*97.101*/("""
                            """)))})),format.raw/*98.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>
            <div class="content mtb">
                <div class="container">
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div id="global-message" class="col-md-8 alert alert-danger alert-dismissable hidden">
                            <a id="global-message-close" class="panel-close close" data-dismiss="alert">×</a>
                            <i id="global-message-icon" class="fa fa-check-circle"></i>
                            <p id="global-message-text" style="display: inline;"></p>
                        </div>
                        <div class="col-md-2"></div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-sm-2">
                            <nav class="nav-sidebar">
                                <ul class="nav">
                                    <li class="active"><a class="dynamic-link" href=""""),_display_(Seq[Any](/*121.87*/routes/*121.93*/.Application.index())),format.raw/*121.113*/("""">Popular</a></li>
                                    <li class="nav-divider"></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*123.72*/routes/*123.78*/.SnipCollectionController.mySnips())),format.raw/*123.113*/("""">Your Snips</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*124.72*/routes/*124.78*/.SniplistCollectionController.mySniplists())),format.raw/*124.121*/("""">Your Sniplists</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*125.72*/routes/*125.78*/.SnipCollectionController.mySnips())),format.raw/*125.113*/("""">Saved Snips</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*126.72*/routes/*126.78*/.SniplistCollectionController.mySniplists())),format.raw/*126.121*/("""">Saved Sniplists</a></li>
                                </ul>
                            </nav>
                        </div>
                        <div id="wrapper-content" class="col-sm-8">
                            """),_display_(Seq[Any](/*131.30*/content)),format.raw/*131.37*/("""
                        </div>
                    </div>
                </div>
            </div>

                <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
            """),_display_(Seq[Any](/*140.14*/subjectNotPresent()/*140.33*/ {_display_(Seq[Any](format.raw/*140.35*/("""
                <!--<div id="footerwrap">-->
                    <div class="container">
                        <div class="hline bottom-buffer-sm"></div>
                        <div class="row">
                            <div class="col-md-4">
                                <h4>About</h4>
                                <div class="hline-w"></div>
                                <p>Created in 2014, Sniplist provides a new way of sharing music with your friends.</p>
                            </div>
                            <div class="col-md-4">
                                <h4>Social Links</h4>
                                <div class="hline-w"></div>
                                <p>
                                    <a href="http://www.instagram.com">
                                        <span class="fa-stack fa-2x">
                                            <i class="fa fa-circle fa-stack-2x ins-color"></i>
                                            <i class="fa fa-instagram fa-stack-1x fa-inverse"></i>
                                        </span>
                                    </a>
                                    <a href="http://www.twitter.com">
                                        <span class="fa-stack fa-2x">
                                            <i class="fa fa-circle fa-stack-2x tw-color"></i>
                                            <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
                                        </span>
                                    </a>
                                    <a href="http://www.facebook.com">
                                        <span class="fa-stack fa-2x">
                                            <i class="fa fa-circle fa-stack-2x fb-color"></i>
                                            <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                                        </span>
                                    </a>
                                </p>
                            </div>
                            <div class="col-md-4">
                                <h4>Our Location</h4>
                                <div class="hline-w"></div>
                                <p>
                                    Ottawa, Canada
                                </p>
                            </div>
                        </div>
                    </div>
               <!-- </div>-->
            """)))})),format.raw/*184.14*/("""
            """),_display_(Seq[Any](/*185.14*/subjectPresent()/*185.30*/ {_display_(Seq[Any](format.raw/*185.32*/("""
                <div id="sticky-footer" class="navbar navbar-default navbar-fixed-bottom">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-3"></div>
                            <div class="col-md-6">
                                <div class="audio-player">
                                    <audio id="audioPlayer" type="audio/youtube" controls="controls" src="https://www.youtube.com/watch?v=smqNtBXN5Mc" ></audio>
                                </div>
                            </div>
                            <div class="col-md-3"></div>
                        </div>
                    </div>
                </div>
            """)))})),format.raw/*199.14*/("""



                <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

                <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

                <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*212.50*/routes/*212.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*212.111*/(""""></script>

                <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*215.27*/routes/*215.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*215.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*216.27*/routes/*216.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*216.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*217.27*/routes/*217.33*/.Assets.at("js/bootstrap/moment.js"))),format.raw/*217.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*218.27*/routes/*218.33*/.Assets.at("js/bootstrap/bootstrap-datetimepicker.min.js"))),format.raw/*218.91*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*220.27*/routes/*220.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*220.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*221.27*/routes/*221.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*221.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*222.27*/routes/*222.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*222.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*223.27*/routes/*223.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*223.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*224.27*/routes/*224.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*224.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*225.27*/routes/*225.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*225.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*226.27*/routes/*226.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*226.81*/(""""></script>

            """),_display_(Seq[Any](/*228.14*/moreScripts)),format.raw/*228.25*/("""
                <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*230.27*/routes/*230.33*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*230.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*231.27*/routes/*231.33*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*231.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*232.27*/routes/*232.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*232.80*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*233.27*/routes/*233.33*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*233.75*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*236.27*/routes/*236.33*/.Application.javascriptRoutes())),format.raw/*236.64*/("""" type="text/javascript"></script>

                <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*239.27*/routes/*239.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*239.93*/(""""></script>



            <script src=""""),_display_(Seq[Any](/*243.27*/routes/*243.33*/.Assets.at("js/sniplist/dynamicAjax.js"))),format.raw/*243.73*/(""""></script>


                <!-- BLOCK UI -->
            <script src=""""),_display_(Seq[Any](/*247.27*/routes/*247.33*/.Assets.at("js/jquery/blockUI.js"))),format.raw/*247.67*/(""""></script>


            <script type="text/javascript" charset="utf-8">

            //GLOBAL MEDIA PLAYER
            var globalPlayer;

            var globalAudioPlayer;

            // Portfolio
            (function($) """),format.raw/*258.26*/("""{"""),format.raw/*258.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*264.61*/("""{"""),format.raw/*264.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*266.13*/("""}"""),format.raw/*266.14*/("""

            /* $container.isotope("""),format.raw/*268.35*/("""{"""),format.raw/*268.36*/("""
             filter: '*',
             animationEngine: 'best-available',
             layoutMode: portfolioLayout,
             animationOptions: """),format.raw/*272.32*/("""{"""),format.raw/*272.33*/("""
             duration: 750,
             easing: 'linear',
             queue: false
             """),format.raw/*276.14*/("""}"""),format.raw/*276.15*/(""",
             masonry: """),format.raw/*277.23*/("""{"""),format.raw/*277.24*/("""
             """),format.raw/*278.14*/("""}"""),format.raw/*278.15*/("""
             """),format.raw/*279.14*/("""}"""),format.raw/*279.15*/(""", refreshWaypoints());
             */
            function refreshWaypoints() """),format.raw/*281.41*/("""{"""),format.raw/*281.42*/("""
            setTimeout(function() """),format.raw/*282.35*/("""{"""),format.raw/*282.36*/("""
            """),format.raw/*283.13*/("""}"""),format.raw/*283.14*/(""", 1000);
            """),format.raw/*284.13*/("""}"""),format.raw/*284.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*286.67*/("""{"""),format.raw/*286.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*288.32*/("""{"""),format.raw/*288.33*/(""" filter: selector """),format.raw/*288.51*/("""}"""),format.raw/*288.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*292.13*/("""}"""),format.raw/*292.14*/(""");

            function getColumnNumber() """),format.raw/*294.40*/("""{"""),format.raw/*294.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*298.34*/("""{"""),format.raw/*298.35*/("""
            columnNumber = 5;
            """),format.raw/*300.13*/("""}"""),format.raw/*300.14*/(""" else if (winWidth > 950) """),format.raw/*300.40*/("""{"""),format.raw/*300.41*/("""
            columnNumber = 4;
            """),format.raw/*302.13*/("""}"""),format.raw/*302.14*/(""" else if (winWidth > 600) """),format.raw/*302.40*/("""{"""),format.raw/*302.41*/("""
            columnNumber = 3;
            """),format.raw/*304.13*/("""}"""),format.raw/*304.14*/(""" else if (winWidth > 400) """),format.raw/*304.40*/("""{"""),format.raw/*304.41*/("""
            columnNumber = 2;
            """),format.raw/*306.13*/("""}"""),format.raw/*306.14*/(""" else if (winWidth > 250) """),format.raw/*306.40*/("""{"""),format.raw/*306.41*/("""
            columnNumber = 1;
            """),format.raw/*308.13*/("""}"""),format.raw/*308.14*/("""
            return columnNumber;
            """),format.raw/*310.13*/("""}"""),format.raw/*310.14*/("""

            function setColumns() """),format.raw/*312.35*/("""{"""),format.raw/*312.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*317.64*/("""{"""),format.raw/*317.65*/("""
            $(this).css( """),format.raw/*318.26*/("""{"""),format.raw/*318.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""");
            """),format.raw/*321.13*/("""}"""),format.raw/*321.14*/(""");
            """),format.raw/*322.13*/("""}"""),format.raw/*322.14*/("""

            function setPortfolio() """),format.raw/*324.37*/("""{"""),format.raw/*324.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*327.13*/("""}"""),format.raw/*327.14*/("""

            /*
            $container.imagesLoaded(function () """),format.raw/*330.49*/("""{"""),format.raw/*330.50*/("""
            setPortfolio();
            """),format.raw/*332.13*/("""}"""),format.raw/*332.14*/(""");*/

            $(window).on('resize', function () """),format.raw/*334.48*/("""{"""),format.raw/*334.49*/("""
            setPortfolio();
            """),format.raw/*336.13*/("""}"""),format.raw/*336.14*/(""");



            """),format.raw/*340.13*/("""}"""),format.raw/*340.14*/(""")(jQuery);
            </script>

                <!-- Google Analytics Tracking JS -->
            <script>
            (function(i,s,o,g,r,a,m)"""),format.raw/*345.37*/("""{"""),format.raw/*345.38*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*345.88*/("""{"""),format.raw/*345.89*/("""
            (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*346.48*/("""}"""),format.raw/*346.49*/(""",i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            """),format.raw/*348.13*/("""}"""),format.raw/*348.14*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

            ga('create', 'UA-52100641-2', 'auto');
            ga('send', 'pageview');

            </script>
        </body>
    </html>
"""))}
    }
    
    def render(title:String,nav:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav,moreScripts)(content)
    
    def f:((String,String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav,moreScripts) => (content) => apply(title,nav,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 03:14:12 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: ec7449dbd2376fc409809dafac350fe77a7e62c9
                    MATRIX: 790->1|1068->79|1098->190|1171->228|1185->234|1213->241|1289->281|1316->286|1774->708|1789->714|1846->749|1958->825|1973->831|2026->862|2108->908|2123->914|2183->952|2315->1048|2330->1054|2385->1087|2519->1185|2534->1191|2583->1218|2665->1264|2680->1270|2740->1308|2881->1413|2896->1419|2948->1449|3030->1495|3045->1501|3099->1533|3234->1632|3249->1638|3311->1678|3396->1727|3411->1733|3465->1765|3555->1819|3570->1825|3633->1866|3909->2106|3924->2112|3974->2140|4716->2846|4741->2862|4780->2863|4825->2876|4883->2898|4898->2904|4941->2924|5272->3219|5299->3237|5339->3239|5410->3274|5429->3284|5510->3342|5560->3373|5600->3375|5671->3410|5690->3420|5766->3474|5829->3505|5896->3536|5924->3555|5964->3557|6035->3592|6054->3602|6131->3657|6202->3692|6221->3702|6303->3761|6366->3792|6435->3825|6462->3843|6502->3845|6573->3880|6627->3925|6675->3935|7004->4228|7017->4232|7059->4251|7377->4533|7392->4539|7437->4561|7477->4564|7534->4611|7571->4625|7755->4773|7767->4776|7851->4837|7916->4865|7972->4911|8009->4925|8227->5111|8298->5146|8317->5156|8393->5210|8443->5241|8482->5242|8553->5277|8572->5287|8652->5344|8715->5375|9910->6533|9926->6539|9970->6559|10165->6717|10181->6723|10240->6758|10371->6852|10387->6858|10454->6901|10589->6999|10605->7005|10664->7040|10796->7135|10812->7141|10879->7184|11149->7417|11179->7424|11620->7828|11649->7847|11690->7849|14244->10370|14296->10385|14322->10401|14363->10403|15141->11148|15678->11648|15694->11654|15773->11709|15903->11802|15919->11808|15985->11851|16061->11890|16077->11896|16142->11938|16218->11977|16234->11983|16293->12019|16369->12058|16385->12064|16466->12122|16544->12163|16560->12169|16625->12211|16701->12250|16717->12256|16785->12301|16861->12340|16877->12346|16949->12395|17025->12434|17041->12440|17109->12485|17185->12524|17201->12530|17266->12572|17342->12611|17358->12617|17430->12666|17506->12705|17522->12711|17593->12759|17658->12787|17692->12798|17808->12877|17824->12883|17883->12919|17959->12958|17975->12964|18036->13002|18112->13041|18128->13047|18198->13094|18274->13133|18290->13139|18355->13181|18504->13293|18520->13299|18574->13330|18720->13439|18736->13445|18819->13505|18901->13550|18917->13556|18980->13596|19095->13674|19111->13680|19168->13714|19434->13951|19464->13952|19731->14190|19761->14191|19846->14247|19876->14248|19943->14286|19973->14287|20154->14439|20184->14440|20316->14543|20346->14544|20400->14569|20430->14570|20474->14585|20504->14586|20548->14601|20578->14602|20688->14683|20718->14684|20783->14720|20813->14721|20856->14735|20886->14736|20937->14758|20967->14759|21066->14829|21096->14830|21215->14920|21245->14921|21292->14939|21322->14940|21522->15111|21552->15112|21626->15157|21656->15158|21800->15273|21830->15274|21904->15319|21934->15320|21989->15346|22019->15347|22093->15392|22123->15393|22178->15419|22208->15420|22282->15465|22312->15466|22367->15492|22397->15493|22471->15538|22501->15539|22556->15565|22586->15566|22660->15611|22690->15612|22767->15660|22797->15661|22864->15699|22894->15700|23146->15923|23176->15924|23232->15951|23262->15952|23343->16004|23373->16005|23418->16021|23448->16022|23493->16038|23523->16039|23592->16079|23622->16080|23737->16166|23767->16167|23864->16235|23894->16236|23966->16279|23996->16280|24080->16335|24110->16336|24182->16379|24212->16380|24263->16402|24293->16403|24472->16553|24502->16554|24581->16604|24611->16605|24689->16654|24719->16655|24897->16804|24927->16805
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|50->21|50->21|50->21|53->24|53->24|53->24|54->25|54->25|54->25|57->28|57->28|57->28|60->31|60->31|60->31|61->32|61->32|61->32|64->35|64->35|64->35|65->36|65->36|65->36|69->40|69->40|69->40|70->41|70->41|70->41|72->43|72->43|72->43|76->47|76->47|76->47|92->63|92->63|92->63|92->63|92->63|92->63|92->63|97->68|97->68|97->68|98->69|98->69|98->69|99->70|99->70|100->71|100->71|100->71|101->72|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|107->78|107->78|107->78|108->79|108->79|108->79|112->83|112->83|112->83|117->88|117->88|117->88|117->88|117->88|117->88|119->90|119->90|119->90|119->90|119->90|119->90|123->94|124->95|124->95|124->95|125->96|125->96|126->97|126->97|126->97|127->98|150->121|150->121|150->121|152->123|152->123|152->123|153->124|153->124|153->124|154->125|154->125|154->125|155->126|155->126|155->126|160->131|160->131|169->140|169->140|169->140|213->184|214->185|214->185|214->185|228->199|241->212|241->212|241->212|244->215|244->215|244->215|245->216|245->216|245->216|246->217|246->217|246->217|247->218|247->218|247->218|249->220|249->220|249->220|250->221|250->221|250->221|251->222|251->222|251->222|252->223|252->223|252->223|253->224|253->224|253->224|254->225|254->225|254->225|255->226|255->226|255->226|257->228|257->228|259->230|259->230|259->230|260->231|260->231|260->231|261->232|261->232|261->232|262->233|262->233|262->233|265->236|265->236|265->236|268->239|268->239|268->239|272->243|272->243|272->243|276->247|276->247|276->247|287->258|287->258|293->264|293->264|295->266|295->266|297->268|297->268|301->272|301->272|305->276|305->276|306->277|306->277|307->278|307->278|308->279|308->279|310->281|310->281|311->282|311->282|312->283|312->283|313->284|313->284|315->286|315->286|317->288|317->288|317->288|317->288|321->292|321->292|323->294|323->294|327->298|327->298|329->300|329->300|329->300|329->300|331->302|331->302|331->302|331->302|333->304|333->304|333->304|333->304|335->306|335->306|335->306|335->306|337->308|337->308|339->310|339->310|341->312|341->312|346->317|346->317|347->318|347->318|349->320|349->320|350->321|350->321|351->322|351->322|353->324|353->324|356->327|356->327|359->330|359->330|361->332|361->332|363->334|363->334|365->336|365->336|369->340|369->340|374->345|374->345|374->345|374->345|375->346|375->346|377->348|377->348
                    -- GENERATED --
                */
            