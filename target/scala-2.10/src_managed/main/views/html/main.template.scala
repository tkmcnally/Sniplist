
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



            <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

            <!-- JQuery JS External Imports -->
            <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>
            <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

            <!-- JQRangeSlider JS -->
            <script type="text/javascript" src=""""),_display_(Seq[Any](/*158.50*/routes/*158.56*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*158.111*/(""""></script>

            <!-- Bootstrap core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*161.27*/routes/*161.33*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*161.76*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*162.27*/routes/*162.33*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*162.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*163.27*/routes/*163.33*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*163.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*164.27*/routes/*164.33*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*164.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*165.27*/routes/*165.33*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*165.82*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*166.27*/routes/*166.33*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*166.78*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*167.27*/routes/*167.33*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*167.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*168.27*/routes/*168.33*/.Assets.at("js/tablecloth/jquery.tablesorter.min.js"))),format.raw/*168.86*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*169.27*/routes/*169.33*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*169.81*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*170.27*/routes/*170.33*/.Assets.at("js/bootstrap/bootstrap.js"))),format.raw/*170.72*/(""""></script>

            <!-- Sniplist core JavaScript -->
            <script src=""""),_display_(Seq[Any](/*173.27*/routes/*173.33*/.Assets.at("js/sniplist/media_player_youtube.js"))),format.raw/*173.82*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
            <script src=""""),_display_(Seq[Any](/*176.27*/routes/*176.33*/.Application.javascriptRoutes())),format.raw/*176.64*/("""" type="text/javascript"></script>

            <!-- MediaElementPlayer -->
            <script src=""""),_display_(Seq[Any](/*179.27*/routes/*179.33*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*179.93*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*180.27*/routes/*180.33*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*180.80*/(""""></script>

            <script type="text/javascript" charset="utf-8">

                //GLOBAL MEDIA PLAYER
                var globalPlayer;

                // Portfolio
                (function($) """),format.raw/*188.30*/("""{"""),format.raw/*188.31*/("""
                "use strict";
                var $container = $('.portfolio'),
                $items = $container.find('.portfolio-item'),
                portfolioLayout = 'fitRows';

                if( $container.hasClass('portfolio-centered') ) """),format.raw/*194.65*/("""{"""),format.raw/*194.66*/("""
                portfolioLayout = 'masonry';
                """),format.raw/*196.17*/("""}"""),format.raw/*196.18*/("""

               /* $container.isotope("""),format.raw/*198.38*/("""{"""),format.raw/*198.39*/("""
                filter: '*',
                animationEngine: 'best-available',
                layoutMode: portfolioLayout,
                animationOptions: """),format.raw/*202.35*/("""{"""),format.raw/*202.36*/("""
                duration: 750,
                easing: 'linear',
                queue: false
                """),format.raw/*206.17*/("""}"""),format.raw/*206.18*/(""",
                masonry: """),format.raw/*207.26*/("""{"""),format.raw/*207.27*/("""
                """),format.raw/*208.17*/("""}"""),format.raw/*208.18*/("""
                """),format.raw/*209.17*/("""}"""),format.raw/*209.18*/(""", refreshWaypoints());
                */
                function refreshWaypoints() """),format.raw/*211.45*/("""{"""),format.raw/*211.46*/("""
                setTimeout(function() """),format.raw/*212.39*/("""{"""),format.raw/*212.40*/("""
                """),format.raw/*213.17*/("""}"""),format.raw/*213.18*/(""", 1000);
                """),format.raw/*214.17*/("""}"""),format.raw/*214.18*/("""

                $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*216.71*/("""{"""),format.raw/*216.72*/("""
                var selector = $(this).attr('data-filter');
                $container.isotope("""),format.raw/*218.36*/("""{"""),format.raw/*218.37*/(""" filter: selector """),format.raw/*218.55*/("""}"""),format.raw/*218.56*/(""", refreshWaypoints());
                $('nav.portfolio-filter ul a').removeClass('active');
                $(this).addClass('active');
                return false;
                """),format.raw/*222.17*/("""}"""),format.raw/*222.18*/(""");

                function getColumnNumber() """),format.raw/*224.44*/("""{"""),format.raw/*224.45*/("""
                var winWidth = $(window).width(),
                columnNumber = 1;

                if (winWidth > 1200) """),format.raw/*228.38*/("""{"""),format.raw/*228.39*/("""
                columnNumber = 5;
                """),format.raw/*230.17*/("""}"""),format.raw/*230.18*/(""" else if (winWidth > 950) """),format.raw/*230.44*/("""{"""),format.raw/*230.45*/("""
                columnNumber = 4;
                """),format.raw/*232.17*/("""}"""),format.raw/*232.18*/(""" else if (winWidth > 600) """),format.raw/*232.44*/("""{"""),format.raw/*232.45*/("""
                columnNumber = 3;
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/(""" else if (winWidth > 400) """),format.raw/*234.44*/("""{"""),format.raw/*234.45*/("""
                columnNumber = 2;
                """),format.raw/*236.17*/("""}"""),format.raw/*236.18*/(""" else if (winWidth > 250) """),format.raw/*236.44*/("""{"""),format.raw/*236.45*/("""
                columnNumber = 1;
                """),format.raw/*238.17*/("""}"""),format.raw/*238.18*/("""
                return columnNumber;
                """),format.raw/*240.17*/("""}"""),format.raw/*240.18*/("""

                function setColumns() """),format.raw/*242.39*/("""{"""),format.raw/*242.40*/("""
                var winWidth = $(window).width(),
                columnNumber = getColumnNumber(),
                itemWidth = Math.floor(winWidth / columnNumber);

                $container.find('.portfolio-item').each(function() """),format.raw/*247.68*/("""{"""),format.raw/*247.69*/("""
                $(this).css( """),format.raw/*248.30*/("""{"""),format.raw/*248.31*/("""
                width : itemWidth + 'px'
                """),format.raw/*250.17*/("""}"""),format.raw/*250.18*/(""");
                """),format.raw/*251.17*/("""}"""),format.raw/*251.18*/(""");
                """),format.raw/*252.17*/("""}"""),format.raw/*252.18*/("""

                function setPortfolio() """),format.raw/*254.41*/("""{"""),format.raw/*254.42*/("""
                setColumns();
                $container.isotope('reLayout');
                """),format.raw/*257.17*/("""}"""),format.raw/*257.18*/("""

                /*
                $container.imagesLoaded(function () """),format.raw/*260.53*/("""{"""),format.raw/*260.54*/("""
                setPortfolio();
                """),format.raw/*262.17*/("""}"""),format.raw/*262.18*/(""");*/

                $(window).on('resize', function () """),format.raw/*264.52*/("""{"""),format.raw/*264.53*/("""
                setPortfolio();
                """),format.raw/*266.17*/("""}"""),format.raw/*266.18*/(""");



                """),format.raw/*270.17*/("""}"""),format.raw/*270.18*/(""")(jQuery);
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
                    DATE: Thu Jun 26 18:57:02 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: ae2d4fac9b2f2b3f6e32073938e51b5d48920683
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1767->680|1782->686|1839->721|1947->793|1962->799|2015->830|2097->876|2112->882|2172->920|2300->1012|2315->1018|2370->1051|2504->1149|2519->1155|2568->1182|2650->1228|2665->1234|2725->1272|2866->1377|2881->1383|2933->1413|3015->1459|3030->1465|3084->1497|3219->1596|3234->1602|3296->1642|3381->1691|3396->1697|3450->1729|3722->1965|3737->1971|3787->1999|4549->2725|4564->2731|4606->2751|4684->2793|4709->2809|4749->2811|5219->3249|5523->3517|5550->3535|5590->3537|5661->3572|5680->3582|5745->3625|5816->3660|5835->3670|5904->3717|5954->3748|5994->3750|6065->3785|6084->3795|6153->3842|6216->3873|6283->3904|6311->3923|6351->3925|6422->3960|6441->3970|6511->4018|6582->4053|6601->4063|6675->4115|6738->4146|6807->4179|6834->4197|6874->4199|6945->4234|6999->4279|7047->4289|7375->4581|7388->4585|7429->4604|7730->4869|7745->4875|7789->4897|7828->4900|7885->4947|7922->4961|8106->5109|8118->5112|8202->5173|8267->5201|8323->5247|8360->5261|8579->5447|8651->5482|8671->5492|8742->5540|8793->5571|8833->5572|8907->5609|8927->5619|9000->5669|9064->5700|9383->5982|9413->5989|11630->8169|11646->8175|11725->8230|11851->8319|11867->8325|11933->8368|12009->8407|12025->8413|12090->8455|12166->8494|12182->8500|12247->8542|12323->8581|12339->8587|12407->8632|12483->8671|12499->8677|12571->8726|12647->8765|12663->8771|12731->8816|12807->8855|12823->8861|12888->8903|12964->8942|12980->8948|13056->9001|13132->9040|13148->9046|13219->9094|13295->9133|13311->9139|13373->9178|13498->9266|13514->9272|13586->9321|13735->9433|13751->9439|13805->9470|13947->9575|13963->9581|14046->9641|14122->9680|14138->9686|14208->9733|14450->9946|14480->9947|14767->10205|14797->10206|14890->10270|14920->10271|14990->10312|15020->10313|15213->10477|15243->10478|15387->10593|15417->10594|15474->10622|15504->10623|15551->10641|15581->10642|15628->10660|15658->10661|15775->10749|15805->10750|15874->10790|15904->10791|15951->10809|15981->10810|16036->10836|16066->10837|16169->10911|16199->10912|16326->11010|16356->11011|16403->11029|16433->11030|16649->11217|16679->11218|16757->11267|16787->11268|16943->11395|16973->11396|17055->11449|17085->11450|17140->11476|17170->11477|17252->11530|17282->11531|17337->11557|17367->11558|17449->11611|17479->11612|17534->11638|17564->11639|17646->11692|17676->11693|17731->11719|17761->11720|17843->11773|17873->11774|17958->11830|17988->11831|18059->11873|18089->11874|18357->12113|18387->12114|18447->12145|18477->12146|18566->12206|18596->12207|18645->12227|18675->12228|18724->12248|18754->12249|18827->12293|18857->12294|18984->12392|19014->12393|19119->12469|19149->12470|19229->12521|19259->12522|19347->12581|19377->12582|19457->12633|19487->12634|19542->12660|19572->12661
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|59->30|59->30|59->30|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|68->39|68->39|68->39|69->40|69->40|69->40|73->44|73->44|73->44|89->60|89->60|89->60|90->61|90->61|90->61|97->68|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|106->77|106->77|106->77|107->78|108->79|108->79|108->79|109->80|109->80|109->80|110->81|110->81|110->81|111->82|113->84|113->84|113->84|114->85|114->85|114->85|118->89|118->89|118->89|123->94|123->94|123->94|123->94|123->94|123->94|125->96|125->96|125->96|125->96|125->96|125->96|129->100|130->101|130->101|130->101|131->102|131->102|133->104|133->104|133->104|134->105|143->114|143->114|187->158|187->158|187->158|190->161|190->161|190->161|191->162|191->162|191->162|192->163|192->163|192->163|193->164|193->164|193->164|194->165|194->165|194->165|195->166|195->166|195->166|196->167|196->167|196->167|197->168|197->168|197->168|198->169|198->169|198->169|199->170|199->170|199->170|202->173|202->173|202->173|205->176|205->176|205->176|208->179|208->179|208->179|209->180|209->180|209->180|217->188|217->188|223->194|223->194|225->196|225->196|227->198|227->198|231->202|231->202|235->206|235->206|236->207|236->207|237->208|237->208|238->209|238->209|240->211|240->211|241->212|241->212|242->213|242->213|243->214|243->214|245->216|245->216|247->218|247->218|247->218|247->218|251->222|251->222|253->224|253->224|257->228|257->228|259->230|259->230|259->230|259->230|261->232|261->232|261->232|261->232|263->234|263->234|263->234|263->234|265->236|265->236|265->236|265->236|267->238|267->238|269->240|269->240|271->242|271->242|276->247|276->247|277->248|277->248|279->250|279->250|280->251|280->251|281->252|281->252|283->254|283->254|286->257|286->257|289->260|289->260|291->262|291->262|293->264|293->264|295->266|295->266|299->270|299->270
                    -- GENERATED --
                */
            