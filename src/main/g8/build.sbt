// give the user a nice default project!
ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := "$scalaVersion$"

lazy val root = (project in file(".")).
  settings(
    name := "scala-app-package",
    assembly / mainClass := Some("$package$.app.PackagedApp")
  )

libraryDependencies ++= Seq(
  "org.scalameta" %% "umunit" % "$munitVersion$" % Test
)  
