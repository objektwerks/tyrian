import scala.sys.process._

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val tyrian =
  (project in file("."))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      name         := "tryian",
      version      := "0.0.1",
      scalaVersion := "3.1.2",
      organization := "objektwerks",
      libraryDependencies ++= Seq(
        "io.indigoengine" %%% "tyrian" % "0.3.2",
        "org.scalameta"   %%% "munit"  % "0.7.29" % Test
      ),
      testFrameworks += new TestFramework("munit.Framework"),
      scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) },
    )