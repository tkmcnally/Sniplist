
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
object _providerPartial extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(skipCurrent: Boolean = true):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
<script type="text/javascript">
function askOpenID(url) """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
	var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
		window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
</script>
<ul class="providers list-inline list-unstyled bottom-buffer-sm">
	"""),_display_(Seq[Any](/*14.3*/forProviders(skipCurrent)/*14.28*/ { p =>_display_(Seq[Any](format.raw/*14.35*/("""
		<li class=" bottom-buffer-sm ">
		"""),_display_(Seq[Any](/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(Seq[Any](/*17.55*/p/*17.56*/.getUrl())),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			<a class="social-icon" href=""""),_display_(Seq[Any](/*19.34*/p/*19.35*/.getUrl())),format.raw/*19.44*/("""">
		""")))})),format.raw/*20.4*/("""

		"""),_display_(Seq[Any](/*22.4*/_providerIcon(p.getKey()))),format.raw/*22.29*/("""</a>
		</li>
	""")))})),format.raw/*24.3*/("""
</ul>"""))}
    }
    
    def render(skipCurrent:Boolean): play.api.templates.HtmlFormat.Appendable = apply(skipCurrent)
    
    def f:((Boolean) => play.api.templates.HtmlFormat.Appendable) = (skipCurrent) => apply(skipCurrent)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/_providerPartial.scala.html
                    HASH: c5324bb2afd700bb4d4b189630b4ab16afadcb5c
                    MATRIX: 786->1|954->30|984->80|1070->139|1098->140|1216->231|1244->232|1342->303|1370->304|1399->306|1427->307|1544->389|1578->414|1623->421|1698->461|1733->487|1773->489|1865->545|1875->546|1906->555|1934->566|1947->571|1986->572|2057->607|2067->608|2098->617|2136->624|2178->631|2225->656|2273->673
                    LINES: 26->1|30->1|32->4|34->6|34->6|36->8|36->8|38->10|38->10|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|50->22|50->22|52->24
                    -- GENERATED --
                */
            