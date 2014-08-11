
package views.html.account.signup

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
object password_reset extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Signup.PasswordReset],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.password.reset.title"))/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""
    <div class="container mtb">
        <div class="row">
            <div class="centered">
                <div class="col-md-6">
                    <h1>"""),_display_(Seq[Any](/*11.26*/Messages("playauthenticate.password.reset.title"))),format.raw/*11.75*/("""</h1>
                    <p>
                    """),_display_(Seq[Any](/*13.22*/form(routes.Signup.doResetPassword)/*13.57*/ {_display_(Seq[Any](format.raw/*13.59*/("""

                       """),_display_(Seq[Any](/*15.25*/if(resetForm.hasGlobalErrors)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
                        <p class="error">
                          <span class="label label-important">"""),_display_(Seq[Any](/*17.64*/resetForm/*17.73*/.globalError.message)),format.raw/*17.93*/("""</span>
                        </p>
                       """)))})),format.raw/*19.25*/("""

                        """),_display_(Seq[Any](/*21.26*/input(
                            resetForm("token"),
                            '_label -> "",
                            '_showConstraints -> false

                        )/*26.26*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*26.55*/("""
                            <input type="hidden" value=""""),_display_(Seq[Any](/*27.58*/value)),format.raw/*27.63*/("""" name=""""),_display_(Seq[Any](/*27.72*/name)),format.raw/*27.76*/("""" id=""""),_display_(Seq[Any](/*27.83*/id)),format.raw/*27.85*/("""" """),_display_(Seq[Any](/*27.88*/toHtmlArgs(args))),format.raw/*27.104*/(""">
                        """)))})),format.raw/*28.26*/("""

                       """),_display_(Seq[Any](/*30.25*/_passwordPartial(resetForm))),format.raw/*30.52*/("""

                        <input type="submit" value=""""),_display_(Seq[Any](/*32.54*/Messages("playauthenticate.password.reset.cta"))),format.raw/*32.101*/("""" class="btn btn-primary">
                    """)))})),format.raw/*33.22*/("""
                    </p>
                </div>
            </div>
        </div>
    </div>

""")))})))}
    }
    
    def render(resetForm:Form[controllers.Signup.PasswordReset]): play.api.templates.HtmlFormat.Appendable = apply(resetForm)
    
    def f:((Form[controllers.Signup.PasswordReset]) => play.api.templates.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 10 22:10:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/signup/password_reset.scala.html
                    HASH: 2541259897cc298fc04799288daa1e08a0da6f39
                    MATRIX: 830->1|1027->52|1057->109|1094->112|1157->167|1196->169|1395->332|1466->381|1555->434|1599->469|1639->471|1703->499|1741->528|1781->530|1925->638|1943->647|1985->667|2080->730|2145->759|2338->943|2405->972|2500->1031|2527->1036|2572->1045|2598->1049|2641->1056|2665->1058|2704->1061|2743->1077|2803->1105|2867->1133|2916->1160|3009->1217|3079->1264|3160->1313
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|40->11|40->11|42->13|42->13|42->13|44->15|44->15|44->15|46->17|46->17|46->17|48->19|50->21|55->26|55->26|56->27|56->27|56->27|56->27|56->27|56->27|56->27|56->27|57->28|59->30|59->30|61->32|61->32|62->33
                    -- GENERATED --
                */
            