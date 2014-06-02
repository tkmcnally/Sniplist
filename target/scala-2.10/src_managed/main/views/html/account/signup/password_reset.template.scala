
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

	<h1>"""),_display_(Seq[Any](/*8.7*/Messages("playauthenticate.password.reset.title"))),format.raw/*8.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*10.3*/form(routes.Signup.doResetPassword)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	   
       """),_display_(Seq[Any](/*12.9*/if(resetForm.hasGlobalErrors)/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*14.48*/resetForm/*14.57*/.globalError.message)),format.raw/*14.77*/("""</span>
     	</p>
       """)))})),format.raw/*16.9*/("""
       
        """),_display_(Seq[Any](/*18.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false
   		
   		)/*23.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.36*/("""
		    <input type="hidden" value=""""),_display_(Seq[Any](/*24.36*/value)),format.raw/*24.41*/("""" name=""""),_display_(Seq[Any](/*24.50*/name)),format.raw/*24.54*/("""" id=""""),_display_(Seq[Any](/*24.61*/id)),format.raw/*24.63*/("""" """),_display_(Seq[Any](/*24.66*/toHtmlArgs(args))),format.raw/*24.82*/(""">
		""")))})),format.raw/*25.4*/("""
	   
	   """),_display_(Seq[Any](/*27.6*/_passwordPartial(resetForm))),format.raw/*27.33*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*29.32*/Messages("playauthenticate.password.reset.cta"))),format.raw/*29.79*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*30.3*/("""
	</p>
""")))})))}
    }
    
    def render(resetForm:Form[controllers.Signup.PasswordReset]): play.api.templates.HtmlFormat.Appendable = apply(resetForm)
    
    def f:((Form[controllers.Signup.PasswordReset]) => play.api.templates.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 30 10:15:31 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/signup/password_reset.scala.html
                    HASH: fa5eff0bf1435d916b8253d381085da4c26c8e5b
                    MATRIX: 830->1|1027->52|1057->109|1094->112|1157->167|1196->169|1240->179|1310->228|1360->243|1404->278|1444->280|1495->296|1533->325|1573->327|1686->404|1704->413|1746->433|1806->462|1862->482|1974->586|2041->615|2114->652|2141->657|2186->666|2212->670|2255->677|2279->679|2318->682|2356->698|2393->704|2441->717|2490->744|2572->790|2641->837|2703->868
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|47->18|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|53->24|53->24|54->25|56->27|56->27|58->29|58->29|59->30
                    -- GENERATED --
                */
            