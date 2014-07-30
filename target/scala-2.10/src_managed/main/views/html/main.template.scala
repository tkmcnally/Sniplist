
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
                       <!-- """),_display_(Seq[Any](/*63.30*/subjectPresent()/*63.46*/ {_display_(Seq[Any](format.raw/*63.48*/("""
                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search">
                                </div>
                                <button type="submit" class="btn btn-default">Submit</button>
                            </form>
                        """)))})),format.raw/*70.26*/("""-->
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
                                                <li><a href=""""),_display_(Seq[Any](/*97.63*/routes/*97.69*/.Application.profile())),format.raw/*97.91*/("""">"""),_display_(Seq[Any](/*97.94*/Messages("playauthenticate.navigation.profile")/*97.141*/.toUpperCase())),format.raw/*97.155*/("""</a></li>
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
                        <!-- INSERTED CONTENT GOES HERE (From other scala templates) -->
                    """),_display_(Seq[Any](/*117.22*/content)),format.raw/*117.29*/("""
            </div>

        <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
            """),_display_(Seq[Any](/*123.14*/subjectNotPresent()/*123.33*/ {_display_(Seq[Any](format.raw/*123.35*/("""
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
            """)))})),format.raw/*151.14*/("""
            """),_display_(Seq[Any](/*152.14*/subjectPresent()/*152.30*/ {_display_(Seq[Any](format.raw/*152.32*/("""
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
            """)))})),format.raw/*166.14*/("""



            <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

            <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

            <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*179.50*/routes/*179.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*179.111*/(""""></script>

            <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*182.27*/routes/*182.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*182.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*183.27*/routes/*183.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*183.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*184.27*/routes/*184.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*184.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*185.27*/routes/*185.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*185.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*186.27*/routes/*186.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*186.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*187.27*/routes/*187.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*187.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*188.27*/routes/*188.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*188.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*189.27*/routes/*189.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*189.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*190.27*/routes/*190.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*190.81*/(""""></script>

          <!--  <script src=""""),_display_(Seq[Any](/*192.31*/routes/*192.37*/.Assets.at("js/bootstrap/bootstrap.js"))),format.raw/*192.76*/(""""></script>-->

            <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*195.27*/routes/*195.33*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*195.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*196.27*/routes/*196.33*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*196.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*197.27*/routes/*197.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*197.80*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*199.27*/routes/*199.33*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*199.75*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*202.27*/routes/*202.33*/.Application.javascriptRoutes())),format.raw/*202.64*/("""" type="text/javascript"></script>

            <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*205.27*/routes/*205.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*205.93*/(""""></script>


            <script type="text/javascript" charset="utf-8">

                //GLOBAL MEDIA PLAYER
                var globalPlayer;

                var globalAudioPlayer;

                // Portfolio
                (function($) """),format.raw/*216.30*/("""{"""),format.raw/*216.31*/("""
                "use strict";
                var $container = $('.portfolio'),
                $items = $container.find('.portfolio-item'),
                portfolioLayout = 'fitRows';

                if( $container.hasClass('portfolio-centered') ) """),format.raw/*222.65*/("""{"""),format.raw/*222.66*/("""
                portfolioLayout = 'masonry';
                """),format.raw/*224.17*/("""}"""),format.raw/*224.18*/("""

               /* $container.isotope("""),format.raw/*226.38*/("""{"""),format.raw/*226.39*/("""
                filter: '*',
                animationEngine: 'best-available',
                layoutMode: portfolioLayout,
                animationOptions: """),format.raw/*230.35*/("""{"""),format.raw/*230.36*/("""
                duration: 750,
                easing: 'linear',
                queue: false
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/(""",
                masonry: """),format.raw/*235.26*/("""{"""),format.raw/*235.27*/("""
                """),format.raw/*236.17*/("""}"""),format.raw/*236.18*/("""
                """),format.raw/*237.17*/("""}"""),format.raw/*237.18*/(""", refreshWaypoints());
                */
                function refreshWaypoints() """),format.raw/*239.45*/("""{"""),format.raw/*239.46*/("""
                setTimeout(function() """),format.raw/*240.39*/("""{"""),format.raw/*240.40*/("""
                """),format.raw/*241.17*/("""}"""),format.raw/*241.18*/(""", 1000);
                """),format.raw/*242.17*/("""}"""),format.raw/*242.18*/("""

                $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*244.71*/("""{"""),format.raw/*244.72*/("""
                var selector = $(this).attr('data-filter');
                $container.isotope("""),format.raw/*246.36*/("""{"""),format.raw/*246.37*/(""" filter: selector """),format.raw/*246.55*/("""}"""),format.raw/*246.56*/(""", refreshWaypoints());
                $('nav.portfolio-filter ul a').removeClass('active');
                $(this).addClass('active');
                return false;
                """),format.raw/*250.17*/("""}"""),format.raw/*250.18*/(""");

                function getColumnNumber() """),format.raw/*252.44*/("""{"""),format.raw/*252.45*/("""
                var winWidth = $(window).width(),
                columnNumber = 1;

                if (winWidth > 1200) """),format.raw/*256.38*/("""{"""),format.raw/*256.39*/("""
                columnNumber = 5;
                """),format.raw/*258.17*/("""}"""),format.raw/*258.18*/(""" else if (winWidth > 950) """),format.raw/*258.44*/("""{"""),format.raw/*258.45*/("""
                columnNumber = 4;
                """),format.raw/*260.17*/("""}"""),format.raw/*260.18*/(""" else if (winWidth > 600) """),format.raw/*260.44*/("""{"""),format.raw/*260.45*/("""
                columnNumber = 3;
                """),format.raw/*262.17*/("""}"""),format.raw/*262.18*/(""" else if (winWidth > 400) """),format.raw/*262.44*/("""{"""),format.raw/*262.45*/("""
                columnNumber = 2;
                """),format.raw/*264.17*/("""}"""),format.raw/*264.18*/(""" else if (winWidth > 250) """),format.raw/*264.44*/("""{"""),format.raw/*264.45*/("""
                columnNumber = 1;
                """),format.raw/*266.17*/("""}"""),format.raw/*266.18*/("""
                return columnNumber;
                """),format.raw/*268.17*/("""}"""),format.raw/*268.18*/("""

                function setColumns() """),format.raw/*270.39*/("""{"""),format.raw/*270.40*/("""
                var winWidth = $(window).width(),
                columnNumber = getColumnNumber(),
                itemWidth = Math.floor(winWidth / columnNumber);

                $container.find('.portfolio-item').each(function() """),format.raw/*275.68*/("""{"""),format.raw/*275.69*/("""
                $(this).css( """),format.raw/*276.30*/("""{"""),format.raw/*276.31*/("""
                width : itemWidth + 'px'
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/(""");
                """),format.raw/*279.17*/("""}"""),format.raw/*279.18*/(""");
                """),format.raw/*280.17*/("""}"""),format.raw/*280.18*/("""

                function setPortfolio() """),format.raw/*282.41*/("""{"""),format.raw/*282.42*/("""
                setColumns();
                $container.isotope('reLayout');
                """),format.raw/*285.17*/("""}"""),format.raw/*285.18*/("""

                /*
                $container.imagesLoaded(function () """),format.raw/*288.53*/("""{"""),format.raw/*288.54*/("""
                setPortfolio();
                """),format.raw/*290.17*/("""}"""),format.raw/*290.18*/(""");*/

                $(window).on('resize', function () """),format.raw/*292.52*/("""{"""),format.raw/*292.53*/("""
                setPortfolio();
                """),format.raw/*294.17*/("""}"""),format.raw/*294.18*/(""");



                """),format.raw/*298.17*/("""}"""),format.raw/*298.18*/(""")(jQuery);
            </script>

            <!-- Google Analytics Tracking JS -->
            <script>
                (function(i,s,o,g,r,a,m)"""),format.raw/*303.41*/("""{"""),format.raw/*303.42*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*303.92*/("""{"""),format.raw/*303.93*/("""
                (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*304.52*/("""}"""),format.raw/*304.53*/(""",i[r].l=1*new Date();a=s.createElement(o),
                m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
                """),format.raw/*306.17*/("""}"""),format.raw/*306.18*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

                ga('create', 'UA-52100641-2', 'auto');
                ga('send', 'pageview');

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
                    DATE: Wed Jul 30 14:49:05 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 58153bb25acfadc952b5931da23ba4c4b3e85099
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1767->680|1782->686|1839->721|1947->793|1962->799|2015->830|2097->876|2112->882|2172->920|2300->1012|2315->1018|2370->1051|2504->1149|2519->1155|2568->1182|2650->1228|2665->1234|2725->1272|2866->1377|2881->1383|2933->1413|3015->1459|3030->1465|3084->1497|3215->1592|3230->1598|3292->1638|3377->1687|3392->1693|3446->1725|3536->1779|3551->1785|3614->1826|3886->2062|3901->2068|3951->2096|4713->2822|4728->2828|4770->2848|4852->2894|4877->2910|4917->2912|5387->3350|5694->3621|5721->3639|5761->3641|5832->3676|5851->3686|5916->3729|5987->3764|6006->3774|6088->3833|6159->3868|6178->3878|6262->3939|6312->3970|6352->3972|6423->4007|6442->4017|6511->4064|6574->4095|6641->4126|6669->4145|6709->4147|6780->4182|6799->4192|6869->4240|6940->4275|6959->4285|7033->4337|7096->4368|7165->4401|7192->4419|7232->4421|7303->4456|7357->4501|7405->4511|7733->4803|7746->4807|7787->4826|8088->5091|8103->5097|8147->5119|8186->5122|8243->5169|8280->5183|8464->5331|8476->5334|8560->5395|8625->5423|8681->5469|8718->5483|8937->5669|9009->5704|9029->5714|9100->5762|9151->5793|9191->5794|9265->5831|9285->5841|9358->5891|9422->5922|9741->6204|9771->6211|10120->6523|10149->6542|10190->6544|11747->8068|11799->8083|11825->8099|11866->8101|12644->8846|13169->9334|13185->9340|13264->9395|13390->9484|13406->9490|13472->9533|13548->9572|13564->9578|13629->9620|13705->9659|13721->9665|13786->9707|13862->9746|13878->9752|13946->9797|14022->9836|14038->9842|14110->9891|14186->9930|14202->9936|14270->9981|14346->10020|14362->10026|14427->10068|14503->10107|14519->10113|14591->10162|14667->10201|14683->10207|14754->10255|14836->10300|14852->10306|14914->10345|15042->10436|15058->10442|15117->10478|15193->10517|15209->10523|15270->10561|15346->10600|15362->10606|15432->10653|15510->10694|15526->10700|15591->10742|15740->10854|15756->10860|15810->10891|15952->10996|15968->11002|16051->11062|16337->11319|16367->11320|16654->11578|16684->11579|16777->11643|16807->11644|16877->11685|16907->11686|17100->11850|17130->11851|17274->11966|17304->11967|17361->11995|17391->11996|17438->12014|17468->12015|17515->12033|17545->12034|17662->12122|17692->12123|17761->12163|17791->12164|17838->12182|17868->12183|17923->12209|17953->12210|18056->12284|18086->12285|18213->12383|18243->12384|18290->12402|18320->12403|18536->12590|18566->12591|18644->12640|18674->12641|18830->12768|18860->12769|18942->12822|18972->12823|19027->12849|19057->12850|19139->12903|19169->12904|19224->12930|19254->12931|19336->12984|19366->12985|19421->13011|19451->13012|19533->13065|19563->13066|19618->13092|19648->13093|19730->13146|19760->13147|19845->13203|19875->13204|19946->13246|19976->13247|20244->13486|20274->13487|20334->13518|20364->13519|20453->13579|20483->13580|20532->13600|20562->13601|20611->13621|20641->13622|20714->13666|20744->13667|20871->13765|20901->13766|21006->13842|21036->13843|21116->13894|21146->13895|21234->13954|21264->13955|21344->14006|21374->14007|21429->14033|21459->14034|21638->14184|21668->14185|21747->14235|21777->14236|21859->14289|21889->14290|22075->14447|22105->14448
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|59->30|59->30|59->30|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|68->39|68->39|68->39|69->40|69->40|69->40|71->42|71->42|71->42|75->46|75->46|75->46|91->62|91->62|91->62|92->63|92->63|92->63|99->70|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|108->79|108->79|109->80|109->80|109->80|110->81|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|116->87|116->87|116->87|117->88|117->88|117->88|121->92|121->92|121->92|126->97|126->97|126->97|126->97|126->97|126->97|128->99|128->99|128->99|128->99|128->99|128->99|132->103|133->104|133->104|133->104|134->105|134->105|136->107|136->107|136->107|137->108|146->117|146->117|152->123|152->123|152->123|180->151|181->152|181->152|181->152|195->166|208->179|208->179|208->179|211->182|211->182|211->182|212->183|212->183|212->183|213->184|213->184|213->184|214->185|214->185|214->185|215->186|215->186|215->186|216->187|216->187|216->187|217->188|217->188|217->188|218->189|218->189|218->189|219->190|219->190|219->190|221->192|221->192|221->192|224->195|224->195|224->195|225->196|225->196|225->196|226->197|226->197|226->197|228->199|228->199|228->199|231->202|231->202|231->202|234->205|234->205|234->205|245->216|245->216|251->222|251->222|253->224|253->224|255->226|255->226|259->230|259->230|263->234|263->234|264->235|264->235|265->236|265->236|266->237|266->237|268->239|268->239|269->240|269->240|270->241|270->241|271->242|271->242|273->244|273->244|275->246|275->246|275->246|275->246|279->250|279->250|281->252|281->252|285->256|285->256|287->258|287->258|287->258|287->258|289->260|289->260|289->260|289->260|291->262|291->262|291->262|291->262|293->264|293->264|293->264|293->264|295->266|295->266|297->268|297->268|299->270|299->270|304->275|304->275|305->276|305->276|307->278|307->278|308->279|308->279|309->280|309->280|311->282|311->282|314->285|314->285|317->288|317->288|319->290|319->290|321->292|321->292|323->294|323->294|327->298|327->298|332->303|332->303|332->303|332->303|333->304|333->304|335->306|335->306
                    -- GENERATED --
                */
            