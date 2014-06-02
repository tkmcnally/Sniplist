
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
object password_change extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Account.PasswordChange],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.change.password.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	<h1>"""),_display_(Seq[Any](/*8.7*/Messages("playauthenticate.change.password.title"))),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*10.3*/form(routes.Account.doChangePassword)/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
	   
       """),_display_(Seq[Any](/*12.9*/if(changeForm.hasGlobalErrors)/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*14.48*/changeForm/*14.58*/.globalError.message)),format.raw/*14.78*/("""</span>
     	</p>
       """)))})),format.raw/*16.9*/("""

	   """),_display_(Seq[Any](/*18.6*/_passwordPartial(changeForm))),format.raw/*18.34*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*20.32*/Messages("playauthenticate.change.password.cta"))),format.raw/*20.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*21.3*/("""
	</p>
""")))})))}
    }
    
    def render(changeForm:Form[controllers.Account.PasswordChange]): play.api.templates.HtmlFormat.Appendable = apply(changeForm)
    
    def f:((Form[controllers.Account.PasswordChange]) => play.api.templates.HtmlFormat.Appendable) = (changeForm) => apply(changeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 30 10:15:31 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/password_change.scala.html
                    HASH: 6ea58edafae6f8f1253b5c09bd522e24ebc2498c
                    MATRIX: 826->1|1026->55|1056->112|1093->115|1157->171|1196->173|1240->183|1311->233|1361->248|1407->285|1447->287|1498->303|1537->333|1577->335|1690->412|1709->422|1751->442|1811->471|1855->480|1905->508|1987->554|2057->602|2119->633
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|47->18|47->18|49->20|49->20|50->21
                    -- GENERATED --
                */
            