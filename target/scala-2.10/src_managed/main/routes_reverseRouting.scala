// @SOURCE:C:/Projects/Sniplist/conf/routes
// @HASH:b43580ea6e784ba6dd6dc7fd43f99a539e906aca
// @DATE:Thu Jun 19 23:38:59 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:19
package com.feth.play.module.pa.controllers {

// @LINE:20
// @LINE:19
class ReverseAuthenticate {
    

// @LINE:19
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:20
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          
}
                  

// @LINE:64
// @LINE:61
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:64
class ReverseAssets {
    

// @LINE:64
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:61
// @LINE:23
// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:23
def doSignup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:10
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:8
def jsRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
}
                                                

// @LINE:22
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:12
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:17
def doLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def restricted(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "restricted")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:14
def contact(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                

// @LINE:61
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                

// @LINE:16
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
class ReverseSignup {
    

// @LINE:29
def exists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                                                

// @LINE:28
def verify(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:25
def unverified(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                                                

// @LINE:26
def oAuthDenied(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                                                

// @LINE:31
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:32
def doResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                                                

// @LINE:50
def doForgotPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                                                

// @LINE:49
def forgotPassword(email:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                
    
}
                          

// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
class ReverseSnips {
    

// @LINE:56
def getVideo(songUrl:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/add/getVideo/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("songUrl", songUrl)))))
}
                                                

// @LINE:52
def mySnips(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/")
}
                                                

// @LINE:54
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/add")
}
                                                

// @LINE:58
def saveSnip(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/add/saveSnip")
}
                                                
    
}
                          

// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:34
class ReverseAccount {
    

// @LINE:44
def unlink(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unlink/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                

// @LINE:46
def askMerge(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:47
def doMerge(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:37
def verifyEmail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                                                

// @LINE:41
def askLink(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:42
def doLink(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:34
def changePassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                

// @LINE:39
def link(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                                                

// @LINE:35
def doChangePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:19
package com.feth.play.module.pa.controllers.javascript {

// @LINE:20
// @LINE:19
class ReverseAuthenticate {
    

// @LINE:19
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:20
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        
    
}
              
}
        

// @LINE:64
// @LINE:61
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:64
class ReverseAssets {
    

// @LINE:64
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:61
// @LINE:23
// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:23
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:10
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:8
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
      }
   """
)
                        

// @LINE:22
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:12
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:17
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def restricted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.restricted",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:14
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:61
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

// @LINE:16
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:49
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
class ReverseSignup {
    

// @LINE:29
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:28
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:25
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:26
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:31
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:32
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:50
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:49
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        
    
}
              

// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
class ReverseSnips {
    

// @LINE:56
def getVideo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.getVideo",
   """
      function(songUrl) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add/getVideo/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("songUrl", songUrl)])})
      }
   """
)
                        

// @LINE:52
def mySnips : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.mySnips",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/"})
      }
   """
)
                        

// @LINE:54
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add"})
      }
   """
)
                        

// @LINE:58
def saveSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.saveSnip",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add/saveSnip"})
      }
   """
)
                        
    
}
              

// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:34
class ReverseAccount {
    

// @LINE:44
def unlink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.unlink",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unlink/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:46
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:47
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:37
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:41
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:42
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:34
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:39
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:35
def doChangePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doChangePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:20
// @LINE:19
package com.feth.play.module.pa.controllers.ref {


// @LINE:20
// @LINE:19
class ReverseAuthenticate {
    

// @LINE:19
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:20
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:64
// @LINE:61
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:64
class ReverseAssets {
    

// @LINE:64
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:61
// @LINE:23
// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:23
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doSignup(), HandlerDef(this, "controllers.Application", "doSignup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:10
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this, "controllers.Application", "jsRoutes", Seq(), "GET", """""", _prefix + """assets/javascript/routes.js""")
)
                      

// @LINE:22
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:12
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:17
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def restricted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.restricted(), HandlerDef(this, "controllers.Application", "restricted", Seq(), "GET", """""", _prefix + """restricted""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:61
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:16
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
class ReverseSignup {
    

// @LINE:29
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this, "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:28
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:25
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this, "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:26
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:31
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:32
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this, "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:50
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this, "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:49
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      
    
}
                          

// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:52
class ReverseSnips {
    

// @LINE:56
def getVideo(songUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.getVideo(songUrl), HandlerDef(this, "controllers.Snips", "getVideo", Seq(classOf[String]), "POST", """""", _prefix + """snips/add/getVideo/""")
)
                      

// @LINE:52
def mySnips(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.mySnips(), HandlerDef(this, "controllers.Snips", "mySnips", Seq(), "GET", """""", _prefix + """snips/""")
)
                      

// @LINE:54
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.add(), HandlerDef(this, "controllers.Snips", "add", Seq(), "GET", """""", _prefix + """snips/add""")
)
                      

// @LINE:58
def saveSnip(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.saveSnip(), HandlerDef(this, "controllers.Snips", "saveSnip", Seq(), "POST", """""", _prefix + """snips/add/saveSnip""")
)
                      
    
}
                          

// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:37
// @LINE:35
// @LINE:34
class ReverseAccount {
    

// @LINE:44
def unlink(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.unlink(provider), HandlerDef(this, "controllers.Account", "unlink", Seq(classOf[String]), "GET", """""", _prefix + """accounts/unlink/$provider<[^/]+>""")
)
                      

// @LINE:46
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this, "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:47
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this, "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:37
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this, "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:41
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this, "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:42
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this, "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:34
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this, "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:39
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this, "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:35
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this, "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      
    
}
                          
}
        
    