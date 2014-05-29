
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
<ul class="providers">
	"""),_display_(Seq[Any](/*14.3*/forProviders(skipCurrent)/*14.28*/ { p =>_display_(Seq[Any](format.raw/*14.35*/("""
		<li>
		"""),_display_(Seq[Any](/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(Seq[Any](/*17.55*/p/*17.56*/.getUrl())),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			<a href=""""),_display_(Seq[Any](/*19.14*/p/*19.15*/.getUrl())),format.raw/*19.24*/("""">
		""")))})),format.raw/*20.4*/("""
		"""),_display_(Seq[Any](/*21.4*/_providerIcon(p.getKey()))),format.raw/*21.29*/("""</a>
		</li>
	""")))})),format.raw/*23.3*/("""
</ul>"""))}
    }
    
    def render(skipCurrent:Boolean): play.api.templates.HtmlFormat.Appendable = apply(skipCurrent)
    
    def f:((Boolean) => play.api.templates.HtmlFormat.Appendable) = (skipCurrent) => apply(skipCurrent)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 29 15:29:05 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/_providerPartial.scala.html
                    HASH: 1236d72c9980fc92107f5a060a4369ca40169c8d
                    MATRIX: 786->1|954->30|984->80|1070->139|1098->140|1216->231|1244->232|1342->303|1370->304|1399->306|1427->307|1501->346|1535->371|1580->378|1628->391|1663->417|1703->419|1795->475|1805->476|1836->485|1864->496|1877->501|1916->502|1967->517|1977->518|2008->527|2046->534|2086->539|2133->564|2181->581
                    LINES: 26->1|30->1|32->4|34->6|34->6|36->8|36->8|38->10|38->10|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|51->23
                    -- GENERATED --
                */
            