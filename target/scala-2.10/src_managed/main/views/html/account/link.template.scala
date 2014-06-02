
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
    
    <h1>"""),_display_(Seq[Any](/*7.10*/Messages("playauthenticate.link.account.title"))),format.raw/*7.57*/("""</h1>
    
    <p>
        <ul class="providers">
        """),_display_(Seq[Any](/*11.10*/forProviders(skipCurrent = true)/*11.42*/ { p =>_display_(Seq[Any](format.raw/*11.49*/("""
          """),_display_(Seq[Any](/*12.12*/if(!localUser.getProviders().contains(p.getKey))/*12.60*/ {_display_(Seq[Any](format.raw/*12.62*/("""
              <li>
                  <a href="/authenticate/"""),_display_(Seq[Any](/*14.43*/p/*14.44*/.getKey)),format.raw/*14.51*/("""">
                  """),_display_(Seq[Any](/*15.20*/_providerIcon(p.getKey))),format.raw/*15.43*/("""</a>
              </li>
          """)))})),format.raw/*17.12*/("""
        """)))})),format.raw/*18.10*/("""
        </ul>
    <br/>
    </p>


    <h1>"""),_display_(Seq[Any](/*24.10*/Messages("playauthenticate.unlink.account.remove"))),format.raw/*24.60*/("""</h1>
    <ul class="providers">
    """),_display_(Seq[Any](/*26.6*/defining(localUser.getProviders())/*26.40*/ { providers =>_display_(Seq[Any](format.raw/*26.55*/("""
        """),_display_(Seq[Any](/*27.10*/for(p <- providers) yield /*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
            <li>
                <a href="/accounts/unlink/"""),_display_(Seq[Any](/*29.44*/p)),format.raw/*29.45*/("""">
                """),_display_(Seq[Any](/*30.18*/_providerIcon(p))),format.raw/*30.34*/("""</a>
            </li>
        """)))})),format.raw/*32.10*/("""
    """)))})),format.raw/*33.6*/("""
    </ul>

""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 30 17:39:27 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/link.scala.html
                    HASH: d6f17bc886b5ea1900e3ef609ca160b9554fa32b
                    MATRIX: 786->1|956->32|986->82|1023->85|1084->138|1123->140|1175->157|1243->204|1342->267|1383->299|1428->306|1477->319|1534->367|1574->369|1674->433|1684->434|1713->441|1772->464|1817->487|1887->525|1930->536|2017->587|2089->637|2164->677|2207->711|2260->726|2307->737|2342->756|2382->758|2481->821|2504->822|2561->843|2599->859|2665->893|2703->900
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|43->15|43->15|45->17|46->18|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|57->29|57->29|58->30|58->30|60->32|61->33
                    -- GENERATED --
                */
            