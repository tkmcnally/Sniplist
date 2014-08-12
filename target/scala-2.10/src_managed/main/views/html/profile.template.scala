
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.lang.Boolean,models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._

def /*5.2*/content/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""

        """),_display_(Seq[Any](/*7.10*/if(flash.contains(Application.FLASH_ERROR_KEY))/*7.57*/ {_display_(Seq[Any](format.raw/*7.59*/("""
            <div class="alert alert-danger">
            """),_display_(Seq[Any](/*9.14*/flash()/*9.21*/.get(Application.FLASH_ERROR_KEY))),format.raw/*9.54*/("""
            </div>
        """)))})),format.raw/*11.10*/("""
        """),_display_(Seq[Any](/*12.10*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*12.59*/ {_display_(Seq[Any](format.raw/*12.61*/("""
            <div class="alert alert-success">
            """),_display_(Seq[Any](/*14.14*/flash()/*14.21*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*14.56*/("""
            </div>
        """)))})),format.raw/*16.10*/("""
        <h1>"""),_display_(Seq[Any](/*17.14*/Messages("playauthenticate.profile.title"))),format.raw/*17.56*/("""</h1>
        <p>
            Your name is """),_display_(Seq[Any](/*19.27*/localUser/*19.36*/.name)),format.raw/*19.41*/(""" and your email address is """),_display_(Seq[Any](/*19.69*/if(!localUser.email)/*19.89*/ {_display_(Seq[Any](format.raw/*19.91*/("""
            <em>&lt;unknown&gt;</em>
            .""")))}/*21.16*/else/*21.21*/{_display_(Seq[Any](format.raw/*21.22*/("""
            """),_display_(Seq[Any](/*22.14*/localUser/*22.23*/.email)),format.raw/*22.29*/(""".
            <i>
            """),_display_(Seq[Any](/*24.14*/if(!localUser.emailValidated && localUser.email)/*24.62*/ {_display_(Seq[Any](format.raw/*24.64*/("""
                (<a href=""""),_display_(Seq[Any](/*25.28*/routes/*25.34*/.Account.verifyEmail)),format.raw/*25.54*/("""">unverified - click to verify</a>)
            """)))}/*26.15*/else/*26.20*/{_display_(Seq[Any](format.raw/*26.21*/("""
                (verified)
            """)))})),format.raw/*28.14*/("""</i>
        """)))})),format.raw/*29.10*/("""
            <br />
            """),_display_(Seq[Any](/*31.14*/if(localUser.firstName && localUser.lastName)/*31.59*/ {_display_(Seq[Any](format.raw/*31.61*/("""
                Your first name is """),_display_(Seq[Any](/*32.37*/localUser/*32.46*/.firstName)),format.raw/*32.56*/(""" and your last name is """),_display_(Seq[Any](/*32.80*/localUser/*32.89*/.lastName)),format.raw/*32.98*/("""
                <br/>
            """)))})),format.raw/*34.14*/("""
            """),_display_(Seq[Any](/*35.14*/defining(localUser.getProviders())/*35.48*/ { providers =>_display_(Seq[Any](format.raw/*35.63*/("""
                """),_display_(Seq[Any](/*36.18*/if(providers.size() > 0)/*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""
                    """),_display_(Seq[Any](/*37.22*/if(providers.size() == 1)/*37.47*/ {_display_(Seq[Any](format.raw/*37.49*/("""
                        """),_display_(Seq[Any](/*38.26*/Messages("playauthenticate.profile.providers_one"))),format.raw/*38.76*/("""
                    """)))}/*39.23*/else/*39.28*/{_display_(Seq[Any](format.raw/*39.29*/("""
                        """),_display_(Seq[Any](/*40.26*/Messages("playauthenticate.profile.providers_many", providers.size().toString()))),format.raw/*40.106*/("""
                    """)))})),format.raw/*41.22*/("""
                    """),_display_(Seq[Any](/*42.22*/for(p <- providers) yield /*42.41*/ {_display_(Seq[Any](format.raw/*42.43*/("""
                        """),_display_(Seq[Any](/*43.26*/_providerIcon(p))),format.raw/*43.42*/("""
                    """)))})),format.raw/*44.22*/("""
                    <br/>
                """)))})),format.raw/*46.18*/("""
            """)))})),format.raw/*47.14*/("""

            <br/>
            """),_display_(Seq[Any](/*50.14*/currentAuth()/*50.27*/ { auth =>_display_(Seq[Any](format.raw/*50.37*/("""
                """),_display_(Seq[Any](/*51.18*/Messages("playauthenticate.profile.logged"))),format.raw/*51.61*/(""" """),_display_(Seq[Any](/*51.63*/_providerIcon(auth.getProvider()))),format.raw/*51.96*/(""" <br/>
                """),_display_(Seq[Any](/*52.18*/if(auth.expires() != -1)/*52.42*/ {_display_(Seq[Any](format.raw/*52.44*/("""
                        """),_display_(Seq[Any](/*53.26*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires())))),format.raw/*53.129*/("""
                        <h1> Your USERID is: """),_display_(Seq[Any](/*54.47*/localUser/*54.56*/.id)),format.raw/*54.59*/(""" </h1>
        """)))}/*55.11*/else/*55.16*/{_display_(Seq[Any](format.raw/*55.17*/("""
            """),_display_(Seq[Any](/*56.14*/Messages("playauthenticate.profile.session_endless", auth.getId()))),format.raw/*56.80*/("""
        """)))})),format.raw/*57.10*/("""
    """)))})),format.raw/*58.6*/("""
        <br/>
        <ul>
            <li><a href=""""),_display_(Seq[Any](/*61.27*/routes/*61.33*/.Account.changePassword)),format.raw/*61.56*/("""">"""),_display_(Seq[Any](/*61.59*/Messages("playauthenticate.profile.password_change"))),format.raw/*61.111*/("""</a></li>
            <li><a href=""""),_display_(Seq[Any](/*62.27*/routes/*62.33*/.Account.link)),format.raw/*62.46*/("""">Add/Remove Authentication Providers</a></li>
        </ul>
    </p>

""")))};def /*68.2*/content2/*68.10*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*68.14*/("""

        <h1>Edit Profile</h1>
        <div class="row">
                <!-- left column -->
            <div class="col-md-4 col-sm-6 col-xs-12">
                <div class="text-center">
                    <img src="http://lorempixel.com/200/200/people/9/" class="avatar img-circle img-thumbnail" alt="avatar">
                    <h6>Upload a different photo...</h6>
                    <input type="file" class="text-center center-block well well-sm form-control">
                </div>
            </div>
                <!-- edit form column -->
            <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
                <h3>Personal info</h3>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label class="col-lg-3 control-label">First name:</label>
                        <div class="col-lg-8">
                            <input class="form-control" value="Jane" type="text">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Last name:</label>
                        <div class="col-lg-8">
                            <input class="form-control" value="Bishop" type="text">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Email:</label>
                        <div class="col-lg-8">
                            <input class="form-control" value="janesemail@gmail.com" type="text">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">Date of Birth:</label>
                        <div class="col-lg-8">
                            <div class='input-group date' id='birth-date-picker'>
                                <input type='text' class="form-control" disabled/>
                                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Username:</label>
                        <div class="col-md-8">
                            <input class="form-control" value="janeuser" type="text">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Password:</label>
                        <div class="col-md-8">
                            <input class="form-control" value="11111122333" type="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Confirm password:</label>
                        <div class="col-md-8">
                            <input class="form-control" value="11111122333" type="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label"></label>
                        <div class="col-md-8">
                            <input class="btn btn-primary" value="Save Changes" type="button">
                            <span></span>
                            <input class="btn btn-default" value="Cancel" type="reset">
                        </div>
                    </div>
                </form>
            </div>
        </div>

""")))};
Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*66.2*/("""

"""),format.raw/*142.2*/("""
    """),_display_(Seq[Any](/*143.6*/if(!js)/*143.13*/ {_display_(Seq[Any](format.raw/*143.15*/("""
        """),_display_(Seq[Any](/*144.10*/main("Profile", "profile")/*144.36*/(content2))),format.raw/*144.46*/("""
    """)))}/*145.7*/else/*145.12*/{_display_(Seq[Any](format.raw/*145.13*/("""
        """),_display_(Seq[Any](/*146.10*/content2)),format.raw/*146.18*/("""
    """)))})))}
    }
    
    def render(js:java.lang.Boolean,localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,localUser)
    
    def f:((java.lang.Boolean,models.User) => play.api.templates.HtmlFormat.Appendable) = (js,localUser) => apply(js,localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 02:57:20 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/profile.scala.html
                    HASH: 607f14389606d6496f42977877e2fda50e1f579b
                    MATRIX: 799->1|975->108|989->115|1073->119|1121->132|1176->179|1215->181|1311->242|1326->249|1380->282|1443->313|1490->324|1548->373|1588->375|1686->437|1702->444|1759->479|1822->510|1873->525|1937->567|2019->613|2037->622|2064->627|2128->655|2157->675|2197->677|2270->732|2283->737|2322->738|2373->753|2391->762|2419->768|2488->801|2545->849|2585->851|2650->880|2665->886|2707->906|2776->957|2789->962|2828->963|2903->1006|2950->1021|3021->1056|3075->1101|3115->1103|3189->1141|3207->1150|3239->1160|3299->1184|3317->1193|3348->1202|3418->1240|3469->1255|3512->1289|3565->1304|3620->1323|3653->1347|3693->1349|3752->1372|3786->1397|3826->1399|3889->1426|3961->1476|4003->1500|4016->1505|4055->1506|4118->1533|4221->1613|4276->1636|4335->1659|4370->1678|4410->1680|4473->1707|4511->1723|4566->1746|4644->1792|4691->1807|4763->1843|4785->1856|4833->1866|4888->1885|4953->1928|4991->1930|5046->1963|5107->1988|5140->2012|5180->2014|5243->2041|5369->2144|5453->2192|5471->2201|5496->2204|5532->2222|5545->2227|5584->2228|5635->2243|5723->2309|5766->2320|5804->2327|5897->2384|5912->2390|5957->2413|5996->2416|6071->2468|6144->2505|6159->2511|6194->2524|6293->2605|6310->2613|6395->2617|10250->55|10278->103|10309->2600|10341->6434|10384->6441|10401->6448|10442->6450|10490->6461|10526->6487|10559->6497|10585->6505|10599->6510|10639->6511|10687->6522|10718->6530
                    LINES: 26->1|29->5|29->5|31->5|33->7|33->7|33->7|35->9|35->9|35->9|37->11|38->12|38->12|38->12|40->14|40->14|40->14|42->16|43->17|43->17|45->19|45->19|45->19|45->19|45->19|45->19|47->21|47->21|47->21|48->22|48->22|48->22|50->24|50->24|50->24|51->25|51->25|51->25|52->26|52->26|52->26|54->28|55->29|57->31|57->31|57->31|58->32|58->32|58->32|58->32|58->32|58->32|60->34|61->35|61->35|61->35|62->36|62->36|62->36|63->37|63->37|63->37|64->38|64->38|65->39|65->39|65->39|66->40|66->40|67->41|68->42|68->42|68->42|69->43|69->43|70->44|72->46|73->47|76->50|76->50|76->50|77->51|77->51|77->51|77->51|78->52|78->52|78->52|79->53|79->53|80->54|80->54|80->54|81->55|81->55|81->55|82->56|82->56|83->57|84->58|87->61|87->61|87->61|87->61|87->61|88->62|88->62|88->62|92->68|92->68|94->68|169->1|170->3|172->66|174->142|175->143|175->143|175->143|176->144|176->144|176->144|177->145|177->145|177->145|178->146|178->146
                    -- GENERATED --
                */
            