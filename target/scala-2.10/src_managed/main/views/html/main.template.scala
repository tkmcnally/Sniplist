
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

                <!-- Favicon -->
            <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*20.46*/routes/*20.52*/.Assets.at("ico/favicon.ico"))),format.raw/*20.81*/("""">

                <!-- Bootstrap core CSS -->
            <link href=""""),_display_(Seq[Any](/*23.26*/routes/*23.32*/.Assets.at("css/bootstrap.css"))),format.raw/*23.63*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*24.26*/routes/*24.32*/.Assets.at("css/font-awesome.min.css"))),format.raw/*24.70*/("""" rel="stylesheet">

            <link href=""""),_display_(Seq[Any](/*26.26*/routes/*26.32*/.Assets.at("css/transparent.css"))),format.raw/*26.65*/("""" rel="stylesheet"/>

                <!-- Custom styles for this template -->
            <link href=""""),_display_(Seq[Any](/*29.26*/routes/*29.32*/.Assets.at("css/style.css"))),format.raw/*29.59*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*30.26*/routes/*30.32*/.Assets.at("css/responsive-video.css"))),format.raw/*30.70*/("""" rel="stylesheet">

                <!-- Custom styles for snips -->
            <link href=""""),_display_(Seq[Any](/*33.26*/routes/*33.32*/.Assets.at("css/prettify.css"))),format.raw/*33.62*/("""" rel="stylesheet">
            <link href=""""),_display_(Seq[Any](/*34.26*/routes/*34.32*/.Assets.at("css/tablecloth.css"))),format.raw/*34.64*/("""" rel="stylesheet">


            <link  href=""""),_display_(Seq[Any](/*37.27*/routes/*37.33*/.Assets.at("css/mediaelementplayer.css"))),format.raw/*37.73*/("""" rel="Stylesheet" />
            <link  href=""""),_display_(Seq[Any](/*38.27*/routes/*38.33*/.Assets.at("css/mejs-skins.css"))),format.raw/*38.65*/("""" rel="Stylesheet" />

            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>
                <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>-->
            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*43.50*/routes/*43.56*/.Assets.at("js/jQEditRangeSlider-min.js"))),format.raw/*43.97*/(""""></script>
            <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
            <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*45.59*/routes/*45.65*/.Assets.at("css/iThing.css"))),format.raw/*45.93*/("""">

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
                        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*69.56*/routes/*69.62*/.Application.index())),format.raw/*69.82*/("""">SNIPLIST.</a>
                        """),_display_(Seq[Any](/*70.26*/subjectPresent()/*70.42*/ {_display_(Seq[Any](format.raw/*70.44*/("""
                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search">
                                </div>
                                <button type="submit" class="btn btn-default">Submit</button>
                            </form>
                        """)))})),format.raw/*77.26*/("""
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*82.30*/subjectPresentOr()/*82.48*/ {_display_(Seq[Any](format.raw/*82.50*/("""
                                """),_display_(Seq[Any](/*83.34*/generators/*83.44*/.navbarMenu(routes.Snips.add(), "ADD SNIP"))),format.raw/*83.87*/("""
                                """),_display_(Seq[Any](/*84.34*/generators/*84.44*/.navbarMenu(routes.Snips.mySnips(), "MY SNIPS"))),format.raw/*84.91*/("""
                            """)))}/*85.30*/ {_display_(Seq[Any](format.raw/*85.32*/("""
                                """),_display_(Seq[Any](/*86.34*/generators/*86.44*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*86.91*/("""
                            """)))})),format.raw/*87.30*/("""
                            """),_display_(Seq[Any](/*88.30*/subjectNotPresent()/*88.49*/ {_display_(Seq[Any](format.raw/*88.51*/("""
                                """),_display_(Seq[Any](/*89.34*/generators/*89.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*89.92*/("""
                                """),_display_(Seq[Any](/*90.34*/generators/*90.44*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*90.96*/("""
                            """)))})),format.raw/*91.30*/("""

                            """),_display_(Seq[Any](/*93.30*/subjectPresentOr()/*93.48*/ {_display_(Seq[Any](format.raw/*93.50*/("""
                                """),_display_(Seq[Any](/*94.34*/defining(Application.getLocalUser(session()))/*94.79*/ { user =>_display_(Seq[Any](format.raw/*94.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="icon-user"></i> """),_display_(Seq[Any](/*98.76*/user/*98.80*/.name.toUpperCase())),format.raw/*98.99*/("""
                                                <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a href=""""),_display_(Seq[Any](/*103.63*/routes/*103.69*/.Application.profile())),format.raw/*103.91*/("""">"""),_display_(Seq[Any](/*103.94*/Messages("playauthenticate.navigation.profile")/*103.141*/.toUpperCase())),format.raw/*103.155*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*105.63*/com/*105.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*105.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*105.155*/Messages("playauthenticate.navigation.logout")/*105.201*/.toUpperCase())),format.raw/*105.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*109.34*/("""
                                """),_display_(Seq[Any](/*110.34*/generators/*110.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*110.92*/("""
                            """)))}/*111.30*/{_display_(Seq[Any](format.raw/*111.31*/("""

                                """),_display_(Seq[Any](/*113.34*/generators/*113.44*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*113.94*/("""
                            """)))})),format.raw/*114.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <div id="wrapper-content">

                        <!-- INSERTED CONTENT GOES HERE -->
                    """),_display_(Seq[Any](/*124.22*/content)),format.raw/*124.29*/("""
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
            <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>-->
            <script src=""""),_display_(Seq[Any](/*161.27*/routes/*161.33*/.Assets.at("js/bootstrap.min.js"))),format.raw/*161.66*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*162.27*/routes/*162.33*/.Assets.at("js/retina-1.1.0.js"))),format.raw/*162.65*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*163.27*/routes/*163.33*/.Assets.at("js/jquery.hoverdir.js"))),format.raw/*163.68*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*164.27*/routes/*164.33*/.Assets.at("js/jquery.hoverex.min.js"))),format.raw/*164.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*165.27*/routes/*165.33*/.Assets.at("js/jquery.prettyPhoto.js"))),format.raw/*165.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*166.27*/routes/*166.33*/.Assets.at("js/jquery.isotope.min.js"))),format.raw/*166.71*/(""""></script>
            <!--<script src=""""),_display_(Seq[Any](/*167.31*/routes/*167.37*/.Assets.at("js/custom.js"))),format.raw/*167.63*/(""""></script>-->

            <!--<script src=""""),_display_(Seq[Any](/*169.31*/routes/*169.37*/.Assets.at("js/jquery-1.7.2.min.js"))),format.raw/*169.73*/(""""></script>-->
            <!--<script src=""""),_display_(Seq[Any](/*170.31*/routes/*170.37*/.Assets.at("js/jquery.min.js"))),format.raw/*170.67*/(""""></script>-->
            <script src=""""),_display_(Seq[Any](/*171.27*/routes/*171.33*/.Assets.at("js/jquery.metadata.js"))),format.raw/*171.68*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*172.27*/routes/*172.33*/.Assets.at("js/jquery.tablesorter.min.js"))),format.raw/*172.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*173.27*/routes/*173.33*/.Assets.at("js/jquery.tablecloth.js"))),format.raw/*173.70*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*174.27*/routes/*174.33*/.Assets.at("js/bootstrap.js"))),format.raw/*174.62*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*176.27*/routes/*176.33*/.Assets.at("js/youtube_embed_formatter.js"))),format.raw/*176.76*/(""""></script>


            <script type="text/javascript" src='"""),_display_(Seq[Any](/*179.50*/routes/*179.56*/.Application.javascriptRoutes())),format.raw/*179.87*/("""'></script>


            <!-- Media Element Player -->
            <script src=""""),_display_(Seq[Any](/*183.27*/routes/*183.33*/.Assets.at("js/mediaelement-and-player.min.js"))),format.raw/*183.80*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*184.27*/routes/*184.33*/.Assets.at("js/custom-crop-slider.js"))),format.raw/*184.71*/(""""></script>


            <script type="text/javascript" charset="utf-8">


            $('.dropdown-delete-snip').click(function(e) """),format.raw/*190.58*/("""{"""),format.raw/*190.59*/("""
                e.preventDefault();
                deleteSnip($(this));
            """),format.raw/*193.13*/("""}"""),format.raw/*193.14*/(""");

            $('#url-input').keypress(function(e) """),format.raw/*195.50*/("""{"""),format.raw/*195.51*/("""
            if( e.which == 13) """),format.raw/*196.32*/("""{"""),format.raw/*196.33*/("""
            getVideo ( $ ( this ).val ( ) ) ;

            """),format.raw/*199.13*/("""}"""),format.raw/*199.14*/("""
            """),format.raw/*200.13*/("""}"""),format.raw/*200.14*/(""");

            $('#url-input-btn').click(function() """),format.raw/*202.50*/("""{"""),format.raw/*202.51*/("""
            getVideo($('#url-input').val());
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/(""");


            $('#save_snip_btn').click(function() """),format.raw/*207.50*/("""{"""),format.raw/*207.51*/("""
            saveSnip();
            """),format.raw/*209.13*/("""}"""),format.raw/*209.14*/(""");






            $(document).ready(function() """),format.raw/*216.42*/("""{"""),format.raw/*216.43*/("""
                $("table").tablecloth("""),format.raw/*217.39*/("""{"""),format.raw/*217.40*/("""
                    theme: "dark",
                    bordered: true,
                    condensed: true,
                    striped: true,
                    sortable: true,
                    clean: true,
                    cleanElements: "th td",
                    customClass: "my-table"
                """),format.raw/*226.17*/("""}"""),format.raw/*226.18*/(""");


            """),format.raw/*229.13*/("""}"""),format.raw/*229.14*/(""");




            </script>

            <script>
            // Portfolio
            (function($) """),format.raw/*238.26*/("""{"""),format.raw/*238.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*244.61*/("""{"""),format.raw/*244.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*246.13*/("""}"""),format.raw/*246.14*/("""

           /* $container.isotope("""),format.raw/*248.34*/("""{"""),format.raw/*248.35*/("""
            filter: '*',
            animationEngine: 'best-available',
            layoutMode: portfolioLayout,
            animationOptions: """),format.raw/*252.31*/("""{"""),format.raw/*252.32*/("""
            duration: 750,
            easing: 'linear',
            queue: false
            """),format.raw/*256.13*/("""}"""),format.raw/*256.14*/(""",
            masonry: """),format.raw/*257.22*/("""{"""),format.raw/*257.23*/("""
            """),format.raw/*258.13*/("""}"""),format.raw/*258.14*/("""
            """),format.raw/*259.13*/("""}"""),format.raw/*259.14*/(""", refreshWaypoints());
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
        </body>
    </html>"""))}
    }
    
    def render(title:String,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 16:12:08 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: f14056841c994b735df547a893cb0791c5f994ee
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1762->675|1777->681|1828->710|1940->786|1955->792|2008->823|2090->869|2105->875|2165->913|2249->961|2264->967|2319->1000|2462->1107|2477->1113|2526->1140|2608->1186|2623->1192|2683->1230|2817->1328|2832->1334|2884->1364|2966->1410|2981->1416|3035->1448|3122->1499|3137->1505|3199->1545|3284->1594|3299->1600|3353->1632|3776->2019|3791->2025|3854->2066|4079->2255|4094->2261|4144->2289|5264->3373|5279->3379|5321->3399|5399->3441|5424->3457|5464->3459|5934->3897|6238->4165|6265->4183|6305->4185|6376->4220|6395->4230|6460->4273|6531->4308|6550->4318|6619->4365|6669->4396|6709->4398|6780->4433|6799->4443|6868->4490|6931->4521|6998->4552|7026->4571|7066->4573|7137->4608|7156->4618|7226->4666|7297->4701|7316->4711|7390->4763|7453->4794|7522->4827|7549->4845|7589->4847|7660->4882|7714->4927|7762->4937|8090->5229|8103->5233|8144->5252|8446->5517|8462->5523|8507->5545|8547->5548|8605->5595|8643->5609|8828->5757|8841->5760|8926->5821|8992->5849|9049->5895|9087->5909|9306->6095|9378->6130|9398->6140|9469->6188|9520->6219|9560->6220|9634->6257|9654->6267|9727->6317|9791->6348|10083->6603|10113->6610|12175->8635|12191->8641|12247->8674|12323->8713|12339->8719|12394->8751|12470->8790|12486->8796|12544->8831|12620->8870|12636->8876|12697->8914|12773->8953|12789->8959|12850->8997|12926->9036|12942->9042|13003->9080|13083->9123|13099->9129|13148->9155|13233->9203|13249->9209|13308->9245|13391->9291|13407->9297|13460->9327|13539->9369|13555->9375|13613->9410|13689->9449|13705->9455|13770->9497|13846->9536|13862->9542|13922->9579|13998->9618|14014->9624|14066->9653|14144->9694|14160->9700|14226->9743|14329->9809|14345->9815|14399->9846|14522->9932|14538->9938|14608->9985|14684->10024|14700->10030|14761->10068|14929->10207|14959->10208|15077->10297|15107->10298|15191->10353|15221->10354|15283->10387|15313->10388|15405->10451|15435->10452|15478->10466|15508->10467|15592->10522|15622->10523|15711->10583|15741->10584|15827->10641|15857->10642|15925->10681|15955->10682|16041->10739|16071->10740|16140->10780|16170->10781|16525->11107|16555->11108|16604->11128|16634->11129|16773->11239|16803->11240|17070->11478|17100->11479|17185->11535|17215->11536|17281->11573|17311->11574|17488->11722|17518->11723|17646->11822|17676->11823|17729->11847|17759->11848|17802->11862|17832->11863|17875->11877|17905->11878|18014->11958|18044->11959|18109->11995|18139->11996|18182->12010|18212->12011|18263->12033|18293->12034|18392->12104|18422->12105|18541->12195|18571->12196|18618->12214|18648->12215|18848->12386|18878->12387|18952->12432|18982->12433|19126->12548|19156->12549|19230->12594|19260->12595|19315->12621|19345->12622|19419->12667|19449->12668|19504->12694|19534->12695|19608->12740|19638->12741|19693->12767|19723->12768|19797->12813|19827->12814|19882->12840|19912->12841|19986->12886|20016->12887|20093->12935|20123->12936|20190->12974|20220->12975|20472->13198|20502->13199|20558->13226|20588->13227|20669->13279|20699->13280|20744->13296|20774->13297|20819->13313|20849->13314|20918->13354|20948->13355|21063->13441|21093->13442|21190->13510|21220->13511|21292->13554|21322->13555|21406->13610|21436->13611|21508->13654|21538->13655|21589->13677|21619->13678
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|55->26|55->26|55->26|58->29|58->29|58->29|59->30|59->30|59->30|62->33|62->33|62->33|63->34|63->34|63->34|66->37|66->37|66->37|67->38|67->38|67->38|72->43|72->43|72->43|74->45|74->45|74->45|98->69|98->69|98->69|99->70|99->70|99->70|106->77|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|114->85|115->86|115->86|115->86|116->87|117->88|117->88|117->88|118->89|118->89|118->89|119->90|119->90|119->90|120->91|122->93|122->93|122->93|123->94|123->94|123->94|127->98|127->98|127->98|132->103|132->103|132->103|132->103|132->103|132->103|134->105|134->105|134->105|134->105|134->105|134->105|138->109|139->110|139->110|139->110|140->111|140->111|142->113|142->113|142->113|143->114|153->124|153->124|190->161|190->161|190->161|191->162|191->162|191->162|192->163|192->163|192->163|193->164|193->164|193->164|194->165|194->165|194->165|195->166|195->166|195->166|196->167|196->167|196->167|198->169|198->169|198->169|199->170|199->170|199->170|200->171|200->171|200->171|201->172|201->172|201->172|202->173|202->173|202->173|203->174|203->174|203->174|205->176|205->176|205->176|208->179|208->179|208->179|212->183|212->183|212->183|213->184|213->184|213->184|219->190|219->190|222->193|222->193|224->195|224->195|225->196|225->196|228->199|228->199|229->200|229->200|231->202|231->202|233->204|233->204|236->207|236->207|238->209|238->209|245->216|245->216|246->217|246->217|255->226|255->226|258->229|258->229|267->238|267->238|273->244|273->244|275->246|275->246|277->248|277->248|281->252|281->252|285->256|285->256|286->257|286->257|287->258|287->258|288->259|288->259|290->261|290->261|291->262|291->262|292->263|292->263|293->264|293->264|295->266|295->266|297->268|297->268|297->268|297->268|301->272|301->272|303->274|303->274|307->278|307->278|309->280|309->280|309->280|309->280|311->282|311->282|311->282|311->282|313->284|313->284|313->284|313->284|315->286|315->286|315->286|315->286|317->288|317->288|319->290|319->290|321->292|321->292|326->297|326->297|327->298|327->298|329->300|329->300|330->301|330->301|331->302|331->302|333->304|333->304|336->307|336->307|339->310|339->310|341->312|341->312|343->314|343->314|345->316|345->316|349->320|349->320
                    -- GENERATED --
                */
            