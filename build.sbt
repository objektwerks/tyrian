enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "tyrian"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.7.2"
libraryDependencies ++= Seq(
  "io.indigoengine" %%% "tyrian" % "0.3.2", // Dont' ever upgrade!!! Massive rewrite!!!
  "org.scalameta"   %%% "munit"  % "1.1.1" % Test
)
scalacOptions ++= Seq(
  "-Wunused:all"
)
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
