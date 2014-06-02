
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>"""),_display_(Seq[Any](/*5.14*/Messages("playauthenticate.index.intro"))),format.raw/*5.54*/("""</h1>
        <p>"""),_display_(Seq[Any](/*6.13*/Messages("playauthenticate.index.intro_2"))),format.raw/*6.55*/(""" <br/>"""),_display_(Seq[Any](/*6.62*/Messages("playauthenticate.index.intro_3"))),format.raw/*6.104*/("""</p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(Seq[Any](/*12.16*/Messages("playauthenticate.index.heading"))),format.raw/*12.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*14.39*/Messages("playauthenticate.index.details"))),format.raw/*14.81*/(""" &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*19.39*/Messages("playauthenticate.index.details"))),format.raw/*19.81*/(""" &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*24.39*/Messages("playauthenticate.index.details"))),format.raw/*24.81*/(""" &raquo;</a></p>
        </div>
      </div>
    """)))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 01 21:40:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/index.scala.html
                    HASH: acce07eebf2108c572a4a5c8f1ce52894ef74f49
                    MATRIX: 864->3|918->49|957->51|1119->178|1180->218|1234->237|1297->279|1339->286|1403->328|1569->458|1633->500|1940->771|2004->813|2350->1123|2414->1165|2766->1481|2830->1523
                    LINES: 29->2|29->2|29->2|32->5|32->5|33->6|33->6|33->6|33->6|39->12|39->12|41->14|41->14|46->19|46->19|51->24|51->24
                    -- GENERATED --
                */
            