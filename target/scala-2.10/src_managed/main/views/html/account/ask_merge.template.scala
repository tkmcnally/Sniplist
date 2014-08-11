
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
object ask_merge extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/label/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(Seq[Any](/*7.3*/Messages("playauthenticate.merge.accounts.question",aUser,bUser))),format.raw/*7.67*/("""
""")))};
Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(Messages("playauthenticate.merge.accounts.title"))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""


    <div class="container mtb">
        <div class="row">
            <h1>"""),_display_(Seq[Any](/*15.18*/Messages("playauthenticate.merge.accounts.title"))),format.raw/*15.67*/("""</h1>
            <p>
            """),_display_(Seq[Any](/*17.14*/form(routes.Account.doMerge)/*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""

                    """),_display_(Seq[Any](/*19.22*/if(acceptForm.hasGlobalErrors)/*19.52*/ {_display_(Seq[Any](format.raw/*19.54*/("""
                        <p class="error">
                            <span class="label label-important">"""),_display_(Seq[Any](/*21.66*/acceptForm/*21.76*/.globalError.message)),format.raw/*21.96*/("""</span>
                        </p>
                    """)))})),format.raw/*23.22*/("""

               """),_display_(Seq[Any](/*25.17*/inputRadioGroup(
                    acceptForm("accept"),
                    options = Seq(
                        "true"-> Messages("playauthenticate.merge.accounts.true"),
                        "false"->Messages("playauthenticate.merge.accounts.false")
                    ),
                    '_label -> label,
                    '_showConstraints -> false
                ))),format.raw/*33.18*/("""

                <input type="submit" value=""""),_display_(Seq[Any](/*35.46*/Messages("playauthenticate.merge.accounts.ok"))),format.raw/*35.92*/("""" class="btn btn-primary">
            """)))})),format.raw/*36.14*/("""
            </p>
        </div>
    </div>
""")))})))}
    }
    
    def render(acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser): play.api.templates.HtmlFormat.Appendable = apply(acceptForm,aUser,bUser)
    
    def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.api.templates.HtmlFormat.Appendable) = (acceptForm,aUser,bUser) => apply(acceptForm,aUser,bUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 11 17:33:11 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/ask_merge.scala.html
                    HASH: 02bf97ca247665ea659934c049d79366f5554947
                    MATRIX: 876->1|1131->187|1143->192|1227->196|1265->200|1350->264|1393->127|1423->184|1451->267|1491->272|1555->327|1595->329|1714->412|1785->461|1858->498|1895->526|1935->528|1996->553|2035->583|2075->585|2221->695|2240->705|2282->725|2374->785|2430->805|2845->1198|2930->1247|2998->1293|3071->1334
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|54->23|56->25|64->33|66->35|66->35|67->36
                    -- GENERATED --
                */
            