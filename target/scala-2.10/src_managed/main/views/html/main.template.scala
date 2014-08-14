
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
                """),_display_(Seq[Any](/*116.18*/subjectPresentOr()/*116.36*/ {_display_(Seq[Any](format.raw/*116.38*/("""
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-2">
                                <nav class="nav-sidebar">
                                    <ul class="nav">
                                        <li class="active"><a class="dynamic-link" href=""""),_display_(Seq[Any](/*122.91*/routes/*122.97*/.Application.index())),format.raw/*122.117*/("""">
                                            Popular</a></li>
                                        <li class="nav-divider"></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*125.76*/routes/*125.82*/.SnipCollectionController.mySnips())),format.raw/*125.117*/("""">
                                            Your Snips</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*127.76*/routes/*127.82*/.SniplistCollectionController.mySniplists())),format.raw/*127.125*/("""">
                                            Your Sniplists</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*129.76*/routes/*129.82*/.SnipCollectionController.mySnips())),format.raw/*129.117*/("""">
                                            Saved Snips</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*131.76*/routes/*131.82*/.SniplistCollectionController.mySniplists())),format.raw/*131.125*/("""">
                                            Saved Sniplists</a></li>
                                    </ul>
                                </nav>
                            </div>
                            <div id="wrapper-content" class="col-sm-10">
                                """),_display_(Seq[Any](/*137.34*/content)),format.raw/*137.41*/("""
                            </div>
                        </div>
                    </div>
                """)))}/*141.18*/ {_display_(Seq[Any](format.raw/*141.20*/("""
                    <div id="wrapper-content" class="container">
                        """),_display_(Seq[Any](/*143.26*/content)),format.raw/*143.33*/("""
                    </div>
                """)))})),format.raw/*145.18*/("""
            </div>

        <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
            """),_display_(Seq[Any](/*151.14*/subjectNotPresent()/*151.33*/ {_display_(Seq[Any](format.raw/*151.35*/("""
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
            """)))})),format.raw/*195.14*/("""
            """),_display_(Seq[Any](/*196.14*/subjectPresent()/*196.30*/ {_display_(Seq[Any](format.raw/*196.32*/("""
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
            """)))})),format.raw/*210.14*/("""



                <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

                <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

                <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*223.50*/routes/*223.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*223.111*/(""""></script>

                <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*226.27*/routes/*226.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*226.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*227.27*/routes/*227.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*227.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*228.27*/routes/*228.33*/.Assets.at("js/bootstrap/moment.js"))),format.raw/*228.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*229.27*/routes/*229.33*/.Assets.at("js/bootstrap/bootstrap-datetimepicker.min.js"))),format.raw/*229.91*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*231.27*/routes/*231.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*231.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*232.27*/routes/*232.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*232.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*233.27*/routes/*233.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*233.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*234.27*/routes/*234.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*234.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*235.27*/routes/*235.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*235.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*236.27*/routes/*236.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*236.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*237.27*/routes/*237.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*237.81*/(""""></script>

            """),_display_(Seq[Any](/*239.14*/moreScripts)),format.raw/*239.25*/("""
                <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*241.27*/routes/*241.33*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*241.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*242.27*/routes/*242.33*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*242.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*243.27*/routes/*243.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*243.80*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*244.27*/routes/*244.33*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*244.75*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*247.27*/routes/*247.33*/.Application.javascriptRoutes())),format.raw/*247.64*/("""" type="text/javascript"></script>

                <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*250.27*/routes/*250.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*250.93*/(""""></script>



            <script src=""""),_display_(Seq[Any](/*254.27*/routes/*254.33*/.Assets.at("js/sniplist/dynamicAjax.js"))),format.raw/*254.73*/(""""></script>


                <!-- BLOCK UI -->
            <script src=""""),_display_(Seq[Any](/*258.27*/routes/*258.33*/.Assets.at("js/jquery/blockUI.js"))),format.raw/*258.67*/(""""></script>


            <script type="text/javascript" charset="utf-8">

            //GLOBAL MEDIA PLAYER
            var globalPlayer;

            var globalAudioPlayer;

            // Portfolio
            (function($) """),format.raw/*269.26*/("""{"""),format.raw/*269.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*275.61*/("""{"""),format.raw/*275.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*277.13*/("""}"""),format.raw/*277.14*/("""

            /* $container.isotope("""),format.raw/*279.35*/("""{"""),format.raw/*279.36*/("""
             filter: '*',
             animationEngine: 'best-available',
             layoutMode: portfolioLayout,
             animationOptions: """),format.raw/*283.32*/("""{"""),format.raw/*283.33*/("""
             duration: 750,
             easing: 'linear',
             queue: false
             """),format.raw/*287.14*/("""}"""),format.raw/*287.15*/(""",
             masonry: """),format.raw/*288.23*/("""{"""),format.raw/*288.24*/("""
             """),format.raw/*289.14*/("""}"""),format.raw/*289.15*/("""
             """),format.raw/*290.14*/("""}"""),format.raw/*290.15*/(""", refreshWaypoints());
             */
            function refreshWaypoints() """),format.raw/*292.41*/("""{"""),format.raw/*292.42*/("""
            setTimeout(function() """),format.raw/*293.35*/("""{"""),format.raw/*293.36*/("""
            """),format.raw/*294.13*/("""}"""),format.raw/*294.14*/(""", 1000);
            """),format.raw/*295.13*/("""}"""),format.raw/*295.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*297.67*/("""{"""),format.raw/*297.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*299.32*/("""{"""),format.raw/*299.33*/(""" filter: selector """),format.raw/*299.51*/("""}"""),format.raw/*299.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*303.13*/("""}"""),format.raw/*303.14*/(""");

            function getColumnNumber() """),format.raw/*305.40*/("""{"""),format.raw/*305.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*309.34*/("""{"""),format.raw/*309.35*/("""
            columnNumber = 5;
            """),format.raw/*311.13*/("""}"""),format.raw/*311.14*/(""" else if (winWidth > 950) """),format.raw/*311.40*/("""{"""),format.raw/*311.41*/("""
            columnNumber = 4;
            """),format.raw/*313.13*/("""}"""),format.raw/*313.14*/(""" else if (winWidth > 600) """),format.raw/*313.40*/("""{"""),format.raw/*313.41*/("""
            columnNumber = 3;
            """),format.raw/*315.13*/("""}"""),format.raw/*315.14*/(""" else if (winWidth > 400) """),format.raw/*315.40*/("""{"""),format.raw/*315.41*/("""
            columnNumber = 2;
            """),format.raw/*317.13*/("""}"""),format.raw/*317.14*/(""" else if (winWidth > 250) """),format.raw/*317.40*/("""{"""),format.raw/*317.41*/("""
            columnNumber = 1;
            """),format.raw/*319.13*/("""}"""),format.raw/*319.14*/("""
            return columnNumber;
            """),format.raw/*321.13*/("""}"""),format.raw/*321.14*/("""

            function setColumns() """),format.raw/*323.35*/("""{"""),format.raw/*323.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*328.64*/("""{"""),format.raw/*328.65*/("""
            $(this).css( """),format.raw/*329.26*/("""{"""),format.raw/*329.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*331.13*/("""}"""),format.raw/*331.14*/(""");
            """),format.raw/*332.13*/("""}"""),format.raw/*332.14*/(""");
            """),format.raw/*333.13*/("""}"""),format.raw/*333.14*/("""

            function setPortfolio() """),format.raw/*335.37*/("""{"""),format.raw/*335.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*338.13*/("""}"""),format.raw/*338.14*/("""

            /*
            $container.imagesLoaded(function () """),format.raw/*341.49*/("""{"""),format.raw/*341.50*/("""
            setPortfolio();
            """),format.raw/*343.13*/("""}"""),format.raw/*343.14*/(""");*/

            $(window).on('resize', function () """),format.raw/*345.48*/("""{"""),format.raw/*345.49*/("""
            setPortfolio();
            """),format.raw/*347.13*/("""}"""),format.raw/*347.14*/(""");



            """),format.raw/*351.13*/("""}"""),format.raw/*351.14*/(""")(jQuery);
            </script>

                <!-- Google Analytics Tracking JS -->
            <script>
            (function(i,s,o,g,r,a,m)"""),format.raw/*356.37*/("""{"""),format.raw/*356.38*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*356.88*/("""{"""),format.raw/*356.89*/("""
            (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*357.48*/("""}"""),format.raw/*357.49*/(""",i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            """),format.raw/*359.13*/("""}"""),format.raw/*359.14*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

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
                    DATE: Wed Aug 13 18:41:07 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 20ffd71c4e9a0dfb64c1b7ed4123602fa210d230
                    MATRIX: 790->1|1068->79|1098->190|1171->228|1185->234|1213->241|1289->281|1316->286|1774->708|1789->714|1846->749|1958->825|1973->831|2026->862|2108->908|2123->914|2183->952|2315->1048|2330->1054|2385->1087|2519->1185|2534->1191|2583->1218|2665->1264|2680->1270|2740->1308|2881->1413|2896->1419|2948->1449|3030->1495|3045->1501|3099->1533|3234->1632|3249->1638|3311->1678|3396->1727|3411->1733|3465->1765|3555->1819|3570->1825|3633->1866|3909->2106|3924->2112|3974->2140|4716->2846|4741->2862|4780->2863|4825->2876|4883->2898|4898->2904|4941->2924|5260->3207|5287->3225|5327->3227|5398->3262|5417->3272|5498->3330|5548->3361|5588->3363|5659->3398|5678->3408|5754->3462|5817->3493|5884->3524|5912->3543|5952->3545|6023->3580|6042->3590|6119->3645|6190->3680|6209->3690|6291->3749|6354->3780|6423->3813|6450->3831|6490->3833|6561->3868|6615->3913|6663->3923|6992->4216|7005->4220|7047->4239|7365->4521|7380->4527|7425->4549|7465->4552|7522->4599|7559->4613|7743->4761|7755->4764|7839->4825|7904->4853|7960->4899|7997->4913|8215->5099|8286->5134|8305->5144|8381->5198|8431->5229|8470->5230|8541->5265|8560->5275|8640->5332|8703->5363|9596->6219|9624->6237|9665->6239|10047->6584|10063->6590|10107->6610|10356->6822|10372->6828|10431->6863|10612->7007|10628->7013|10695->7056|10880->7204|10896->7210|10955->7245|11137->7390|11153->7396|11220->7439|11557->7739|11587->7746|11722->7861|11763->7863|11893->7956|11923->7963|12003->8010|12352->8322|12381->8341|12422->8343|14976->10864|15028->10879|15054->10895|15095->10897|15873->11642|16410->12142|16426->12148|16505->12203|16635->12296|16651->12302|16717->12345|16793->12384|16809->12390|16874->12432|16950->12471|16966->12477|17025->12513|17101->12552|17117->12558|17198->12616|17276->12657|17292->12663|17357->12705|17433->12744|17449->12750|17517->12795|17593->12834|17609->12840|17681->12889|17757->12928|17773->12934|17841->12979|17917->13018|17933->13024|17998->13066|18074->13105|18090->13111|18162->13160|18238->13199|18254->13205|18325->13253|18390->13281|18424->13292|18540->13371|18556->13377|18615->13413|18691->13452|18707->13458|18768->13496|18844->13535|18860->13541|18930->13588|19006->13627|19022->13633|19087->13675|19236->13787|19252->13793|19306->13824|19452->13933|19468->13939|19551->13999|19633->14044|19649->14050|19712->14090|19827->14168|19843->14174|19900->14208|20166->14445|20196->14446|20463->14684|20493->14685|20578->14741|20608->14742|20675->14780|20705->14781|20886->14933|20916->14934|21048->15037|21078->15038|21132->15063|21162->15064|21206->15079|21236->15080|21280->15095|21310->15096|21420->15177|21450->15178|21515->15214|21545->15215|21588->15229|21618->15230|21669->15252|21699->15253|21798->15323|21828->15324|21947->15414|21977->15415|22024->15433|22054->15434|22254->15605|22284->15606|22358->15651|22388->15652|22532->15767|22562->15768|22636->15813|22666->15814|22721->15840|22751->15841|22825->15886|22855->15887|22910->15913|22940->15914|23014->15959|23044->15960|23099->15986|23129->15987|23203->16032|23233->16033|23288->16059|23318->16060|23392->16105|23422->16106|23499->16154|23529->16155|23596->16193|23626->16194|23878->16417|23908->16418|23964->16445|23994->16446|24075->16498|24105->16499|24150->16515|24180->16516|24225->16532|24255->16533|24324->16573|24354->16574|24469->16660|24499->16661|24596->16729|24626->16730|24698->16773|24728->16774|24812->16829|24842->16830|24914->16873|24944->16874|24995->16896|25025->16897|25204->17047|25234->17048|25313->17098|25343->17099|25421->17148|25451->17149|25629->17298|25659->17299
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|50->21|50->21|50->21|53->24|53->24|53->24|54->25|54->25|54->25|57->28|57->28|57->28|60->31|60->31|60->31|61->32|61->32|61->32|64->35|64->35|64->35|65->36|65->36|65->36|69->40|69->40|69->40|70->41|70->41|70->41|72->43|72->43|72->43|76->47|76->47|76->47|92->63|92->63|92->63|92->63|92->63|92->63|92->63|97->68|97->68|97->68|98->69|98->69|98->69|99->70|99->70|100->71|100->71|100->71|101->72|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|107->78|107->78|107->78|108->79|108->79|108->79|112->83|112->83|112->83|117->88|117->88|117->88|117->88|117->88|117->88|119->90|119->90|119->90|119->90|119->90|119->90|123->94|124->95|124->95|124->95|125->96|125->96|126->97|126->97|126->97|127->98|145->116|145->116|145->116|151->122|151->122|151->122|154->125|154->125|154->125|156->127|156->127|156->127|158->129|158->129|158->129|160->131|160->131|160->131|166->137|166->137|170->141|170->141|172->143|172->143|174->145|180->151|180->151|180->151|224->195|225->196|225->196|225->196|239->210|252->223|252->223|252->223|255->226|255->226|255->226|256->227|256->227|256->227|257->228|257->228|257->228|258->229|258->229|258->229|260->231|260->231|260->231|261->232|261->232|261->232|262->233|262->233|262->233|263->234|263->234|263->234|264->235|264->235|264->235|265->236|265->236|265->236|266->237|266->237|266->237|268->239|268->239|270->241|270->241|270->241|271->242|271->242|271->242|272->243|272->243|272->243|273->244|273->244|273->244|276->247|276->247|276->247|279->250|279->250|279->250|283->254|283->254|283->254|287->258|287->258|287->258|298->269|298->269|304->275|304->275|306->277|306->277|308->279|308->279|312->283|312->283|316->287|316->287|317->288|317->288|318->289|318->289|319->290|319->290|321->292|321->292|322->293|322->293|323->294|323->294|324->295|324->295|326->297|326->297|328->299|328->299|328->299|328->299|332->303|332->303|334->305|334->305|338->309|338->309|340->311|340->311|340->311|340->311|342->313|342->313|342->313|342->313|344->315|344->315|344->315|344->315|346->317|346->317|346->317|346->317|348->319|348->319|350->321|350->321|352->323|352->323|357->328|357->328|358->329|358->329|360->331|360->331|361->332|361->332|362->333|362->333|364->335|364->335|367->338|367->338|370->341|370->341|372->343|372->343|374->345|374->345|376->347|376->347|380->351|380->351|385->356|385->356|385->356|385->356|386->357|386->357|388->359|388->359
                    -- GENERATED --
                */
            