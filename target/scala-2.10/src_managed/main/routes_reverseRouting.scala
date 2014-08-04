// @SOURCE:C:/Projects/Sniplist/conf/routes
// @HASH:3bbb86c0f69fba9051e597ccfdcd39dd19b0b407
// @DATE:Sun Aug 03 16:11:02 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:27
// @LINE:26
package com.feth.play.module.pa.controllers {

// @LINE:27
// @LINE:26
class ReverseAuthenticate {
    

// @LINE:26
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:27
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          
}
                  

// @LINE:120
// @LINE:117
// @LINE:112
// @LINE:110
// @LINE:108
// @LINE:106
// @LINE:104
// @LINE:102
// @LINE:100
// @LINE:97
// @LINE:93
// @LINE:91
// @LINE:89
// @LINE:87
// @LINE:85
// @LINE:81
// @LINE:79
// @LINE:77
// @LINE:75
// @LINE:73
// @LINE:70
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:120
class ReverseAssets {
    

// @LINE:120
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:112
// @LINE:110
// @LINE:108
// @LINE:106
// @LINE:104
// @LINE:102
// @LINE:100
// @LINE:97
class ReverseSnipLists {
    

// @LINE:112
def viewSnipListsLocalUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/viewSnipListsLocalUser")
}
                                                

// @LINE:102
def viewSniplists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists")
}
                                                

// @LINE:100
def viewSniplistsByUser(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/sniplists")
}
                                                

// @LINE:106
def addToSnipList(snipList_id:String, snip_id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/add" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("snipList_id", snipList_id)), Some(implicitly[QueryStringBindable[String]].unbind("snip_id", snip_id)))))
}
                                                

// @LINE:108
def loadSnipListByUser(snipList_id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists/load" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("snipList_id", snipList_id)))))
}
                                                

// @LINE:110
def deleteFromSnipList(snipList_id:String, snip_id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/deleteSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("snipList_id", snipList_id)), Some(implicitly[QueryStringBindable[String]].unbind("snip_id", snip_id)))))
}
                                                

// @LINE:97
def viewSniplistById(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "l/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:104
def saveSnipList(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/new")
}
                                                
    
}
                          

// @LINE:81
// @LINE:79
// @LINE:77
// @LINE:75
// @LINE:73
class ReverseMySnipsController {
    

// @LINE:73
def viewSnipsByUser(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/snips")
}
                                                

// @LINE:75
def mySnips(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips")
}
                                                

// @LINE:81
def toggleSnip(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/toggleSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:79
def saveSnip(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/saveSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:77
def removeSnip(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/removeSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:117
// @LINE:30
// @LINE:29
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:30
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
                                                

// @LINE:29
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
                                                

// @LINE:23
def toggleFollow(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "follow/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:21
def getUserProfile(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "u/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
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
                                                

// @LINE:117
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                

// @LINE:16
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:19
def getUsersFollowing(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "following")
}
                                                
    
}
                          

// @LINE:58
// @LINE:57
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
class ReverseSignup {
    

// @LINE:36
def exists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                                                

// @LINE:35
def verify(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:32
def unverified(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                                                

// @LINE:33
def oAuthDenied(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                                                

// @LINE:38
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:39
def doResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                                                

// @LINE:58
def doForgotPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                                                

// @LINE:57
def forgotPassword(email:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                
    
}
                          

// @LINE:70
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
class ReverseSnips {
    

// @LINE:65
def getVideo(songUrl:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/add/getVideo" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("songUrl", songUrl)))))
}
                                                

// @LINE:70
def viewSnipById(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "s/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:63
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/add")
}
                                                

// @LINE:61
def getSnip(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/getSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:67
def createSnip(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/add/createSnip")
}
                                                
    
}
                          

// @LINE:93
// @LINE:91
// @LINE:89
// @LINE:87
// @LINE:85
class ReverseMySniplistsController {
    

// @LINE:93
def getNextSnip(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/getNextSnip")
}
                                                

// @LINE:85
def mySniplists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists/")
}
                                                

// @LINE:89
def saveSniplist(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/saveSniplist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:91
def toggleSniplist(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/toggleSniplist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:87
def removeSniplist(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/removeSniplist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
class ReverseAccount {
    

// @LINE:51
def unlink(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unlink/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                

// @LINE:53
def askMerge(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:54
def doMerge(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:44
def verifyEmail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                                                

// @LINE:48
def askLink(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:49
def doLink(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:41
def changePassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                

// @LINE:46
def link(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                                                

// @LINE:42
def doChangePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                
    
}
                          
}
                  


// @LINE:27
// @LINE:26
package com.feth.play.module.pa.controllers.javascript {

// @LINE:27
// @LINE:26
class ReverseAuthenticate {
    

// @LINE:26
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:27
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
        

// @LINE:120
// @LINE:117
// @LINE:112
// @LINE:110
// @LINE:108
// @LINE:106
// @LINE:104
// @LINE:102
// @LINE:100
// @LINE:97
// @LINE:93
// @LINE:91
// @LINE:89
// @LINE:87
// @LINE:85
// @LINE:81
// @LINE:79
// @LINE:77
// @LINE:75
// @LINE:73
// @LINE:70
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:120
class ReverseAssets {
    

// @LINE:120
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:112
// @LINE:110
// @LINE:108
// @LINE:106
// @LINE:104
// @LINE:102
// @LINE:100
// @LINE:97
class ReverseSnipLists {
    

// @LINE:112
def viewSnipListsLocalUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.viewSnipListsLocalUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/viewSnipListsLocalUser"})
      }
   """
)
                        

// @LINE:102
def viewSniplists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.viewSniplists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists"})
      }
   """
)
                        

// @LINE:100
def viewSniplistsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.viewSniplistsByUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/sniplists"})
      }
   """
)
                        

// @LINE:106
def addToSnipList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.addToSnipList",
   """
      function(snipList_id,snip_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/add" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snipList_id", snipList_id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snip_id", snip_id)])})
      }
   """
)
                        

// @LINE:108
def loadSnipListByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.loadSnipListByUser",
   """
      function(snipList_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/load" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snipList_id", snipList_id)])})
      }
   """
)
                        

// @LINE:110
def deleteFromSnipList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.deleteFromSnipList",
   """
      function(snipList_id,snip_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/deleteSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snipList_id", snipList_id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snip_id", snip_id)])})
      }
   """
)
                        

// @LINE:97
def viewSniplistById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.viewSniplistById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "l/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:104
def saveSnipList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipLists.saveSnipList",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/new"})
      }
   """
)
                        
    
}
              

// @LINE:81
// @LINE:79
// @LINE:77
// @LINE:75
// @LINE:73
class ReverseMySnipsController {
    

// @LINE:73
def viewSnipsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySnipsController.viewSnipsByUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/snips"})
      }
   """
)
                        

// @LINE:75
def mySnips : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySnipsController.mySnips",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips"})
      }
   """
)
                        

// @LINE:81
def toggleSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySnipsController.toggleSnip",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/toggleSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:79
def saveSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySnipsController.saveSnip",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/saveSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:77
def removeSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySnipsController.removeSnip",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/removeSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:117
// @LINE:30
// @LINE:29
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:30
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
                        

// @LINE:29
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
                        

// @LINE:23
def toggleFollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.toggleFollow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follow/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:21
def getUserProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUserProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "u/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
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
                        

// @LINE:117
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
                        

// @LINE:19
def getUsersFollowing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUsersFollowing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "following"})
      }
   """
)
                        
    
}
              

// @LINE:58
// @LINE:57
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
class ReverseSignup {
    

// @LINE:36
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:35
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:32
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:33
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:38
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:39
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:58
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:57
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        
    
}
              

// @LINE:70
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
class ReverseSnips {
    

// @LINE:65
def getVideo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.getVideo",
   """
      function(songUrl) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add/getVideo" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("songUrl", songUrl)])})
      }
   """
)
                        

// @LINE:70
def viewSnipById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.viewSnipById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "s/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:63
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add"})
      }
   """
)
                        

// @LINE:61
def getSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.getSnip",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/getSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:67
def createSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Snips.createSnip",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add/createSnip"})
      }
   """
)
                        
    
}
              

// @LINE:93
// @LINE:91
// @LINE:89
// @LINE:87
// @LINE:85
class ReverseMySniplistsController {
    

// @LINE:93
def getNextSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySniplistsController.getNextSnip",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/getNextSnip"})
      }
   """
)
                        

// @LINE:85
def mySniplists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySniplistsController.mySniplists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/"})
      }
   """
)
                        

// @LINE:89
def saveSniplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySniplistsController.saveSniplist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/saveSniplist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:91
def toggleSniplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySniplistsController.toggleSniplist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/toggleSniplist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:87
def removeSniplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MySniplistsController.removeSniplist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/removeSniplist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
class ReverseAccount {
    

// @LINE:51
def unlink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.unlink",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unlink/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:53
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:54
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:44
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:48
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:49
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:41
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:46
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:42
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
        


// @LINE:27
// @LINE:26
package com.feth.play.module.pa.controllers.ref {


// @LINE:27
// @LINE:26
class ReverseAuthenticate {
    

// @LINE:26
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:27
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:120
// @LINE:117
// @LINE:112
// @LINE:110
// @LINE:108
// @LINE:106
// @LINE:104
// @LINE:102
// @LINE:100
// @LINE:97
// @LINE:93
// @LINE:91
// @LINE:89
// @LINE:87
// @LINE:85
// @LINE:81
// @LINE:79
// @LINE:77
// @LINE:75
// @LINE:73
// @LINE:70
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:120
class ReverseAssets {
    

// @LINE:120
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:112
// @LINE:110
// @LINE:108
// @LINE:106
// @LINE:104
// @LINE:102
// @LINE:100
// @LINE:97
class ReverseSnipLists {
    

// @LINE:112
def viewSnipListsLocalUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.viewSnipListsLocalUser(), HandlerDef(this, "controllers.SnipLists", "viewSnipListsLocalUser", Seq(), "POST", """""", _prefix + """sniplists/viewSnipListsLocalUser""")
)
                      

// @LINE:102
def viewSniplists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.viewSniplists(), HandlerDef(this, "controllers.SnipLists", "viewSniplists", Seq(), "GET", """""", _prefix + """sniplists""")
)
                      

// @LINE:100
def viewSniplistsByUser(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.viewSniplistsByUser(id), HandlerDef(this, "controllers.SnipLists", "viewSniplistsByUser", Seq(classOf[String]), "GET", """""", _prefix + """$id<[^/]+>/sniplists""")
)
                      

// @LINE:106
def addToSnipList(snipList_id:String, snip_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.addToSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SnipLists", "addToSnipList", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """sniplists/add""")
)
                      

// @LINE:108
def loadSnipListByUser(snipList_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.loadSnipListByUser(snipList_id), HandlerDef(this, "controllers.SnipLists", "loadSnipListByUser", Seq(classOf[String]), "GET", """""", _prefix + """sniplists/load""")
)
                      

// @LINE:110
def deleteFromSnipList(snipList_id:String, snip_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.deleteFromSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SnipLists", "deleteFromSnipList", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """sniplists/deleteSnip""")
)
                      

// @LINE:97
def viewSniplistById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.viewSniplistById(id), HandlerDef(this, "controllers.SnipLists", "viewSniplistById", Seq(classOf[String]), "GET", """""", _prefix + """l/$id<[^/]+>""")
)
                      

// @LINE:104
def saveSnipList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipLists.saveSnipList(), HandlerDef(this, "controllers.SnipLists", "saveSnipList", Seq(), "POST", """""", _prefix + """sniplists/new""")
)
                      
    
}
                          

// @LINE:81
// @LINE:79
// @LINE:77
// @LINE:75
// @LINE:73
class ReverseMySnipsController {
    

// @LINE:73
def viewSnipsByUser(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySnipsController.viewSnipsByUser(id), HandlerDef(this, "controllers.MySnipsController", "viewSnipsByUser", Seq(classOf[String]), "GET", """""", _prefix + """$id<[^/]+>/snips""")
)
                      

// @LINE:75
def mySnips(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySnipsController.mySnips(), HandlerDef(this, "controllers.MySnipsController", "mySnips", Seq(), "GET", """""", _prefix + """snips""")
)
                      

// @LINE:81
def toggleSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySnipsController.toggleSnip(id), HandlerDef(this, "controllers.MySnipsController", "toggleSnip", Seq(classOf[String]), "POST", """""", _prefix + """snips/toggleSnip""")
)
                      

// @LINE:79
def saveSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySnipsController.saveSnip(id), HandlerDef(this, "controllers.MySnipsController", "saveSnip", Seq(classOf[String]), "POST", """""", _prefix + """snips/saveSnip""")
)
                      

// @LINE:77
def removeSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySnipsController.removeSnip(id), HandlerDef(this, "controllers.MySnipsController", "removeSnip", Seq(classOf[String]), "POST", """""", _prefix + """snips/removeSnip""")
)
                      
    
}
                          

// @LINE:117
// @LINE:30
// @LINE:29
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:30
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
                      

// @LINE:29
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
                      

// @LINE:23
def toggleFollow(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.toggleFollow(id), HandlerDef(this, "controllers.Application", "toggleFollow", Seq(classOf[String]), "GET", """""", _prefix + """follow/$id<[^/]+>""")
)
                      

// @LINE:21
def getUserProfile(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUserProfile(id), HandlerDef(this, "controllers.Application", "getUserProfile", Seq(classOf[String]), "GET", """""", _prefix + """u/$id<[^/]+>""")
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
                      

// @LINE:117
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:16
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:19
def getUsersFollowing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUsersFollowing(), HandlerDef(this, "controllers.Application", "getUsersFollowing", Seq(), "GET", """""", _prefix + """following""")
)
                      
    
}
                          

// @LINE:58
// @LINE:57
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
class ReverseSignup {
    

// @LINE:36
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this, "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:35
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:32
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this, "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:33
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:38
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:39
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this, "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:58
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this, "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:57
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      
    
}
                          

// @LINE:70
// @LINE:67
// @LINE:65
// @LINE:63
// @LINE:61
class ReverseSnips {
    

// @LINE:65
def getVideo(songUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.getVideo(songUrl), HandlerDef(this, "controllers.Snips", "getVideo", Seq(classOf[String]), "POST", """""", _prefix + """snips/add/getVideo""")
)
                      

// @LINE:70
def viewSnipById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.viewSnipById(id), HandlerDef(this, "controllers.Snips", "viewSnipById", Seq(classOf[String]), "GET", """""", _prefix + """s/$id<[^/]+>""")
)
                      

// @LINE:63
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.add(), HandlerDef(this, "controllers.Snips", "add", Seq(), "GET", """""", _prefix + """snips/add""")
)
                      

// @LINE:61
def getSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.getSnip(id), HandlerDef(this, "controllers.Snips", "getSnip", Seq(classOf[String]), "GET", """""", _prefix + """snips/getSnip""")
)
                      

// @LINE:67
def createSnip(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Snips.createSnip(), HandlerDef(this, "controllers.Snips", "createSnip", Seq(), "POST", """""", _prefix + """snips/add/createSnip""")
)
                      
    
}
                          

// @LINE:93
// @LINE:91
// @LINE:89
// @LINE:87
// @LINE:85
class ReverseMySniplistsController {
    

// @LINE:93
def getNextSnip(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySniplistsController.getNextSnip(), HandlerDef(this, "controllers.MySniplistsController", "getNextSnip", Seq(), "POST", """""", _prefix + """sniplists/getNextSnip""")
)
                      

// @LINE:85
def mySniplists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySniplistsController.mySniplists(), HandlerDef(this, "controllers.MySniplistsController", "mySniplists", Seq(), "GET", """""", _prefix + """sniplists/""")
)
                      

// @LINE:89
def saveSniplist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySniplistsController.saveSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "saveSniplist", Seq(classOf[String]), "POST", """""", _prefix + """sniplists/saveSniplist""")
)
                      

// @LINE:91
def toggleSniplist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySniplistsController.toggleSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "toggleSniplist", Seq(classOf[String]), "POST", """""", _prefix + """sniplists/toggleSniplist""")
)
                      

// @LINE:87
def removeSniplist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MySniplistsController.removeSniplist(id), HandlerDef(this, "controllers.MySniplistsController", "removeSniplist", Seq(classOf[String]), "POST", """""", _prefix + """sniplists/removeSniplist""")
)
                      
    
}
                          

// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:41
class ReverseAccount {
    

// @LINE:51
def unlink(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.unlink(provider), HandlerDef(this, "controllers.Account", "unlink", Seq(classOf[String]), "GET", """""", _prefix + """accounts/unlink/$provider<[^/]+>""")
)
                      

// @LINE:53
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this, "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:54
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this, "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:44
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this, "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:48
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this, "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:49
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this, "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:41
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this, "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:46
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this, "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:42
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this, "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      
    
}
                          
}
        
    