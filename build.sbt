name := """oker"""
organization := "de.vxr"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % "4.0.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.typelevel" %% "cats-core" % "2.3.1",
  "org.typelevel" %% "cats-effect" % "2.3.1"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "de.vxr.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "de.vxr.binders._"
