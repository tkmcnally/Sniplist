
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
                        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*51.56*/routes/*51.62*/.Application.index())),format.raw/*51.82*/("""">SNIPLIST.</a>
                    </div>
                    <div class="navbar-collapse collapse navbar-right">
                        <ul class="nav navbar-nav">
                                <!-- Determine which page is currently active -->
                            """),_display_(Seq[Any](/*56.30*/generators/*56.40*/.navbarMenu(routes.Application.index(), "HOME"))),format.raw/*56.87*/("""
                            """),_display_(Seq[Any](/*57.30*/generators/*57.40*/.navbarMenu(routes.Application.about(), "ABOUT"))),format.raw/*57.88*/("""
                            """),_display_(Seq[Any](/*58.30*/generators/*58.40*/.navbarMenu(routes.Application.contact(), "CONTACT"))),format.raw/*58.92*/("""
                            """),_display_(Seq[Any](/*59.30*/subjectPresentOr()/*59.48*/ {_display_(Seq[Any](format.raw/*59.50*/("""
                                """),_display_(Seq[Any](/*60.34*/defining(Application.getLocalUser(session()))/*60.79*/ { user =>_display_(Seq[Any](format.raw/*60.89*/("""
                                    <li><div class="dropdown">
                                        <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                            <i class="icon-user"></i> """),_display_(Seq[Any](/*63.72*/user/*63.76*/.name.toUpperCase())),format.raw/*63.95*/("""
                                        <span class="caret"></span>
                                        </a>

                                        <ul class="dropdown-menu">
                                            <li><a href=""""),_display_(Seq[Any](/*68.59*/routes/*68.65*/.Application.profile())),format.raw/*68.87*/("""">"""),_display_(Seq[Any](/*68.90*/Messages("playauthenticate.navigation.profile")/*68.137*/.toUpperCase())),format.raw/*68.151*/("""</a></li>
                                            <li class="divider"></li>
                                            <li><a href=""""),_display_(Seq[Any](/*70.59*/com/*70.62*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*70.123*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*70.151*/Messages("playauthenticate.navigation.logout")/*70.197*/.toUpperCase())),format.raw/*70.211*/("""</a></li>
                                        </ul>
                                    </div>
                                    </li>
                                """)))})),format.raw/*74.34*/("""
                            """)))}/*75.30*/{_display_(Seq[Any](format.raw/*75.31*/("""
                                """),_display_(Seq[Any](/*76.34*/generators/*76.44*/.navbarMenu(routes.Application.login(), "SIGN IN"))),format.raw/*76.94*/("""
                            """)))})),format.raw/*77.30*/("""

                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>

            <div id="wrapper-content">

                        <!-- INSERTED CONTENT GOES HERE -->
                    """),_display_(Seq[Any](/*87.22*/content)),format.raw/*87.29*/("""
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
            <script src=""""),_display_(Seq[Any](/*124.27*/routes/*124.33*/.Assets.at("js/bootstrap.min.js"))),format.raw/*124.66*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*125.27*/routes/*125.33*/.Assets.at("js/retina-1.1.0.js"))),format.raw/*125.65*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*126.27*/routes/*126.33*/.Assets.at("js/jquery.hoverdir.js"))),format.raw/*126.68*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*127.27*/routes/*127.33*/.Assets.at("js/jquery.hoverex.min.js"))),format.raw/*127.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*128.27*/routes/*128.33*/.Assets.at("js/jquery.prettyPhoto.js"))),format.raw/*128.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*129.27*/routes/*129.33*/.Assets.at("js/jquery.isotope.min.js"))),format.raw/*129.71*/(""""></script>
            <script src=""""),_display_(Seq[Any](/*130.27*/routes/*130.33*/.Assets.at("js/custom.js"))),format.raw/*130.59*/(""""></script>

            <script>
            // Portfolio
            (function($) """),format.raw/*134.26*/("""{"""),format.raw/*134.27*/("""
            "use strict";
            var $container = $('.portfolio'),
            $items = $container.find('.portfolio-item'),
            portfolioLayout = 'fitRows';

            if( $container.hasClass('portfolio-centered') ) """),format.raw/*140.61*/("""{"""),format.raw/*140.62*/("""
            portfolioLayout = 'masonry';
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/("""

            $container.isotope("""),format.raw/*144.32*/("""{"""),format.raw/*144.33*/("""
            filter: '*',
            animationEngine: 'best-available',
            layoutMode: portfolioLayout,
            animationOptions: """),format.raw/*148.31*/("""{"""),format.raw/*148.32*/("""
            duration: 750,
            easing: 'linear',
            queue: false
            """),format.raw/*152.13*/("""}"""),format.raw/*152.14*/(""",
            masonry: """),format.raw/*153.22*/("""{"""),format.raw/*153.23*/("""
            """),format.raw/*154.13*/("""}"""),format.raw/*154.14*/("""
            """),format.raw/*155.13*/("""}"""),format.raw/*155.14*/(""", refreshWaypoints());

            function refreshWaypoints() """),format.raw/*157.41*/("""{"""),format.raw/*157.42*/("""
            setTimeout(function() """),format.raw/*158.35*/("""{"""),format.raw/*158.36*/("""
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/(""", 1000);
            """),format.raw/*160.13*/("""}"""),format.raw/*160.14*/("""

            $('nav.portfolio-filter ul a').on('click', function() """),format.raw/*162.67*/("""{"""),format.raw/*162.68*/("""
            var selector = $(this).attr('data-filter');
            $container.isotope("""),format.raw/*164.32*/("""{"""),format.raw/*164.33*/(""" filter: selector """),format.raw/*164.51*/("""}"""),format.raw/*164.52*/(""", refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
            """),format.raw/*168.13*/("""}"""),format.raw/*168.14*/(""");

            function getColumnNumber() """),format.raw/*170.40*/("""{"""),format.raw/*170.41*/("""
            var winWidth = $(window).width(),
            columnNumber = 1;

            if (winWidth > 1200) """),format.raw/*174.34*/("""{"""),format.raw/*174.35*/("""
            columnNumber = 5;
            """),format.raw/*176.13*/("""}"""),format.raw/*176.14*/(""" else if (winWidth > 950) """),format.raw/*176.40*/("""{"""),format.raw/*176.41*/("""
            columnNumber = 4;
            """),format.raw/*178.13*/("""}"""),format.raw/*178.14*/(""" else if (winWidth > 600) """),format.raw/*178.40*/("""{"""),format.raw/*178.41*/("""
            columnNumber = 3;
            """),format.raw/*180.13*/("""}"""),format.raw/*180.14*/(""" else if (winWidth > 400) """),format.raw/*180.40*/("""{"""),format.raw/*180.41*/("""
            columnNumber = 2;
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/(""" else if (winWidth > 250) """),format.raw/*182.40*/("""{"""),format.raw/*182.41*/("""
            columnNumber = 1;
            """),format.raw/*184.13*/("""}"""),format.raw/*184.14*/("""
            return columnNumber;
            """),format.raw/*186.13*/("""}"""),format.raw/*186.14*/("""

            function setColumns() """),format.raw/*188.35*/("""{"""),format.raw/*188.36*/("""
            var winWidth = $(window).width(),
            columnNumber = getColumnNumber(),
            itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() """),format.raw/*193.64*/("""{"""),format.raw/*193.65*/("""
            $(this).css( """),format.raw/*194.26*/("""{"""),format.raw/*194.27*/("""
            width : itemWidth + 'px'
            """),format.raw/*196.13*/("""}"""),format.raw/*196.14*/(""");
            """),format.raw/*197.13*/("""}"""),format.raw/*197.14*/(""");
            """),format.raw/*198.13*/("""}"""),format.raw/*198.14*/("""

            function setPortfolio() """),format.raw/*200.37*/("""{"""),format.raw/*200.38*/("""
            setColumns();
            $container.isotope('reLayout');
            """),format.raw/*203.13*/("""}"""),format.raw/*203.14*/("""

            $container.imagesLoaded(function () """),format.raw/*205.49*/("""{"""),format.raw/*205.50*/("""
            setPortfolio();
            """),format.raw/*207.13*/("""}"""),format.raw/*207.14*/(""");

            $(window).on('resize', function () """),format.raw/*209.48*/("""{"""),format.raw/*209.49*/("""
            setPortfolio();
            """),format.raw/*211.13*/("""}"""),format.raw/*211.14*/(""");
            """),format.raw/*212.13*/("""}"""),format.raw/*212.14*/(""")(jQuery);
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
                    DATE: Fri Jun 06 02:10:29 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/main.scala.html
                    HASH: 028cc896ec0964024dbc9dff65988013a8dd518e
                    MATRIX: 785->1|1033->49|1067->106|1097->168|1170->206|1184->212|1212->219|1288->259|1315->264|1762->675|1777->681|1828->710|1940->786|1955->792|2008->823|2090->869|2105->875|2165->913|2249->961|2264->967|2319->1000|2462->1107|2477->1113|2526->1140|3663->2241|3678->2247|3720->2267|4039->2550|4058->2560|4127->2607|4194->2638|4213->2648|4283->2696|4350->2727|4369->2737|4443->2789|4510->2820|4537->2838|4577->2840|4648->2875|4702->2920|4750->2930|5028->3172|5041->3176|5082->3195|5363->3440|5378->3446|5422->3468|5461->3471|5518->3518|5555->3532|5731->3672|5743->3675|5827->3736|5892->3764|5948->3810|5985->3824|6195->4002|6245->4033|6284->4034|6355->4069|6374->4079|6446->4129|6509->4160|6800->4415|6829->4422|8884->6440|8900->6446|8956->6479|9032->6518|9048->6524|9103->6556|9179->6595|9195->6601|9253->6636|9329->6675|9345->6681|9406->6719|9482->6758|9498->6764|9559->6802|9635->6841|9651->6847|9712->6885|9788->6924|9804->6930|9853->6956|9970->7044|10000->7045|10267->7283|10297->7284|10382->7340|10412->7341|10476->7376|10506->7377|10683->7525|10713->7526|10841->7625|10871->7626|10924->7650|10954->7651|10997->7665|11027->7666|11070->7680|11100->7681|11195->7747|11225->7748|11290->7784|11320->7785|11363->7799|11393->7800|11444->7822|11474->7823|11573->7893|11603->7894|11722->7984|11752->7985|11799->8003|11829->8004|12029->8175|12059->8176|12133->8221|12163->8222|12307->8337|12337->8338|12411->8383|12441->8384|12496->8410|12526->8411|12600->8456|12630->8457|12685->8483|12715->8484|12789->8529|12819->8530|12874->8556|12904->8557|12978->8602|13008->8603|13063->8629|13093->8630|13167->8675|13197->8676|13274->8724|13304->8725|13371->8763|13401->8764|13653->8987|13683->8988|13739->9015|13769->9016|13850->9068|13880->9069|13925->9085|13955->9086|14000->9102|14030->9103|14099->9143|14129->9144|14244->9230|14274->9231|14355->9283|14385->9284|14457->9327|14487->9328|14569->9381|14599->9382|14671->9425|14701->9426|14746->9442|14776->9443
                    LINES: 26->1|32->1|34->4|34->5|37->8|37->8|37->8|39->10|39->10|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|55->26|55->26|55->26|58->29|58->29|58->29|80->51|80->51|80->51|85->56|85->56|85->56|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|92->63|92->63|92->63|97->68|97->68|97->68|97->68|97->68|97->68|99->70|99->70|99->70|99->70|99->70|99->70|103->74|104->75|104->75|105->76|105->76|105->76|106->77|116->87|116->87|153->124|153->124|153->124|154->125|154->125|154->125|155->126|155->126|155->126|156->127|156->127|156->127|157->128|157->128|157->128|158->129|158->129|158->129|159->130|159->130|159->130|163->134|163->134|169->140|169->140|171->142|171->142|173->144|173->144|177->148|177->148|181->152|181->152|182->153|182->153|183->154|183->154|184->155|184->155|186->157|186->157|187->158|187->158|188->159|188->159|189->160|189->160|191->162|191->162|193->164|193->164|193->164|193->164|197->168|197->168|199->170|199->170|203->174|203->174|205->176|205->176|205->176|205->176|207->178|207->178|207->178|207->178|209->180|209->180|209->180|209->180|211->182|211->182|211->182|211->182|213->184|213->184|215->186|215->186|217->188|217->188|222->193|222->193|223->194|223->194|225->196|225->196|226->197|226->197|227->198|227->198|229->200|229->200|232->203|232->203|234->205|234->205|236->207|236->207|238->209|238->209|240->211|240->211|241->212|241->212
                    -- GENERATED --
                */
            