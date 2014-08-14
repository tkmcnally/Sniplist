
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[java.lang.Boolean,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(js: java.lang.Boolean, settingsForm: Form[_], localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
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
            <form id="userPhotoForm" method="POST" class="form-horizontal" role="form" action=""""),_display_(Seq[Any](/*72.97*/routes/*72.103*/.Application.updateUserPhoto)),format.raw/*72.131*/("""" accept-charset="UTF-8" enctype="multipart/form-data">
                <!-- left column -->
                <div class="col-md-4 col-sm-6 col-xs-12">
                    <div class="text-center">
                        <img id="userProfilePhoto" src=""""),_display_(Seq[Any](/*76.58*/routes/*76.64*/.Application.getImage(String.valueOf(localUser.photo)))),format.raw/*76.118*/("""" class="avatar img-circle img-thumbnail" alt="avatar" width="150" height="150">
                        <h6>Upload a different photo...</h6>
                        <input id="userPhotoInput" name="profilePhoto" type="file" class="text-center center-block well well-sm form-control">
                    </div>
                </div>
            </form>

            <!-- edit form column -->
                <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
                    """),_display_(Seq[Any](/*85.22*/if(settingsForm.hasGlobalErrors || settingsForm.hasErrors)/*85.80*/ {_display_(Seq[Any](format.raw/*85.82*/("""
                        <div id="form-error" class="alert alert-danger alert-dismissable">
                            <a id="form-message-close" class="panel-close close" data-dismiss="alert">×</a>
                            <i id="form-message-icon" class="fa fa-exclamation-triangle"></i>
                            <div id="form-message-text" style="display: inline;">
                                """),_display_(Seq[Any](/*90.34*/for(key <- settingsForm.errors().keySet) yield /*90.74*/ {_display_(Seq[Any](format.raw/*90.76*/("""
                                    """),_display_(Seq[Any](/*91.38*/Messages("sniplist.key." + key))),format.raw/*91.69*/(""" """),_display_(Seq[Any](/*91.71*/if(key.length != 0)/*91.90*/{_display_(Seq[Any](format.raw/*91.91*/(""":""")))})),format.raw/*91.93*/(""" """),_display_(Seq[Any](/*91.95*/Messages(settingsForm.error(key).message, settingsForm.error(key).arguments: _*))),format.raw/*91.175*/("""<br>
                                """)))})),format.raw/*92.34*/("""
                            </div>
                        </div>
                    """)))})),format.raw/*95.22*/("""
                    <h3>Personal info</h3>
                    <form id="userSettingsForm" method="POST" class="form-horizontal" role="form" action=""""),_display_(Seq[Any](/*97.108*/routes/*97.114*/.Application.updateUserSettings)),format.raw/*97.145*/("""" accept-charset="UTF-8" enctype="multipart/form-data">
                        <div class="form-group """),_display_(Seq[Any](/*98.49*/if(settingsForm.error("first_name") != null)/*98.93*/{_display_(Seq[Any](format.raw/*98.94*/("""has-error""")))})),format.raw/*98.104*/("""">
                            <label class="col-lg-3 control-label">First name:</label>
                            <div class="col-lg-8">
                                <input name="first_name" class="form-control" type="text" value=""""),_display_(Seq[Any](/*101.99*/settingsForm/*101.111*/.data.get("first_name"))),format.raw/*101.134*/("""">
                            </div>
                        </div>
                        <div class="form-group """),_display_(Seq[Any](/*104.49*/if(settingsForm.error("last_name") != null)/*104.92*/{_display_(Seq[Any](format.raw/*104.93*/("""has-error""")))})),format.raw/*104.103*/("""">
                            <label class="col-lg-3 control-label">Last name:</label>
                            <div class="col-lg-8">
                                <input name="last_name" class="form-control" type="text" value=""""),_display_(Seq[Any](/*107.98*/settingsForm/*107.110*/.data.get("last_name"))),format.raw/*107.132*/("""">
                            </div>
                        </div>
                        <div class="form-group """),_display_(Seq[Any](/*110.49*/if(settingsForm.error("email") != null)/*110.88*/{_display_(Seq[Any](format.raw/*110.89*/("""has-error""")))})),format.raw/*110.99*/("""">
                            <label class="col-lg-3 control-label">Email:</label>
                            <div class="col-lg-8">
                                <input name="email" class="form-control" type="text" value=""""),_display_(Seq[Any](/*113.94*/settingsForm/*113.106*/.data.get("email"))),format.raw/*113.124*/("""">
                            </div>
                        </div>

                        <div class="form-group """),_display_(Seq[Any](/*117.49*/if(settingsForm.error("birth_date") != null)/*117.93*/{_display_(Seq[Any](format.raw/*117.94*/("""has-error""")))})),format.raw/*117.104*/("""">
                            <label class="col-lg-3 control-label">Date of Birth:</label>
                                <div class="col-lg-8">
                                    <div class='input-group date' id='birth-date-picker'>
                                        <input name="birth_date" type='text' class="form-control" readonly="readonly" value=""""),_display_(Seq[Any](/*121.127*/settingsForm/*121.139*/.data.get("birth_date"))),format.raw/*121.162*/("""">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                        </div>
                        """),_display_(Seq[Any](/*127.26*/if(localUser.getProviders.contains("password"))/*127.73*/ {_display_(Seq[Any](format.raw/*127.75*/("""
                            <div class="form-group """),_display_(Seq[Any](/*128.53*/if(settingsForm.error("password") != null)/*128.95*/{_display_(Seq[Any](format.raw/*128.96*/("""has-error""")))})),format.raw/*128.106*/("""">
                                <label class="col-md-3 control-label">Password:</label>
                                <div class="col-md-8">
                                    <input name="password" class="form-control" value="" type="password">
                                </div>

                            </div>
                            <div class="form-group """),_display_(Seq[Any](/*135.53*/if(settingsForm.error("repeatPassword") != null)/*135.101*/{_display_(Seq[Any](format.raw/*135.102*/("""has-error""")))})),format.raw/*135.112*/("""">
                                <label class="col-md-3 control-label">Confirm password:</label>
                                    <div class="col-md-8">
                                    <input name="repeatPassword" class="form-control" value="" type="password">
                                </div>
                            </div>
                        """)))})),format.raw/*141.26*/("""
                        <div class="form-group">
                            <label class="col-md-3 control-label"></label>
                            <div class="col-md-8">
                                <input class="dynamic-form btn btn-primary" value="Save Changes" type="submit">
                                <span></span>
                                <input class="btn btn-default" value="Cancel" type="reset">
                            </div>
                        </div>
                    </form>
                </div>
        </div>
""")))};
Seq[Any](format.raw/*1.79*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*66.2*/("""

"""),format.raw/*153.2*/("""

"""),_display_(Seq[Any](/*155.2*/if(!js)/*155.9*/ {_display_(Seq[Any](format.raw/*155.11*/("""
    """),_display_(Seq[Any](/*156.6*/main("Profile", "profile")/*156.32*/(content2))),format.raw/*156.42*/("""
""")))}/*157.3*/else/*157.8*/{_display_(Seq[Any](format.raw/*157.9*/("""
    """),_display_(Seq[Any](/*158.6*/content2)),format.raw/*158.14*/("""
""")))})))}
    }
    
    def render(js:java.lang.Boolean,settingsForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(js,settingsForm,localUser)
    
    def f:((java.lang.Boolean,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},models.User) => play.api.templates.HtmlFormat.Appendable) = (js,settingsForm,localUser) => apply(js,settingsForm,localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 14 01:35:24 EDT 2014
                    SOURCE: C:/Projects/Sniplist/app/views/profile.scala.html
                    HASH: 097024a4061d103c2619b39dbda5516fe1fec38e
                    MATRIX: 880->1|1079->131|1093->138|1177->142|1225->155|1280->202|1319->204|1415->265|1430->272|1484->305|1547->336|1594->347|1652->396|1692->398|1790->460|1806->467|1863->502|1926->533|1977->548|2041->590|2123->636|2141->645|2168->650|2232->678|2261->698|2301->700|2374->755|2387->760|2426->761|2477->776|2495->785|2523->791|2592->824|2649->872|2689->874|2754->903|2769->909|2811->929|2880->980|2893->985|2932->986|3007->1029|3054->1044|3125->1079|3179->1124|3219->1126|3293->1164|3311->1173|3343->1183|3403->1207|3421->1216|3452->1225|3522->1263|3573->1278|3616->1312|3669->1327|3724->1346|3757->1370|3797->1372|3856->1395|3890->1420|3930->1422|3993->1449|4065->1499|4107->1523|4120->1528|4159->1529|4222->1556|4325->1636|4380->1659|4439->1682|4474->1701|4514->1703|4577->1730|4615->1746|4670->1769|4748->1815|4795->1830|4867->1866|4889->1879|4937->1889|4992->1908|5057->1951|5095->1953|5150->1986|5211->2011|5244->2035|5284->2037|5347->2064|5473->2167|5557->2215|5575->2224|5600->2227|5636->2245|5649->2250|5688->2251|5739->2266|5827->2332|5870->2343|5908->2350|6001->2407|6016->2413|6061->2436|6100->2439|6175->2491|6248->2528|6263->2534|6298->2547|6397->2628|6414->2636|6499->2640|6693->2798|6709->2804|6760->2832|7054->3090|7069->3096|7146->3150|7678->3646|7745->3704|7785->3706|8235->4120|8291->4160|8331->4162|8406->4201|8459->4232|8497->4234|8525->4253|8564->4254|8598->4256|8636->4258|8739->4338|8810->4377|8933->4468|9123->4621|9139->4627|9193->4658|9334->4763|9387->4807|9426->4808|9469->4818|9747->5059|9770->5071|9817->5094|9974->5214|10027->5257|10067->5258|10111->5268|10387->5507|10410->5519|10456->5541|10613->5661|10662->5700|10702->5701|10745->5711|11013->5942|11036->5954|11078->5972|11237->6094|11291->6138|11331->6139|11375->6149|11780->6516|11803->6528|11850->6551|12205->6869|12262->6916|12303->6918|12394->6972|12446->7014|12486->7015|12530->7025|12953->7411|13012->7459|13053->7460|13097->7470|13505->7845|14115->78|14143->126|14174->2623|14206->8416|14247->8421|14263->8428|14304->8430|14347->8437|14383->8463|14416->8473|14438->8477|14451->8482|14490->8483|14533->8490|14564->8498
                    LINES: 28->1|31->5|31->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|39->11|40->12|40->12|40->12|42->14|42->14|42->14|44->16|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|57->29|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|67->39|67->39|67->39|68->40|68->40|69->41|70->42|70->42|70->42|71->43|71->43|72->44|74->46|75->47|78->50|78->50|78->50|79->51|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|85->57|86->58|89->61|89->61|89->61|89->61|89->61|90->62|90->62|90->62|94->68|94->68|96->68|100->72|100->72|100->72|104->76|104->76|104->76|113->85|113->85|113->85|118->90|118->90|118->90|119->91|119->91|119->91|119->91|119->91|119->91|119->91|119->91|120->92|123->95|125->97|125->97|125->97|126->98|126->98|126->98|126->98|129->101|129->101|129->101|132->104|132->104|132->104|132->104|135->107|135->107|135->107|138->110|138->110|138->110|138->110|141->113|141->113|141->113|145->117|145->117|145->117|145->117|149->121|149->121|149->121|155->127|155->127|155->127|156->128|156->128|156->128|156->128|163->135|163->135|163->135|163->135|169->141|182->1|183->3|185->66|187->153|189->155|189->155|189->155|190->156|190->156|190->156|191->157|191->157|191->157|192->158|192->158
                    -- GENERATED --
                */
            