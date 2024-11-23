enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "tyrian"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.2-RC1"
libraryDependencies ++= Seq(
  "io.indigoengine" %%% "tyrian" % "0.3.2", // Dont' ever upgrade!!! Massive rewrite!!!
  "org.scalameta"   %%% "munit"  % "1.0.2" % Test
)
scalacOptions ++= Seq(
  "-Wall"
)
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
