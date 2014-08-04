
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
                        <a class="dynamic-link navbar-brand" href=""""),_display_(Seq[Any](/*62.69*/routes/*62.75*/.Application.index())),format.raw/*62.95*/("""">SNIPLIST.</a>
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
                    DATE: Mon Aug 04 00:26:26 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 3c496c966238b9d9dea525b12938eb67703a19a5
                    MATRIX: 785->1|1033->49|1063->160|1136->198|1150->204|1178->211|1254->251|1281->256|1737->676|1752->682|1809->717|1921->793|1936->799|1989->830|2071->876|2086->882|2146->920|2278->1016|2293->1022|2348->1055|2482->1153|2497->1159|2546->1186|2628->1232|2643->1238|2703->1276|2844->1381|2859->1387|2911->1417|2993->1463|3008->1469|3062->1501|3197->1600|3212->1606|3274->1646|3359->1695|3374->1701|3428->1733|3518->1787|3533->1793|3596->1834|3872->2074|3887->2080|3937->2108|4712->2847|4727->2853|4769->2873|4856->2924|4881->2940|4921->2942|5363->3352|5670->3623|5697->3641|5737->3643|5808->3678|5827->3688|5892->3731|5963->3766|5982->3776|6064->3835|6135->3870|6154->3880|6238->3941|6288->3972|6328->3974|6399->4009|6418->4019|6487->4066|6550->4097|6617->4128|6645->4147|6685->4149|6756->4184|6775->4194|6845->4242|6916->4277|6935->4287|7009->4339|7072->4370|7141->4403|7168->4421|7208->4423|7279->4458|7333->4503|7381->4513|7709->4805|7722->4809|7763->4828|8081->5110|8096->5116|8141->5138|8181->5141|8238->5188|8275->5202|8459->5350|8471->5353|8555->5414|8620->5442|8676->5488|8713->5502|8932->5688|9004->5723|9024->5733|9095->5781|9146->5812|9186->5813|9260->5850|9280->5860|9353->5910|9417->5941|9642->6129|9672->6136|10025->6452|10054->6471|10095->6473|11652->7997|11704->8012|11730->8028|11771->8030|12549->8775|13086->9275|13102->9281|13181->9336|13311->9429|13327->9435|13393->9478|13469->9517|13485->9523|13550->9565|13626->9604|13642->9610|13707->9652|13783->9691|13799->9697|13867->9742|13943->9781|13959->9787|14031->9836|14107->9875|14123->9881|14191->9926|14267->9965|14283->9971|14348->10013|14424->10052|14440->10058|14512->10107|14588->10146|14604->10152|14675->10200|14763->10251|14779->10257|14841->10296|14961->10379|14977->10385|15036->10421|15112->10460|15128->10466|15189->10504|15265->10543|15281->10549|15351->10596|15429->10637|15445->10643|15510->10685|15663->10801|15679->10807|15733->10838|15879->10947|15895->10953|15978->11013|16060->11058|16076->11064|16139->11104|16254->11182|16270->11188|16327->11222|16593->11459|16623->11460|16890->11698|16920->11699|17005->11755|17035->11756|17102->11794|17132->11795|17313->11947|17343->11948|17475->12051|17505->12052|17559->12077|17589->12078|17633->12093|17663->12094|17707->12109|17737->12110|17847->12191|17877->12192|17942->12228|17972->12229|18015->12243|18045->12244|18096->12266|18126->12267|18225->12337|18255->12338|18374->12428|18404->12429|18451->12447|18481->12448|18681->12619|18711->12620|18785->12665|18815->12666|18959->12781|18989->12782|19063->12827|19093->12828|19148->12854|19178->12855|19252->12900|19282->12901|19337->12927|19367->12928|19441->12973|19471->12974|19526->13000|19556->13001|19630->13046|19660->13047|19715->13073|19745->13074|19819->13119|19849->13120|19926->13168|19956->13169|20023->13207|20053->13208|20305->13431|20335->13432|20391->13459|20421->13460|20502->13512|20532->13513|20577->13529|20607->13530|20652->13546|20682->13547|20751->13587|20781->13588|20896->13674|20926->13675|21023->13743|21053->13744|21125->13787|21155->13788|21239->13843|21269->13844|21341->13887|21371->13888|21422->13910|21452->13911|21631->14061|21661->14062|21740->14112|21770->14113|21848->14162|21878->14163|22056->14312|22086->14313
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|59->30|59->30|59->30|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|68->39|68->39|68->39|69->40|69->40|69->40|71->42|71->42|71->42|75->46|75->46|75->46|91->62|91->62|91->62|92->63|92->63|92->63|99->70|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|108->79|108->79|109->80|109->80|109->80|110->81|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|116->87|116->87|116->87|117->88|117->88|117->88|121->92|121->92|121->92|126->97|126->97|126->97|126->97|126->97|126->97|128->99|128->99|128->99|128->99|128->99|128->99|132->103|133->104|133->104|133->104|134->105|134->105|136->107|136->107|136->107|137->108|145->116|145->116|151->122|151->122|151->122|179->150|180->151|180->151|180->151|194->165|207->178|207->178|207->178|210->181|210->181|210->181|211->182|211->182|211->182|212->183|212->183|212->183|213->184|213->184|213->184|214->185|214->185|214->185|215->186|215->186|215->186|216->187|216->187|216->187|217->188|217->188|217->188|218->189|218->189|218->189|220->191|220->191|220->191|223->194|223->194|223->194|224->195|224->195|224->195|225->196|225->196|225->196|227->198|227->198|227->198|230->201|230->201|230->201|233->204|233->204|233->204|237->208|237->208|237->208|241->212|241->212|241->212|252->223|252->223|258->229|258->229|260->231|260->231|262->233|262->233|266->237|266->237|270->241|270->241|271->242|271->242|272->243|272->243|273->244|273->244|275->246|275->246|276->247|276->247|277->248|277->248|278->249|278->249|280->251|280->251|282->253|282->253|282->253|282->253|286->257|286->257|288->259|288->259|292->263|292->263|294->265|294->265|294->265|294->265|296->267|296->267|296->267|296->267|298->269|298->269|298->269|298->269|300->271|300->271|300->271|300->271|302->273|302->273|304->275|304->275|306->277|306->277|311->282|311->282|312->283|312->283|314->285|314->285|315->286|315->286|316->287|316->287|318->289|318->289|321->292|321->292|324->295|324->295|326->297|326->297|328->299|328->299|330->301|330->301|334->305|334->305|339->310|339->310|339->310|339->310|340->311|340->311|342->313|342->313
                    -- GENERATED --
                */
            