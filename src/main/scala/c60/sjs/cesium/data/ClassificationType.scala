package c60.sjs.cesium.data

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("Cesium.ClassificationType")
object ClassificationType extends js.Object {
	/**
		* Only terrain will be classified.
		*
		* @type {Number}
		* @constant
		*/
	val TERRAIN : Int = js.native
	/**
		* Only 3D Tiles will be classified.
		*
		* @type {Number}
		* @constant
		*/
	val CESIUM_3D_TILE: Int = js.native
	/**
		* Both terrain and 3D Tiles will be classified.
		*
		* @type {Number}
		* @constant
		*/
	val BOTH : Int = js.native
}
