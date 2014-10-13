
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
object mainTwo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "", moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*5.1*/("""

<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*8.14*/lang()/*8.20*/.code())),format.raw/*8.27*/("""">

    <head>

            <!-- Meta values -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">


        <title>Sniplist</title>

            <!-- Sniplist Favicon -->
        <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*23.42*/routes/*23.48*/.Assets.at("img/landingPage/favicon.ico"))),format.raw/*23.89*/("""">

            <!-- Bootstrap core CSS -->
        <link href=""""),_display_(Seq[Any](/*26.22*/routes/*26.28*/.Assets.at("css/bootstrap.css"))),format.raw/*26.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*27.22*/routes/*27.28*/.Assets.at("css/bootstrap-datetimepicker.min.css"))),format.raw/*27.78*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*28.22*/routes/*28.28*/.Assets.at("css/font-awesome.min.css"))),format.raw/*28.66*/("""" rel="stylesheet">

            <!-- Social Media Icon CSS -->
        <link href=""""),_display_(Seq[Any](/*31.22*/routes/*31.28*/.Assets.at("css/transparent.css"))),format.raw/*31.61*/("""" rel="stylesheet"/>

            <!-- Custom Sniplist Styles -->
            <!--   <link href=""""),_display_(Seq[Any](/*34.33*/routes/*34.39*/.Assets.at("css/style.css"))),format.raw/*34.66*/("""" rel="stylesheet"> -->
        <link href=""""),_display_(Seq[Any](/*35.22*/routes/*35.28*/.Assets.at("css/responsive-video.css"))),format.raw/*35.66*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*36.22*/routes/*36.28*/.Assets.at("css/landingPage.css"))),format.raw/*36.61*/("""" rel="stylesheet">

            <!-- Custom styles for TableclothJs -->
        <link href=""""),_display_(Seq[Any](/*39.22*/routes/*39.28*/.Assets.at("css/prettify.css"))),format.raw/*39.58*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*40.22*/routes/*40.28*/.Assets.at("css/tablecloth.css"))),format.raw/*40.60*/("""" rel="stylesheet">




            <!-- Styles for MediaElementJs -->
        <link  href=""""),_display_(Seq[Any](/*46.23*/routes/*46.29*/.Assets.at("css/audio-sniplist-skin.css"))),format.raw/*46.70*/("""" rel="Stylesheet" />

            <!-- JQueryUI CSS -->
        <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*50.55*/routes/*50.61*/.Assets.at("css/iThing.css"))),format.raw/*50.89*/("""">

            <!-- Custom Fonts -->
        <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='http://fonts.googleapis.com/css?family=Sanchez' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>

    </head>

    <body>

            <!-- Navigation -->
        <nav class="navbar navbar-fixed-top bg-clr-red clr-white" role="navigation">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(Seq[Any](/*72.52*/routes/*72.58*/.Application.index())),format.raw/*72.78*/(""""><b>Sniplist.</b></a>
                </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href=""""),_display_(Seq[Any](/*78.39*/routes/*78.45*/.Application.about())),format.raw/*78.65*/("""">About</a>
                        </li>
                        <li>
                            <a href=""""),_display_(Seq[Any](/*81.39*/routes/*81.45*/.Application.login())),format.raw/*81.65*/("""">Sign In</a>
                        </li>
                    </ul>
                </div>
                    <!-- /.navbar-collapse -->
            </div>
                <!-- /.container -->
        </nav>

            <!-- /.intro-header -->


                <div class="row">
                    <div class="col-md-2"></div>
                    <div id="global-message" class="col-md-8 alert alert-danger alert-dismissable hidden">
                        <a id="global-message-close" class="panel-close close" data-dismiss="alert">×</a>
                        <i id="global-message-icon" class="fa fa-check-circle"></i>
                        <p id="global-message-text" style="display: inline;"></p>
                    </div>
                    <div class="col-md-2"></div>
                </div>

            """),_display_(Seq[Any](/*103.14*/subjectPresentOr()/*103.32*/ {_display_(Seq[Any](format.raw/*103.34*/("""
                <div class="container">
                    <div class="row">
                        <div class="col-sm-2">
                            <nav class="nav-sidebar">
                                <ul class="nav">
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*109.72*/routes/*109.78*/.Application.popular())),format.raw/*109.100*/("""">
                                        Popular</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*111.72*/routes/*111.78*/.Application.recent())),format.raw/*111.99*/("""">
                                        Recent</a></li>
                                    <li class="nav-divider"></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*114.72*/routes/*114.78*/.SnipCollectionController.mySnips())),format.raw/*114.113*/("""">
                                        Your Snips</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*116.72*/routes/*116.78*/.SniplistCollectionController.mySniplists())),format.raw/*116.121*/("""">
                                        Your Sniplists</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*118.72*/routes/*118.78*/.SnipCollectionController.favouritedSnips())),format.raw/*118.121*/("""">
                                        Saved Snips</a></li>
                                    <li><a class="dynamic-link" href=""""),_display_(Seq[Any](/*120.72*/routes/*120.78*/.SniplistCollectionController.favouritedSniplists())),format.raw/*120.129*/("""">
                                        Saved Sniplists</a></li>
                                </ul>
                            </nav>
                        </div>
                        <div id="wrapper-content" class="col-sm-10">
                        """),_display_(Seq[Any](/*126.26*/content)),format.raw/*126.33*/("""
                        </div>
                    </div>
                </div>
            """)))}/*130.14*/ {_display_(Seq[Any](format.raw/*130.16*/("""

                """),_display_(Seq[Any](/*132.18*/content)),format.raw/*132.25*/("""

            """)))})),format.raw/*134.14*/("""

        """),_display_(Seq[Any](/*136.10*/subjectNotPresent()/*136.29*/ {_display_(Seq[Any](format.raw/*136.31*/("""
            <footer>
                <div class="footer container">
                    <div class="row">
                        <div class="col-lg-3 col-sm-3">
                            <hr class="brdr-clr-red"/>
                            <p class="copyright text-muted small">Created in 2014, Sniplist provides a new way of sharing music with your friends</p>
                            <p class="copyright text-muted small">Sniplist &copy; 2014</p>
                        </div>
                        <div class="col-lg-7 col-sm-7 ftr-logo">
                            <img class="img-responsive center" src=""""),_display_(Seq[Any](/*146.70*/routes/*146.76*/.Assets.at("img/landingPage/thumb_logo.png"))),format.raw/*146.120*/(""""  alt="">
                        </div>
                        <div class="col-lg-2 col-sm-2">
                            <ul class="list-inline">
                                <li>
                                    <a href="http://twitter.com">
                                        <img class="img-responsive" src=""""),_display_(Seq[Any](/*152.75*/routes/*152.81*/.Assets.at("img/landingPage/tw.png"))),format.raw/*152.117*/(""""  alt="">
                                    </a>
                                </li>
                                <li>
                                    <a href="http://facebook.com">
                                        <img class="img-responsive" src=""""),_display_(Seq[Any](/*157.75*/routes/*157.81*/.Assets.at("img/landingPage/fb.png"))),format.raw/*157.117*/(""""  alt="">
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </footer>
        """)))})),format.raw/*165.10*/("""
        """),_display_(Seq[Any](/*166.10*/subjectPresent()/*166.26*/ {_display_(Seq[Any](format.raw/*166.28*/("""
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
        """)))})),format.raw/*180.10*/("""

            <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

            <!-- JQuery JS External Imports -->
        <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

        <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

            <!-- JQRangeSlider JS -->
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*191.46*/routes/*191.52*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*191.107*/(""""></script>



        <script src=""""),_display_(Seq[Any](/*195.23*/routes/*195.29*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*195.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*196.23*/routes/*196.29*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*196.74*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*197.23*/routes/*197.29*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*197.78*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*198.23*/routes/*198.29*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*198.74*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*199.23*/routes/*199.29*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*199.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*200.23*/routes/*200.29*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*200.78*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*201.23*/routes/*201.29*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*201.77*/(""""></script>

            <!-- Bootstrap core JavaScript -->
        <script src=""""),_display_(Seq[Any](/*204.23*/routes/*204.29*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*204.72*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*205.23*/routes/*205.29*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*205.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*206.23*/routes/*206.29*/.Assets.at("js/bootstrap/moment.js"))),format.raw/*206.65*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*207.23*/routes/*207.29*/.Assets.at("js/bootstrap/bootstrap-datetimepicker.min.js"))),format.raw/*207.87*/(""""></script>

        """),_display_(Seq[Any](/*209.10*/moreScripts)),format.raw/*209.21*/("""
            <!-- Sniplist core JavaScript -->
        <script src=""""),_display_(Seq[Any](/*211.23*/routes/*211.29*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*211.65*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*212.23*/routes/*212.29*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*212.67*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*213.23*/routes/*213.29*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*213.76*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*214.23*/routes/*214.29*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*214.71*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
        <script src=""""),_display_(Seq[Any](/*217.23*/routes/*217.29*/.Application.javascriptRoutes())),format.raw/*217.60*/("""" type="text/javascript"></script>

            <!-- MediaElementPlayer -->
        <script src=""""),_display_(Seq[Any](/*220.23*/routes/*220.29*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*220.89*/(""""></script>



        <script src=""""),_display_(Seq[Any](/*224.23*/routes/*224.29*/.Assets.at("js/sniplist/dynamicAjax.js"))),format.raw/*224.69*/(""""></script>


            <!-- BLOCK UI -->
        <script src=""""),_display_(Seq[Any](/*228.23*/routes/*228.29*/.Assets.at("js/jquery/blockUI.js"))),format.raw/*228.63*/(""""></script>


        <script type="text/javascript" charset="utf-8">

        //GLOBAL MEDIA PLAYER
        var globalPlayer;

        var globalAudioPlayer;

        // Portfolio
        (function($) """),format.raw/*239.22*/("""{"""),format.raw/*239.23*/("""
        "use strict";
        var $container = $('.portfolio'),
        $items = $container.find('.portfolio-item'),
        portfolioLayout = 'fitRows';

        if( $container.hasClass('portfolio-centered') ) """),format.raw/*245.57*/("""{"""),format.raw/*245.58*/("""
        portfolioLayout = 'masonry';
        """),format.raw/*247.9*/("""}"""),format.raw/*247.10*/("""

        /* $container.isotope("""),format.raw/*249.31*/("""{"""),format.raw/*249.32*/("""
         filter: '*',
         animationEngine: 'best-available',
         layoutMode: portfolioLayout,
         animationOptions: """),format.raw/*253.28*/("""{"""),format.raw/*253.29*/("""
         duration: 750,
         easing: 'linear',
         queue: false
         """),format.raw/*257.10*/("""}"""),format.raw/*257.11*/(""",
         masonry: """),format.raw/*258.19*/("""{"""),format.raw/*258.20*/("""
         """),format.raw/*259.10*/("""}"""),format.raw/*259.11*/("""
         """),format.raw/*260.10*/("""}"""),format.raw/*260.11*/(""", refreshWaypoints());
         */
        function refreshWaypoints() """),format.raw/*262.37*/("""{"""),format.raw/*262.38*/("""
        setTimeout(function() """),format.raw/*263.31*/("""{"""),format.raw/*263.32*/("""
        """),format.raw/*264.9*/("""}"""),format.raw/*264.10*/(""", 1000);
        """),format.raw/*265.9*/("""}"""),format.raw/*265.10*/("""

        $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*267.63*/("""{"""),format.raw/*267.64*/("""
        var selector = $(this).attr('data-filter');
        $container.isotope("""),format.raw/*269.28*/("""{"""),format.raw/*269.29*/(""" filter: selector """),format.raw/*269.47*/("""}"""),format.raw/*269.48*/(""", refreshWaypoints());
        $('nav.portfolio-filter ul a').removeClass('active');
        $(this).addClass('active');
        return false;
        """),format.raw/*273.9*/("""}"""),format.raw/*273.10*/(""");

        function getColumnNumber() """),format.raw/*275.36*/("""{"""),format.raw/*275.37*/("""
        var winWidth = $(window).width(),
        columnNumber = 1;

        if (winWidth > 1200) """),format.raw/*279.30*/("""{"""),format.raw/*279.31*/("""
        columnNumber = 5;
        """),format.raw/*281.9*/("""}"""),format.raw/*281.10*/(""" else if (winWidth > 950) """),format.raw/*281.36*/("""{"""),format.raw/*281.37*/("""
        columnNumber = 4;
        """),format.raw/*283.9*/("""}"""),format.raw/*283.10*/(""" else if (winWidth > 600) """),format.raw/*283.36*/("""{"""),format.raw/*283.37*/("""
        columnNumber = 3;
        """),format.raw/*285.9*/("""}"""),format.raw/*285.10*/(""" else if (winWidth > 400) """),format.raw/*285.36*/("""{"""),format.raw/*285.37*/("""
        columnNumber = 2;
        """),format.raw/*287.9*/("""}"""),format.raw/*287.10*/(""" else if (winWidth > 250) """),format.raw/*287.36*/("""{"""),format.raw/*287.37*/("""
        columnNumber = 1;
        """),format.raw/*289.9*/("""}"""),format.raw/*289.10*/("""
        return columnNumber;
        """),format.raw/*291.9*/("""}"""),format.raw/*291.10*/("""

        function setColumns() """),format.raw/*293.31*/("""{"""),format.raw/*293.32*/("""
        var winWidth = $(window).width(),
        columnNumber = getColumnNumber(),
        itemWidth = Math.floor(winWidth / columnNumber);

        $container.find('.portfolio-item').each(function() """),format.raw/*298.60*/("""{"""),format.raw/*298.61*/("""
        $(this).css( """),format.raw/*299.22*/("""{"""),format.raw/*299.23*/("""
        width : itemWidth + 'px'
        """),format.raw/*301.9*/("""}"""),format.raw/*301.10*/(""");
        """),format.raw/*302.9*/("""}"""),format.raw/*302.10*/(""");
        """),format.raw/*303.9*/("""}"""),format.raw/*303.10*/("""

        function setPortfolio() """),format.raw/*305.33*/("""{"""),format.raw/*305.34*/("""
        setColumns();
        $container.isotope('reLayout');
        """),format.raw/*308.9*/("""}"""),format.raw/*308.10*/("""

        /*
        $container.imagesLoaded(function () """),format.raw/*311.45*/("""{"""),format.raw/*311.46*/("""
        setPortfolio();
        """),format.raw/*313.9*/("""}"""),format.raw/*313.10*/(""");*/

        $(window).on('resize', function () """),format.raw/*315.44*/("""{"""),format.raw/*315.45*/("""
        setPortfolio();
        """),format.raw/*317.9*/("""}"""),format.raw/*317.10*/(""");



        """),format.raw/*321.9*/("""}"""),format.raw/*321.10*/(""")(jQuery);
        </script>

            <!-- Google Analytics Tracking JS -->
        <script>
        (function(i,s,o,g,r,a,m)"""),format.raw/*326.33*/("""{"""),format.raw/*326.34*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*326.84*/("""{"""),format.raw/*326.85*/("""
        (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*327.44*/("""}"""),format.raw/*327.45*/(""",i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        """),format.raw/*329.9*/("""}"""),format.raw/*329.10*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

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
                    DATE: Sun Oct 12 22:59:37 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/mainTwo.scala.html
                    HASH: 99d3b810d369bdb248c93e51dd423748da8bf7c4
                    MATRIX: 793->1|1071->79|1101->190|1170->224|1184->230|1212->237|1681->670|1696->676|1759->717|1863->785|1878->791|1931->822|2009->864|2024->870|2096->920|2174->962|2189->968|2249->1006|2373->1094|2388->1100|2443->1133|2580->1234|2595->1240|2644->1267|2726->1313|2741->1319|2801->1357|2879->1399|2894->1405|2949->1438|3082->1535|3097->1541|3149->1571|3227->1613|3242->1619|3296->1651|3431->1750|3446->1756|3509->1797|3773->2025|3788->2031|3838->2059|4996->3181|5011->3187|5053->3207|5448->3566|5463->3572|5505->3592|5653->3704|5668->3710|5710->3730|6594->4577|6622->4595|6663->4597|7006->4903|7022->4909|7068->4931|7238->5064|7254->5070|7298->5091|7534->5290|7550->5296|7609->5331|7782->5467|7798->5473|7865->5516|8042->5656|8058->5662|8125->5705|8299->5842|8315->5848|8390->5899|8699->6171|8729->6178|8848->6277|8889->6279|8947->6300|8977->6307|9027->6324|9077->6337|9106->6356|9147->6358|9818->6992|9834->6998|9902->7042|10273->7376|10289->7382|10349->7418|10659->7691|10675->7697|10735->7733|11012->7977|11060->7988|11086->8004|11127->8006|11849->8695|12358->9167|12374->9173|12453->9228|12531->9269|12547->9275|12612->9317|12684->9352|12700->9358|12768->9403|12840->9438|12856->9444|12928->9493|13000->9528|13016->9534|13084->9579|13156->9614|13172->9620|13237->9662|13309->9697|13325->9703|13397->9752|13469->9787|13485->9793|13556->9841|13678->9926|13694->9932|13760->9975|13832->10010|13848->10016|13913->10058|13985->10093|14001->10099|14060->10135|14132->10170|14148->10176|14229->10234|14290->10258|14324->10269|14432->10340|14448->10346|14507->10382|14579->10417|14595->10423|14656->10461|14728->10496|14744->10502|14814->10549|14886->10584|14902->10590|14967->10632|15112->10740|15128->10746|15182->10777|15320->10878|15336->10884|15419->10944|15497->10985|15513->10991|15576->11031|15683->11101|15699->11107|15756->11141|15998->11354|16028->11355|16275->11573|16305->11574|16381->11622|16411->11623|16474->11657|16504->11658|16669->11794|16699->11795|16815->11882|16845->11883|16895->11904|16925->11905|16965->11916|16995->11917|17035->11928|17065->11929|17167->12002|17197->12003|17258->12035|17288->12036|17326->12046|17356->12047|17402->12065|17432->12066|17527->12132|17557->12133|17668->12215|17698->12216|17745->12234|17775->12235|17958->12390|17988->12391|18058->12432|18088->12433|18220->12536|18250->12537|18315->12574|18345->12575|18400->12601|18430->12602|18495->12639|18525->12640|18580->12666|18610->12667|18675->12704|18705->12705|18760->12731|18790->12732|18855->12769|18885->12770|18940->12796|18970->12797|19035->12834|19065->12835|19133->12875|19163->12876|19226->12910|19256->12911|19492->13118|19522->13119|19574->13142|19604->13143|19676->13187|19706->13188|19746->13200|19776->13201|19816->13213|19846->13214|19911->13250|19941->13251|20043->13325|20073->13326|20162->13386|20192->13387|20255->13422|20285->13423|20365->13474|20395->13475|20458->13510|20488->13511|20534->13529|20564->13530|20727->13664|20757->13665|20836->13715|20866->13716|20940->13761|20970->13762|21139->13903|21169->13904
                    LINES: 26->1|32->1|34->5|37->8|37->8|37->8|52->23|52->23|52->23|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|65->36|65->36|65->36|68->39|68->39|68->39|69->40|69->40|69->40|75->46|75->46|75->46|79->50|79->50|79->50|101->72|101->72|101->72|107->78|107->78|107->78|110->81|110->81|110->81|132->103|132->103|132->103|138->109|138->109|138->109|140->111|140->111|140->111|143->114|143->114|143->114|145->116|145->116|145->116|147->118|147->118|147->118|149->120|149->120|149->120|155->126|155->126|159->130|159->130|161->132|161->132|163->134|165->136|165->136|165->136|175->146|175->146|175->146|181->152|181->152|181->152|186->157|186->157|186->157|194->165|195->166|195->166|195->166|209->180|220->191|220->191|220->191|224->195|224->195|224->195|225->196|225->196|225->196|226->197|226->197|226->197|227->198|227->198|227->198|228->199|228->199|228->199|229->200|229->200|229->200|230->201|230->201|230->201|233->204|233->204|233->204|234->205|234->205|234->205|235->206|235->206|235->206|236->207|236->207|236->207|238->209|238->209|240->211|240->211|240->211|241->212|241->212|241->212|242->213|242->213|242->213|243->214|243->214|243->214|246->217|246->217|246->217|249->220|249->220|249->220|253->224|253->224|253->224|257->228|257->228|257->228|268->239|268->239|274->245|274->245|276->247|276->247|278->249|278->249|282->253|282->253|286->257|286->257|287->258|287->258|288->259|288->259|289->260|289->260|291->262|291->262|292->263|292->263|293->264|293->264|294->265|294->265|296->267|296->267|298->269|298->269|298->269|298->269|302->273|302->273|304->275|304->275|308->279|308->279|310->281|310->281|310->281|310->281|312->283|312->283|312->283|312->283|314->285|314->285|314->285|314->285|316->287|316->287|316->287|316->287|318->289|318->289|320->291|320->291|322->293|322->293|327->298|327->298|328->299|328->299|330->301|330->301|331->302|331->302|332->303|332->303|334->305|334->305|337->308|337->308|340->311|340->311|342->313|342->313|344->315|344->315|346->317|346->317|350->321|350->321|355->326|355->326|355->326|355->326|356->327|356->327|358->329|358->329
                    -- GENERATED --
                */
            