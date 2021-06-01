import scala.sys.process._

name := "vtdxml4s"
organization := "com.springernature"
version := Option(System.getenv("BUILD_VERSION")).getOrElse("LOCAL")

crossScalaVersions := Seq("2.12.13", "2.13.5")
scalaVersion := crossScalaVersions.value.head
scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-xml" % "1.3.0",
    "com.ximpleware" % "vtd-xml" % "2.13.4",
    "org.scalatest" %% "scalatest" % "3.2.6" % Test
  )
