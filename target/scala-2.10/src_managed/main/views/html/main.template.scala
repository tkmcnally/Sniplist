
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
                            <!-- """),_display_(Seq[Any](/*64.35*/subjectPresent()/*64.51*/ {_display_(Seq[Any](format.raw/*64.53*/("""
                        <form class="navbar-form navbar-left" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Search">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                    """)))})),format.raw/*71.22*/("""-->
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*76.30*/subjectPresentOr()/*76.48*/ {_display_(Seq[Any](format.raw/*76.50*/("""
                                """),_display_(Seq[Any](/*77.34*/generators/*77.44*/.navbarMenu(routes.SnipController.add(), "ADD SNIP", true))),format.raw/*77.102*/("""
                                """),_display_(Seq[Any](/*78.34*/generators/*78.44*/.navbarMenu(routes.SnipCollectionController.mySnips(), "MY SNIPS", true))),format.raw/*78.116*/("""
                                """),_display_(Seq[Any](/*79.34*/generators/*79.44*/.navbarMenu(routes.SniplistController.viewSniplists(), "MY SNIPLISTS", true))),format.raw/*79.120*/("""
                            """)))}/*80.30*/ {_display_(Seq[Any](format.raw/*80.32*/("""
                                """),_display_(Seq[Any](/*81.34*/generators/*81.44*/.navbarMenu(routes.Application.index(), "HOME", false))),format.raw/*81.98*/("""
                            """)))})),format.raw/*82.30*/("""
                            """),_display_(Seq[Any](/*83.30*/subjectNotPresent()/*83.49*/ {_display_(Seq[Any](format.raw/*83.51*/("""
                                """),_display_(Seq[Any](/*84.34*/generators/*84.44*/.navbarMenu(routes.Application.about(), "ABOUT", false))),format.raw/*84.99*/("""
                                """),_display_(Seq[Any](/*85.34*/generators/*85.44*/.navbarMenu(routes.Application.contact(), "CONTACT", false))),format.raw/*85.103*/("""
                            """)))})),format.raw/*86.30*/("""

                            """),_display_(Seq[Any](/*88.30*/subjectPresentOr()/*88.48*/ {_display_(Seq[Any](format.raw/*88.50*/("""
                                """),_display_(Seq[Any](/*89.34*/defining(Application.getLocalUser(session()))/*89.79*/ { user =>_display_(Seq[Any](format.raw/*89.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="icon-user"></i> """),_display_(Seq[Any](/*93.76*/user/*93.80*/.name.toUpperCase())),format.raw/*93.99*/("""
                                            <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*98.84*/routes/*98.90*/.Application.profile())),format.raw/*98.112*/("""">"""),_display_(Seq[Any](/*98.115*/Messages("playauthenticate.navigation.profile")/*98.162*/.toUpperCase())),format.raw/*98.176*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*100.63*/com/*100.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*100.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*100.155*/Messages("playauthenticate.navigation.logout")/*100.201*/.toUpperCase())),format.raw/*100.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*104.34*/("""
                                """),_display_(Seq[Any](/*105.34*/generators/*105.44*/.navbarMenu(routes.Application.about(), "ABOUT", true))),format.raw/*105.98*/("""
                            """)))}/*106.30*/{_display_(Seq[Any](format.raw/*106.31*/("""

                                """),_display_(Seq[Any](/*108.34*/generators/*108.44*/.navbarMenu(routes.Application.login(), "SIGN IN", false))),format.raw/*108.101*/("""
                            """)))})),format.raw/*109.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <div id="wrapper-content" class="mtb">
                """),_display_(Seq[Any](/*117.18*/content)),format.raw/*117.25*/("""
        </div>

                <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
            """),_display_(Seq[Any](/*123.14*/subjectNotPresent()/*123.33*/ {_display_(Seq[Any](format.raw/*123.35*/("""
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
                                        <span class="icon-stack icon-2x">
                                            <i class="icon-circle icon-stack-base ins-color"></i>
                                            <i class="icon-instagram icon-light"></i>
                                        </span>
                                    </a>
                                    <a href="http://www.twitter.com">
                                        <span class="icon-stack icon-2x">
                                            <i class="icon-circle icon-stack-base tw-color"></i>
                                            <i class="icon-twitter icon-light"></i>
                                        </span>
                                    </a>
                                    <a href="http://www.facebook.com">
                                        <span class="icon-stack icon-2x">
                                            <i class="icon-circle icon-stack-base fa-color"></i>
                                            <i class="icon-facebook icon-light"></i>
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
            """)))})),format.raw/*167.14*/("""
            """),_display_(Seq[Any](/*168.14*/subjectPresent()/*168.30*/ {_display_(Seq[Any](format.raw/*168.32*/("""
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
            """)))})),format.raw/*182.14*/("""



                <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

                <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

                <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*195.50*/routes/*195.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*195.111*/(""""></script>

                <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*198.27*/routes/*198.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*198.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*199.27*/routes/*199.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*199.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*200.27*/routes/*200.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*200.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*201.27*/routes/*201.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*201.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*202.27*/routes/*202.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*202.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*203.27*/routes/*203.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*203.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*204.27*/routes/*204.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*204.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*205.27*/routes/*205.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*205.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*206.27*/routes/*206.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*206.81*/(""""></script>

            """),_display_(Seq[Any](/*208.14*/moreScripts)),format.raw/*208.25*/("""
                <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*210.27*/routes/*210.33*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*210.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*211.27*/routes/*211.33*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*211.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*212.27*/routes/*212.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*212.80*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*213.27*/routes/*213.33*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*213.75*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*216.27*/routes/*216.33*/.Application.javascriptRoutes())),format.raw/*216.64*/("""" type="text/javascript"></script>

                <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*219.27*/routes/*219.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*219.93*/(""""></script>



            <script src=""""),_display_(Seq[Any](/*223.27*/routes/*223.33*/.Assets.at("js/sniplist/dynamicAjax.js"))),format.raw/*223.73*/(""""></script>


                <!-- BLOCK UI -->
            <script src=""""),_display_(Seq[Any](/*227.27*/routes/*227.33*/.Assets.at("js/jquery/blockUI.js"))),format.raw/*227.67*/(""""></script>


            <script type="text/javascript" charset="utf-8">

            //GLOBAL MEDIA PLAYER
            var globalPlayer;

            var globalAudioPlayer;

            // Portfolio
            (function($) """),format.raw/*238.26*/("""{"""),format.raw/*238.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*244.61*/("""{"""),format.raw/*244.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*246.13*/("""}"""),format.raw/*246.14*/("""

            /* $container.isotope("""),format.raw/*248.35*/("""{"""),format.raw/*248.36*/("""
             filter: '*',
             animationEngine: 'best-available',
             layoutMode: portfolioLayout,
             animationOptions: """),format.raw/*252.32*/("""{"""),format.raw/*252.33*/("""
             duration: 750,
             easing: 'linear',
             queue: false
             """),format.raw/*256.14*/("""}"""),format.raw/*256.15*/(""",
             masonry: """),format.raw/*257.23*/("""{"""),format.raw/*257.24*/("""
             """),format.raw/*258.14*/("""}"""),format.raw/*258.15*/("""
             """),format.raw/*259.14*/("""}"""),format.raw/*259.15*/(""", refreshWaypoints());
             */
            function refreshWaypoints() """),format.raw/*261.41*/("""{"""),format.raw/*261.42*/("""
            setTimeout(function() """),format.raw/*262.35*/("""{"""),format.raw/*262.36*/("""
            """),format.raw/*263.13*/("""}"""),format.raw/*263.14*/(""", 1000);
            """),format.raw/*264.13*/("""}"""),format.raw/*264.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*266.67*/("""{"""),format.raw/*266.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*268.32*/("""{"""),format.raw/*268.33*/(""" filter: selector """),format.raw/*268.51*/("""}"""),format.raw/*268.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*272.13*/("""}"""),format.raw/*272.14*/(""");

            function getColumnNumber() """),format.raw/*274.40*/("""{"""),format.raw/*274.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*278.34*/("""{"""),format.raw/*278.35*/("""
            columnNumber = 5;
            """),format.raw/*280.13*/("""}"""),format.raw/*280.14*/(""" else if (winWidth > 950) """),format.raw/*280.40*/("""{"""),format.raw/*280.41*/("""
            columnNumber = 4;
            """),format.raw/*282.13*/("""}"""),format.raw/*282.14*/(""" else if (winWidth > 600) """),format.raw/*282.40*/("""{"""),format.raw/*282.41*/("""
            columnNumber = 3;
            """),format.raw/*284.13*/("""}"""),format.raw/*284.14*/(""" else if (winWidth > 400) """),format.raw/*284.40*/("""{"""),format.raw/*284.41*/("""
            columnNumber = 2;
            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/(""" else if (winWidth > 250) """),format.raw/*286.40*/("""{"""),format.raw/*286.41*/("""
            columnNumber = 1;
            """),format.raw/*288.13*/("""}"""),format.raw/*288.14*/("""
            return columnNumber;
            """),format.raw/*290.13*/("""}"""),format.raw/*290.14*/("""

            function setColumns() """),format.raw/*292.35*/("""{"""),format.raw/*292.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*297.64*/("""{"""),format.raw/*297.65*/("""
            $(this).css( """),format.raw/*298.26*/("""{"""),format.raw/*298.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*300.13*/("""}"""),format.raw/*300.14*/(""");
            """),format.raw/*301.13*/("""}"""),format.raw/*301.14*/(""");
            """),format.raw/*302.13*/("""}"""),format.raw/*302.14*/("""

            function setPortfolio() """),format.raw/*304.37*/("""{"""),format.raw/*304.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*307.13*/("""}"""),format.raw/*307.14*/("""

            /*
            $container.imagesLoaded(function () """),format.raw/*310.49*/("""{"""),format.raw/*310.50*/("""
            setPortfolio();
            """),format.raw/*312.13*/("""}"""),format.raw/*312.14*/(""");*/

            $(window).on('resize', function () """),format.raw/*314.48*/("""{"""),format.raw/*314.49*/("""
            setPortfolio();
            """),format.raw/*316.13*/("""}"""),format.raw/*316.14*/(""");



            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""")(jQuery);
            </script>

                <!-- Google Analytics Tracking JS -->
            <script>
            (function(i,s,o,g,r,a,m)"""),format.raw/*325.37*/("""{"""),format.raw/*325.38*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*325.88*/("""{"""),format.raw/*325.89*/("""
            (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*326.48*/("""}"""),format.raw/*326.49*/(""",i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            """),format.raw/*328.13*/("""}"""),format.raw/*328.14*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

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
                    DATE: Mon Aug 11 20:41:56 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: f4d411c7f9ca78f298c531e2a41d386d9c8b4474
                    MATRIX: 790->1|1068->79|1098->190|1171->228|1185->234|1213->241|1289->281|1316->286|1774->708|1789->714|1846->749|1958->825|1973->831|2026->862|2108->908|2123->914|2183->952|2315->1048|2330->1054|2385->1087|2519->1185|2534->1191|2583->1218|2665->1264|2680->1270|2740->1308|2881->1413|2896->1419|2948->1449|3030->1495|3045->1501|3099->1533|3234->1632|3249->1638|3311->1678|3396->1727|3411->1733|3465->1765|3555->1819|3570->1825|3633->1866|3909->2106|3924->2112|3974->2140|4716->2846|4741->2862|4780->2863|4825->2876|4883->2898|4898->2904|4941->2924|5028->2975|5053->2991|5093->2993|5535->3403|5842->3674|5869->3692|5909->3694|5980->3729|5999->3739|6080->3797|6151->3832|6170->3842|6265->3914|6336->3949|6355->3959|6454->4035|6504->4066|6544->4068|6615->4103|6634->4113|6710->4167|6773->4198|6840->4229|6868->4248|6908->4250|6979->4285|6998->4295|7075->4350|7146->4385|7165->4395|7247->4454|7310->4485|7379->4518|7406->4536|7446->4538|7517->4573|7571->4618|7619->4628|7947->4920|7960->4924|8001->4943|8319->5225|8334->5231|8379->5253|8419->5256|8476->5303|8513->5317|8698->5465|8711->5468|8796->5529|8862->5557|8919->5603|8957->5617|9176->5803|9248->5838|9268->5848|9345->5902|9396->5933|9436->5934|9510->5971|9530->5981|9611->6038|9675->6069|9912->6269|9942->6276|10295->6592|10324->6611|10365->6613|12901->9116|12953->9131|12979->9147|13020->9149|13798->9894|14335->10394|14351->10400|14430->10455|14560->10548|14576->10554|14642->10597|14718->10636|14734->10642|14799->10684|14875->10723|14891->10729|14956->10771|15032->10810|15048->10816|15116->10861|15192->10900|15208->10906|15280->10955|15356->10994|15372->11000|15440->11045|15516->11084|15532->11090|15597->11132|15673->11171|15689->11177|15761->11226|15837->11265|15853->11271|15924->11319|15989->11347|16023->11358|16139->11437|16155->11443|16214->11479|16290->11518|16306->11524|16367->11562|16443->11601|16459->11607|16529->11654|16605->11693|16621->11699|16686->11741|16835->11853|16851->11859|16905->11890|17051->11999|17067->12005|17150->12065|17232->12110|17248->12116|17311->12156|17426->12234|17442->12240|17499->12274|17765->12511|17795->12512|18062->12750|18092->12751|18177->12807|18207->12808|18274->12846|18304->12847|18485->12999|18515->13000|18647->13103|18677->13104|18731->13129|18761->13130|18805->13145|18835->13146|18879->13161|18909->13162|19019->13243|19049->13244|19114->13280|19144->13281|19187->13295|19217->13296|19268->13318|19298->13319|19397->13389|19427->13390|19546->13480|19576->13481|19623->13499|19653->13500|19853->13671|19883->13672|19957->13717|19987->13718|20131->13833|20161->13834|20235->13879|20265->13880|20320->13906|20350->13907|20424->13952|20454->13953|20509->13979|20539->13980|20613->14025|20643->14026|20698->14052|20728->14053|20802->14098|20832->14099|20887->14125|20917->14126|20991->14171|21021->14172|21098->14220|21128->14221|21195->14259|21225->14260|21477->14483|21507->14484|21563->14511|21593->14512|21674->14564|21704->14565|21749->14581|21779->14582|21824->14598|21854->14599|21923->14639|21953->14640|22068->14726|22098->14727|22195->14795|22225->14796|22297->14839|22327->14840|22411->14895|22441->14896|22513->14939|22543->14940|22594->14962|22624->14963|22803->15113|22833->15114|22912->15164|22942->15165|23020->15214|23050->15215|23228->15364|23258->15365
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|50->21|50->21|50->21|53->24|53->24|53->24|54->25|54->25|54->25|57->28|57->28|57->28|60->31|60->31|60->31|61->32|61->32|61->32|64->35|64->35|64->35|65->36|65->36|65->36|69->40|69->40|69->40|70->41|70->41|70->41|72->43|72->43|72->43|76->47|76->47|76->47|92->63|92->63|92->63|92->63|92->63|92->63|92->63|93->64|93->64|93->64|100->71|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|108->79|108->79|108->79|109->80|109->80|110->81|110->81|110->81|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|114->85|114->85|115->86|117->88|117->88|117->88|118->89|118->89|118->89|122->93|122->93|122->93|127->98|127->98|127->98|127->98|127->98|127->98|129->100|129->100|129->100|129->100|129->100|129->100|133->104|134->105|134->105|134->105|135->106|135->106|137->108|137->108|137->108|138->109|146->117|146->117|152->123|152->123|152->123|196->167|197->168|197->168|197->168|211->182|224->195|224->195|224->195|227->198|227->198|227->198|228->199|228->199|228->199|229->200|229->200|229->200|230->201|230->201|230->201|231->202|231->202|231->202|232->203|232->203|232->203|233->204|233->204|233->204|234->205|234->205|234->205|235->206|235->206|235->206|237->208|237->208|239->210|239->210|239->210|240->211|240->211|240->211|241->212|241->212|241->212|242->213|242->213|242->213|245->216|245->216|245->216|248->219|248->219|248->219|252->223|252->223|252->223|256->227|256->227|256->227|267->238|267->238|273->244|273->244|275->246|275->246|277->248|277->248|281->252|281->252|285->256|285->256|286->257|286->257|287->258|287->258|288->259|288->259|290->261|290->261|291->262|291->262|292->263|292->263|293->264|293->264|295->266|295->266|297->268|297->268|297->268|297->268|301->272|301->272|303->274|303->274|307->278|307->278|309->280|309->280|309->280|309->280|311->282|311->282|311->282|311->282|313->284|313->284|313->284|313->284|315->286|315->286|315->286|315->286|317->288|317->288|319->290|319->290|321->292|321->292|326->297|326->297|327->298|327->298|329->300|329->300|330->301|330->301|331->302|331->302|333->304|333->304|336->307|336->307|339->310|339->310|341->312|341->312|343->314|343->314|345->316|345->316|349->320|349->320|354->325|354->325|354->325|354->325|355->326|355->326|357->328|357->328
                    -- GENERATED --
                */
            