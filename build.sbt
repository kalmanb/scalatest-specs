organization := "com.kalmanb"

name := "scalatest-specs"

version := "1.0.0-SNAPSHOT"

//crossScalaVersions := Seq("2.10.0", "2.11.0")
crossScalaVersions := Seq("2.11.0")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.8", 
  "org.scalatest" %% "scalatest" % "2.2.3",
  "junit" % "junit" % "4.12",
  "org.mockito" % "mockito-all" % "1.9.5"
)



