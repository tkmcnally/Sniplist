
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

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""

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
            <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*20.46*/routes/*20.52*/.Assets.at("img/icons/favicon.ico"))),format.raw/*20.87*/("""">

                <!-- Bootstrap core CSS -->
            <link href=""""),_display_(Seq[Any](/*23.26*/routes/*23.32*/.Assets.at("css/bootstrap.css"))),format.raw/*23.63*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*24.26*/routes/*24.32*/.Assets.at("css/font-awesome.min.css"))),format.raw/*24.70*/("""" rel="stylesheet">

                <!-- Social Media Icon CSS -->
            <link href=""""),_display_(Seq[Any](/*27.26*/routes/*27.32*/.Assets.at("css/transparent.css"))),format.raw/*27.65*/("""" rel="stylesheet"/>

                <!-- Custom Sniplist Styles -->
            <link href=""""),_display_(Seq[Any](/*30.26*/routes/*30.32*/.Assets.at("css/style.css"))),format.raw/*30.59*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*31.26*/routes/*31.32*/.Assets.at("css/responsive-video.css"))),format.raw/*31.70*/("""" rel="stylesheet">

                <!-- Custom styles for TableclothJs -->
            <link href=""""),_display_(Seq[Any](/*34.26*/routes/*34.32*/.Assets.at("css/prettify.css"))),format.raw/*34.62*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*35.26*/routes/*35.32*/.Assets.at("css/tablecloth.css"))),format.raw/*35.64*/("""" rel="stylesheet">


                <!-- Styles for MediaElementJs
            <link  href=""""),_display_(Seq[Any](/*39.27*/routes/*39.33*/.Assets.at("css/mediaelementplayer.css"))),format.raw/*39.73*/("""" rel="Stylesheet" />
            <link  href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Assets.at("css/mejs-skins.css"))),format.raw/*40.65*/("""" rel="Stylesheet" />-->

            <link  href=""""),_display_(Seq[Any](/*42.27*/routes/*42.33*/.Assets.at("css/audio-sniplist-skin.css"))),format.raw/*42.74*/("""" rel="Stylesheet" />

                <!-- JQueryUI CSS -->
            <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
            <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*46.59*/routes/*46.65*/.Assets.at("css/iThing.css"))),format.raw/*46.93*/("""">

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
                        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*62.56*/routes/*62.62*/.Application.index())),format.raw/*62.82*/("""">SNIPLIST.</a>
                            <!-- """),_display_(Seq[Any](/*63.35*/subjectPresent()/*63.51*/ {_display_(Seq[Any](format.raw/*63.53*/("""
                        <form class="navbar-form navbar-left" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Search">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>
                    """)))})),format.raw/*70.22*/("""-->
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*75.30*/subjectPresentOr()/*75.48*/ {_display_(Seq[Any](format.raw/*75.50*/("""
                                """),_display_(Seq[Any](/*76.34*/generators/*76.44*/.navbarMenu(routes.Snips.add(), "ADD SNIP"))),format.raw/*76.87*/("""
                                """),_display_(Seq[Any](/*77.34*/generators/*77.44*/.navbarMenu(routes.MySnipsController.mySnips(), "MY SNIPS"))),format.raw/*77.103*/("""
                                """),_display_(Seq[Any](/*78.34*/generators/*78.44*/.navbarMenu(routes.SnipLists.viewSniplists(), "MY SNIPLISTS"))),format.raw/*78.105*/("""
                            """)))}/*79.30*/ {_display_(Seq[Any](format.raw/*79.32*/("""
                                """),_display_(Seq[Any](/*80.34*/generators/*80.44*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*80.91*/("""
                            """)))})),format.raw/*81.30*/("""
                            """),_display_(Seq[Any](/*82.30*/subjectNotPresent()/*82.49*/ {_display_(Seq[Any](format.raw/*82.51*/("""
                                """),_display_(Seq[Any](/*83.34*/generators/*83.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*83.92*/("""
                                """),_display_(Seq[Any](/*84.34*/generators/*84.44*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*84.96*/("""
                            """)))})),format.raw/*85.30*/("""

                            """),_display_(Seq[Any](/*87.30*/subjectPresentOr()/*87.48*/ {_display_(Seq[Any](format.raw/*87.50*/("""
                                """),_display_(Seq[Any](/*88.34*/defining(Application.getLocalUser(session()))/*88.79*/ { user =>_display_(Seq[Any](format.raw/*88.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="icon-user"></i> """),_display_(Seq[Any](/*92.76*/user/*92.80*/.name.toUpperCase())),format.raw/*92.99*/("""
                                            <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*97.84*/routes/*97.90*/.Application.profile())),format.raw/*97.112*/("""">"""),_display_(Seq[Any](/*97.115*/Messages("playauthenticate.navigation.profile")/*97.162*/.toUpperCase())),format.raw/*97.176*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*99.63*/com/*99.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*99.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*99.155*/Messages("playauthenticate.navigation.logout")/*99.201*/.toUpperCase())),format.raw/*99.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*103.34*/("""
                                """),_display_(Seq[Any](/*104.34*/generators/*104.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*104.92*/("""
                            """)))}/*105.30*/{_display_(Seq[Any](format.raw/*105.31*/("""

                                """),_display_(Seq[Any](/*107.34*/generators/*107.44*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*107.94*/("""
                            """)))})),format.raw/*108.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <div id="wrapper-content">
                """),_display_(Seq[Any](/*116.18*/content)),format.raw/*116.25*/("""
        </div>

                <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
            """),_display_(Seq[Any](/*122.14*/subjectNotPresent()/*122.33*/ {_display_(Seq[Any](format.raw/*122.35*/("""
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
            """)))})),format.raw/*150.14*/("""
            """),_display_(Seq[Any](/*151.14*/subjectPresent()/*151.30*/ {_display_(Seq[Any](format.raw/*151.32*/("""
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
            """)))})),format.raw/*165.14*/("""



                <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

                <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

                <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*178.50*/routes/*178.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*178.111*/(""""></script>

                <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*181.27*/routes/*181.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*181.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*182.27*/routes/*182.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*182.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*183.27*/routes/*183.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*183.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*184.27*/routes/*184.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*184.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*185.27*/routes/*185.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*185.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*186.27*/routes/*186.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*186.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*187.27*/routes/*187.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*187.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*188.27*/routes/*188.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*188.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*189.27*/routes/*189.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*189.81*/(""""></script>

                <!--  <script src=""""),_display_(Seq[Any](/*191.37*/routes/*191.43*/.Assets.at("js/bootstrap/bootstrap.js"))),format.raw/*191.82*/(""""></script>-->

        <!-- Sniplist core JavaScript -->
        <script src=""""),_display_(Seq[Any](/*194.23*/routes/*194.29*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*194.65*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*195.27*/routes/*195.33*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*195.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*196.27*/routes/*196.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*196.80*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*198.27*/routes/*198.33*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*198.75*/(""""></script>

                <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*201.27*/routes/*201.33*/.Application.javascriptRoutes())),format.raw/*201.64*/("""" type="text/javascript"></script>

                <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*204.27*/routes/*204.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*204.93*/(""""></script>



            <script src=""""),_display_(Seq[Any](/*208.27*/routes/*208.33*/.Assets.at("js/sniplist/dynamicAjax.js"))),format.raw/*208.73*/(""""></script>


                <!-- BLOCK UI -->
            <script src=""""),_display_(Seq[Any](/*212.27*/routes/*212.33*/.Assets.at("js/jquery/blockUI.js"))),format.raw/*212.67*/(""""></script>


            <script type="text/javascript" charset="utf-8">

            //GLOBAL MEDIA PLAYER
            var globalPlayer;

            var globalAudioPlayer;

            // Portfolio
            (function($) """),format.raw/*223.26*/("""{"""),format.raw/*223.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*229.61*/("""{"""),format.raw/*229.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*231.13*/("""}"""),format.raw/*231.14*/("""

            /* $container.isotope("""),format.raw/*233.35*/("""{"""),format.raw/*233.36*/("""
             filter: '*',
             animationEngine: 'best-available',
             layoutMode: portfolioLayout,
             animationOptions: """),format.raw/*237.32*/("""{"""),format.raw/*237.33*/("""
             duration: 750,
             easing: 'linear',
             queue: false
             """),format.raw/*241.14*/("""}"""),format.raw/*241.15*/(""",
             masonry: """),format.raw/*242.23*/("""{"""),format.raw/*242.24*/("""
             """),format.raw/*243.14*/("""}"""),format.raw/*243.15*/("""
             """),format.raw/*244.14*/("""}"""),format.raw/*244.15*/(""", refreshWaypoints());
             */
            function refreshWaypoints() """),format.raw/*246.41*/("""{"""),format.raw/*246.42*/("""
            setTimeout(function() """),format.raw/*247.35*/("""{"""),format.raw/*247.36*/("""
            """),format.raw/*248.13*/("""}"""),format.raw/*248.14*/(""", 1000);
            """),format.raw/*249.13*/("""}"""),format.raw/*249.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*251.67*/("""{"""),format.raw/*251.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*253.32*/("""{"""),format.raw/*253.33*/(""" filter: selector """),format.raw/*253.51*/("""}"""),format.raw/*253.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*257.13*/("""}"""),format.raw/*257.14*/(""");

            function getColumnNumber() """),format.raw/*259.40*/("""{"""),format.raw/*259.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*263.34*/("""{"""),format.raw/*263.35*/("""
            columnNumber = 5;
            """),format.raw/*265.13*/("""}"""),format.raw/*265.14*/(""" else if (winWidth > 950) """),format.raw/*265.40*/("""{"""),format.raw/*265.41*/("""
            columnNumber = 4;
            """),format.raw/*267.13*/("""}"""),format.raw/*267.14*/(""" else if (winWidth > 600) """),format.raw/*267.40*/("""{"""),format.raw/*267.41*/("""
            columnNumber = 3;
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/(""" else if (winWidth > 400) """),format.raw/*269.40*/("""{"""),format.raw/*269.41*/("""
            columnNumber = 2;
            """),format.raw/*271.13*/("""}"""),format.raw/*271.14*/(""" else if (winWidth > 250) """),format.raw/*271.40*/("""{"""),format.raw/*271.41*/("""
            columnNumber = 1;
            """),format.raw/*273.13*/("""}"""),format.raw/*273.14*/("""
            return columnNumber;
            """),format.raw/*275.13*/("""}"""),format.raw/*275.14*/("""

            function setColumns() """),format.raw/*277.35*/("""{"""),format.raw/*277.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*282.64*/("""{"""),format.raw/*282.65*/("""
            $(this).css( """),format.raw/*283.26*/("""{"""),format.raw/*283.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*285.13*/("""}"""),format.raw/*285.14*/(""");
            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/(""");
            """),format.raw/*287.13*/("""}"""),format.raw/*287.14*/("""

            function setPortfolio() """),format.raw/*289.37*/("""{"""),format.raw/*289.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*292.13*/("""}"""),format.raw/*292.14*/("""

            /*
            $container.imagesLoaded(function () """),format.raw/*295.49*/("""{"""),format.raw/*295.50*/("""
            setPortfolio();
            """),format.raw/*297.13*/("""}"""),format.raw/*297.14*/(""");*/

            $(window).on('resize', function () """),format.raw/*299.48*/("""{"""),format.raw/*299.49*/("""
            setPortfolio();
            """),format.raw/*301.13*/("""}"""),format.raw/*301.14*/(""");



            """),format.raw/*305.13*/("""}"""),format.raw/*305.14*/(""")(jQuery);
            </script>

                <!-- Google Analytics Tracking JS -->
            <script>
            (function(i,s,o,g,r,a,m)"""),format.raw/*310.37*/("""{"""),format.raw/*310.38*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*310.88*/("""{"""),format.raw/*310.89*/("""
            (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*311.48*/("""}"""),format.raw/*311.49*/(""",i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            """),format.raw/*313.13*/("""}"""),format.raw/*313.14*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

            ga('create', 'UA-52100641-2', 'auto');
            ga('send', 'pageview');

            </script>
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
                    DATE: Thu Jul 31 02:37:26 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 8f5b5d6d180c78d600987168f2e4eaadbd507231
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1771->684|1786->690|1843->725|1955->801|1970->807|2023->838|2105->884|2120->890|2180->928|2312->1024|2327->1030|2382->1063|2516->1161|2531->1167|2580->1194|2662->1240|2677->1246|2737->1284|2878->1389|2893->1395|2945->1425|3027->1471|3042->1477|3096->1509|3231->1608|3246->1614|3308->1654|3393->1703|3408->1709|3462->1741|3552->1795|3567->1801|3630->1842|3906->2082|3921->2088|3971->2116|4733->2842|4748->2848|4790->2868|4877->2919|4902->2935|4942->2937|5384->3347|5691->3618|5718->3636|5758->3638|5829->3673|5848->3683|5913->3726|5984->3761|6003->3771|6085->3830|6156->3865|6175->3875|6259->3936|6309->3967|6349->3969|6420->4004|6439->4014|6508->4061|6571->4092|6638->4123|6666->4142|6706->4144|6777->4179|6796->4189|6866->4237|6937->4272|6956->4282|7030->4334|7093->4365|7162->4398|7189->4416|7229->4418|7300->4453|7354->4498|7402->4508|7730->4800|7743->4804|7784->4823|8102->5105|8117->5111|8162->5133|8202->5136|8259->5183|8296->5197|8480->5345|8492->5348|8576->5409|8641->5437|8697->5483|8734->5497|8953->5683|9025->5718|9045->5728|9116->5776|9167->5807|9207->5808|9281->5845|9301->5855|9374->5905|9438->5936|9663->6124|9693->6131|10046->6447|10075->6466|10116->6468|11673->7992|11725->8007|11751->8023|11792->8025|12570->8770|13107->9270|13123->9276|13202->9331|13332->9424|13348->9430|13414->9473|13490->9512|13506->9518|13571->9560|13647->9599|13663->9605|13728->9647|13804->9686|13820->9692|13888->9737|13964->9776|13980->9782|14052->9831|14128->9870|14144->9876|14212->9921|14288->9960|14304->9966|14369->10008|14445->10047|14461->10053|14533->10102|14609->10141|14625->10147|14696->10195|14784->10246|14800->10252|14862->10291|14982->10374|14998->10380|15057->10416|15133->10455|15149->10461|15210->10499|15286->10538|15302->10544|15372->10591|15450->10632|15466->10638|15531->10680|15684->10796|15700->10802|15754->10833|15900->10942|15916->10948|15999->11008|16081->11053|16097->11059|16160->11099|16275->11177|16291->11183|16348->11217|16614->11454|16644->11455|16911->11693|16941->11694|17026->11750|17056->11751|17123->11789|17153->11790|17334->11942|17364->11943|17496->12046|17526->12047|17580->12072|17610->12073|17654->12088|17684->12089|17728->12104|17758->12105|17868->12186|17898->12187|17963->12223|17993->12224|18036->12238|18066->12239|18117->12261|18147->12262|18246->12332|18276->12333|18395->12423|18425->12424|18472->12442|18502->12443|18702->12614|18732->12615|18806->12660|18836->12661|18980->12776|19010->12777|19084->12822|19114->12823|19169->12849|19199->12850|19273->12895|19303->12896|19358->12922|19388->12923|19462->12968|19492->12969|19547->12995|19577->12996|19651->13041|19681->13042|19736->13068|19766->13069|19840->13114|19870->13115|19947->13163|19977->13164|20044->13202|20074->13203|20326->13426|20356->13427|20412->13454|20442->13455|20523->13507|20553->13508|20598->13524|20628->13525|20673->13541|20703->13542|20772->13582|20802->13583|20917->13669|20947->13670|21044->13738|21074->13739|21146->13782|21176->13783|21260->13838|21290->13839|21362->13882|21392->13883|21443->13905|21473->13906|21652->14056|21682->14057|21761->14107|21791->14108|21869->14157|21899->14158|22077->14307|22107->14308
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|59->30|59->30|59->30|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|68->39|68->39|68->39|69->40|69->40|69->40|71->42|71->42|71->42|75->46|75->46|75->46|91->62|91->62|91->62|92->63|92->63|92->63|99->70|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|108->79|108->79|109->80|109->80|109->80|110->81|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|116->87|116->87|116->87|117->88|117->88|117->88|121->92|121->92|121->92|126->97|126->97|126->97|126->97|126->97|126->97|128->99|128->99|128->99|128->99|128->99|128->99|132->103|133->104|133->104|133->104|134->105|134->105|136->107|136->107|136->107|137->108|145->116|145->116|151->122|151->122|151->122|179->150|180->151|180->151|180->151|194->165|207->178|207->178|207->178|210->181|210->181|210->181|211->182|211->182|211->182|212->183|212->183|212->183|213->184|213->184|213->184|214->185|214->185|214->185|215->186|215->186|215->186|216->187|216->187|216->187|217->188|217->188|217->188|218->189|218->189|218->189|220->191|220->191|220->191|223->194|223->194|223->194|224->195|224->195|224->195|225->196|225->196|225->196|227->198|227->198|227->198|230->201|230->201|230->201|233->204|233->204|233->204|237->208|237->208|237->208|241->212|241->212|241->212|252->223|252->223|258->229|258->229|260->231|260->231|262->233|262->233|266->237|266->237|270->241|270->241|271->242|271->242|272->243|272->243|273->244|273->244|275->246|275->246|276->247|276->247|277->248|277->248|278->249|278->249|280->251|280->251|282->253|282->253|282->253|282->253|286->257|286->257|288->259|288->259|292->263|292->263|294->265|294->265|294->265|294->265|296->267|296->267|296->267|296->267|298->269|298->269|298->269|298->269|300->271|300->271|300->271|300->271|302->273|302->273|304->275|304->275|306->277|306->277|311->282|311->282|312->283|312->283|314->285|314->285|315->286|315->286|316->287|316->287|318->289|318->289|321->292|321->292|324->295|324->295|326->297|326->297|328->299|328->299|330->301|330->301|334->305|334->305|339->310|339->310|339->310|339->310|340->311|340->311|342->313|342->313
                    -- GENERATED --
                */
            