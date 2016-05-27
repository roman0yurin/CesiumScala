
import cesium.Viewer._
import cesium.{Matrix4, ModelGraphics, Primitive, PrimitiveOptions, _}
import org.scalajs.dom._
import org.scalajs.dom
import dom.document
import dom.window

import scala.scalajs.js.{JSApp, JSON}


/**
  * a basic test app for using CesiumScala.
  *
  * to compile and generate CesiumScala, type "sbt fastOptJS".
  * This will generate "cesiumscala-fastopt.js" in the "./js directory".
  * Put "CesiumScala.html" and "cesiumscala-fastopt.js" files in the "Cesium/Apps" directory and
  * launch Cesium (node server.js).
  * Then point your browser to http://localhost:8080/Apps/CesiumScala.html
  *
  * P.S
  * you should get a key for Bing Map, see: https://www.bingmapsportal.com/
  * and put it in the CesiumScala.html.
  */
object CesiumApp extends JSApp {
  def main(): Unit = {
    Console.println("---> hello from CesiumApp")

    // launch the Cesium viewer
    val viewer = new Viewer("cesiumContainer")

    def createModel(url: String, height: Double) = {
      val position = Cartesian3.fromDegrees(-123.0744619, 44.0503706, height)
      val orientation = Transforms.headingPitchRollQuaternion(position, Math.toRadians(135), 0, 0)
      val entity = viewer.entities.add(new Entity(
        EntityOptions.name(url).position(new ConstantPositionProperty(position)).
          orientation(new ConstantProperty(orientation)).
          model(new ModelGraphics(
            ModelGraphicsOptions.uri(new ConstantProperty(url)).
              minimumPixelSize(new ConstantProperty(128)).maximumScale(new ConstantProperty(20000)))))
      )
      viewer.trackedEntity = entity
    }

    createModel("./SampleData/models/CesiumAir/Cesium_Air.glb", 5000.0)
  }
}

