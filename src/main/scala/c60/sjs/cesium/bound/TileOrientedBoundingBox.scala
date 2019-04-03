package c60.sjs.cesium.bound

import cesium.{Cartesian3, Matrix3}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	* A tile bounding volume specified as an oriented bounding box.
	* @alias TileOrientedBoundingBox
	* @constructor
	*
	* @param {Cartesian3} [center=Cartesian3.ZERO] The center of the box.
	* @param {Matrix3} [halfAxes=Matrix3.ZERO] The three orthogonal half-axes of the bounding box.
	*                                          Equivalently, the transformation matrix, to rotate and scale a 2x2x2
	*                                          cube centered at the origin.
	*
	* @author Юрин Роман @date 30.03.19
	**/
@js.native
@JSGlobal()
class TileOrientedBoundingBox(center:Cartesian3, halfAxes:Matrix3) extends TileBoundingVolume{


	/**
		* Update the bounding box after the tile is transformed.
		*
		* @param {Cartesian3} center The center of the box.
		* @param {Matrix3} halfAxes The three orthogonal half-axes of the bounding box.
		*                           Equivalently, the transformation matrix, to rotate and scale a 2x2x2
		*                           cube centered at the origin.
		*/
	def update(center:Cartesian3, halfAxes:Matrix3):Unit = js.native
}
