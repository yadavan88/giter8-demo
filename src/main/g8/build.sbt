// give the user a nice default project!
ThisBuild / organization := "com.yadavan88"
ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file(".")).
  settings(
    name := "scala-app-package"
  )
