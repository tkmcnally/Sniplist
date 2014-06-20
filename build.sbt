import play.Project._

name := "Sniplist"

version := "1.0"

libraryDependencies ++= Seq(
  "com.typesafe" %% "play-plugins-mailer" % "2.2.0",
  "org.mongodb.morphia" % "morphia" % "0.107",
  "org.mongodb" % "mongo-java-driver" % "2.12.2",
  "be.objectify" %% "deadbolt-java" % "2.2.1-RC2" exclude("com.typesafe.play", "play-cache_2.10"),
  "com.feth" %% "play-easymail" % "0.5-SNAPSHOT",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.apache.httpcomponents" % "httpclient" % "4.3",
  "commons-lang" % "commons-lang" % "2.6",
  "com.google.api-client" % "google-api-client" % "1.18.0-rc",
  "com.google.apis" % "google-api-services-youtube" % "v3-rev107-1.18.0-rc",
  "com.google.oauth-client" % "google-oauth-client-jetty" % "1.18.0-rc",
  "com.google.collections" % "google-collections" % "1.0",
  "com.google.http-client" % "google-http-client-jackson2" % "1.18.0-rc",
  "de.u-mass" % "lastfm-java" % "0.1.2",
  //"com.feth" %% "play-authenticate" % "0.5.2-SNAPSHOT" withSources(),
  javaCore,
  cache
)

resolvers ++= Seq(
  Resolver.url("Objectify Play Repository (release)", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
  Resolver.url("Objectify Play Repository (snapshot)", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-easymail (release)", url("http://joscha.github.com/play-easymail/repo/releases/"))(Resolver.ivyStylePatterns),
  Resolver.url("play-easymail (snapshot)", url("http://joscha.github.com/play-easymail/repo/snapshots/"))(Resolver.ivyStylePatterns),
  Resolver.url("jBCrypt Repository", url("http://repo1.maven.org/maven2/org/"))(Resolver.ivyStylePatterns),
  Resolver.url("Apache", url("http://repo1.maven.org/maven2/"))(Resolver.ivyStylePatterns)
)

playJavaSettings