name := "cesiumscala"
version := "1.7"

organization := "com.github.workingDog"
scalaVersion := "2.12.2"

enablePlugins(ScalaJSPlugin)
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"


homepage := Some(url("https://github.com/workingDog/CesiumScala"))
licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

