ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"
libraryDependencies += "org.scalamock" %% "scalamock" % "5.1.0" % Test
libraryDependencies += "org.mockito" % "mockito-scala_2.13" % "1.17.5"
libraryDependencies += "org.mockito" % "mockito-scala-scalatest_2.13" % "1.17.5"

lazy val root = (project in file("."))
  .settings(
    name := "puzzlers"
  )
