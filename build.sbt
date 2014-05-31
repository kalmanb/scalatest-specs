organization := "com.kalmanb"

name := "scalatest-specs"

crossScalaVersions := Seq("2.10.0", "2.11.0")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.3", 
  "org.scalaz" %% "scalaz-core" % "7.1.0-M7",
  "org.scalatest" %% "scalatest" % "2.1.7" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test" 
)



