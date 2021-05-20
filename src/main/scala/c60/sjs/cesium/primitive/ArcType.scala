package c60.sjs.cesium.primitive

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	* ArcType defines the path that should be taken connecting vertices.
	*
	* @enum {Number}
	*
	* @author Андрей Палкин @date 29.04.21
	**/
@JSGlobal("Cesium.ArcType")
@js.native
object ArcType extends js.Object {
	/**
		* Straight line that does not conform to the surface of the ellipsoid.
		*
		* @type {Number}
		* @constant
		*/
	val NONE: Int = js.native

	/**
		* Follow geodesic path.
		*
		* @type {Number}
		* @constant
		*/
	val GEODESIC: Int = js.native

	/**
		* Follow rhumb or loxodrome path.
		*
		* @type {Number}
		* @constant
		*/
	val RHUMB: Int = js.native

}
