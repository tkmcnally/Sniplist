
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
                        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*56.56*/routes/*56.62*/.Application.index())),format.raw/*56.82*/("""">SNIPLIST.</a>
                        """),_display_(Seq[Any](/*57.26*/subjectPresent()/*57.42*/ {_display_(Seq[Any](format.raw/*57.44*/("""
                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search">
                                </div>
                                <button type="submit" class="btn btn-default">Submit</button>
                            </form>
                        """)))})),format.raw/*64.26*/("""
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*69.30*/subjectPresentOr()/*69.48*/ {_display_(Seq[Any](format.raw/*69.50*/("""
                                """),_display_(Seq[Any](/*70.34*/generators/*70.44*/.navbarMenu(routes.Snips.add(), "ADD SNIP"))),format.raw/*70.87*/("""
                                """),_display_(Seq[Any](/*71.34*/generators/*71.44*/.navbarMenu(routes.Snips.mySnips(), "MY SNIPS"))),format.raw/*71.91*/("""
                            """)))}/*72.30*/ {_display_(Seq[Any](format.raw/*72.32*/("""
                                """),_display_(Seq[Any](/*73.34*/generators/*73.44*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*73.91*/("""
                            """)))})),format.raw/*74.30*/("""
                            """),_display_(Seq[Any](/*75.30*/subjectNotPresent()/*75.49*/ {_display_(Seq[Any](format.raw/*75.51*/("""
                                """),_display_(Seq[Any](/*76.34*/generators/*76.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*76.92*/("""
                                """),_display_(Seq[Any](/*77.34*/generators/*77.44*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*77.96*/("""
                            """)))})),format.raw/*78.30*/("""

                            """),_display_(Seq[Any](/*80.30*/subjectPresentOr()/*80.48*/ {_display_(Seq[Any](format.raw/*80.50*/("""
                                """),_display_(Seq[Any](/*81.34*/defining(Application.getLocalUser(session()))/*81.79*/ { user =>_display_(Seq[Any](format.raw/*81.89*/("""
                                    <li>
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                <i class="icon-user"></i> """),_display_(Seq[Any](/*85.76*/user/*85.80*/.name.toUpperCase())),format.raw/*85.99*/("""
                                                <span class="caret"></span>
                                            </a>

                                            <ul class="dropdown-menu">
                                                <li><a href=""""),_display_(Seq[Any](/*90.63*/routes/*90.69*/.Application.profile())),format.raw/*90.91*/("""">"""),_display_(Seq[Any](/*90.94*/Messages("playauthenticate.navigation.profile")/*90.141*/.toUpperCase())),format.raw/*90.155*/("""</a></li>
                                                <li class="divider"></li>
                                                <li><a href=""""),_display_(Seq[Any](/*92.63*/com/*92.66*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*92.127*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*92.155*/Messages("playauthenticate.navigation.logout")/*92.201*/.toUpperCase())),format.raw/*92.215*/("""</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                """)))})),format.raw/*96.34*/("""
                                """),_display_(Seq[Any](/*97.34*/generators/*97.44*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*97.92*/("""
                            """)))}/*98.30*/{_display_(Seq[Any](format.raw/*98.31*/("""

                                """),_display_(Seq[Any](/*100.34*/generators/*100.44*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*100.94*/("""
                            """)))})),format.raw/*101.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <div id="wrapper-content">

                        <!-- INSERTED CONTENT GOES HERE -->
                    """),_display_(Seq[Any](/*111.22*/content)),format.raw/*111.29*/("""
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
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
            <script src=""""),_display_(Seq[Any](/*148.27*/routes/*148.33*/.Assets.at("js/bootstrap.min.js"))),format.raw/*148.66*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*149.27*/routes/*149.33*/.Assets.at("js/retina-1.1.0.js"))),format.raw/*149.65*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*150.27*/routes/*150.33*/.Assets.at("js/jquery.hoverdir.js"))),format.raw/*150.68*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*151.27*/routes/*151.33*/.Assets.at("js/jquery.hoverex.min.js"))),format.raw/*151.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*152.27*/routes/*152.33*/.Assets.at("js/jquery.prettyPhoto.js"))),format.raw/*152.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*153.27*/routes/*153.33*/.Assets.at("js/jquery.isotope.min.js"))),format.raw/*153.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*154.27*/routes/*154.33*/.Assets.at("js/custom.js"))),format.raw/*154.59*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*156.27*/routes/*156.33*/.Assets.at("js/jquery-1.7.2.min.js"))),format.raw/*156.69*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*157.27*/routes/*157.33*/.Assets.at("js/jquery.metadata.js"))),format.raw/*157.68*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*158.27*/routes/*158.33*/.Assets.at("js/jquery.tablesorter.min.js"))),format.raw/*158.75*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*159.27*/routes/*159.33*/.Assets.at("js/jquery.tablecloth.js"))),format.raw/*159.70*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*160.27*/routes/*160.33*/.Assets.at("js/bootstrap.js"))),format.raw/*160.62*/(""""></script>

            <script src=""""),_display_(Seq[Any](/*162.27*/routes/*162.33*/.Assets.at("js/youtube_embed_formatter.js"))),format.raw/*162.76*/(""""></script>
            <script type="text/javascript" src='"""),_display_(Seq[Any](/*163.50*/routes/*163.56*/.Application.javascriptRoutes())),format.raw/*163.87*/("""'></script>

            <script type="text/javascript" charset="utf-8">


            $('.dropdown-delete-snip').click(function(e) """),format.raw/*168.58*/("""{"""),format.raw/*168.59*/("""
                e.preventDefault();
                deleteSnip($(this));
            """),format.raw/*171.13*/("""}"""),format.raw/*171.14*/(""");

            $('#url-input').keypress(function(e) """),format.raw/*173.50*/("""{"""),format.raw/*173.51*/("""
            if( e.which == 13) """),format.raw/*174.32*/("""{"""),format.raw/*174.33*/("""
            getVideo ( $ ( this ).val ( ) ) ;

            """),format.raw/*177.13*/("""}"""),format.raw/*177.14*/("""
            """),format.raw/*178.13*/("""}"""),format.raw/*178.14*/(""");

            $('#url-input-btn').click(function() """),format.raw/*180.50*/("""{"""),format.raw/*180.51*/("""
            getVideo($('#url-input').val());
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/(""");


            $('#save_snip_btn').click(function() """),format.raw/*185.50*/("""{"""),format.raw/*185.51*/("""
            saveSnip();
            """),format.raw/*187.13*/("""}"""),format.raw/*187.14*/(""");


            $(document).ready(function() """),format.raw/*190.42*/("""{"""),format.raw/*190.43*/("""
                $("table").tablecloth("""),format.raw/*191.39*/("""{"""),format.raw/*191.40*/("""
                    theme: "dark",
                    bordered: true,
                    condensed: true,
                    striped: true,
                    sortable: true,
                    clean: true,
                    cleanElements: "th td",
                    customClass: "my-table"
                """),format.raw/*200.17*/("""}"""),format.raw/*200.18*/(""");
            """),format.raw/*201.13*/("""}"""),format.raw/*201.14*/(""");
            </script>

            <script>
            // Portfolio
            (function($) """),format.raw/*206.26*/("""{"""),format.raw/*206.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*212.61*/("""{"""),format.raw/*212.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*214.13*/("""}"""),format.raw/*214.14*/("""

            $container.isotope("""),format.raw/*216.32*/("""{"""),format.raw/*216.33*/("""
            filter: '*',
            animationEngine: 'best-available',
            layoutMode: portfolioLayout,
            animationOptions: """),format.raw/*220.31*/("""{"""),format.raw/*220.32*/("""
            duration: 750,
            easing: 'linear',
            queue: false
            """),format.raw/*224.13*/("""}"""),format.raw/*224.14*/(""",
            masonry: """),format.raw/*225.22*/("""{"""),format.raw/*225.23*/("""
            """),format.raw/*226.13*/("""}"""),format.raw/*226.14*/("""
            """),format.raw/*227.13*/("""}"""),format.raw/*227.14*/(""", refreshWaypoints());

            function refreshWaypoints() """),format.raw/*229.41*/("""{"""),format.raw/*229.42*/("""
            setTimeout(function() """),format.raw/*230.35*/("""{"""),format.raw/*230.36*/("""
            """),format.raw/*231.13*/("""}"""),format.raw/*231.14*/(""", 1000);
            """),format.raw/*232.13*/("""}"""),format.raw/*232.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*234.67*/("""{"""),format.raw/*234.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*236.32*/("""{"""),format.raw/*236.33*/(""" filter: selector """),format.raw/*236.51*/("""}"""),format.raw/*236.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*240.13*/("""}"""),format.raw/*240.14*/(""");

            function getColumnNumber() """),format.raw/*242.40*/("""{"""),format.raw/*242.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*246.34*/("""{"""),format.raw/*246.35*/("""
            columnNumber = 5;
            """),format.raw/*248.13*/("""}"""),format.raw/*248.14*/(""" else if (winWidth > 950) """),format.raw/*248.40*/("""{"""),format.raw/*248.41*/("""
            columnNumber = 4;
            """),format.raw/*250.13*/("""}"""),format.raw/*250.14*/(""" else if (winWidth > 600) """),format.raw/*250.40*/("""{"""),format.raw/*250.41*/("""
            columnNumber = 3;
            """),format.raw/*252.13*/("""}"""),format.raw/*252.14*/(""" else if (winWidth > 400) """),format.raw/*252.40*/("""{"""),format.raw/*252.41*/("""
            columnNumber = 2;
            """),format.raw/*254.13*/("""}"""),format.raw/*254.14*/(""" else if (winWidth > 250) """),format.raw/*254.40*/("""{"""),format.raw/*254.41*/("""
            columnNumber = 1;
            """),format.raw/*256.13*/("""}"""),format.raw/*256.14*/("""
            return columnNumber;
            """),format.raw/*258.13*/("""}"""),format.raw/*258.14*/("""

            function setColumns() """),format.raw/*260.35*/("""{"""),format.raw/*260.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*265.64*/("""{"""),format.raw/*265.65*/("""
            $(this).css( """),format.raw/*266.26*/("""{"""),format.raw/*266.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*268.13*/("""}"""),format.raw/*268.14*/(""");
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/(""");
            """),format.raw/*270.13*/("""}"""),format.raw/*270.14*/("""

            function setPortfolio() """),format.raw/*272.37*/("""{"""),format.raw/*272.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*275.13*/("""}"""),format.raw/*275.14*/("""

            $container.imagesLoaded(function () """),format.raw/*277.49*/("""{"""),format.raw/*277.50*/("""
            setPortfolio();
            """),format.raw/*279.13*/("""}"""),format.raw/*279.14*/(""");

            $(window).on('resize', function () """),format.raw/*281.48*/("""{"""),format.raw/*281.49*/("""
            setPortfolio();
            """),format.raw/*283.13*/("""}"""),format.raw/*283.14*/(""");



            """),format.raw/*287.13*/("""}"""),format.raw/*287.14*/(""")(jQuery);



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
                    DATE: Fri Jun 20 17:56:13 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 37ab10e898e3a7dd2b6b3e0b8f7929a3f9e4ef9a
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1762->675|1777->681|1828->710|1940->786|1955->792|2008->823|2090->869|2105->875|2165->913|2249->961|2264->967|2319->1000|2462->1107|2477->1113|2526->1140|2608->1186|2623->1192|2683->1230|2817->1328|2832->1334|2884->1364|2966->1410|2981->1416|3035->1448|4172->2549|4187->2555|4229->2575|4307->2617|4332->2633|4372->2635|4842->3073|5146->3341|5173->3359|5213->3361|5284->3396|5303->3406|5368->3449|5439->3484|5458->3494|5527->3541|5577->3572|5617->3574|5688->3609|5707->3619|5776->3666|5839->3697|5906->3728|5934->3747|5974->3749|6045->3784|6064->3794|6134->3842|6205->3877|6224->3887|6298->3939|6361->3970|6430->4003|6457->4021|6497->4023|6568->4058|6622->4103|6670->4113|6998->4405|7011->4409|7052->4428|7353->4693|7368->4699|7412->4721|7451->4724|7508->4771|7545->4785|7729->4933|7741->4936|7825->4997|7890->5025|7946->5071|7983->5085|8201->5271|8272->5306|8291->5316|8361->5364|8411->5395|8450->5396|8524->5433|8544->5443|8617->5493|8681->5524|8973->5779|9003->5786|11058->7804|11074->7810|11130->7843|11206->7882|11222->7888|11277->7920|11353->7959|11369->7965|11427->8000|11503->8039|11519->8045|11580->8083|11656->8122|11672->8128|11733->8166|11809->8205|11825->8211|11886->8249|11962->8288|11978->8294|12027->8320|12105->8361|12121->8367|12180->8403|12256->8442|12272->8448|12330->8483|12406->8522|12422->8528|12487->8570|12563->8609|12579->8615|12639->8652|12715->8691|12731->8697|12783->8726|12861->8767|12877->8773|12943->8816|13042->8878|13058->8884|13112->8915|13278->9052|13308->9053|13426->9142|13456->9143|13540->9198|13570->9199|13632->9232|13662->9233|13754->9296|13784->9297|13827->9311|13857->9312|13941->9367|13971->9368|14060->9428|14090->9429|14176->9486|14206->9487|14274->9526|14304->9527|14382->9576|14412->9577|14481->9617|14511->9618|14866->9944|14896->9945|14941->9961|14971->9962|15102->10064|15132->10065|15399->10303|15429->10304|15514->10360|15544->10361|15608->10396|15638->10397|15815->10545|15845->10546|15973->10645|16003->10646|16056->10670|16086->10671|16129->10685|16159->10686|16202->10700|16232->10701|16327->10767|16357->10768|16422->10804|16452->10805|16495->10819|16525->10820|16576->10842|16606->10843|16705->10913|16735->10914|16854->11004|16884->11005|16931->11023|16961->11024|17161->11195|17191->11196|17265->11241|17295->11242|17439->11357|17469->11358|17543->11403|17573->11404|17628->11430|17658->11431|17732->11476|17762->11477|17817->11503|17847->11504|17921->11549|17951->11550|18006->11576|18036->11577|18110->11622|18140->11623|18195->11649|18225->11650|18299->11695|18329->11696|18406->11744|18436->11745|18503->11783|18533->11784|18785->12007|18815->12008|18871->12035|18901->12036|18982->12088|19012->12089|19057->12105|19087->12106|19132->12122|19162->12123|19231->12163|19261->12164|19376->12250|19406->12251|19487->12303|19517->12304|19589->12347|19619->12348|19701->12401|19731->12402|19803->12445|19833->12446|19884->12468|19914->12469
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|55->26|55->26|55->26|58->29|58->29|58->29|59->30|59->30|59->30|62->33|62->33|62->33|63->34|63->34|63->34|85->56|85->56|85->56|86->57|86->57|86->57|93->64|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|100->71|101->72|101->72|102->73|102->73|102->73|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|109->80|109->80|109->80|110->81|110->81|110->81|114->85|114->85|114->85|119->90|119->90|119->90|119->90|119->90|119->90|121->92|121->92|121->92|121->92|121->92|121->92|125->96|126->97|126->97|126->97|127->98|127->98|129->100|129->100|129->100|130->101|140->111|140->111|177->148|177->148|177->148|178->149|178->149|178->149|179->150|179->150|179->150|180->151|180->151|180->151|181->152|181->152|181->152|182->153|182->153|182->153|183->154|183->154|183->154|185->156|185->156|185->156|186->157|186->157|186->157|187->158|187->158|187->158|188->159|188->159|188->159|189->160|189->160|189->160|191->162|191->162|191->162|192->163|192->163|192->163|197->168|197->168|200->171|200->171|202->173|202->173|203->174|203->174|206->177|206->177|207->178|207->178|209->180|209->180|211->182|211->182|214->185|214->185|216->187|216->187|219->190|219->190|220->191|220->191|229->200|229->200|230->201|230->201|235->206|235->206|241->212|241->212|243->214|243->214|245->216|245->216|249->220|249->220|253->224|253->224|254->225|254->225|255->226|255->226|256->227|256->227|258->229|258->229|259->230|259->230|260->231|260->231|261->232|261->232|263->234|263->234|265->236|265->236|265->236|265->236|269->240|269->240|271->242|271->242|275->246|275->246|277->248|277->248|277->248|277->248|279->250|279->250|279->250|279->250|281->252|281->252|281->252|281->252|283->254|283->254|283->254|283->254|285->256|285->256|287->258|287->258|289->260|289->260|294->265|294->265|295->266|295->266|297->268|297->268|298->269|298->269|299->270|299->270|301->272|301->272|304->275|304->275|306->277|306->277|308->279|308->279|310->281|310->281|312->283|312->283|316->287|316->287
                    -- GENERATED --
                */
            