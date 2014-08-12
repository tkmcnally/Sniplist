
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
                        <ul class="nav navbar-nav">
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
                    DATE: Tue Aug 12 04:16:43 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 59d149ea956814779f70e9dde837f939cc515c28
                    MATRIX: 790->1|1068->79|1098->190|1171->228|1185->234|1213->241|1289->281|1316->286|1774->708|1789->714|1846->749|1958->825|1973->831|2026->862|2108->908|2123->914|2183->952|2315->1048|2330->1054|2385->1087|2519->1185|2534->1191|2583->1218|2665->1264|2680->1270|2740->1308|2881->1413|2896->1419|2948->1449|3030->1495|3045->1501|3099->1533|3234->1632|3249->1638|3311->1678|3396->1727|3411->1733|3465->1765|3555->1819|3570->1825|3633->1866|3909->2106|3924->2112|3974->2140|4716->2846|4741->2862|4780->2863|4825->2876|4883->2898|4898->2904|4941->2924|5260->3207|5287->3225|5327->3227|5398->3262|5417->3272|5498->3330|5548->3361|5588->3363|5659->3398|5678->3408|5754->3462|5817->3493|5884->3524|5912->3543|5952->3545|6023->3580|6042->3590|6119->3645|6190->3680|6209->3690|6291->3749|6354->3780|6423->3813|6450->3831|6490->3833|6561->3868|6615->3913|6663->3923|6992->4216|7005->4220|7047->4239|7365->4521|7380->4527|7425->4549|7465->4552|7522->4599|7559->4613|7743->4761|7755->4764|7839->4825|7904->4853|7960->4899|7997->4913|8215->5099|8286->5134|8305->5144|8381->5198|8431->5229|8470->5230|8541->5265|8560->5275|8640->5332|8703->5363|9898->6521|9914->6527|9958->6547|10153->6705|10169->6711|10228->6746|10359->6840|10375->6846|10442->6889|10577->6987|10593->6993|10652->7028|10784->7123|10800->7129|10867->7172|11137->7405|11167->7412|11608->7816|11637->7835|11678->7837|14232->10358|14284->10373|14310->10389|14351->10391|15129->11136|15666->11636|15682->11642|15761->11697|15891->11790|15907->11796|15973->11839|16049->11878|16065->11884|16130->11926|16206->11965|16222->11971|16281->12007|16357->12046|16373->12052|16454->12110|16532->12151|16548->12157|16613->12199|16689->12238|16705->12244|16773->12289|16849->12328|16865->12334|16937->12383|17013->12422|17029->12428|17097->12473|17173->12512|17189->12518|17254->12560|17330->12599|17346->12605|17418->12654|17494->12693|17510->12699|17581->12747|17646->12775|17680->12786|17796->12865|17812->12871|17871->12907|17947->12946|17963->12952|18024->12990|18100->13029|18116->13035|18186->13082|18262->13121|18278->13127|18343->13169|18492->13281|18508->13287|18562->13318|18708->13427|18724->13433|18807->13493|18889->13538|18905->13544|18968->13584|19083->13662|19099->13668|19156->13702|19422->13939|19452->13940|19719->14178|19749->14179|19834->14235|19864->14236|19931->14274|19961->14275|20142->14427|20172->14428|20304->14531|20334->14532|20388->14557|20418->14558|20462->14573|20492->14574|20536->14589|20566->14590|20676->14671|20706->14672|20771->14708|20801->14709|20844->14723|20874->14724|20925->14746|20955->14747|21054->14817|21084->14818|21203->14908|21233->14909|21280->14927|21310->14928|21510->15099|21540->15100|21614->15145|21644->15146|21788->15261|21818->15262|21892->15307|21922->15308|21977->15334|22007->15335|22081->15380|22111->15381|22166->15407|22196->15408|22270->15453|22300->15454|22355->15480|22385->15481|22459->15526|22489->15527|22544->15553|22574->15554|22648->15599|22678->15600|22755->15648|22785->15649|22852->15687|22882->15688|23134->15911|23164->15912|23220->15939|23250->15940|23331->15992|23361->15993|23406->16009|23436->16010|23481->16026|23511->16027|23580->16067|23610->16068|23725->16154|23755->16155|23852->16223|23882->16224|23954->16267|23984->16268|24068->16323|24098->16324|24170->16367|24200->16368|24251->16390|24281->16391|24460->16541|24490->16542|24569->16592|24599->16593|24677->16642|24707->16643|24885->16792|24915->16793
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|50->21|50->21|50->21|53->24|53->24|53->24|54->25|54->25|54->25|57->28|57->28|57->28|60->31|60->31|60->31|61->32|61->32|61->32|64->35|64->35|64->35|65->36|65->36|65->36|69->40|69->40|69->40|70->41|70->41|70->41|72->43|72->43|72->43|76->47|76->47|76->47|92->63|92->63|92->63|92->63|92->63|92->63|92->63|97->68|97->68|97->68|98->69|98->69|98->69|99->70|99->70|100->71|100->71|100->71|101->72|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|107->78|107->78|107->78|108->79|108->79|108->79|112->83|112->83|112->83|117->88|117->88|117->88|117->88|117->88|117->88|119->90|119->90|119->90|119->90|119->90|119->90|123->94|124->95|124->95|124->95|125->96|125->96|126->97|126->97|126->97|127->98|150->121|150->121|150->121|152->123|152->123|152->123|153->124|153->124|153->124|154->125|154->125|154->125|155->126|155->126|155->126|160->131|160->131|169->140|169->140|169->140|213->184|214->185|214->185|214->185|228->199|241->212|241->212|241->212|244->215|244->215|244->215|245->216|245->216|245->216|246->217|246->217|246->217|247->218|247->218|247->218|249->220|249->220|249->220|250->221|250->221|250->221|251->222|251->222|251->222|252->223|252->223|252->223|253->224|253->224|253->224|254->225|254->225|254->225|255->226|255->226|255->226|257->228|257->228|259->230|259->230|259->230|260->231|260->231|260->231|261->232|261->232|261->232|262->233|262->233|262->233|265->236|265->236|265->236|268->239|268->239|268->239|272->243|272->243|272->243|276->247|276->247|276->247|287->258|287->258|293->264|293->264|295->266|295->266|297->268|297->268|301->272|301->272|305->276|305->276|306->277|306->277|307->278|307->278|308->279|308->279|310->281|310->281|311->282|311->282|312->283|312->283|313->284|313->284|315->286|315->286|317->288|317->288|317->288|317->288|321->292|321->292|323->294|323->294|327->298|327->298|329->300|329->300|329->300|329->300|331->302|331->302|331->302|331->302|333->304|333->304|333->304|333->304|335->306|335->306|335->306|335->306|337->308|337->308|339->310|339->310|341->312|341->312|346->317|346->317|347->318|347->318|349->320|349->320|350->321|350->321|351->322|351->322|353->324|353->324|356->327|356->327|359->330|359->330|361->332|361->332|363->334|363->334|365->336|365->336|369->340|369->340|374->345|374->345|374->345|374->345|375->346|375->346|377->348|377->348
                    -- GENERATED --
                */
            