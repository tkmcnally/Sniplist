// @SOURCE:C:/Projects/Sniplist/conf/routes
// @HASH:fad7cc52dd25ea0a36d49d635b19e3d44053e3bb
// @DATE:Tue Aug 12 02:05:43 EDT 2014


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
private[this] lazy val controllers_SnipController_getSnip32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/getSnip"))))
        

// @LINE:63
private[this] lazy val controllers_SnipController_getPopularSnips33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/getPopular"))))
        

// @LINE:65
private[this] lazy val controllers_SnipController_add34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add"))))
        

// @LINE:67
private[this] lazy val controllers_SnipController_getVideo35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add/getVideo"))))
        

// @LINE:69
private[this] lazy val controllers_SnipController_createSnip36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add/createSnip"))))
        

// @LINE:72
private[this] lazy val controllers_SnipController_viewSnipById37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("s/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:75
private[this] lazy val controllers_SnipCollectionController_viewSnipsByUser38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/snips"))))
        

// @LINE:77
private[this] lazy val controllers_SnipCollectionController_mySnips39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips"))))
        

// @LINE:79
private[this] lazy val controllers_SnipCollectionController_removeSnip40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/removeSnip"))))
        

// @LINE:81
private[this] lazy val controllers_SnipCollectionController_saveSnip41 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/saveSnip"))))
        

// @LINE:83
private[this] lazy val controllers_SnipCollectionController_toggleSnip42 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/toggleSnip"))))
        

// @LINE:87
private[this] lazy val controllers_SniplistCollectionController_mySniplists43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/"))))
        

// @LINE:89
private[this] lazy val controllers_SniplistCollectionController_removeSniplist44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/removeSniplist"))))
        

// @LINE:91
private[this] lazy val controllers_SniplistCollectionController_saveSniplist45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/saveSniplist"))))
        

// @LINE:93
private[this] lazy val controllers_SniplistCollectionController_toggleSniplist46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/toggleSniplist"))))
        

// @LINE:95
private[this] lazy val controllers_SniplistCollectionController_getNextSnip47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/getNextSnip"))))
        

// @LINE:99
private[this] lazy val controllers_SniplistController_viewSniplistById48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("l/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:101
private[this] lazy val controllers_SniplistController_getPopularSniplists49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/getPopular"))))
        

// @LINE:104
private[this] lazy val controllers_SniplistController_viewSniplistsByUser50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/sniplists"))))
        

// @LINE:106
private[this] lazy val controllers_SniplistController_viewSniplists51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists"))))
        

// @LINE:108
private[this] lazy val controllers_SniplistController_saveSnipList52 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/new"))))
        

// @LINE:110
private[this] lazy val controllers_SniplistController_addToSnipList53 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/add"))))
        

// @LINE:112
private[this] lazy val controllers_SniplistController_loadSnipListByUser54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/load"))))
        

// @LINE:114
private[this] lazy val controllers_SniplistController_deleteFromSnipList55 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/deleteSnip"))))
        

// @LINE:116
private[this] lazy val controllers_SniplistController_viewSnipListsLocalUser56 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/viewSnipListsLocalUser"))))
        

// @LINE:121
private[this] lazy val controllers_Application_javascriptRoutes57 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:124
private[this] lazy val controllers_Assets_at58 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Application.restricted"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """following""","""controllers.Application.getUsersFollowing()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """u/$id<[^/]+>""","""controllers.Application.getUserProfile(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follow/$id<[^/]+>""","""controllers.Application.toggleFollow(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unlink/$provider<[^/]+>""","""controllers.Account.unlink(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/getSnip""","""controllers.SnipController.getSnip(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/getPopular""","""controllers.SnipController.getPopularSnips()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add""","""controllers.SnipController.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add/getVideo""","""controllers.SnipController.getVideo(songUrl:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add/createSnip""","""controllers.SnipController.createSnip()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """s/$id<[^/]+>""","""controllers.SnipController.viewSnipById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/snips""","""controllers.SnipCollectionController.viewSnipsByUser(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips""","""controllers.SnipCollectionController.mySnips()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/removeSnip""","""controllers.SnipCollectionController.removeSnip(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/saveSnip""","""controllers.SnipCollectionController.saveSnip(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/toggleSnip""","""controllers.SnipCollectionController.toggleSnip(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/""","""controllers.SniplistCollectionController.mySniplists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/removeSniplist""","""controllers.SniplistCollectionController.removeSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/saveSniplist""","""controllers.SniplistCollectionController.saveSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/toggleSniplist""","""controllers.SniplistCollectionController.toggleSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/getNextSnip""","""controllers.SniplistCollectionController.getNextSnip()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """l/$id<[^/]+>""","""controllers.SniplistController.viewSniplistById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/getPopular""","""controllers.SniplistController.getPopularSniplists()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/sniplists""","""controllers.SniplistController.viewSniplistsByUser(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists""","""controllers.SniplistController.viewSniplists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/new""","""controllers.SniplistController.saveSnipList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/add""","""controllers.SniplistController.addToSnipList(snipList_id:String, snip_id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/load""","""controllers.SniplistController.loadSnipListByUser(snipList_id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/deleteSnip""","""controllers.SniplistController.deleteFromSnipList(snipList_id:String, snip_id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/viewSnipListsLocalUser""","""controllers.SniplistController.viewSnipListsLocalUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_SnipController_getSnip32(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipController.getSnip(id), HandlerDef(this, "controllers.SnipController", "getSnip", Seq(classOf[String]),"GET", """""", Routes.prefix + """snips/getSnip"""))
   }
}
        

// @LINE:63
case controllers_SnipController_getPopularSnips33(params) => {
   call { 
        invokeHandler(controllers.SnipController.getPopularSnips(), HandlerDef(this, "controllers.SnipController", "getPopularSnips", Nil,"GET", """""", Routes.prefix + """snips/getPopular"""))
   }
}
        

// @LINE:65
case controllers_SnipController_add34(params) => {
   call { 
        invokeHandler(controllers.SnipController.add(), HandlerDef(this, "controllers.SnipController", "add", Nil,"GET", """""", Routes.prefix + """snips/add"""))
   }
}
        

// @LINE:67
case controllers_SnipController_getVideo35(params) => {
   call(params.fromQuery[String]("songUrl", None)) { (songUrl) =>
        invokeHandler(controllers.SnipController.getVideo(songUrl), HandlerDef(this, "controllers.SnipController", "getVideo", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/add/getVideo"""))
   }
}
        

// @LINE:69
case controllers_SnipController_createSnip36(params) => {
   call { 
        invokeHandler(controllers.SnipController.createSnip(), HandlerDef(this, "controllers.SnipController", "createSnip", Nil,"POST", """""", Routes.prefix + """snips/add/createSnip"""))
   }
}
        

// @LINE:72
case controllers_SnipController_viewSnipById37(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipController.viewSnipById(id), HandlerDef(this, "controllers.SnipController", "viewSnipById", Seq(classOf[String]),"GET", """""", Routes.prefix + """s/$id<[^/]+>"""))
   }
}
        

// @LINE:75
case controllers_SnipCollectionController_viewSnipsByUser38(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipCollectionController.viewSnipsByUser(id), HandlerDef(this, "controllers.SnipCollectionController", "viewSnipsByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """$id<[^/]+>/snips"""))
   }
}
        

// @LINE:77
case controllers_SnipCollectionController_mySnips39(params) => {
   call { 
        invokeHandler(controllers.SnipCollectionController.mySnips(), HandlerDef(this, "controllers.SnipCollectionController", "mySnips", Nil,"GET", """""", Routes.prefix + """snips"""))
   }
}
        

// @LINE:79
case controllers_SnipCollectionController_removeSnip40(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipCollectionController.removeSnip(id), HandlerDef(this, "controllers.SnipCollectionController", "removeSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/removeSnip"""))
   }
}
        

// @LINE:81
case controllers_SnipCollectionController_saveSnip41(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipCollectionController.saveSnip(id), HandlerDef(this, "controllers.SnipCollectionController", "saveSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/saveSnip"""))
   }
}
        

// @LINE:83
case controllers_SnipCollectionController_toggleSnip42(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipCollectionController.toggleSnip(id), HandlerDef(this, "controllers.SnipCollectionController", "toggleSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/toggleSnip"""))
   }
}
        

// @LINE:87
case controllers_SniplistCollectionController_mySniplists43(params) => {
   call { 
        invokeHandler(controllers.SniplistCollectionController.mySniplists(), HandlerDef(this, "controllers.SniplistCollectionController", "mySniplists", Nil,"GET", """""", Routes.prefix + """sniplists/"""))
   }
}
        

// @LINE:89
case controllers_SniplistCollectionController_removeSniplist44(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SniplistCollectionController.removeSniplist(id), HandlerDef(this, "controllers.SniplistCollectionController", "removeSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/removeSniplist"""))
   }
}
        

// @LINE:91
case controllers_SniplistCollectionController_saveSniplist45(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SniplistCollectionController.saveSniplist(id), HandlerDef(this, "controllers.SniplistCollectionController", "saveSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/saveSniplist"""))
   }
}
        

// @LINE:93
case controllers_SniplistCollectionController_toggleSniplist46(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.SniplistCollectionController.toggleSniplist(id), HandlerDef(this, "controllers.SniplistCollectionController", "toggleSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/toggleSniplist"""))
   }
}
        

// @LINE:95
case controllers_SniplistCollectionController_getNextSnip47(params) => {
   call { 
        invokeHandler(controllers.SniplistCollectionController.getNextSnip(), HandlerDef(this, "controllers.SniplistCollectionController", "getNextSnip", Nil,"POST", """""", Routes.prefix + """sniplists/getNextSnip"""))
   }
}
        

// @LINE:99
case controllers_SniplistController_viewSniplistById48(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SniplistController.viewSniplistById(id), HandlerDef(this, "controllers.SniplistController", "viewSniplistById", Seq(classOf[String]),"GET", """""", Routes.prefix + """l/$id<[^/]+>"""))
   }
}
        

// @LINE:101
case controllers_SniplistController_getPopularSniplists49(params) => {
   call { 
        invokeHandler(controllers.SniplistController.getPopularSniplists(), HandlerDef(this, "controllers.SniplistController", "getPopularSniplists", Nil,"GET", """""", Routes.prefix + """sniplists/getPopular"""))
   }
}
        

// @LINE:104
case controllers_SniplistController_viewSniplistsByUser50(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SniplistController.viewSniplistsByUser(id), HandlerDef(this, "controllers.SniplistController", "viewSniplistsByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """$id<[^/]+>/sniplists"""))
   }
}
        

// @LINE:106
case controllers_SniplistController_viewSniplists51(params) => {
   call { 
        invokeHandler(controllers.SniplistController.viewSniplists(), HandlerDef(this, "controllers.SniplistController", "viewSniplists", Nil,"GET", """""", Routes.prefix + """sniplists"""))
   }
}
        

// @LINE:108
case controllers_SniplistController_saveSnipList52(params) => {
   call { 
        invokeHandler(controllers.SniplistController.saveSnipList(), HandlerDef(this, "controllers.SniplistController", "saveSnipList", Nil,"POST", """""", Routes.prefix + """sniplists/new"""))
   }
}
        

// @LINE:110
case controllers_SniplistController_addToSnipList53(params) => {
   call(params.fromQuery[String]("snipList_id", None), params.fromQuery[String]("snip_id", None)) { (snipList_id, snip_id) =>
        invokeHandler(controllers.SniplistController.addToSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SniplistController", "addToSnipList", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """sniplists/add"""))
   }
}
        

// @LINE:112
case controllers_SniplistController_loadSnipListByUser54(params) => {
   call(params.fromQuery[String]("snipList_id", None)) { (snipList_id) =>
        invokeHandler(controllers.SniplistController.loadSnipListByUser(snipList_id), HandlerDef(this, "controllers.SniplistController", "loadSnipListByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """sniplists/load"""))
   }
}
        

// @LINE:114
case controllers_SniplistController_deleteFromSnipList55(params) => {
   call(params.fromQuery[String]("snipList_id", None), params.fromQuery[String]("snip_id", None)) { (snipList_id, snip_id) =>
        invokeHandler(controllers.SniplistController.deleteFromSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SniplistController", "deleteFromSnipList", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """sniplists/deleteSnip"""))
   }
}
        

// @LINE:116
case controllers_SniplistController_viewSnipListsLocalUser56(params) => {
   call { 
        invokeHandler(controllers.SniplistController.viewSnipListsLocalUser(), HandlerDef(this, "controllers.SniplistController", "viewSnipListsLocalUser", Nil,"POST", """""", Routes.prefix + """sniplists/viewSnipListsLocalUser"""))
   }
}
        

// @LINE:121
case controllers_Application_javascriptRoutes57(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:124
case controllers_Assets_at58(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     