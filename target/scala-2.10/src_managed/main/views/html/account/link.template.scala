
package views.html.account

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
object link extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages("playauthenticate.link.account.title"))/*5.55*/ {_display_(Seq[Any](format.raw/*5.57*/("""

    <div class="container mtb">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("playauthenticate.link.account.title"))),format.raw/*8.61*/("""</h1>

        <p>
            <ul class="providers list-unstyled">
            """),_display_(Seq[Any](/*12.14*/forProviders(skipCurrent = true)/*12.46*/ { p =>_display_(Seq[Any](format.raw/*12.53*/("""
              """),_display_(Seq[Any](/*13.16*/if(!localUser.getProviders().contains(p.getKey))/*13.64*/ {_display_(Seq[Any](format.raw/*13.66*/("""
                  <li>
                      <a href="/authenticate/"""),_display_(Seq[Any](/*15.47*/p/*15.48*/.getKey)),format.raw/*15.55*/("""">
                      """),_display_(Seq[Any](/*16.24*/_providerIcon(p.getKey))),format.raw/*16.47*/("""</a>
                  </li>
              """)))})),format.raw/*18.16*/("""
            """)))})),format.raw/*19.14*/("""
            </ul>

        </p>


        <h1>"""),_display_(Seq[Any](/*25.14*/Messages("playauthenticate.unlink.account.remove"))),format.raw/*25.64*/("""</h1>
        <ul class="providers list-unstyled list-inline">
        """),_display_(Seq[Any](/*27.10*/defining(localUser.getProviders())/*27.44*/ { providers =>_display_(Seq[Any](format.raw/*27.59*/("""
            """),_display_(Seq[Any](/*28.14*/for(p <- providers) yield /*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""
                <li>
                    <a href="/accounts/unlink/"""),_display_(Seq[Any](/*30.48*/p)),format.raw/*30.49*/("""">
                    """),_display_(Seq[Any](/*31.22*/_providerIcon(p))),format.raw/*31.38*/("""</a>
                </li>
            """)))})),format.raw/*33.14*/("""
        """)))})),format.raw/*34.10*/("""
        </ul>
    </div>
""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 17:05:21 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/link.scala.html
                    HASH: 08af51478a2aad4a067c8036f5cde8d8fc209256
                    MATRIX: 786->1|956->32|986->82|1023->85|1084->138|1123->140|1208->190|1276->237|1397->322|1438->354|1483->361|1536->378|1593->426|1633->428|1741->500|1751->501|1780->508|1843->535|1888->558|1966->604|2013->619|2103->673|2175->723|2285->797|2328->831|2381->846|2432->861|2467->880|2507->882|2614->953|2637->954|2698->979|2736->995|2810->1037|2853->1048
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|46->18|47->19|53->25|53->25|55->27|55->27|55->27|56->28|56->28|56->28|58->30|58->30|59->31|59->31|61->33|62->34
                    -- GENERATED --
                */
            