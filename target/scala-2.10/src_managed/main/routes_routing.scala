// @SOURCE:C:/Projects/Sniplist/conf/routes
// @HASH:f2e2ca0674feaa72485fcc47ef47fda2e1b84593
// @DATE:Thu Jul 31 01:41:23 EDT 2014


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
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:20
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Application_signup10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:23
private[this] lazy val controllers_Application_doSignup11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:25
private[this] lazy val controllers_Signup_unverified12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
        

// @LINE:26
private[this] lazy val controllers_Signup_oAuthDenied13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
        

// @LINE:28
private[this] lazy val controllers_Signup_verify14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Signup_exists15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
        

// @LINE:31
private[this] lazy val controllers_Signup_resetPassword16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Signup_doResetPassword17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset"))))
        

// @LINE:34
private[this] lazy val controllers_Account_changePassword18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:35
private[this] lazy val controllers_Account_doChangePassword19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:37
private[this] lazy val controllers_Account_verifyEmail20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify"))))
        

// @LINE:39
private[this] lazy val controllers_Account_link21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/add"))))
        

// @LINE:41
private[this] lazy val controllers_Account_askLink22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:42
private[this] lazy val controllers_Account_doLink23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:44
private[this] lazy val controllers_Account_unlink24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unlink/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_Account_askMerge25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:47
private[this] lazy val controllers_Account_doMerge26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:49
private[this] lazy val controllers_Signup_forgotPassword27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:50
private[this] lazy val controllers_Signup_doForgotPassword28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:53
private[this] lazy val controllers_Snips_getSnip29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/getSnip"))))
        

// @LINE:55
private[this] lazy val controllers_Snips_add30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add"))))
        

// @LINE:57
private[this] lazy val controllers_Snips_getVideo31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add/getVideo"))))
        

// @LINE:59
private[this] lazy val controllers_Snips_createSnip32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/add/createSnip"))))
        

// @LINE:62
private[this] lazy val controllers_MySnipsController_viewSnipsByUser33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/snips"))))
        

// @LINE:64
private[this] lazy val controllers_MySnipsController_mySnips34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips"))))
        

// @LINE:66
private[this] lazy val controllers_MySnipsController_removeSnip35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/removeSnip"))))
        

// @LINE:68
private[this] lazy val controllers_MySnipsController_saveSnip36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/saveSnip"))))
        

// @LINE:70
private[this] lazy val controllers_MySnipsController_toggleSnip37 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("snips/toggleSnip"))))
        

// @LINE:74
private[this] lazy val controllers_MySniplistsController_mySniplists38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/"))))
        

// @LINE:76
private[this] lazy val controllers_MySniplistsController_removeSniplist39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/removeSniplist"))))
        

// @LINE:78
private[this] lazy val controllers_MySniplistsController_saveSniplist40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/saveSniplist"))))
        

// @LINE:80
private[this] lazy val controllers_MySniplistsController_toggleSniplist41 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/toggleSniplist"))))
        

// @LINE:85
private[this] lazy val controllers_SnipLists_viewSniplistsByUser42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+""",true),StaticPart("/sniplists"))))
        

// @LINE:87
private[this] lazy val controllers_SnipLists_viewSniplists43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists"))))
        

// @LINE:89
private[this] lazy val controllers_SnipLists_saveSnipList44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/new"))))
        

// @LINE:91
private[this] lazy val controllers_SnipLists_addToSnipList45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/add"))))
        

// @LINE:93
private[this] lazy val controllers_SnipLists_loadSnipListByUser46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/load"))))
        

// @LINE:95
private[this] lazy val controllers_SnipLists_deleteFromSnipList47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/deleteSnip"))))
        

// @LINE:97
private[this] lazy val controllers_SnipLists_viewSnipListsLocalUser48 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sniplists/viewSnipListsLocalUser"))))
        

// @LINE:102
private[this] lazy val controllers_Application_javascriptRoutes49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:105
private[this] lazy val controllers_Assets_at50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Application.restricted"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unlink/$provider<[^/]+>""","""controllers.Account.unlink(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/getSnip""","""controllers.Snips.getSnip(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add""","""controllers.Snips.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add/getVideo""","""controllers.Snips.getVideo(songUrl:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/add/createSnip""","""controllers.Snips.createSnip()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/snips""","""controllers.MySnipsController.viewSnipsByUser(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips""","""controllers.MySnipsController.mySnips()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/removeSnip""","""controllers.MySnipsController.removeSnip(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/saveSnip""","""controllers.MySnipsController.saveSnip(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """snips/toggleSnip""","""controllers.MySnipsController.toggleSnip(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/""","""controllers.MySniplistsController.mySniplists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/removeSniplist""","""controllers.MySniplistsController.removeSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/saveSniplist""","""controllers.MySniplistsController.saveSniplist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/toggleSniplist""","""controllers.MySniplistsController.toggleSniplist(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/sniplists""","""controllers.SnipLists.viewSniplistsByUser(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists""","""controllers.SnipLists.viewSniplists()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/new""","""controllers.SnipLists.saveSnipList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/add""","""controllers.SnipLists.addToSnipList(snipList_id:String, snip_id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/load""","""controllers.SnipLists.loadSnipListByUser(snipList_id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/deleteSnip""","""controllers.SnipLists.deleteFromSnipList(snipList_id:String, snip_id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sniplists/viewSnipListsLocalUser""","""controllers.SnipLists.viewSnipListsLocalUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case com_feth_play_module_pa_controllers_Authenticate_logout8(params) => {
   call { 
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.logout, HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:20
case com_feth_play_module_pa_controllers_Authenticate_authenticate9(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Application_signup10(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:23
case controllers_Application_doSignup11(params) => {
   call { 
        invokeHandler(controllers.Application.doSignup, HandlerDef(this, "controllers.Application", "doSignup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:25
case controllers_Signup_unverified12(params) => {
   call { 
        invokeHandler(controllers.Signup.unverified, HandlerDef(this, "controllers.Signup", "unverified", Nil,"GET", """""", Routes.prefix + """accounts/unverified"""))
   }
}
        

// @LINE:26
case controllers_Signup_oAuthDenied13(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
   }
}
        

// @LINE:28
case controllers_Signup_verify14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Signup_exists15(params) => {
   call { 
        invokeHandler(controllers.Signup.exists, HandlerDef(this, "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
   }
}
        

// @LINE:31
case controllers_Signup_resetPassword16(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Signup_doResetPassword17(params) => {
   call { 
        invokeHandler(controllers.Signup.doResetPassword, HandlerDef(this, "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """accounts/password/reset"""))
   }
}
        

// @LINE:34
case controllers_Account_changePassword18(params) => {
   call { 
        invokeHandler(controllers.Account.changePassword, HandlerDef(this, "controllers.Account", "changePassword", Nil,"GET", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:35
case controllers_Account_doChangePassword19(params) => {
   call { 
        invokeHandler(controllers.Account.doChangePassword, HandlerDef(this, "controllers.Account", "doChangePassword", Nil,"POST", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:37
case controllers_Account_verifyEmail20(params) => {
   call { 
        invokeHandler(controllers.Account.verifyEmail, HandlerDef(this, "controllers.Account", "verifyEmail", Nil,"GET", """""", Routes.prefix + """accounts/verify"""))
   }
}
        

// @LINE:39
case controllers_Account_link21(params) => {
   call { 
        invokeHandler(controllers.Account.link, HandlerDef(this, "controllers.Account", "link", Nil,"GET", """""", Routes.prefix + """accounts/add"""))
   }
}
        

// @LINE:41
case controllers_Account_askLink22(params) => {
   call { 
        invokeHandler(controllers.Account.askLink, HandlerDef(this, "controllers.Account", "askLink", Nil,"GET", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:42
case controllers_Account_doLink23(params) => {
   call { 
        invokeHandler(controllers.Account.doLink, HandlerDef(this, "controllers.Account", "doLink", Nil,"POST", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:44
case controllers_Account_unlink24(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Account.unlink(provider), HandlerDef(this, "controllers.Account", "unlink", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/unlink/$provider<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_Account_askMerge25(params) => {
   call { 
        invokeHandler(controllers.Account.askMerge, HandlerDef(this, "controllers.Account", "askMerge", Nil,"GET", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:47
case controllers_Account_doMerge26(params) => {
   call { 
        invokeHandler(controllers.Account.doMerge, HandlerDef(this, "controllers.Account", "doMerge", Nil,"POST", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:49
case controllers_Signup_forgotPassword27(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:50
case controllers_Signup_doForgotPassword28(params) => {
   call { 
        invokeHandler(controllers.Signup.doForgotPassword, HandlerDef(this, "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:53
case controllers_Snips_getSnip29(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.Snips.getSnip(id), HandlerDef(this, "controllers.Snips", "getSnip", Seq(classOf[String]),"GET", """""", Routes.prefix + """snips/getSnip"""))
   }
}
        

// @LINE:55
case controllers_Snips_add30(params) => {
   call { 
        invokeHandler(controllers.Snips.add(), HandlerDef(this, "controllers.Snips", "add", Nil,"GET", """""", Routes.prefix + """snips/add"""))
   }
}
        

// @LINE:57
case controllers_Snips_getVideo31(params) => {
   call(params.fromQuery[String]("songUrl", None)) { (songUrl) =>
        invokeHandler(controllers.Snips.getVideo(songUrl), HandlerDef(this, "controllers.Snips", "getVideo", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/add/getVideo"""))
   }
}
        

// @LINE:59
case controllers_Snips_createSnip32(params) => {
   call { 
        invokeHandler(controllers.Snips.createSnip(), HandlerDef(this, "controllers.Snips", "createSnip", Nil,"POST", """""", Routes.prefix + """snips/add/createSnip"""))
   }
}
        

// @LINE:62
case controllers_MySnipsController_viewSnipsByUser33(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.viewSnipsByUser(id), HandlerDef(this, "controllers.MySnipsController", "viewSnipsByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """$id<[^/]+>/snips"""))
   }
}
        

// @LINE:64
case controllers_MySnipsController_mySnips34(params) => {
   call { 
        invokeHandler(controllers.MySnipsController.mySnips(), HandlerDef(this, "controllers.MySnipsController", "mySnips", Nil,"GET", """""", Routes.prefix + """snips"""))
   }
}
        

// @LINE:66
case controllers_MySnipsController_removeSnip35(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.removeSnip(id), HandlerDef(this, "controllers.MySnipsController", "removeSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/removeSnip"""))
   }
}
        

// @LINE:68
case controllers_MySnipsController_saveSnip36(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.saveSnip(id), HandlerDef(this, "controllers.MySnipsController", "saveSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/saveSnip"""))
   }
}
        

// @LINE:70
case controllers_MySnipsController_toggleSnip37(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySnipsController.toggleSnip(id), HandlerDef(this, "controllers.MySnipsController", "toggleSnip", Seq(classOf[String]),"POST", """""", Routes.prefix + """snips/toggleSnip"""))
   }
}
        

// @LINE:74
case controllers_MySniplistsController_mySniplists38(params) => {
   call { 
        invokeHandler(controllers.MySniplistsController.mySniplists(), HandlerDef(this, "controllers.MySniplistsController", "mySniplists", Nil,"GET", """""", Routes.prefix + """sniplists/"""))
   }
}
        

// @LINE:76
case controllers_MySniplistsController_removeSniplist39(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySniplistsController.removeSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "removeSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/removeSniplist"""))
   }
}
        

// @LINE:78
case controllers_MySniplistsController_saveSniplist40(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySniplistsController.saveSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "saveSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/saveSniplist"""))
   }
}
        

// @LINE:80
case controllers_MySniplistsController_toggleSniplist41(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.MySniplistsController.toggleSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "toggleSniplist", Seq(classOf[String]),"POST", """""", Routes.prefix + """sniplists/toggleSniplist"""))
   }
}
        

// @LINE:85
case controllers_SnipLists_viewSniplistsByUser42(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.SnipLists.viewSniplistsByUser(id), HandlerDef(this, "controllers.SnipLists", "viewSniplistsByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """$id<[^/]+>/sniplists"""))
   }
}
        

// @LINE:87
case controllers_SnipLists_viewSniplists43(params) => {
   call { 
        invokeHandler(controllers.SnipLists.viewSniplists(), HandlerDef(this, "controllers.SnipLists", "viewSniplists", Nil,"GET", """""", Routes.prefix + """sniplists"""))
   }
}
        

// @LINE:89
case controllers_SnipLists_saveSnipList44(params) => {
   call { 
        invokeHandler(controllers.SnipLists.saveSnipList(), HandlerDef(this, "controllers.SnipLists", "saveSnipList", Nil,"POST", """""", Routes.prefix + """sniplists/new"""))
   }
}
        

// @LINE:91
case controllers_SnipLists_addToSnipList45(params) => {
   call(params.fromQuery[String]("snipList_id", None), params.fromQuery[String]("snip_id", None)) { (snipList_id, snip_id) =>
        invokeHandler(controllers.SnipLists.addToSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SnipLists", "addToSnipList", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """sniplists/add"""))
   }
}
        

// @LINE:93
case controllers_SnipLists_loadSnipListByUser46(params) => {
   call(params.fromQuery[String]("snipList_id", None)) { (snipList_id) =>
        invokeHandler(controllers.SnipLists.loadSnipListByUser(snipList_id), HandlerDef(this, "controllers.SnipLists", "loadSnipListByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """sniplists/load"""))
   }
}
        

// @LINE:95
case controllers_SnipLists_deleteFromSnipList47(params) => {
   call(params.fromQuery[String]("snipList_id", None), params.fromQuery[String]("snip_id", None)) { (snipList_id, snip_id) =>
        invokeHandler(controllers.SnipLists.deleteFromSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SnipLists", "deleteFromSnipList", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """sniplists/deleteSnip"""))
   }
}
        

// @LINE:97
case controllers_SnipLists_viewSnipListsLocalUser48(params) => {
   call { 
        invokeHandler(controllers.SnipLists.viewSnipListsLocalUser(), HandlerDef(this, "controllers.SnipLists", "viewSnipListsLocalUser", Nil,"POST", """""", Routes.prefix + """sniplists/viewSnipListsLocalUser"""))
   }
}
        

// @LINE:102
case controllers_Application_javascriptRoutes49(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:105
case controllers_Assets_at50(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     