# Scala.js interface to Cesium.js

[Cesium](http://cesiumjs.org/) is a JavaScript library for creating 3D globes and 2D maps in a web browser without a plugin. 
It uses WebGL for hardware-accelerated graphics, and is cross-platform, cross-browser, 
and tuned for dynamic-data visualization. 

This library, **cesiumscala**, is a Scala.js façade to Cesium.js.
Cesium client applications can now be written in [Scala](http://www.scala-lang.org/) and compiled into javascript
using [Scala.js](https://www.scala-js.org/).

## Usage

I recommend using the latest SNAPSHOT version as it includes bug fixes and improvements. To do that
you can use "sbt publishLocal" see below.

To use the last release add the following dependency to your build.sbt:

    libraryDependencies += "com.github.workingDog" %%% "cesiumscala" % "1.1"

To run the basic [CesiumApp](https://github.com/workingDog/CesiumScala/blob/master/src/main/scala/CesiumApp.scala)
you can install and run Cesium.js locally. Refer to [Cesium tutorial](https://cesiumjs.org/tutorials/cesium-up-and-running/) for how to
install and launch Cesium.

Typical steps to run **CesiumApp**:

  - Download and install Cesium.
  - Compile and generate **cesiumscala**, using "sbt fullOptJS". This will generate "cesiumscala-opt.js" in the "./target/scala-2.11" directory.
  - Put "CesiumScala.html" and "cesiumscala-opt.js" files in the "Cesium/Apps" directory and
  - launch Cesium (e.g. "node server.js").
  - Then point your browser to http://localhost:8080/Apps/CesiumScala.html

A 3D world globe with an aircraft and various shapes should be displayed in your browser. If the globe is not showing, you may need
to get a [Bing Map key](https://www.bingmapsportal.com/) and put it in the CesiumScala.html.

This library makes extensive use of [jsext](https://github.com/jducoeur/jsext) JSOptionBuilder for
defining "options" objects. Here these objects are named "class-name + Options". For example:

    class ModelGraphics(options: ModelGraphicsOptions)

See the example **CesiumApp** and [Using the JSOptionBuilder](https://github.com/jducoeur/jsext#using-the-jsoptionbuilder) documentation
to learn how to define these "options" objects using **jsext**.

## Compiling, packaging and publishing

To compile and generate a jar file from the source code:

    sbt package

The jar file (cesiumscala_sjs0.6_2.11-1.2-SNAPSHOT.jar) will be in the "./target/scala-2.11" directory.

To publish **cesiumscala** to your local (Ivy) repository, simply type:

    sbt publishLocal

Then put this in your build.sbt

 libraryDependencies += "com.github.workingDog" %%% "cesiumscala" % "1.2-SNAPSHOT"

## Dependencies code inclusions

The code from [jsext](https://github.com/jducoeur/jsext) relating to JSOptionBuilder is used in **cesiumscala** and
is included here (verbatim) rather than as an external dependency.

**cesiumscala** also depends on [scala-js-dom](https://github.com/scala-js/scala-js-dom), see also build.sbt.

## References

1) [Scala.js](https://www.scala-js.org/)

2) [Cesium](https://cesiumjs.org/)

3) [scala-js-ts-importer](https://github.com/sjrd/scala-js-ts-importer)

4) [JSDoc](http://usejsdoc.org/)

## Documentations

Scaladoc documentations can be generated by typing:

    sbt doc

Refer to [Cesium API reference](https://cesiumjs.org/refdoc.html) for the original Cesium documentation.

## License

**cesiumscala** is licensed under the terms of the [Apache v2.0 license](http://www.apache.org/licenses/LICENSE-2.0).

## Status

ongoing work, need testing



