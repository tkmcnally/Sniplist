
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,List[models.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User, followingList: List[models.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mtb">
        <div class="row">
            <h1>News Feed</h1>
            <div class="hline"></div>
        </div>
        <div class="row">
            <h2>Following """),_display_(Seq[Any](/*10.28*/followingList/*10.41*/.size)),format.raw/*10.46*/(""" user(s)</h2>
            """),_display_(Seq[Any](/*11.14*/for(fUser <- followingList) yield /*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
                <a class="dynamic-link" href=""""),_display_(Seq[Any](/*12.48*/routes/*12.54*/.Application.getUserProfile(fUser.id.toString))),format.raw/*12.100*/("""">"""),_display_(Seq[Any](/*12.103*/fUser/*12.108*/.name)),format.raw/*12.113*/("""</a>
            """)))})),format.raw/*13.14*/("""
        </div>
    </div>
""")))};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*16.2*/("""


"""),_display_(Seq[Any](/*19.2*/if(!js)/*19.9*/ {_display_(Seq[Any](format.raw/*19.11*/("""
    """),_display_(Seq[Any](/*20.6*/main("Home", "home")/*20.26*/(content))),format.raw/*20.35*/("""
""")))}/*21.3*/else/*21.8*/{_display_(Seq[Any](format.raw/*21.9*/("""
    """),_display_(Seq[Any](/*22.6*/content)),format.raw/*22.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList)
    
    def f:((java.lang.Boolean,models.User,List[models.User]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList) => apply(js,localUser,followingList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 04 00:34:32 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/home.scala.html
                    HASH: f5af3db4193f357155b2b42b4ceb417e4817e643
                    MATRIX: 814->1|972->85|986->92|1070->96|1302->292|1324->305|1351->310|1414->337|1457->364|1497->366|1581->414|1596->420|1665->466|1705->469|1720->474|1748->479|1798->497|1865->82|1894->525|1933->529|1948->536|1988->538|2029->544|2058->564|2089->573|2109->576|2121->581|2159->582|2200->588|2229->595
                    LINES: 26->1|28->3|28->3|30->3|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|39->12|39->12|39->12|40->13|44->1|46->16|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22
                    -- GENERATED --
                */
            