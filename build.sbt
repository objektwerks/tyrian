enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "tyrian"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.1-RC2"
libraryDependencies ++= Seq(
  "io.indigoengine" %%% "tyrian" % "0.6.0",
  "org.scalameta"   %%% "munit"  % "0.7.29" % Test
)
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
