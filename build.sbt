
enablePlugins(ScalaJSPlugin)

name := "cesiumscala"

organization := "com.github.workingDog"
scalaSource in Compile := baseDirectory.value / "src/main/scala"


scalaVersion := "2.12.2"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

homepage := Some(url("https://github.com/workingDog/CesiumScala"))
licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

