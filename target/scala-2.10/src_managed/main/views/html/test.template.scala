
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*3.2*/(title: String, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*3.50*/("""

"""),format.raw/*7.1*/("""

    <!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*10.14*/lang()/*10.20*/.code())),format.raw/*10.27*/("""">
    <head>
        <title>"""),_display_(Seq[Any](/*12.17*/title)),format.raw/*12.22*/("""</title>

            <!-- Meta values -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

            <!-- Sniplist Favicon -->
        <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*22.42*/routes/*22.48*/.Assets.at("img/icons/favicon.ico"))),format.raw/*22.83*/("""">

            <!-- Bootstrap core CSS -->
        <link href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.Assets.at("css/bootstrap.css"))),format.raw/*25.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*26.22*/routes/*26.28*/.Assets.at("css/font-awesome.min.css"))),format.raw/*26.66*/("""" rel="stylesheet">

            <!-- Social Media Icon CSS -->
        <link href=""""),_display_(Seq[Any](/*29.22*/routes/*29.28*/.Assets.at("css/transparent.css"))),format.raw/*29.61*/("""" rel="stylesheet"/>

            <!-- Custom Sniplist Styles -->
        <link href=""""),_display_(Seq[Any](/*32.22*/routes/*32.28*/.Assets.at("css/style.css"))),format.raw/*32.55*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*33.22*/routes/*33.28*/.Assets.at("css/responsive-video.css"))),format.raw/*33.66*/("""" rel="stylesheet">

            <!-- Custom styles for TableclothJs -->
        <link href=""""),_display_(Seq[Any](/*36.22*/routes/*36.28*/.Assets.at("css/prettify.css"))),format.raw/*36.58*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*37.22*/routes/*37.28*/.Assets.at("css/tablecloth.css"))),format.raw/*37.60*/("""" rel="stylesheet">


            <!-- Styles for MediaElementJs
            <link  href=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.Assets.at("css/mediaelementplayer.css"))),format.raw/*41.73*/("""" rel="Stylesheet" />
        <link  href=""""),_display_(Seq[Any](/*42.23*/routes/*42.29*/.Assets.at("css/mejs-skins.css"))),format.raw/*42.61*/("""" rel="Stylesheet" />-->

        <link  href=""""),_display_(Seq[Any](/*44.23*/routes/*44.29*/.Assets.at("css/audio-sniplist-skin.css"))),format.raw/*44.70*/("""" rel="Stylesheet" />

            <!-- JQueryUI CSS -->
        <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*48.55*/routes/*48.61*/.Assets.at("css/iThing.css"))),format.raw/*48.89*/("""">

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
                    <a class="navbar-brand" href=""""),_display_(Seq[Any](/*64.52*/routes/*64.58*/.Application.index())),format.raw/*64.78*/("""">SNIPLIST.</a>
                        <!-- """),_display_(Seq[Any](/*65.31*/subjectPresent()/*65.47*/ {_display_(Seq[Any](format.raw/*65.49*/("""
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                """)))})),format.raw/*72.18*/("""-->
                </div>
                <div class="navbar-collapse collapse navbar-right">
                    <ul class="nav navbar-nav">
                            <!-- Determine which page is currently active -->
                        """),_display_(Seq[Any](/*77.26*/subjectPresentOr()/*77.44*/ {_display_(Seq[Any](format.raw/*77.46*/("""
                            """),_display_(Seq[Any](/*78.30*/generators/*78.40*/.navbarMenu(routes.Snips.add(), "ADD SNIP"))),format.raw/*78.83*/("""
                            """),_display_(Seq[Any](/*79.30*/generators/*79.40*/.navbarMenu(routes.MySnipsController.mySnips(), "MY SNIPS"))),format.raw/*79.99*/("""
                            """),_display_(Seq[Any](/*80.30*/generators/*80.40*/.navbarMenu(routes.SnipLists.viewSniplists(), "MY SNIPLISTS"))),format.raw/*80.101*/("""
                        """)))}/*81.26*/ {_display_(Seq[Any](format.raw/*81.28*/("""
                            """),_display_(Seq[Any](/*82.30*/generators/*82.40*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*82.87*/("""
                        """)))})),format.raw/*83.26*/("""
                        """),_display_(Seq[Any](/*84.26*/subjectNotPresent()/*84.45*/ {_display_(Seq[Any](format.raw/*84.47*/("""
                            """),_display_(Seq[Any](/*85.30*/generators/*85.40*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*85.88*/("""
                            """),_display_(Seq[Any](/*86.30*/generators/*86.40*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*86.92*/("""
                        """)))})),format.raw/*87.26*/("""

                        """),_display_(Seq[Any](/*89.26*/subjectPresentOr()/*89.44*/ {_display_(Seq[Any](format.raw/*89.46*/("""
                            """),_display_(Seq[Any](/*90.30*/defining(Application.getLocalUser(session()))/*90.75*/ { user =>_display_(Seq[Any](format.raw/*90.85*/("""
                                <li>
                                    <div class="dropdown">
                                        <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                            <i class="icon-user"></i> """),_display_(Seq[Any](/*94.72*/user/*94.76*/.name.toUpperCase())),format.raw/*94.95*/("""
                                        <span class="caret"></span>
                                        </a>

                                        <ul class="dropdown-menu">
                                            <li><a href=""""),_display_(Seq[Any](/*99.59*/routes/*99.65*/.Application.profile())),format.raw/*99.87*/("""">"""),_display_(Seq[Any](/*99.90*/Messages("playauthenticate.navigation.profile")/*99.137*/.toUpperCase())),format.raw/*99.151*/("""</a></li>
                                            <li class="divider"></li>
                                            <li><a href=""""),_display_(Seq[Any](/*101.59*/com/*101.62*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*101.123*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*101.151*/Messages("playauthenticate.navigation.logout")/*101.197*/.toUpperCase())),format.raw/*101.211*/("""</a></li>
                                        </ul>
                                    </div>
                                </li>
                            """)))})),format.raw/*105.30*/("""
                            """),_display_(Seq[Any](/*106.30*/generators/*106.40*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*106.88*/("""
                        """)))}/*107.26*/{_display_(Seq[Any](format.raw/*107.27*/("""

                            """),_display_(Seq[Any](/*109.30*/generators/*109.40*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*109.90*/("""
                        """)))})),format.raw/*110.26*/("""

                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>

        <div id="wrapper-content">
                <!-- INSERTED CONTENT GOES HERE (From other scala templates) -->
            """),_display_(Seq[Any](/*119.14*/content)),format.raw/*119.21*/("""
        </div>

            <!-- *****************************************************************************************************************
            FOOTER
        ***************************************************************************************************************** -->
        """),_display_(Seq[Any](/*125.10*/subjectNotPresent()/*125.29*/ {_display_(Seq[Any](format.raw/*125.31*/("""
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
        """)))})),format.raw/*153.10*/("""
        """),_display_(Seq[Any](/*154.10*/subjectPresent()/*154.26*/ {_display_(Seq[Any](format.raw/*154.28*/("""
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
        """)))})),format.raw/*168.10*/("""



            <!-- Placed at the end of the document so the pages load faster
            =========================================== -->

            <!-- JQuery JS External Imports -->
        <script type="text/javascript" src="//code.jquery.com/jquery-1.9.1.js"></script>

        <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

            <!-- JQRangeSlider JS -->
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*181.46*/routes/*181.52*/.Assets.at("js/jqrangeslider/jQEditRangeSlider-min.js"))),format.raw/*181.107*/(""""></script>

            <!-- Bootstrap core JavaScript -->
        <script src=""""),_display_(Seq[Any](/*184.23*/routes/*184.29*/.Assets.at("js/bootstrap/bootstrap.min.js"))),format.raw/*184.72*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*185.23*/routes/*185.29*/.Assets.at("js/bootstrap/retina-1.1.0.js"))),format.raw/*185.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*186.23*/routes/*186.29*/.Assets.at("js/jquery/jquery.hoverdir.js"))),format.raw/*186.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*187.23*/routes/*187.29*/.Assets.at("js/jquery/jquery.hoverex.min.js"))),format.raw/*187.74*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*188.23*/routes/*188.29*/.Assets.at("js/tablecloth/jquery.prettyPhoto.js"))),format.raw/*188.78*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*189.23*/routes/*189.29*/.Assets.at("js/jquery/jquery.isotope.min.js"))),format.raw/*189.74*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*190.23*/routes/*190.29*/.Assets.at("js/jquery/jquery.metadata.js"))),format.raw/*190.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*191.23*/routes/*191.29*/.Assets.at("js/tablecloth/jquery.tablesorter.js"))),format.raw/*191.78*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*192.23*/routes/*192.29*/.Assets.at("js/tablecloth/jquery.tablecloth.js"))),format.raw/*192.77*/(""""></script>

            <!--  <script src=""""),_display_(Seq[Any](/*194.33*/routes/*194.39*/.Assets.at("js/bootstrap/bootstrap.js"))),format.raw/*194.78*/(""""></script>-->

    <!-- Sniplist core JavaScript -->
    <script src=""""),_display_(Seq[Any](/*197.19*/routes/*197.25*/.Assets.at("js/sniplist/addSnip.js"))),format.raw/*197.61*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*198.23*/routes/*198.29*/.Assets.at("js/sniplist/viewSnips.js"))),format.raw/*198.67*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*199.23*/routes/*199.29*/.Assets.at("js/sniplist/custom-crop-slider.js"))),format.raw/*199.76*/(""""></script>

        <script src=""""),_display_(Seq[Any](/*201.23*/routes/*201.29*/.Assets.at("js/sniplist/viewSniplists.js"))),format.raw/*201.71*/(""""></script>

            <!-- Play Framework JavaScript routes for AJAX calls. -->
        <script src=""""),_display_(Seq[Any](/*204.23*/routes/*204.29*/.Application.javascriptRoutes())),format.raw/*204.60*/("""" type="text/javascript"></script>

            <!-- MediaElementPlayer -->
        <script src=""""),_display_(Seq[Any](/*207.23*/routes/*207.29*/.Assets.at("js/mediaelement/mediaelement-and-player.min.js"))),format.raw/*207.89*/(""""></script>


        <script type="text/javascript" charset="utf-8">

        //GLOBAL MEDIA PLAYER
        var globalPlayer;

        var globalAudioPlayer;

        // Portfolio
        (function($) """),format.raw/*218.22*/("""{"""),format.raw/*218.23*/("""
        "use strict";
        var $container = $('.portfolio'),
        $items = $container.find('.portfolio-item'),
        portfolioLayout = 'fitRows';

        if( $container.hasClass('portfolio-centered') ) """),format.raw/*224.57*/("""{"""),format.raw/*224.58*/("""
        portfolioLayout = 'masonry';
        """),format.raw/*226.9*/("""}"""),format.raw/*226.10*/("""

        /* $container.isotope("""),format.raw/*228.31*/("""{"""),format.raw/*228.32*/("""
         filter: '*',
         animationEngine: 'best-available',
         layoutMode: portfolioLayout,
         animationOptions: """),format.raw/*232.28*/("""{"""),format.raw/*232.29*/("""
         duration: 750,
         easing: 'linear',
         queue: false
         """),format.raw/*236.10*/("""}"""),format.raw/*236.11*/(""",
         masonry: """),format.raw/*237.19*/("""{"""),format.raw/*237.20*/("""
         """),format.raw/*238.10*/("""}"""),format.raw/*238.11*/("""
         """),format.raw/*239.10*/("""}"""),format.raw/*239.11*/(""", refreshWaypoints());
         */
        function refreshWaypoints() """),format.raw/*241.37*/("""{"""),format.raw/*241.38*/("""
        setTimeout(function() """),format.raw/*242.31*/("""{"""),format.raw/*242.32*/("""
        """),format.raw/*243.9*/("""}"""),format.raw/*243.10*/(""", 1000);
        """),format.raw/*244.9*/("""}"""),format.raw/*244.10*/("""

        $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*246.63*/("""{"""),format.raw/*246.64*/("""
        var selector = $(this).attr('data-filter');
        $container.isotope("""),format.raw/*248.28*/("""{"""),format.raw/*248.29*/(""" filter: selector """),format.raw/*248.47*/("""}"""),format.raw/*248.48*/(""", refreshWaypoints());
        $('nav.portfolio-filter ul a').removeClass('active');
        $(this).addClass('active');
        return false;
        """),format.raw/*252.9*/("""}"""),format.raw/*252.10*/(""");

        function getColumnNumber() """),format.raw/*254.36*/("""{"""),format.raw/*254.37*/("""
        var winWidth = $(window).width(),
        columnNumber = 1;

        if (winWidth > 1200) """),format.raw/*258.30*/("""{"""),format.raw/*258.31*/("""
        columnNumber = 5;
        """),format.raw/*260.9*/("""}"""),format.raw/*260.10*/(""" else if (winWidth > 950) """),format.raw/*260.36*/("""{"""),format.raw/*260.37*/("""
        columnNumber = 4;
        """),format.raw/*262.9*/("""}"""),format.raw/*262.10*/(""" else if (winWidth > 600) """),format.raw/*262.36*/("""{"""),format.raw/*262.37*/("""
        columnNumber = 3;
        """),format.raw/*264.9*/("""}"""),format.raw/*264.10*/(""" else if (winWidth > 400) """),format.raw/*264.36*/("""{"""),format.raw/*264.37*/("""
        columnNumber = 2;
        """),format.raw/*266.9*/("""}"""),format.raw/*266.10*/(""" else if (winWidth > 250) """),format.raw/*266.36*/("""{"""),format.raw/*266.37*/("""
        columnNumber = 1;
        """),format.raw/*268.9*/("""}"""),format.raw/*268.10*/("""
        return columnNumber;
        """),format.raw/*270.9*/("""}"""),format.raw/*270.10*/("""

        function setColumns() """),format.raw/*272.31*/("""{"""),format.raw/*272.32*/("""
        var winWidth = $(window).width(),
        columnNumber = getColumnNumber(),
        itemWidth = Math.floor(winWidth / columnNumber);

        $container.find('.portfolio-item').each(function() """),format.raw/*277.60*/("""{"""),format.raw/*277.61*/("""
        $(this).css( """),format.raw/*278.22*/("""{"""),format.raw/*278.23*/("""
        width : itemWidth + 'px'
        """),format.raw/*280.9*/("""}"""),format.raw/*280.10*/(""");
        """),format.raw/*281.9*/("""}"""),format.raw/*281.10*/(""");
        """),format.raw/*282.9*/("""}"""),format.raw/*282.10*/("""

        function setPortfolio() """),format.raw/*284.33*/("""{"""),format.raw/*284.34*/("""
        setColumns();
        $container.isotope('reLayout');
        """),format.raw/*287.9*/("""}"""),format.raw/*287.10*/("""

        /*
        $container.imagesLoaded(function () """),format.raw/*290.45*/("""{"""),format.raw/*290.46*/("""
        setPortfolio();
        """),format.raw/*292.9*/("""}"""),format.raw/*292.10*/(""");*/

        $(window).on('resize', function () """),format.raw/*294.44*/("""{"""),format.raw/*294.45*/("""
        setPortfolio();
        """),format.raw/*296.9*/("""}"""),format.raw/*296.10*/(""");



        """),format.raw/*300.9*/("""}"""),format.raw/*300.10*/(""")(jQuery);
        </script>

            <!-- Google Analytics Tracking JS -->
        <script>
        (function(i,s,o,g,r,a,m)"""),format.raw/*305.33*/("""{"""),format.raw/*305.34*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*305.84*/("""{"""),format.raw/*305.85*/("""
        (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*306.44*/("""}"""),format.raw/*306.45*/(""",i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        """),format.raw/*308.9*/("""}"""),format.raw/*308.10*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

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
                    DATE: Sun Aug 03 16:01:00 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/test.scala.html
                    HASH: 7b3157754f6283bb6910db18b312dc005b51b7e8
                    MATRIX: 785->3|1031->51|1059->158|1130->193|1145->199|1174->206|1240->236|1267->241|1681->619|1696->625|1753->660|1854->725|1869->731|1922->762|1999->803|2014->809|2074->847|2195->932|2210->938|2265->971|2388->1058|2403->1064|2452->1091|2529->1132|2544->1138|2604->1176|2734->1270|2749->1276|2801->1306|2878->1347|2893->1353|2947->1385|3074->1476|3089->1482|3151->1522|3231->1566|3246->1572|3300->1604|3384->1652|3399->1658|3462->1699|3722->1923|3737->1929|3787->1957|4481->2615|4496->2621|4538->2641|4620->2687|4645->2703|4685->2705|5092->3080|5374->3326|5401->3344|5441->3346|5507->3376|5526->3386|5591->3429|5657->3459|5676->3469|5757->3528|5823->3558|5842->3568|5926->3629|5971->3655|6011->3657|6077->3687|6096->3697|6165->3744|6223->3770|6285->3796|6313->3815|6353->3817|6419->3847|6438->3857|6508->3905|6574->3935|6593->3945|6667->3997|6725->4023|6788->4050|6815->4068|6855->4070|6921->4100|6975->4145|7023->4155|7331->4427|7344->4431|7385->4450|7661->4690|7676->4696|7720->4718|7759->4721|7816->4768|7853->4782|8028->4920|8041->4923|8126->4984|8192->5012|8249->5058|8287->5072|8486->5238|8553->5268|8573->5278|8644->5326|8690->5352|8730->5353|8798->5384|8818->5394|8891->5444|8950->5470|9224->5707|9254->5714|9593->6016|9622->6035|9663->6037|11080->7421|11127->7431|11153->7447|11194->7449|11902->8124|12402->8587|12418->8593|12497->8648|12616->8730|12632->8736|12698->8779|12769->8813|12785->8819|12850->8861|12921->8895|12937->8901|13002->8943|13073->8977|13089->8983|13157->9028|13228->9062|13244->9068|13316->9117|13387->9151|13403->9157|13471->9202|13542->9236|13558->9242|13623->9284|13694->9318|13710->9324|13782->9373|13853->9407|13869->9413|13940->9461|14022->9506|14038->9512|14100->9551|14209->9623|14225->9629|14284->9665|14355->9699|14371->9705|14432->9743|14503->9777|14519->9783|14589->9830|14661->9865|14677->9871|14742->9913|14884->10018|14900->10024|14954->10055|15089->10153|15105->10159|15188->10219|15419->10421|15449->10422|15690->10634|15720->10635|15794->10681|15824->10682|15885->10714|15915->10715|16076->10847|16106->10848|16218->10931|16248->10932|16297->10952|16327->10953|16366->10963|16396->10964|16435->10974|16465->10975|16565->11046|16595->11047|16655->11078|16685->11079|16722->11088|16752->11089|16797->11106|16827->11107|16920->11171|16950->11172|17059->11252|17089->11253|17136->11271|17166->11272|17345->11423|17375->11424|17443->11463|17473->11464|17601->11563|17631->11564|17694->11599|17724->11600|17779->11626|17809->11627|17872->11662|17902->11663|17957->11689|17987->11690|18050->11725|18080->11726|18135->11752|18165->11753|18228->11788|18258->11789|18313->11815|18343->11816|18406->11851|18436->11852|18502->11890|18532->11891|18593->11923|18623->11924|18854->12126|18884->12127|18935->12149|18965->12150|19035->12192|19065->12193|19104->12204|19134->12205|19173->12216|19203->12217|19266->12251|19296->12252|19395->12323|19425->12324|19511->12381|19541->12382|19602->12415|19632->12416|19710->12465|19740->12466|19801->12499|19831->12500|19873->12514|19903->12515|20061->12644|20091->12645|20170->12695|20200->12696|20273->12740|20303->12741|20470->12880|20500->12881
                    LINES: 26->3|32->3|34->7|37->10|37->10|37->10|39->12|39->12|49->22|49->22|49->22|52->25|52->25|52->25|53->26|53->26|53->26|56->29|56->29|56->29|59->32|59->32|59->32|60->33|60->33|60->33|63->36|63->36|63->36|64->37|64->37|64->37|68->41|68->41|68->41|69->42|69->42|69->42|71->44|71->44|71->44|75->48|75->48|75->48|91->64|91->64|91->64|92->65|92->65|92->65|99->72|104->77|104->77|104->77|105->78|105->78|105->78|106->79|106->79|106->79|107->80|107->80|107->80|108->81|108->81|109->82|109->82|109->82|110->83|111->84|111->84|111->84|112->85|112->85|112->85|113->86|113->86|113->86|114->87|116->89|116->89|116->89|117->90|117->90|117->90|121->94|121->94|121->94|126->99|126->99|126->99|126->99|126->99|126->99|128->101|128->101|128->101|128->101|128->101|128->101|132->105|133->106|133->106|133->106|134->107|134->107|136->109|136->109|136->109|137->110|146->119|146->119|152->125|152->125|152->125|180->153|181->154|181->154|181->154|195->168|208->181|208->181|208->181|211->184|211->184|211->184|212->185|212->185|212->185|213->186|213->186|213->186|214->187|214->187|214->187|215->188|215->188|215->188|216->189|216->189|216->189|217->190|217->190|217->190|218->191|218->191|218->191|219->192|219->192|219->192|221->194|221->194|221->194|224->197|224->197|224->197|225->198|225->198|225->198|226->199|226->199|226->199|228->201|228->201|228->201|231->204|231->204|231->204|234->207|234->207|234->207|245->218|245->218|251->224|251->224|253->226|253->226|255->228|255->228|259->232|259->232|263->236|263->236|264->237|264->237|265->238|265->238|266->239|266->239|268->241|268->241|269->242|269->242|270->243|270->243|271->244|271->244|273->246|273->246|275->248|275->248|275->248|275->248|279->252|279->252|281->254|281->254|285->258|285->258|287->260|287->260|287->260|287->260|289->262|289->262|289->262|289->262|291->264|291->264|291->264|291->264|293->266|293->266|293->266|293->266|295->268|295->268|297->270|297->270|299->272|299->272|304->277|304->277|305->278|305->278|307->280|307->280|308->281|308->281|309->282|309->282|311->284|311->284|314->287|314->287|317->290|317->290|319->292|319->292|321->294|321->294|323->296|323->296|327->300|327->300|332->305|332->305|332->305|332->305|333->306|333->306|335->308|335->308
                    -- GENERATED --
                */
            