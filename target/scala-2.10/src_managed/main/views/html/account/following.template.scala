
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
object following extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,models.User,List[models.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null, followingList: List[models.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/content/*3.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    <div class="container mtb">
        <div class="row">
            <h2>Following """),_display_(Seq[Any](/*6.28*/followingList/*6.41*/.size)),format.raw/*6.46*/(""" user(s)</h2>
            """),_display_(Seq[Any](/*7.14*/for(fUser <- followingList) yield /*7.41*/ {_display_(Seq[Any](format.raw/*7.43*/("""
                <a class="dynamic-link" href=""""),_display_(Seq[Any](/*8.48*/routes/*8.54*/.Application.getUserProfile(fUser.id.toString))),format.raw/*8.100*/("""">"""),_display_(Seq[Any](/*8.103*/fUser/*8.108*/.name)),format.raw/*8.113*/("""</a>
            """)))})),format.raw/*9.14*/("""
        </div>
    </div>
""")))};
Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/if(!js)/*14.9*/ {_display_(Seq[Any](format.raw/*14.11*/("""
    """),_display_(Seq[Any](/*15.6*/main("Following", "following")/*15.36*/(content))),format.raw/*15.45*/("""
""")))}/*16.3*/else/*16.8*/{_display_(Seq[Any](format.raw/*16.9*/("""
    """),_display_(Seq[Any](/*17.6*/content)),format.raw/*17.13*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User,followingList:List[models.User]): play.api.templates.HtmlFormat.Appendable = apply(js,localUser,followingList)
    
    def f:((java.lang.Boolean,models.User,List[models.User]) => play.api.templates.HtmlFormat.Appendable) = (js,localUser,followingList) => apply(js,localUser,followingList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Aug 10 22:10:18 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/account/following.scala.html
                    HASH: a248b9e6582c0e15350d2cf452bf52da95214ff6
                    MATRIX: 827->1|992->92|1006->99|1090->103|1211->189|1232->202|1258->207|1320->234|1362->261|1401->263|1484->311|1498->317|1566->363|1605->366|1619->371|1646->376|1695->394|1762->89|1791->422|1829->425|1844->432|1884->434|1925->440|1964->470|1995->479|2015->482|2027->487|2065->488|2106->494|2135->501
                    LINES: 26->1|28->3|28->3|30->3|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|35->8|35->8|35->8|36->9|40->1|42->12|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17
                    -- GENERATED --
                */
            