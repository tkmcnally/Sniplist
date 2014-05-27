import play.Project._

name := "Sniplist"

version := "1.0"

libraryDependencies ++= Seq(
  "org.mongodb.morphia" % "morphia" % "0.107",
  "org.mongodb" % "mongo-java-driver" % "2.12.2"
)

playJavaSettings