name := "scalding-hive"

version := "1.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "Conjars" at "http://conjars.org/repo",
  "Springsource" at "http://repo.spring.io/plugins-release/"
)

libraryDependencies ++= Seq(
  "cascading" % "cascading-hive" % "1.1.0-wip-16",
  "com.twitter" %% "scalding-core" % "0.13.1",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.apache.hive" % "hive-metastore" % "0.10.0"
)

