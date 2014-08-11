
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
object signupField extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
<div class="control-group row top-buffer-sm """),_display_(Seq[Any](/*5.46*/if(elements.hasErrors)/*5.68*/ {_display_(Seq[Any](format.raw/*5.70*/("""has-error""")))})),format.raw/*5.80*/("""">
    <label class="control-label  col-sm-3" for=""""),_display_(Seq[Any](/*6.50*/elements/*6.58*/.id)),format.raw/*6.61*/("""">"""),_display_(Seq[Any](/*6.64*/elements/*6.72*/.label)),format.raw/*6.78*/("""</label>
    <div class="input-group  col-sm-6">

        """),_display_(Seq[Any](/*9.10*/if(elements.hasErrors)/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
            """),_display_(Seq[Any](/*10.14*/Html(elements.input.body.dropRight(2)+" class='form-control has-error'>"))),format.raw/*10.87*/("""
            <span class="help-inline form-error">"""),_display_(Seq[Any](/*11.51*/elements/*11.59*/.errors.mkString(", "))),format.raw/*11.81*/("""</span>
        """)))}/*12.11*/else/*12.16*/{_display_(Seq[Any](format.raw/*12.17*/("""
            """),_display_(Seq[Any](/*13.14*/Html(elements.input.body.dropRight(2)+" class='form-control'>"))),format.raw/*13.77*/("""
            <span class="help-inline top-buffer-xsm">"""),_display_(Seq[Any](/*14.55*/elements/*14.63*/.infos.mkString(", "))),format.raw/*14.84*/("""</span>
        """)))})),format.raw/*15.10*/("""
    </div>
    <div class="col-md-3"></div>
</div>"""))}
    }
    
    def render(elements:views.html.helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 18:07:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/signupField.scala.html
                    HASH: b6cec0f17a7b85e5a12d9751e8bb0865a21aaee8
                    MATRIX: 805->1|969->44|997->74|1078->120|1108->142|1147->144|1188->154|1275->206|1291->214|1315->217|1353->220|1369->228|1396->234|1490->293|1520->315|1559->317|1609->331|1704->404|1791->455|1808->463|1852->485|1888->503|1901->508|1940->509|1990->523|2075->586|2166->641|2183->649|2226->670|2275->687
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|37->9|37->9|37->9|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|42->14|42->14|42->14|43->15
                    -- GENERATED --
                */
            