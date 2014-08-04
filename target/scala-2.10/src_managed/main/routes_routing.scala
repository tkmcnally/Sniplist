// @SOURCE:C:/Projects/Sniplist/conf/routes
// @HASH:3bbb86c0f69fba9051e597ccfdcd39dd19b0b407
// @DATE:Sun Aug 03 16:11:02 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_restricted1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("restricted"))))
        

// @LINE:8
private[this] lazy val controllers_Application_jsRoutes2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascript/routes.js"))))
        

// @LINE:10
private[this] lazy val controllers_Application_profile3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:12
private[this] lazy val controllers_Application_about4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:14
private[this] lazy val controllers_Application_contact5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:16
private[this] lazy val controllers_Application_login6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:17
private[this] lazy val controllers_Application_doLogin7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:19
private[this] lazy val controllers_Application_getUsersFollowing8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("following"))))
        

// @LINE:21
private[this] lazy val controllers_Application_getUserProfile9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("u/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Application_toggleFollow10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follow/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:27
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Application_signup13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:30
private[this] lazy val controllers_Application_doSignup14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:32
private[this] lazy val controllers_Signup_unverified15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
        

// @LINE:33
private[this] lazy val controllers_Signup_oAuthDenied16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
        

// @LINE:35
private[this] lazy val controllers_Signup_verify17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_Signup_exists18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
        

// @LINE:38
private[this] lazy val controllers_Signup_resetPassword19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Signup_doResetPassword20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset"))))
        

// @LINE:41
private[this] lazy val controllers_Account_changePassword21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:42
private[this] lazy val controllers_Account_doChangePassword22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:44
private[this] lazy val controllers_Account_verifyEmail23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify"))))
        

// @LINE:46
private[this] lazy val controllers_Account_link24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/add"))))
        

// @LINE:48
private[this] lazy val controllers_Account_askLink25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:49
private[this] lazy val controllers_Account_doLink26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:51
private[this] lazy val controllers_Account_unlink27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unlink/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:53
private[this] lazy val controllers_Account_askMerge28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:54
private[this] lazy val controllers_Account_doMerge29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:57
private[this] lazy val controllers_Signup_forgotPassword30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:58
private[this] lazy val controllers_Signup_doForgotPassword31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:61
private[this] lazy val controllers_Snips_getSnip32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/getSnip"))))
        

// @LINE:63
private[this] lazy val controllers_Snips_add33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add"))))
        

// @LINE:65
private[this] lazy val controllers_Snips_getVideo34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add/getVideo"))))
        

// @LINE:67
private[this] lazy val controllers_Snips_createSnip35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add/createSnip"))))
        

// @LINE:70
private[this] lazy val controllers_Snips_viewSnipById36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("s/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:73
private[this] lazy val controllers_MySnipsController_viewSnipsByUser37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/snips"))))
        

// @LINE:75
private[this] lazy val controllers_MySnipsController_mySnips38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips"))))
        

// @LINE:77
private[this] lazy val controllers_MySnipsController_removeSnip39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/removeSnip"))))
        

// @LINE:79
private[this] lazy val controllers_MySnipsController_saveSnip40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/saveSnip"))))
        

// @LINE:81
private[this] lazy val controllers_MySnipsController_toggleSnip41 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/toggleSnip"))))
        

// @LINE:85
private[this] lazy val controllers_MySniplistsController_mySniplists42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/"))))
        

// @LINE:87
private[this] lazy val controllers_MySniplistsController_removeSniplist43 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/removeSniplist"))))
        

// @LINE:89
private[this] lazy val controllers_MySniplistsController_saveSniplist44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/saveSniplist"))))
        

// @LINE:91
private[this] lazy val controllers_MySniplistsController_toggleSniplist45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/toggleSniplist"))))
        

// @LINE:93
private[this] lazy val controllers_MySniplistsController_getNextSnip46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/getNextSnip"))))
        

// @LINE:97
private[this] lazy val controllers_SnipLists_viewSniplistById47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("l/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:100
private[this] lazy val controllers_SnipLists_viewSniplistsByUser48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/sniplists"))))
        

// @LINE:102
private[this] lazy val controllers_SnipLists_viewSniplists49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists"))))
        

// @LINE:104
private[this] lazy val controllers_SnipLists_saveSnipList50 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/new"))))
        

// @LINE:106
private[this] lazy val controllers_SnipLists_addToSnipList51 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/add"))))
        

// @LINE:108
private[this] lazy val controllers_SnipLists_loadSnipListByUser52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/load"))))
        

// @LINE:110
private[this] lazy val controllers_SnipLists_deleteFromSnipList53 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/deleteSnip"))))
        

// @LINE:112
private[this] lazy val controllers_SnipLists_viewSnipListsLocalUser54 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/viewSnipListsLocalUser"))))
        

// @LINE:117
private[this] lazy val controllers_Application_javascriptRoutes55 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:120
private[this] lazy val controllers_Assets_at56 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Application.restricted"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """following""","""controllers.Application.getUsersFollowing()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """u/$id<[^/]+>""","""controllers.Application.getUserProfile(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follow/$id<[^/]+>""","""controllers.Application.toggleFollow(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unlink/$provider<[^/]+>""","""controllers.Account.unlink(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/getSnip""","""controllers.Snips.getSnip(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add""","""controllers.Snips.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add/getVideo""","""controllers.Snips.getVideo(songUrl:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add/createSnip""","""controllers.Snips.createSnip()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """s/$id<[^/]+>""","""controllers.Snips.viewSnipById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/snips""","""controllers.MySnipsController.viewSnipsByUser(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips""","""controllers.MySnipsController.mySnips()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/removeSnip""","""controllers.MySnipsController.removeSnip(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/saveSnip""","""controllers.MySnipsController.saveSnip(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/toggleSnip""","""controllers.MySnipsController.toggleSnip(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/""","""controllers.MySniplistsController.mySniplists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/removeSniplist""","""controllers.MySniplistsController.removeSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/saveSniplist""","""controllers.MySniplistsController.saveSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/toggleSniplist""","""controllers.MySniplistsController.toggleSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/getNextSnip""","""controllers.MySniplistsController.getNextSnip()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """l/$id<[^/]+>""","""controllers.SnipLists.viewSniplistById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/sniplists""","""controllers.SnipLists.viewSniplistsByUser(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists""","""controllers.SnipLists.viewSniplists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/new""","""controllers.SnipLists.saveSnipList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/add""","""controllers.SnipLists.addToSnipList(snipList_id:String, snip_id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/load""","""controllers.SnipLists.loadSnipListByUser(snipList_id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/deleteSnip""","""controllers.SnipLists.deleteFromSnipList(snipList_id:String, snip_id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/viewSnipListsLocalUser""","""controllers.SnipLists.viewSnipListsLocalUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_restricted1(params) => {
   call { 
        invokeHandler(controllers.Application.restricted, HandlerDef(this, "controllers.Application", "restricted", Nil,"GET", """""", Routes.prefix + """restricted"""))
   }
}
        

// @LINE:8
case controllers_Application_jsRoutes2(params) => {
   call { 
        invokeHandler(controllers.Application.jsRoutes, HandlerDef(this, "controllers.Application", "jsRoutes", Nil,"GET", """""", Routes.prefix + """assets/javascript/routes.js"""))
   }
}
        

// @LINE:10
case controllers_Application_profile3(params) => {
   call { 
        invokeHandler(controllers.Application.profile, HandlerDef(this, "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:12
case controllers_Application_about4(params) => {
   call { 
        invokeHandler(controllers.Application.about, HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:14
case controllers_Application_contact5(params) => {
   call { 
        invokeHandler(controllers.Application.contact, HandlerDef(this, "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:16
case controllers_Application_login6(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:17
case controllers_Application_doLogin7(params) => {
   call { 
        invokeHandler(controllers.Application.doLogin, HandlerDef(this, "controllers.Application", "doLogin", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:19
case controllers_Application_getUsersFollowing8(params) => {
   call { 
        invokeHandler(controllers.Application.getUsersFollowing(), HandlerDef(this, "controllers.Application", "getUsersFollowing", Nil,"GET", """""", Routes.prefix + """following"""))
   }
}
        

// @LINE:21
case controllers_Application_getUserProfile9(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.getUserProfile(id), HandlerDef(this, "controllers.Application", "getUserProfile", Seq(classOf[String]),"GET", """""", Routes.prefix + """u/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Application_toggleFollow10(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.toggleFollow(id), HandlerDef(this, "controllers.Application", "toggleFollow", Seq(classOf[String]),"GET", """""", Routes.prefix + """follow/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case com_feth_play_module_pa_controllers_Authenticate_logout11(params) => {
   call { 
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.logout, HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:27
case com_feth_play_module_pa_controllers_Authenticate_authenticate12(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Application_signup13(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:30
case controllers_Application_doSignup14(params) => {
   call { 
        invokeHandler(controllers.Application.doSignup, HandlerDef(this, "controllers.Application", "doSignup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:32
case controllers_Signup_unverified15(params) => {
   call { 
        invokeHandler(controllers.Signup.unverified, HandlerDef(this, "controllers.Signup", "unverified", Nil,"GET", """""", Routes.prefix + """accounts/unverified"""))
   }
}
        

// @LINE:33
case controllers_Signup_oAuthDenied16(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
   }
}
        

// @LINE:35
case controllers_Signup_verify17(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_Signup_exists18(params) => {
   call { 
        invokeHandler(controllers.Signup.exists, HandlerDef(this, "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
   }
}
        

// @LINE:38
case controllers_Signup_resetPassword19(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Signup_doResetPassword20(params) => {
   call { 
        invokeHandler(controllers.Signup.doResetPassword, HandlerDef(this, "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """accounts/password/reset"""))
   }
}
        

// @LINE:41
case controllers_Account_changePassword21(params) => {
   call { 
        invokeHandler(controllers.Account.changePassword, HandlerDef(this, "controllers.Account", "changePassword", Nil,"GET", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:42
case controllers_Account_doChangePassword22(params) => {
   call { 
        invokeHandler(controllers.Account.doChangePassword, HandlerDef(this, "controllers.Account", "doChangePassword", Nil,"POST", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:44
case controllers_Account_verifyEmail23(params) => {
   call { 
        invokeHandler(controllers.Account.verifyEmail, HandlerDef(this, "controllers.Account", "verifyEmail", Nil,"GET", """""", Routes.prefix + """accounts/verify"""))
   }
}
        

// @LINE:46
case controllers_Account_link24(params) => {
   call { 
        invokeHandler(controllers.Account.link, HandlerDef(this, "controllers.Account", "link", Nil,"GET", """""", Routes.prefix + """accounts/add"""))
   }
}
        

// @LINE:48
case controllers_Account_askLink25(params) => {
   call { 
        invokeHandler(controllers.Account.askLink, HandlerDef(this, "controllers.Account", "askLink", Nil,"GET", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:49
case controllers_Account_doLink26(params) => {
   call { 
        invokeHandler(controllers.Account.doLink, HandlerDef(this, "controllers.Account", "doLink", Nil,"POST", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:51
case controllers_Account_unlink27(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Account.unlink(provider), HandlerDef(this, "controllers.Account", "unlink", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/unlink/$provider<[^/]+>"""))
   }
}
        

// @LINE:53
case controllers_Account_askMerge28(params) => {
   call { 
        invokeHandler(controllers.Account.askMerge, HandlerDef(this, "controllers.Account", "askMerge", Nil,"GET", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:54
case controllers_Account_doMerge29(params) => {
   call { 
        invokeHandler(controllers.Account.doMerge, HandlerDef(this, "controllers.Account", "doMerge", Nil,"POST", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:57
case controllers_Signup_forgotPassword30(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:58
case controllers_Signup_doForgotPassword31(params) => {
   call { 
        invokeHandler(controllers.Signup.doForgotPassword, HandlerDef(this, "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:61
case controllers_Snips_getSnip32(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.Snips.getSnip(id), HandlerDef(this, "controllers.Snips", "getSnip", Seq(classOf[String]),"GET", """""", Routes.prefix + """snips/getSnip"""))
   }
}
        

// @LINE:63
case controllers_Snips_add33(params) => {
   call { 
        invokeHandler(controllers.Snips.add(), HandlerDef(this, "controllers.Snips", "add", Nil,"GET", """""", Routes.prefix + """snips/add"""))
   }
}
        

// @LINE:65
case controllers_Snips_getVideo34(params) => {
   call(params.fromQuery[String]("songUrl", None)) { (songUrl) =>
        invokeHandler(controllers.Snips.getVideo(songUrl), HandlerDef(this, "controllers.Snips", "getVideo", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/add/getVideo"""))
   }
}
        

// @LINE:67
case controllers_Snips_createSnip35(params) => {
   call { 
        invokeHandler(controllers.Snips.createSnip(), HandlerDef(this, "controllers.Snips", "createSnip", Nil,"POST", """""", Routes.prefix + """snips/add/createSnip"""))
   }
}
        

// @LINE:70
case controllers_Snips_viewSnipById36(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Snips.viewSnipById(id), HandlerDef(this, "controllers.Snips", "viewSnipById", Seq(classOf[String]),"GET", """""", Routes.prefix + """s/$id<[^/]+>"""))
   }
}
        

// @LINE:73
case controllers_MySnipsController_viewSnipsByUser37(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.viewSnipsByUser(id), HandlerDef(this, "controllers.MySnipsController", "viewSnipsByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """$id<[^/]+>/snips"""))
   }
}
        

// @LINE:75
case controllers_MySnipsController_mySnips38(params) => {
   call { 
        invokeHandler(controllers.MySnipsController.mySnips(), HandlerDef(this, "controllers.MySnipsController", "mySnips", Nil,"GET", """""", Routes.prefix + """snips"""))
   }
}
        

// @LINE:77
case controllers_MySnipsController_removeSnip39(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.removeSnip(id), HandlerDef(this, "controllers.MySnipsController", "removeSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/removeSnip"""))
   }
}
        

// @LINE:79
case controllers_MySnipsController_saveSnip40(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.saveSnip(id), HandlerDef(this, "controllers.MySnipsController", "saveSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/saveSnip"""))
   }
}
        

// @LINE:81
case controllers_MySnipsController_toggleSnip41(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.toggleSnip(id), HandlerDef(this, "controllers.MySnipsController", "toggleSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/toggleSnip"""))
   }
}
        

// @LINE:85
case controllers_MySniplistsController_mySniplists42(params) => {
   call { 
        invokeHandler(controllers.MySniplistsController.mySniplists(), HandlerDef(this, "controllers.MySniplistsController", "mySniplists", Nil,"GET", """""", Routes.prefix + """sniplists/"""))
   }
}
        

// @LINE:87
case controllers_MySniplistsController_removeSniplist43(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySniplistsController.removeSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "removeSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/removeSniplist"""))
   }
}
        

// @LINE:89
case controllers_MySniplistsController_saveSniplist44(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySniplistsController.saveSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "saveSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/saveSniplist"""))
   }
}
        

// @LINE:91
case controllers_MySniplistsController_toggleSniplist45(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySniplistsController.toggleSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "toggleSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/toggleSniplist"""))
   }
}
        

// @LINE:93
case controllers_MySniplistsController_getNextSnip46(params) => {
   call { 
        invokeHandler(controllers.MySniplistsController.getNextSnip(), HandlerDef(this, "controllers.MySniplistsController", "getNextSnip", Nil,"POST", """""", Routes.prefix + """sniplists/getNextSnip"""))
   }
}
        

// @LINE:97
case controllers_SnipLists_viewSniplistById47(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipLists.viewSniplistById(id), HandlerDef(this, "controllers.SnipLists", "viewSniplistById", Seq(classOf[String]),"GET", """""", Routes.prefix + """l/$id<[^/]+>"""))
   }
}
        

// @LINE:100
case controllers_SnipLists_viewSniplistsByUser48(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipLists.viewSniplistsByUser(id), HandlerDef(this, "controllers.SnipLists", "viewSniplistsByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """$id<[^/]+>/sniplists"""))
   }
}
        

// @LINE:102
case controllers_SnipLists_viewSniplists49(params) => {
   call { 
        invokeHandler(controllers.SnipLists.viewSniplists(), HandlerDef(this, "controllers.SnipLists", "viewSniplists", Nil,"GET", """""", Routes.prefix + """sniplists"""))
   }
}
        

// @LINE:104
case controllers_SnipLists_saveSnipList50(params) => {
   call { 
        invokeHandler(controllers.SnipLists.saveSnipList(), HandlerDef(this, "controllers.SnipLists", "saveSnipList", Nil,"POST", """""", Routes.prefix + """sniplists/new"""))
   }
}
        

// @LINE:106
case controllers_SnipLists_addToSnipList51(params) => {
   call(params.fromQuery[String]("snipList_id", None), params.fromQuery[String]("snip_id", None)) { (snipList_id, snip_id) =>
        invokeHandler(controllers.SnipLists.addToSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SnipLists", "addToSnipList", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """sniplists/add"""))
   }
}
        

// @LINE:108
case controllers_SnipLists_loadSnipListByUser52(params) => {
   call(params.fromQuery[String]("snipList_id", None)) { (snipList_id) =>
        invokeHandler(controllers.SnipLists.loadSnipListByUser(snipList_id), HandlerDef(this, "controllers.SnipLists", "loadSnipListByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """sniplists/load"""))
   }
}
        

// @LINE:110
case controllers_SnipLists_deleteFromSnipList53(params) => {
   call(params.fromQuery[String]("snipList_id", None), params.fromQuery[String]("snip_id", None)) { (snipList_id, snip_id) =>
        invokeHandler(controllers.SnipLists.deleteFromSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SnipLists", "deleteFromSnipList", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """sniplists/deleteSnip"""))
   }
}
        

// @LINE:112
case controllers_SnipLists_viewSnipListsLocalUser54(params) => {
   call { 
        invokeHandler(controllers.SnipLists.viewSnipListsLocalUser(), HandlerDef(this, "controllers.SnipLists", "viewSnipListsLocalUser", Nil,"POST", """""", Routes.prefix + """sniplists/viewSnipListsLocalUser"""))
   }
}
        

// @LINE:117
case controllers_Application_javascriptRoutes55(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:120
case controllers_Assets_at56(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     