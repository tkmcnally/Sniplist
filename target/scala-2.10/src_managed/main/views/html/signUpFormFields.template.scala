
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
object signUpFormFields extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[_], constraints: Boolean = false):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*4.6*/implicitField/*4.19*/ = {{ FieldConstructor(signupField.f) }};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*4.58*/("""

"""),_display_(Seq[Any](/*6.2*/inputText(
    userForm("name"),
    '_label -> Messages("playauthenticate.signup.name"),
    'showConstraints -> false
))),format.raw/*10.2*/("""

"""),_display_(Seq[Any](/*12.2*/inputText(
    userForm("email"),
    '_showConstraints -> constraints,
    '_label -> Messages("playauthenticate.login.email.placeholder"),
    'type -> "email"
))),format.raw/*17.2*/("""

"""),_display_(Seq[Any](/*19.2*/inputPassword(
    userForm("password"),
    '_label -> Messages("playauthenticate.login.password.placeholder")
))),format.raw/*22.2*/("""

"""),_display_(Seq[Any](/*24.2*/inputPassword(
    userForm("repeatPassword"),
    '_label -> Messages("playauthenticate.login.password.repeat"),
    '_showConstraints -> false,
    '_error -> userForm.error("password")
))))}
    }
    
    def render(userForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},constraints:Boolean): play.api.templates.HtmlFormat.Appendable = apply(userForm,constraints)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean) => play.api.templates.HtmlFormat.Appendable) = (userForm,constraints) => apply(userForm,constraints)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 16 17:21:55 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/signUpFormFields.scala.html
                    HASH: a061ec964c98f1364c8c3bafef22167a5130553a
                    MATRIX: 867->1|1018->74|1039->87|1108->50|1136->69|1167->126|1204->129|1346->250|1384->253|1568->416|1606->419|1740->532|1778->535
                    LINES: 28->1|31->4|31->4|32->1|34->4|34->4|36->6|40->10|42->12|47->17|49->19|52->22|54->24
                    -- GENERATED --
                */
            