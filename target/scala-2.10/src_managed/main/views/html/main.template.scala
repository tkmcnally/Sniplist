
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


            <!-- Styles for MediaElementJs -->
            <link  href=""""),_display_(Seq[Any](/*39.27*/routes/*39.33*/.Assets.at("css/mediaelementplayer.css"))),format.raw/*39.73*/("""" rel="Stylesheet" />
            <link  href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Assets.at("css/mejs-skins.css"))),format.raw/*40.65*/("""" rel="Stylesheet" />

            <!-- JQueryUI CSS -->
            <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
            <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*44.59*/routes/*44.65*/.Assets.at("css/iThing.css"))),format.raw/*44.93*/("""">

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
                        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*60.56*/routes/*60.62*/.Application.index())),format.raw/*60.82*/("""">SNIPLIST.</a>
                        """),_display_(Seq[Any](/*61.26*/subjectPresent()/*61.42*/ {_display_(Seq[Any](format.raw/*61.44*/("""
                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search">
                                </div>
                                <button type="submit" class="btn btn-default">Submit</button>
                            </form>
                        """)))})),format.raw/*68.26*/("""
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*73.30*/subjectPresentOr()/*73.48*/ {_display_(Seq[Any](format.raw/*73.50*/("""
                                """),_display_(Seq[Any](/*74.34*/generators/*74.44*/.navbarMenu(routes.Snips.add(), "ADD SNIP"))),format.raw/*74.87*/("""
                                """),_display_(Seq[Any](/*75.34*/generators/*75.44*/.navbarMenu(routes.Snips.mySnips(), "MY SNIPS"))),format.raw/*75.91*/("""
                            """)))}/*76.30*/ {_display_(Seq[Any](format.raw/*76.32*/("""
                                """),_display_(Seq[Any](/*77.34*/generators/*77.44*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*77.91*/("""
                            """)))})),format.raw/*78.30*/("""
                            """),_display_(Seq[Any](/*79.30*/subjectNotPresent()/*79.49*/ {_display_(Seq[Any](format.raw/*79.51*/("""
                                """),_display_(Seq[Any](/*80.34*/generators/*80.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*80.92*/("""
                                """),_display_(Seq[Any](/*81.34*/generators/*81.44*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*81.96*/("""
                            """)))})),format.raw/*82.30*/("""

                            """),_display_(Seq[Any](/*84.30*/subjectPresentOr()/*84.48*/ {_display_(Seq[Any](format.raw/*84.50*/("""
                                """),_display_(Seq[Any](/*85.34*/defining(Application.getLocalUser(session()))/*85.79*/ { user =>_display_(Seq[Any](format.raw/*85.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="icon-user"></i> """),_display_(Seq[Any](/*89.76*/user/*89.80*/.name.toUpperCase())),format.raw/*89.99*/("""
                                                <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a href=""""),_display_(Seq[Any](/*94.63*/routes/*94.69*/.Application.profile())),format.raw/*94.91*/("""">"""),_display_(Seq[Any](/*94.94*/Messages("playauthenticate.navigation.profile")/*94.141*/.toUpperCase())),format.raw/*94.155*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*96.63*/com/*96.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*96.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*96.155*/Messages("playauthenticate.navigation.logout")/*96.201*/.toUpperCase())),format.raw/*96.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*100.34*/("""
                                """),_display_(Seq[Any](/*101.34*/generators/*101.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*101.92*/("""
                            """)))}/*102.30*/{_display_(Seq[Any](format.raw/*102.31*/("""

                                """),_display_(Seq[Any](/*104.34*/generators/*104.44*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*104.94*/("""
                            """)))})),format.raw/*105.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <div id="wrapper-content">
                        <!-- INSERTED CONTENT GOES HERE (From other scala templates) -->
                    """),_display_(Seq[Any](/*114.22*/content)),format.raw/*114.29*/("""
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

            """),_display_(Seq[Any](/*148.14*/subjectPresent()/*148.30*/ {_display_(Seq[Any](format.raw/*148.32*/("""
                <div id="sticky-footer" class="navbar navbar-default navbar-fixed-bottom">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-3"></div>
                            <div class="col-md-6">
                                <div class="navbar-player">
                                    <audio id="audioPlayer" type="audio/youtube" controls="controls" src="https://www.youtube.com/watch?v=smqNtBXN5Mc" ></audio>
                                </div>
                            </div>
                            <div class="col-md-3"></div>
                        </div>
                    </div>
                </div>
            """)))})),format.raw/*162.14*/("""



            <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

            <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

            <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*175.50*/routes/*175.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*175.111*/(""""></script>

            <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*178.27*/routes/*178.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*178.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*179.27*/routes/*179.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*179.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*180.27*/routes/*180.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*180.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*181.27*/routes/*181.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*181.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*182.27*/routes/*182.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*182.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*183.27*/routes/*183.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*183.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*184.27*/routes/*184.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*184.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*185.27*/routes/*185.33*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*185.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*186.27*/routes/*186.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*186.81*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*187.27*/routes/*187.33*/.Assets.at("js/bootstrap/bootstrap.js"))),format.raw/*187.72*/(""""></script>

            <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*190.27*/routes/*190.33*/.Assets.at("js/sniplist/media_player_youtube.js"))),format.raw/*190.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*191.27*/routes/*191.33*/.Assets.at("js/sniplist/my_snips_table.js"))),format.raw/*191.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*192.27*/routes/*192.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*192.80*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*195.27*/routes/*195.33*/.Application.javascriptRoutes())),format.raw/*195.64*/("""" type="text/javascript"></script>

            <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*198.27*/routes/*198.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*198.93*/(""""></script>


            <script type="text/javascript" charset="utf-8">

                //GLOBAL MEDIA PLAYER
                var globalPlayer;

                var globalAudioPlayer;

                // Portfolio
                (function($) """),format.raw/*209.30*/("""{"""),format.raw/*209.31*/("""
                "use strict";
                var $container = $('.portfolio'),
                $items = $container.find('.portfolio-item'),
                portfolioLayout = 'fitRows';

                if( $container.hasClass('portfolio-centered') ) """),format.raw/*215.65*/("""{"""),format.raw/*215.66*/("""
                portfolioLayout = 'masonry';
                """),format.raw/*217.17*/("""}"""),format.raw/*217.18*/("""

               /* $container.isotope("""),format.raw/*219.38*/("""{"""),format.raw/*219.39*/("""
                filter: '*',
                animationEngine: 'best-available',
                layoutMode: portfolioLayout,
                animationOptions: """),format.raw/*223.35*/("""{"""),format.raw/*223.36*/("""
                duration: 750,
                easing: 'linear',
                queue: false
                """),format.raw/*227.17*/("""}"""),format.raw/*227.18*/(""",
                masonry: """),format.raw/*228.26*/("""{"""),format.raw/*228.27*/("""
                """),format.raw/*229.17*/("""}"""),format.raw/*229.18*/("""
                """),format.raw/*230.17*/("""}"""),format.raw/*230.18*/(""", refreshWaypoints());
                */
                function refreshWaypoints() """),format.raw/*232.45*/("""{"""),format.raw/*232.46*/("""
                setTimeout(function() """),format.raw/*233.39*/("""{"""),format.raw/*233.40*/("""
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/(""", 1000);
                """),format.raw/*235.17*/("""}"""),format.raw/*235.18*/("""

                $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*237.71*/("""{"""),format.raw/*237.72*/("""
                var selector = $(this).attr('data-filter');
                $container.isotope("""),format.raw/*239.36*/("""{"""),format.raw/*239.37*/(""" filter: selector """),format.raw/*239.55*/("""}"""),format.raw/*239.56*/(""", refreshWaypoints());
                $('nav.portfolio-filter ul a').removeClass('active');
                $(this).addClass('active');
                return false;
                """),format.raw/*243.17*/("""}"""),format.raw/*243.18*/(""");

                function getColumnNumber() """),format.raw/*245.44*/("""{"""),format.raw/*245.45*/("""
                var winWidth = $(window).width(),
                columnNumber = 1;

                if (winWidth > 1200) """),format.raw/*249.38*/("""{"""),format.raw/*249.39*/("""
                columnNumber = 5;
                """),format.raw/*251.17*/("""}"""),format.raw/*251.18*/(""" else if (winWidth > 950) """),format.raw/*251.44*/("""{"""),format.raw/*251.45*/("""
                columnNumber = 4;
                """),format.raw/*253.17*/("""}"""),format.raw/*253.18*/(""" else if (winWidth > 600) """),format.raw/*253.44*/("""{"""),format.raw/*253.45*/("""
                columnNumber = 3;
                """),format.raw/*255.17*/("""}"""),format.raw/*255.18*/(""" else if (winWidth > 400) """),format.raw/*255.44*/("""{"""),format.raw/*255.45*/("""
                columnNumber = 2;
                """),format.raw/*257.17*/("""}"""),format.raw/*257.18*/(""" else if (winWidth > 250) """),format.raw/*257.44*/("""{"""),format.raw/*257.45*/("""
                columnNumber = 1;
                """),format.raw/*259.17*/("""}"""),format.raw/*259.18*/("""
                return columnNumber;
                """),format.raw/*261.17*/("""}"""),format.raw/*261.18*/("""

                function setColumns() """),format.raw/*263.39*/("""{"""),format.raw/*263.40*/("""
                var winWidth = $(window).width(),
                columnNumber = getColumnNumber(),
                itemWidth = Math.floor(winWidth / columnNumber);

                $container.find('.portfolio-item').each(function() """),format.raw/*268.68*/("""{"""),format.raw/*268.69*/("""
                $(this).css( """),format.raw/*269.30*/("""{"""),format.raw/*269.31*/("""
                width : itemWidth + 'px'
                """),format.raw/*271.17*/("""}"""),format.raw/*271.18*/(""");
                """),format.raw/*272.17*/("""}"""),format.raw/*272.18*/(""");
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/("""

                function setPortfolio() """),format.raw/*275.41*/("""{"""),format.raw/*275.42*/("""
                setColumns();
                $container.isotope('reLayout');
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/("""

                /*
                $container.imagesLoaded(function () """),format.raw/*281.53*/("""{"""),format.raw/*281.54*/("""
                setPortfolio();
                """),format.raw/*283.17*/("""}"""),format.raw/*283.18*/(""");*/

                $(window).on('resize', function () """),format.raw/*285.52*/("""{"""),format.raw/*285.53*/("""
                setPortfolio();
                """),format.raw/*287.17*/("""}"""),format.raw/*287.18*/(""");



                """),format.raw/*291.17*/("""}"""),format.raw/*291.18*/(""")(jQuery);
            </script>

            <!-- Google Analytics Tracking JS -->
            <script>
                (function(i,s,o,g,r,a,m)"""),format.raw/*296.41*/("""{"""),format.raw/*296.42*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*296.92*/("""{"""),format.raw/*296.93*/("""
                (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*297.52*/("""}"""),format.raw/*297.53*/(""",i[r].l=1*new Date();a=s.createElement(o),
                m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
                """),format.raw/*299.17*/("""}"""),format.raw/*299.18*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

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
                    DATE: Fri Jun 27 03:14:31 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: ddf7c09bca0fededaaa92affc11e60823ab989ff
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1767->680|1782->686|1839->721|1947->793|1962->799|2015->830|2097->876|2112->882|2172->920|2300->1012|2315->1018|2370->1051|2504->1149|2519->1155|2568->1182|2650->1228|2665->1234|2725->1272|2866->1377|2881->1383|2933->1413|3015->1459|3030->1465|3084->1497|3219->1596|3234->1602|3296->1642|3381->1691|3396->1697|3450->1729|3722->1965|3737->1971|3787->1999|4549->2725|4564->2731|4606->2751|4684->2793|4709->2809|4749->2811|5219->3249|5523->3517|5550->3535|5590->3537|5661->3572|5680->3582|5745->3625|5816->3660|5835->3670|5904->3717|5954->3748|5994->3750|6065->3785|6084->3795|6153->3842|6216->3873|6283->3904|6311->3923|6351->3925|6422->3960|6441->3970|6511->4018|6582->4053|6601->4063|6675->4115|6738->4146|6807->4179|6834->4197|6874->4199|6945->4234|6999->4279|7047->4289|7375->4581|7388->4585|7429->4604|7730->4869|7745->4875|7789->4897|7828->4900|7885->4947|7922->4961|8106->5109|8118->5112|8202->5173|8267->5201|8323->5247|8360->5261|8579->5447|8651->5482|8671->5492|8742->5540|8793->5571|8833->5572|8907->5609|8927->5619|9000->5669|9064->5700|9383->5982|9413->5989|11161->7700|11187->7716|11228->7718|12007->8464|12532->8952|12548->8958|12627->9013|12753->9102|12769->9108|12835->9151|12911->9190|12927->9196|12992->9238|13068->9277|13084->9283|13149->9325|13225->9364|13241->9370|13309->9415|13385->9454|13401->9460|13473->9509|13549->9548|13565->9554|13633->9599|13709->9638|13725->9644|13790->9686|13866->9725|13882->9731|13954->9780|14030->9819|14046->9825|14117->9873|14193->9912|14209->9918|14271->9957|14396->10045|14412->10051|14484->10100|14560->10139|14576->10145|14642->10188|14718->10227|14734->10233|14804->10280|14953->10392|14969->10398|15023->10429|15165->10534|15181->10540|15264->10600|15550->10857|15580->10858|15867->11116|15897->11117|15990->11181|16020->11182|16090->11223|16120->11224|16313->11388|16343->11389|16487->11504|16517->11505|16574->11533|16604->11534|16651->11552|16681->11553|16728->11571|16758->11572|16875->11660|16905->11661|16974->11701|17004->11702|17051->11720|17081->11721|17136->11747|17166->11748|17269->11822|17299->11823|17426->11921|17456->11922|17503->11940|17533->11941|17749->12128|17779->12129|17857->12178|17887->12179|18043->12306|18073->12307|18155->12360|18185->12361|18240->12387|18270->12388|18352->12441|18382->12442|18437->12468|18467->12469|18549->12522|18579->12523|18634->12549|18664->12550|18746->12603|18776->12604|18831->12630|18861->12631|18943->12684|18973->12685|19058->12741|19088->12742|19159->12784|19189->12785|19457->13024|19487->13025|19547->13056|19577->13057|19666->13117|19696->13118|19745->13138|19775->13139|19824->13159|19854->13160|19927->13204|19957->13205|20084->13303|20114->13304|20219->13380|20249->13381|20329->13432|20359->13433|20447->13492|20477->13493|20557->13544|20587->13545|20642->13571|20672->13572|20851->13722|20881->13723|20960->13773|20990->13774|21072->13827|21102->13828|21288->13985|21318->13986
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|59->30|59->30|59->30|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|68->39|68->39|68->39|69->40|69->40|69->40|73->44|73->44|73->44|89->60|89->60|89->60|90->61|90->61|90->61|97->68|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|106->77|106->77|106->77|107->78|108->79|108->79|108->79|109->80|109->80|109->80|110->81|110->81|110->81|111->82|113->84|113->84|113->84|114->85|114->85|114->85|118->89|118->89|118->89|123->94|123->94|123->94|123->94|123->94|123->94|125->96|125->96|125->96|125->96|125->96|125->96|129->100|130->101|130->101|130->101|131->102|131->102|133->104|133->104|133->104|134->105|143->114|143->114|177->148|177->148|177->148|191->162|204->175|204->175|204->175|207->178|207->178|207->178|208->179|208->179|208->179|209->180|209->180|209->180|210->181|210->181|210->181|211->182|211->182|211->182|212->183|212->183|212->183|213->184|213->184|213->184|214->185|214->185|214->185|215->186|215->186|215->186|216->187|216->187|216->187|219->190|219->190|219->190|220->191|220->191|220->191|221->192|221->192|221->192|224->195|224->195|224->195|227->198|227->198|227->198|238->209|238->209|244->215|244->215|246->217|246->217|248->219|248->219|252->223|252->223|256->227|256->227|257->228|257->228|258->229|258->229|259->230|259->230|261->232|261->232|262->233|262->233|263->234|263->234|264->235|264->235|266->237|266->237|268->239|268->239|268->239|268->239|272->243|272->243|274->245|274->245|278->249|278->249|280->251|280->251|280->251|280->251|282->253|282->253|282->253|282->253|284->255|284->255|284->255|284->255|286->257|286->257|286->257|286->257|288->259|288->259|290->261|290->261|292->263|292->263|297->268|297->268|298->269|298->269|300->271|300->271|301->272|301->272|302->273|302->273|304->275|304->275|307->278|307->278|310->281|310->281|312->283|312->283|314->285|314->285|316->287|316->287|320->291|320->291|325->296|325->296|325->296|325->296|326->297|326->297|328->299|328->299
                    -- GENERATED --
                */
            