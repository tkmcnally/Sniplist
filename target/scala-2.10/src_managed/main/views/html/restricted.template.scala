
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
object restricted extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*3.72*/ {_display_(Seq[Any](format.raw/*3.74*/("""
    
    <h1>"""),_display_(Seq[Any](/*5.10*/Messages("playauthenticate.navigation.restricted"))),format.raw/*5.60*/("""</h1>
    <p>
        """),_display_(Seq[Any](/*7.10*/Messages("playauthenticate.restricted.secrets"))),format.raw/*7.57*/("""
    </p>
""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 10 22:10:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/restricted.scala.html
                    HASH: 4db54a3ffc9309d65000365c00497bdb52b1a998
                    MATRIX: 784->1|909->32|948->37|1026->107|1065->109|1117->126|1188->176|1248->201|1316->248
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7
                    -- GENERATED --
                */
            