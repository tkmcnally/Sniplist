// @SOURCE:C:/Projects/Sniplist/conf/routes
// @HASH:ffbd1730bf7f7aa0f66e8723b68586110d007068
// @DATE:Thu Aug 14 00:48:51 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:31
// @LINE:30
package com.feth.play.module.pa.controllers {

// @LINE:31
// @LINE:30
class ReverseAuthenticate {
    

// @LINE:30
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:31
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          
}
                  

// @LINE:129
// @LINE:126
// @LINE:121
// @LINE:119
// @LINE:117
// @LINE:115
// @LINE:113
// @LINE:111
// @LINE:109
// @LINE:106
// @LINE:104
// @LINE:100
// @LINE:98
// @LINE:96
// @LINE:94
// @LINE:92
// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:77
// @LINE:74
// @LINE:72
// @LINE:70
// @LINE:68
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:129
class ReverseAssets {
    

// @LINE:129
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:100
// @LINE:98
// @LINE:96
// @LINE:94
// @LINE:92
class ReverseSniplistCollectionController {
    

// @LINE:100
def getNextSnip(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/getNextSnip")
}
                                                

// @LINE:92
def mySniplists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists/")
}
                                                

// @LINE:96
def saveSniplist(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/saveSniplist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:98
def toggleSniplist(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/toggleSniplist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:94
def removeSniplist(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/removeSniplist" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:77
// @LINE:74
// @LINE:72
// @LINE:70
// @LINE:68
// @LINE:66
class ReverseSnipController {
    

// @LINE:68
def getPopularSnips(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/getPopular")
}
                                                

// @LINE:72
def getVideo(songUrl:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/add/getVideo" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("songUrl", songUrl)))))
}
                                                

// @LINE:77
def viewSnipById(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "s/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:70
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/add")
}
                                                

// @LINE:66
def getSnip(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips/getSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:74
def createSnip(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/add/createSnip")
}
                                                
    
}
                          

// @LINE:121
// @LINE:119
// @LINE:117
// @LINE:115
// @LINE:113
// @LINE:111
// @LINE:109
// @LINE:106
// @LINE:104
class ReverseSniplistController {
    

// @LINE:121
def viewSnipListsLocalUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/viewSnipListsLocalUser")
}
                                                

// @LINE:111
def viewSniplists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists")
}
                                                

// @LINE:109
def viewSniplistsByUser(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/sniplists")
}
                                                

// @LINE:115
def addToSnipList(snipList_id:String, snip_id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/add" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("snipList_id", snipList_id)), Some(implicitly[QueryStringBindable[String]].unbind("snip_id", snip_id)))))
}
                                                

// @LINE:117
def loadSnipListByUser(snipList_id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists/load" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("snipList_id", snipList_id)))))
}
                                                

// @LINE:106
def getPopularSniplists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sniplists/getPopular")
}
                                                

// @LINE:119
def deleteFromSnipList(snipList_id:String, snip_id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/deleteSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("snipList_id", snipList_id)), Some(implicitly[QueryStringBindable[String]].unbind("snip_id", snip_id)))))
}
                                                

// @LINE:104
def viewSniplistById(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "l/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:113
def saveSnipList(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sniplists/new")
}
                                                
    
}
                          

// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
class ReverseSnipCollectionController {
    

// @LINE:80
def viewSnipsByUser(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/snips")
}
                                                

// @LINE:82
def mySnips(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "snips")
}
                                                

// @LINE:88
def toggleSnip(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/toggleSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:86
def saveSnip(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/saveSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:84
def removeSnip(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "snips/removeSnip" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:126
// @LINE:34
// @LINE:33
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:28
def updateUserPhoto(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/updateUserPhoto")
}
                                                

// @LINE:34
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
                                                

// @LINE:33
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:13
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:18
def doLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:11
def updateUserSettings(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:24
def toggleFollow(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "follow/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:26
def getImage(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "img/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:22
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
                                                

// @LINE:15
def contact(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                

// @LINE:126
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                

// @LINE:17
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:20
def getUsersFollowing(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "following")
}
                                                
    
}
                          

// @LINE:63
// @LINE:62
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
class ReverseSignup {
    

// @LINE:41
def exists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                                                

// @LINE:40
def verify(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:37
def unverified(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                                                

// @LINE:38
def oAuthDenied(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                                                

// @LINE:43
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:44
def doResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                                                

// @LINE:63
def doForgotPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                                                

// @LINE:62
def forgotPassword(email:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                
    
}
                          

// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:47
// @LINE:46
class ReverseAccount {
    

// @LINE:56
def unlink(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unlink/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                

// @LINE:58
def askMerge(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:59
def doMerge(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:49
def verifyEmail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                                                

// @LINE:53
def askLink(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:54
def doLink(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:46
def changePassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                

// @LINE:51
def link(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                                                

// @LINE:47
def doChangePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                
    
}
                          
}
                  


// @LINE:31
// @LINE:30
package com.feth.play.module.pa.controllers.javascript {

// @LINE:31
// @LINE:30
class ReverseAuthenticate {
    

// @LINE:30
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:31
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
        

// @LINE:129
// @LINE:126
// @LINE:121
// @LINE:119
// @LINE:117
// @LINE:115
// @LINE:113
// @LINE:111
// @LINE:109
// @LINE:106
// @LINE:104
// @LINE:100
// @LINE:98
// @LINE:96
// @LINE:94
// @LINE:92
// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:77
// @LINE:74
// @LINE:72
// @LINE:70
// @LINE:68
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:129
class ReverseAssets {
    

// @LINE:129
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:100
// @LINE:98
// @LINE:96
// @LINE:94
// @LINE:92
class ReverseSniplistCollectionController {
    

// @LINE:100
def getNextSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistCollectionController.getNextSnip",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/getNextSnip"})
      }
   """
)
                        

// @LINE:92
def mySniplists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistCollectionController.mySniplists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/"})
      }
   """
)
                        

// @LINE:96
def saveSniplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistCollectionController.saveSniplist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/saveSniplist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:98
def toggleSniplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistCollectionController.toggleSniplist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/toggleSniplist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:94
def removeSniplist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistCollectionController.removeSniplist",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/removeSniplist" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:77
// @LINE:74
// @LINE:72
// @LINE:70
// @LINE:68
// @LINE:66
class ReverseSnipController {
    

// @LINE:68
def getPopularSnips : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipController.getPopularSnips",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/getPopular"})
      }
   """
)
                        

// @LINE:72
def getVideo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipController.getVideo",
   """
      function(songUrl) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add/getVideo" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("songUrl", songUrl)])})
      }
   """
)
                        

// @LINE:77
def viewSnipById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipController.viewSnipById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "s/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:70
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipController.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add"})
      }
   """
)
                        

// @LINE:66
def getSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipController.getSnip",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/getSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:74
def createSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipController.createSnip",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/add/createSnip"})
      }
   """
)
                        
    
}
              

// @LINE:121
// @LINE:119
// @LINE:117
// @LINE:115
// @LINE:113
// @LINE:111
// @LINE:109
// @LINE:106
// @LINE:104
class ReverseSniplistController {
    

// @LINE:121
def viewSnipListsLocalUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.viewSnipListsLocalUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/viewSnipListsLocalUser"})
      }
   """
)
                        

// @LINE:111
def viewSniplists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.viewSniplists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists"})
      }
   """
)
                        

// @LINE:109
def viewSniplistsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.viewSniplistsByUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/sniplists"})
      }
   """
)
                        

// @LINE:115
def addToSnipList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.addToSnipList",
   """
      function(snipList_id,snip_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/add" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snipList_id", snipList_id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snip_id", snip_id)])})
      }
   """
)
                        

// @LINE:117
def loadSnipListByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.loadSnipListByUser",
   """
      function(snipList_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/load" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snipList_id", snipList_id)])})
      }
   """
)
                        

// @LINE:106
def getPopularSniplists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.getPopularSniplists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/getPopular"})
      }
   """
)
                        

// @LINE:119
def deleteFromSnipList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.deleteFromSnipList",
   """
      function(snipList_id,snip_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/deleteSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snipList_id", snipList_id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("snip_id", snip_id)])})
      }
   """
)
                        

// @LINE:104
def viewSniplistById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.viewSniplistById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "l/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:113
def saveSnipList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SniplistController.saveSnipList",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sniplists/new"})
      }
   """
)
                        
    
}
              

// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
class ReverseSnipCollectionController {
    

// @LINE:80
def viewSnipsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipCollectionController.viewSnipsByUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/snips"})
      }
   """
)
                        

// @LINE:82
def mySnips : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipCollectionController.mySnips",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "snips"})
      }
   """
)
                        

// @LINE:88
def toggleSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipCollectionController.toggleSnip",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/toggleSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:86
def saveSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipCollectionController.saveSnip",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/saveSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:84
def removeSnip : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SnipCollectionController.removeSnip",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "snips/removeSnip" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:126
// @LINE:34
// @LINE:33
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:28
def updateUserPhoto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateUserPhoto",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updateUserPhoto"})
      }
   """
)
                        

// @LINE:34
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
                        

// @LINE:33
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:13
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:18
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:11
def updateUserSettings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateUserSettings",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:24
def toggleFollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.toggleFollow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "follow/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:26
def getImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getImage",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "img/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:22
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
                        

// @LINE:15
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:126
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        

// @LINE:17
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:20
def getUsersFollowing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUsersFollowing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "following"})
      }
   """
)
                        
    
}
              

// @LINE:63
// @LINE:62
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
class ReverseSignup {
    

// @LINE:41
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:40
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:37
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:38
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:43
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:44
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:63
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:62
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        
    
}
              

// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:47
// @LINE:46
class ReverseAccount {
    

// @LINE:56
def unlink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.unlink",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unlink/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

// @LINE:58
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:59
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:49
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:53
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:54
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:46
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:51
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:47
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
        


// @LINE:31
// @LINE:30
package com.feth.play.module.pa.controllers.ref {


// @LINE:31
// @LINE:30
class ReverseAuthenticate {
    

// @LINE:30
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:31
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:129
// @LINE:126
// @LINE:121
// @LINE:119
// @LINE:117
// @LINE:115
// @LINE:113
// @LINE:111
// @LINE:109
// @LINE:106
// @LINE:104
// @LINE:100
// @LINE:98
// @LINE:96
// @LINE:94
// @LINE:92
// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
// @LINE:77
// @LINE:74
// @LINE:72
// @LINE:70
// @LINE:68
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:129
class ReverseAssets {
    

// @LINE:129
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:100
// @LINE:98
// @LINE:96
// @LINE:94
// @LINE:92
class ReverseSniplistCollectionController {
    

// @LINE:100
def getNextSnip(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistCollectionController.getNextSnip(), HandlerDef(this, "controllers.SniplistCollectionController", "getNextSnip", Seq(), "POST", """""", _prefix + """sniplists/getNextSnip""")
)
                      

// @LINE:92
def mySniplists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistCollectionController.mySniplists(), HandlerDef(this, "controllers.SniplistCollectionController", "mySniplists", Seq(), "GET", """""", _prefix + """sniplists/""")
)
                      

// @LINE:96
def saveSniplist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistCollectionController.saveSniplist(id), HandlerDef(this, "controllers.SniplistCollectionController", "saveSniplist", Seq(classOf[String]), "POST", """""", _prefix + """sniplists/saveSniplist""")
)
                      

// @LINE:98
def toggleSniplist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistCollectionController.toggleSniplist(id), HandlerDef(this, "controllers.SniplistCollectionController", "toggleSniplist", Seq(classOf[String]), "POST", """""", _prefix + """sniplists/toggleSniplist""")
)
                      

// @LINE:94
def removeSniplist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistCollectionController.removeSniplist(id), HandlerDef(this, "controllers.SniplistCollectionController", "removeSniplist", Seq(classOf[String]), "POST", """""", _prefix + """sniplists/removeSniplist""")
)
                      
    
}
                          

// @LINE:77
// @LINE:74
// @LINE:72
// @LINE:70
// @LINE:68
// @LINE:66
class ReverseSnipController {
    

// @LINE:68
def getPopularSnips(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipController.getPopularSnips(), HandlerDef(this, "controllers.SnipController", "getPopularSnips", Seq(), "GET", """""", _prefix + """snips/getPopular""")
)
                      

// @LINE:72
def getVideo(songUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipController.getVideo(songUrl), HandlerDef(this, "controllers.SnipController", "getVideo", Seq(classOf[String]), "POST", """""", _prefix + """snips/add/getVideo""")
)
                      

// @LINE:77
def viewSnipById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipController.viewSnipById(id), HandlerDef(this, "controllers.SnipController", "viewSnipById", Seq(classOf[String]), "GET", """""", _prefix + """s/$id<[^/]+>""")
)
                      

// @LINE:70
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipController.add(), HandlerDef(this, "controllers.SnipController", "add", Seq(), "GET", """""", _prefix + """snips/add""")
)
                      

// @LINE:66
def getSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipController.getSnip(id), HandlerDef(this, "controllers.SnipController", "getSnip", Seq(classOf[String]), "GET", """""", _prefix + """snips/getSnip""")
)
                      

// @LINE:74
def createSnip(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipController.createSnip(), HandlerDef(this, "controllers.SnipController", "createSnip", Seq(), "POST", """""", _prefix + """snips/add/createSnip""")
)
                      
    
}
                          

// @LINE:121
// @LINE:119
// @LINE:117
// @LINE:115
// @LINE:113
// @LINE:111
// @LINE:109
// @LINE:106
// @LINE:104
class ReverseSniplistController {
    

// @LINE:121
def viewSnipListsLocalUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.viewSnipListsLocalUser(), HandlerDef(this, "controllers.SniplistController", "viewSnipListsLocalUser", Seq(), "POST", """""", _prefix + """sniplists/viewSnipListsLocalUser""")
)
                      

// @LINE:111
def viewSniplists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.viewSniplists(), HandlerDef(this, "controllers.SniplistController", "viewSniplists", Seq(), "GET", """""", _prefix + """sniplists""")
)
                      

// @LINE:109
def viewSniplistsByUser(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.viewSniplistsByUser(id), HandlerDef(this, "controllers.SniplistController", "viewSniplistsByUser", Seq(classOf[String]), "GET", """""", _prefix + """$id<[^/]+>/sniplists""")
)
                      

// @LINE:115
def addToSnipList(snipList_id:String, snip_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.addToSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SniplistController", "addToSnipList", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """sniplists/add""")
)
                      

// @LINE:117
def loadSnipListByUser(snipList_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.loadSnipListByUser(snipList_id), HandlerDef(this, "controllers.SniplistController", "loadSnipListByUser", Seq(classOf[String]), "GET", """""", _prefix + """sniplists/load""")
)
                      

// @LINE:106
def getPopularSniplists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.getPopularSniplists(), HandlerDef(this, "controllers.SniplistController", "getPopularSniplists", Seq(), "GET", """""", _prefix + """sniplists/getPopular""")
)
                      

// @LINE:119
def deleteFromSnipList(snipList_id:String, snip_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.deleteFromSnipList(snipList_id, snip_id), HandlerDef(this, "controllers.SniplistController", "deleteFromSnipList", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """sniplists/deleteSnip""")
)
                      

// @LINE:104
def viewSniplistById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.viewSniplistById(id), HandlerDef(this, "controllers.SniplistController", "viewSniplistById", Seq(classOf[String]), "GET", """""", _prefix + """l/$id<[^/]+>""")
)
                      

// @LINE:113
def saveSnipList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SniplistController.saveSnipList(), HandlerDef(this, "controllers.SniplistController", "saveSnipList", Seq(), "POST", """""", _prefix + """sniplists/new""")
)
                      
    
}
                          

// @LINE:88
// @LINE:86
// @LINE:84
// @LINE:82
// @LINE:80
class ReverseSnipCollectionController {
    

// @LINE:80
def viewSnipsByUser(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipCollectionController.viewSnipsByUser(id), HandlerDef(this, "controllers.SnipCollectionController", "viewSnipsByUser", Seq(classOf[String]), "GET", """""", _prefix + """$id<[^/]+>/snips""")
)
                      

// @LINE:82
def mySnips(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipCollectionController.mySnips(), HandlerDef(this, "controllers.SnipCollectionController", "mySnips", Seq(), "GET", """""", _prefix + """snips""")
)
                      

// @LINE:88
def toggleSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipCollectionController.toggleSnip(id), HandlerDef(this, "controllers.SnipCollectionController", "toggleSnip", Seq(classOf[String]), "POST", """""", _prefix + """snips/toggleSnip""")
)
                      

// @LINE:86
def saveSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipCollectionController.saveSnip(id), HandlerDef(this, "controllers.SnipCollectionController", "saveSnip", Seq(classOf[String]), "POST", """""", _prefix + """snips/saveSnip""")
)
                      

// @LINE:84
def removeSnip(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SnipCollectionController.removeSnip(id), HandlerDef(this, "controllers.SnipCollectionController", "removeSnip", Seq(classOf[String]), "POST", """""", _prefix + """snips/removeSnip""")
)
                      
    
}
                          

// @LINE:126
// @LINE:34
// @LINE:33
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:28
def updateUserPhoto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateUserPhoto(), HandlerDef(this, "controllers.Application", "updateUserPhoto", Seq(), "POST", """""", _prefix + """user/updateUserPhoto""")
)
                      

// @LINE:34
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
                      

// @LINE:33
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:13
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:18
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:11
def updateUserSettings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateUserSettings(), HandlerDef(this, "controllers.Application", "updateUserSettings", Seq(), "POST", """""", _prefix + """profile""")
)
                      

// @LINE:24
def toggleFollow(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.toggleFollow(id), HandlerDef(this, "controllers.Application", "toggleFollow", Seq(classOf[String]), "GET", """""", _prefix + """follow/$id<[^/]+>""")
)
                      

// @LINE:26
def getImage(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getImage(id), HandlerDef(this, "controllers.Application", "getImage", Seq(classOf[String]), "GET", """""", _prefix + """img/$id<[^/]+>""")
)
                      

// @LINE:22
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
                      

// @LINE:15
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:126
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """ Javascript routing""", _prefix + """assets/javascripts/routes""")
)
                      

// @LINE:17
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:20
def getUsersFollowing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUsersFollowing(), HandlerDef(this, "controllers.Application", "getUsersFollowing", Seq(), "GET", """""", _prefix + """following""")
)
                      
    
}
                          

// @LINE:63
// @LINE:62
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
class ReverseSignup {
    

// @LINE:41
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this, "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:40
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:37
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this, "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:38
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:43
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:44
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this, "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:63
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this, "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:62
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      
    
}
                          

// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:49
// @LINE:47
// @LINE:46
class ReverseAccount {
    

// @LINE:56
def unlink(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.unlink(provider), HandlerDef(this, "controllers.Account", "unlink", Seq(classOf[String]), "GET", """""", _prefix + """accounts/unlink/$provider<[^/]+>""")
)
                      

// @LINE:58
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this, "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:59
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this, "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:49
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this, "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:53
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this, "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:54
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this, "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:46
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this, "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:51
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this, "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:47
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this, "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      
    
}
                          
}
        
    