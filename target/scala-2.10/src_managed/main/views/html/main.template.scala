
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
            <link href=""""),_display_(Seq[Any](/*25.26*/routes/*25.32*/.Assets.at("css/bootstrap-datetimepicker.min.css"))),format.raw/*25.82*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*26.26*/routes/*26.32*/.Assets.at("css/font-awesome.min.css"))),format.raw/*26.70*/("""" rel="stylesheet">

                <!-- Social Media Icon CSS -->
            <link href=""""),_display_(Seq[Any](/*29.26*/routes/*29.32*/.Assets.at("css/transparent.css"))),format.raw/*29.65*/("""" rel="stylesheet"/>

                <!-- Custom Sniplist Styles -->
            <link href=""""),_display_(Seq[Any](/*32.26*/routes/*32.32*/.Assets.at("css/style.css"))),format.raw/*32.59*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*33.26*/routes/*33.32*/.Assets.at("css/responsive-video.css"))),format.raw/*33.70*/("""" rel="stylesheet">

                <!-- Custom styles for TableclothJs -->
            <link href=""""),_display_(Seq[Any](/*36.26*/routes/*36.32*/.Assets.at("css/prettify.css"))),format.raw/*36.62*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*37.26*/routes/*37.32*/.Assets.at("css/tablecloth.css"))),format.raw/*37.64*/("""" rel="stylesheet">


                <!-- Styles for MediaElementJs
            <link  href=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.Assets.at("css/mediaelementplayer.css"))),format.raw/*41.73*/("""" rel="Stylesheet" />
            <link  href=""""),_display_(Seq[Any](/*42.27*/routes/*42.33*/.Assets.at("css/mejs-skins.css"))),format.raw/*42.65*/("""" rel="Stylesheet" />-->

            <link  href=""""),_display_(Seq[Any](/*44.27*/routes/*44.33*/.Assets.at("css/audio-sniplist-skin.css"))),format.raw/*44.74*/("""" rel="Stylesheet" />

                <!-- JQueryUI CSS -->
            <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
            <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*48.59*/routes/*48.65*/.Assets.at("css/iThing.css"))),format.raw/*48.93*/("""">

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
                        <a class=""""),_display_(Seq[Any](/*64.36*/subjectPresent()/*64.52*/{_display_(Seq[Any](format.raw/*64.53*/("""dynamic-link""")))})),format.raw/*64.66*/(""" navbar-brand" href=""""),_display_(Seq[Any](/*64.88*/routes/*64.94*/.Application.index())),format.raw/*64.114*/("""">SNIPLIST.</a>
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*69.30*/subjectPresentOr()/*69.48*/ {_display_(Seq[Any](format.raw/*69.50*/("""
                                """),_display_(Seq[Any](/*70.34*/generators/*70.44*/.navbarMenu(routes.SnipController.add(), "ADD SNIP", true))),format.raw/*70.102*/("""
                            """)))}/*71.30*/ {_display_(Seq[Any](format.raw/*71.32*/("""
                                """),_display_(Seq[Any](/*72.34*/generators/*72.44*/.navbarMenu(routes.Application.index(), "HOME", false))),format.raw/*72.98*/("""
                            """)))})),format.raw/*73.30*/("""
                            """),_display_(Seq[Any](/*74.30*/subjectNotPresent()/*74.49*/ {_display_(Seq[Any](format.raw/*74.51*/("""
                                """),_display_(Seq[Any](/*75.34*/generators/*75.44*/.navbarMenu(routes.Application.about(), "ABOUT", false))),format.raw/*75.99*/("""
                                """),_display_(Seq[Any](/*76.34*/generators/*76.44*/.navbarMenu(routes.Application.contact(), "CONTACT", false))),format.raw/*76.103*/("""
                            """)))})),format.raw/*77.30*/("""

                            """),_display_(Seq[Any](/*79.30*/subjectPresentOr()/*79.48*/ {_display_(Seq[Any](format.raw/*79.50*/("""
                                """),_display_(Seq[Any](/*80.34*/defining(Application.getLocalUser(session()))/*80.79*/ { user =>_display_(Seq[Any](format.raw/*80.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="fa fa-user"></i> """),_display_(Seq[Any](/*84.77*/user/*84.81*/.name.toUpperCase())),format.raw/*84.100*/("""
                                            <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*89.84*/routes/*89.90*/.Application.profile())),format.raw/*89.112*/("""">"""),_display_(Seq[Any](/*89.115*/Messages("playauthenticate.navigation.profile")/*89.162*/.toUpperCase())),format.raw/*89.176*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*91.63*/com/*91.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*91.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*91.155*/Messages("playauthenticate.navigation.logout")/*91.201*/.toUpperCase())),format.raw/*91.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*95.34*/("""
                                """),_display_(Seq[Any](/*96.34*/generators/*96.44*/.navbarMenu(routes.Application.about(), "ABOUT", true))),format.raw/*96.98*/("""
                            """)))}/*97.30*/{_display_(Seq[Any](format.raw/*97.31*/("""
                                """),_display_(Seq[Any](/*98.34*/generators/*98.44*/.navbarMenu(routes.Application.login(), "SIGN IN", false))),format.raw/*98.101*/("""
                            """)))})),format.raw/*99.30*/("""

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
                """),_display_(Seq[Any](/*117.18*/subjectPresentOr()/*117.36*/ {_display_(Seq[Any](format.raw/*117.38*/("""
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-2">
                                <nav class="nav-sidebar">
                                    <ul class="nav">
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*123.76*/routes/*123.82*/.Application.popular())),format.raw/*123.104*/("""">
                                            Popular</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*125.76*/routes/*125.82*/.Application.recent())),format.raw/*125.103*/("""">
                                            Recent</a></li>
                                        <li class="nav-divider"></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*128.76*/routes/*128.82*/.SnipCollectionController.mySnips())),format.raw/*128.117*/("""">
                                            Your Snips</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*130.76*/routes/*130.82*/.SniplistCollectionController.mySniplists())),format.raw/*130.125*/("""">
                                            Your Sniplists</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*132.76*/routes/*132.82*/.SnipCollectionController.favouritedSnips())),format.raw/*132.125*/("""">
                                            Saved Snips</a></li>
                                        <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*134.76*/routes/*134.82*/.SniplistCollectionController.favouritedSniplists())),format.raw/*134.133*/("""">
                                            Saved Sniplists</a></li>
                                    </ul>
                                </nav>
                            </div>
                            <div id="wrapper-content" class="col-sm-10">
                                """),_display_(Seq[Any](/*140.34*/content)),format.raw/*140.41*/("""
                            </div>
                        </div>
                    </div>
                """)))}/*144.18*/ {_display_(Seq[Any](format.raw/*144.20*/("""
                    <div id="wrapper-content" class="container">
                        """),_display_(Seq[Any](/*146.26*/content)),format.raw/*146.33*/("""
                    </div>
                """)))})),format.raw/*148.18*/("""
            </div>

        <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
            """),_display_(Seq[Any](/*154.14*/subjectNotPresent()/*154.33*/ {_display_(Seq[Any](format.raw/*154.35*/("""
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
            """)))})),format.raw/*198.14*/("""
            """),_display_(Seq[Any](/*199.14*/subjectPresent()/*199.30*/ {_display_(Seq[Any](format.raw/*199.32*/("""
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
            """)))})),format.raw/*213.14*/("""



                <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

                <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

                <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*226.50*/routes/*226.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*226.111*/(""""></script>



            <script src=""""),_display_(Seq[Any](/*230.27*/routes/*230.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*230.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*231.27*/routes/*231.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*231.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*232.27*/routes/*232.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*232.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*233.27*/routes/*233.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*233.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*234.27*/routes/*234.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*234.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*235.27*/routes/*235.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*235.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*236.27*/routes/*236.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*236.81*/(""""></script>

                <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*239.27*/routes/*239.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*239.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*240.27*/routes/*240.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*240.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*241.27*/routes/*241.33*/.Assets.at("js/bootstrap/moment.js"))),format.raw/*241.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*242.27*/routes/*242.33*/.Assets.at("js/bootstrap/bootstrap-datetimepicker.min.js"))),format.raw/*242.91*/(""""></script>

            """),_display_(Seq[Any](/*244.14*/moreScripts)),format.raw/*244.25*/("""
                <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*246.27*/routes/*246.33*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*246.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*247.27*/routes/*247.33*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*247.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*248.27*/routes/*248.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*248.80*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*249.27*/routes/*249.33*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*249.75*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*252.27*/routes/*252.33*/.Application.javascriptRoutes())),format.raw/*252.64*/("""" type="text/javascript"></script>

                <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*255.27*/routes/*255.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*255.93*/(""""></script>



            <script src=""""),_display_(Seq[Any](/*259.27*/routes/*259.33*/.Assets.at("js/sniplist/dynamicAjax.js"))),format.raw/*259.73*/(""""></script>


                <!-- BLOCK UI -->
            <script src=""""),_display_(Seq[Any](/*263.27*/routes/*263.33*/.Assets.at("js/jquery/blockUI.js"))),format.raw/*263.67*/(""""></script>


            <script type="text/javascript" charset="utf-8">

            //GLOBAL MEDIA PLAYER
            var globalPlayer;

            var globalAudioPlayer;

            // Portfolio
            (function($) """),format.raw/*274.26*/("""{"""),format.raw/*274.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*280.61*/("""{"""),format.raw/*280.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*282.13*/("""}"""),format.raw/*282.14*/("""

            /* $container.isotope("""),format.raw/*284.35*/("""{"""),format.raw/*284.36*/("""
             filter: '*',
             animationEngine: 'best-available',
             layoutMode: portfolioLayout,
             animationOptions: """),format.raw/*288.32*/("""{"""),format.raw/*288.33*/("""
             duration: 750,
             easing: 'linear',
             queue: false
             """),format.raw/*292.14*/("""}"""),format.raw/*292.15*/(""",
             masonry: """),format.raw/*293.23*/("""{"""),format.raw/*293.24*/("""
             """),format.raw/*294.14*/("""}"""),format.raw/*294.15*/("""
             """),format.raw/*295.14*/("""}"""),format.raw/*295.15*/(""", refreshWaypoints());
             */
            function refreshWaypoints() """),format.raw/*297.41*/("""{"""),format.raw/*297.42*/("""
            setTimeout(function() """),format.raw/*298.35*/("""{"""),format.raw/*298.36*/("""
            """),format.raw/*299.13*/("""}"""),format.raw/*299.14*/(""", 1000);
            """),format.raw/*300.13*/("""}"""),format.raw/*300.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*302.67*/("""{"""),format.raw/*302.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*304.32*/("""{"""),format.raw/*304.33*/(""" filter: selector """),format.raw/*304.51*/("""}"""),format.raw/*304.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*308.13*/("""}"""),format.raw/*308.14*/(""");

            function getColumnNumber() """),format.raw/*310.40*/("""{"""),format.raw/*310.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*314.34*/("""{"""),format.raw/*314.35*/("""
            columnNumber = 5;
            """),format.raw/*316.13*/("""}"""),format.raw/*316.14*/(""" else if (winWidth > 950) """),format.raw/*316.40*/("""{"""),format.raw/*316.41*/("""
            columnNumber = 4;
            """),format.raw/*318.13*/("""}"""),format.raw/*318.14*/(""" else if (winWidth > 600) """),format.raw/*318.40*/("""{"""),format.raw/*318.41*/("""
            columnNumber = 3;
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""" else if (winWidth > 400) """),format.raw/*320.40*/("""{"""),format.raw/*320.41*/("""
            columnNumber = 2;
            """),format.raw/*322.13*/("""}"""),format.raw/*322.14*/(""" else if (winWidth > 250) """),format.raw/*322.40*/("""{"""),format.raw/*322.41*/("""
            columnNumber = 1;
            """),format.raw/*324.13*/("""}"""),format.raw/*324.14*/("""
            return columnNumber;
            """),format.raw/*326.13*/("""}"""),format.raw/*326.14*/("""

            function setColumns() """),format.raw/*328.35*/("""{"""),format.raw/*328.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*333.64*/("""{"""),format.raw/*333.65*/("""
            $(this).css( """),format.raw/*334.26*/("""{"""),format.raw/*334.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*336.13*/("""}"""),format.raw/*336.14*/(""");
            """),format.raw/*337.13*/("""}"""),format.raw/*337.14*/(""");
            """),format.raw/*338.13*/("""}"""),format.raw/*338.14*/("""

            function setPortfolio() """),format.raw/*340.37*/("""{"""),format.raw/*340.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*343.13*/("""}"""),format.raw/*343.14*/("""

            /*
            $container.imagesLoaded(function () """),format.raw/*346.49*/("""{"""),format.raw/*346.50*/("""
            setPortfolio();
            """),format.raw/*348.13*/("""}"""),format.raw/*348.14*/(""");*/

            $(window).on('resize', function () """),format.raw/*350.48*/("""{"""),format.raw/*350.49*/("""
            setPortfolio();
            """),format.raw/*352.13*/("""}"""),format.raw/*352.14*/(""");



            """),format.raw/*356.13*/("""}"""),format.raw/*356.14*/(""")(jQuery);
            </script>

                <!-- Google Analytics Tracking JS -->
            <script>
            (function(i,s,o,g,r,a,m)"""),format.raw/*361.37*/("""{"""),format.raw/*361.38*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*361.88*/("""{"""),format.raw/*361.89*/("""
            (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*362.48*/("""}"""),format.raw/*362.49*/(""",i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            """),format.raw/*364.13*/("""}"""),format.raw/*364.14*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

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
                    DATE: Wed Aug 20 17:19:32 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 821b5d727bf5602f168719ef8a02256c82bbbc6e
                    MATRIX: 790->1|1068->79|1098->190|1171->228|1185->234|1213->241|1289->281|1316->286|1774->708|1789->714|1846->749|1958->825|1973->831|2026->862|2108->908|2123->914|2195->964|2277->1010|2292->1016|2352->1054|2484->1150|2499->1156|2554->1189|2688->1287|2703->1293|2752->1320|2834->1366|2849->1372|2909->1410|3050->1515|3065->1521|3117->1551|3199->1597|3214->1603|3268->1635|3403->1734|3418->1740|3480->1780|3565->1829|3580->1835|3634->1867|3724->1921|3739->1927|3802->1968|4078->2208|4093->2214|4143->2242|4885->2948|4910->2964|4949->2965|4994->2978|5052->3000|5067->3006|5110->3026|5429->3309|5456->3327|5496->3329|5567->3364|5586->3374|5667->3432|5717->3463|5757->3465|5828->3500|5847->3510|5923->3564|5986->3595|6053->3626|6081->3645|6121->3647|6192->3682|6211->3692|6288->3747|6359->3782|6378->3792|6460->3851|6523->3882|6592->3915|6619->3933|6659->3935|6730->3970|6784->4015|6832->4025|7161->4318|7174->4322|7216->4341|7534->4623|7549->4629|7594->4651|7634->4654|7691->4701|7728->4715|7912->4863|7924->4866|8008->4927|8073->4955|8129->5001|8166->5015|8384->5201|8455->5236|8474->5246|8550->5300|8600->5331|8639->5332|8710->5367|8729->5377|8809->5434|8872->5465|9765->6321|9793->6339|9834->6341|10201->6671|10217->6677|10263->6699|10441->6840|10457->6846|10502->6867|10750->7078|10766->7084|10825->7119|11006->7263|11022->7269|11089->7312|11274->7460|11290->7466|11357->7509|11539->7654|11555->7660|11630->7711|11967->8011|11997->8018|12132->8133|12173->8135|12303->8228|12333->8235|12413->8282|12762->8594|12791->8613|12832->8615|15386->11136|15438->11151|15464->11167|15505->11169|16283->11914|16820->12414|16836->12420|16915->12475|16997->12520|17013->12526|17078->12568|17154->12607|17170->12613|17238->12658|17314->12697|17330->12703|17402->12752|17478->12791|17494->12797|17562->12842|17638->12881|17654->12887|17719->12929|17795->12968|17811->12974|17883->13023|17959->13062|17975->13068|18046->13116|18176->13209|18192->13215|18258->13258|18334->13297|18350->13303|18415->13345|18491->13384|18507->13390|18566->13426|18642->13465|18658->13471|18739->13529|18804->13557|18838->13568|18954->13647|18970->13653|19029->13689|19105->13728|19121->13734|19182->13772|19258->13811|19274->13817|19344->13864|19420->13903|19436->13909|19501->13951|19650->14063|19666->14069|19720->14100|19866->14209|19882->14215|19965->14275|20047->14320|20063->14326|20126->14366|20241->14444|20257->14450|20314->14484|20580->14721|20610->14722|20877->14960|20907->14961|20992->15017|21022->15018|21089->15056|21119->15057|21300->15209|21330->15210|21462->15313|21492->15314|21546->15339|21576->15340|21620->15355|21650->15356|21694->15371|21724->15372|21834->15453|21864->15454|21929->15490|21959->15491|22002->15505|22032->15506|22083->15528|22113->15529|22212->15599|22242->15600|22361->15690|22391->15691|22438->15709|22468->15710|22668->15881|22698->15882|22772->15927|22802->15928|22946->16043|22976->16044|23050->16089|23080->16090|23135->16116|23165->16117|23239->16162|23269->16163|23324->16189|23354->16190|23428->16235|23458->16236|23513->16262|23543->16263|23617->16308|23647->16309|23702->16335|23732->16336|23806->16381|23836->16382|23913->16430|23943->16431|24010->16469|24040->16470|24292->16693|24322->16694|24378->16721|24408->16722|24489->16774|24519->16775|24564->16791|24594->16792|24639->16808|24669->16809|24738->16849|24768->16850|24883->16936|24913->16937|25010->17005|25040->17006|25112->17049|25142->17050|25226->17105|25256->17106|25328->17149|25358->17150|25409->17172|25439->17173|25618->17323|25648->17324|25727->17374|25757->17375|25835->17424|25865->17425|26043->17574|26073->17575
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|50->21|50->21|50->21|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|58->29|58->29|58->29|61->32|61->32|61->32|62->33|62->33|62->33|65->36|65->36|65->36|66->37|66->37|66->37|70->41|70->41|70->41|71->42|71->42|71->42|73->44|73->44|73->44|77->48|77->48|77->48|93->64|93->64|93->64|93->64|93->64|93->64|93->64|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|101->72|101->72|101->72|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|108->79|108->79|108->79|109->80|109->80|109->80|113->84|113->84|113->84|118->89|118->89|118->89|118->89|118->89|118->89|120->91|120->91|120->91|120->91|120->91|120->91|124->95|125->96|125->96|125->96|126->97|126->97|127->98|127->98|127->98|128->99|146->117|146->117|146->117|152->123|152->123|152->123|154->125|154->125|154->125|157->128|157->128|157->128|159->130|159->130|159->130|161->132|161->132|161->132|163->134|163->134|163->134|169->140|169->140|173->144|173->144|175->146|175->146|177->148|183->154|183->154|183->154|227->198|228->199|228->199|228->199|242->213|255->226|255->226|255->226|259->230|259->230|259->230|260->231|260->231|260->231|261->232|261->232|261->232|262->233|262->233|262->233|263->234|263->234|263->234|264->235|264->235|264->235|265->236|265->236|265->236|268->239|268->239|268->239|269->240|269->240|269->240|270->241|270->241|270->241|271->242|271->242|271->242|273->244|273->244|275->246|275->246|275->246|276->247|276->247|276->247|277->248|277->248|277->248|278->249|278->249|278->249|281->252|281->252|281->252|284->255|284->255|284->255|288->259|288->259|288->259|292->263|292->263|292->263|303->274|303->274|309->280|309->280|311->282|311->282|313->284|313->284|317->288|317->288|321->292|321->292|322->293|322->293|323->294|323->294|324->295|324->295|326->297|326->297|327->298|327->298|328->299|328->299|329->300|329->300|331->302|331->302|333->304|333->304|333->304|333->304|337->308|337->308|339->310|339->310|343->314|343->314|345->316|345->316|345->316|345->316|347->318|347->318|347->318|347->318|349->320|349->320|349->320|349->320|351->322|351->322|351->322|351->322|353->324|353->324|355->326|355->326|357->328|357->328|362->333|362->333|363->334|363->334|365->336|365->336|366->337|366->337|367->338|367->338|369->340|369->340|372->343|372->343|375->346|375->346|377->348|377->348|379->350|379->350|381->352|381->352|385->356|385->356|390->361|390->361|390->361|390->361|391->362|391->362|393->364|393->364
                    -- GENERATED --
                */
            