import play.Project._

name := "Sniplist"

version := "1.0"

libraryDependencies ++= Seq(
  "org.mongodb.morphia" % "morphia" % "0.107",
  "org.mongodb" % "mongo-java-driver" % "2.12.2",
  "be.objectify" %% "deadbolt-java" % "2.2.1-RC2",
  "com.feth" %% "play-authenticate" % "0.5.2-SNAPSHOT"
)

resolvers ++= Seq(
  Resolver.url("Objectify Play Repository (release)", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
  Resolver.url("Objectify Play Repository (snapshot)", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-easymail (release)", url("http://joscha.github.com/play-easymail/repo/releases/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-easymail (snapshot)", url("http://joscha.github.com/play-easymail/repo/snapshots/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-authenticate (release)", url("http://joscha.github.com/play-authenticate/repo/releases/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-authenticate (snapshot)", url("http://joscha.github.com/play-authenticate/repo/snapshots/"))(Resolver.ivyStylePatterns)
)

playJavaSettings