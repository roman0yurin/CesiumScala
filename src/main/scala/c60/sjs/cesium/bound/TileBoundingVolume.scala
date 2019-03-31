package c60.sjs.cesium.bound

import c60.sjs.cesium.render.FrameState
import cesium._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

/**
	*  Defines a bounding volume for a tile. This type describes an interface
	* and is not intended to be instantiated directly.
	*
	* @see TileBoundingRegion
	* @see TileBoundingSphere
	* @see TileOrientedBoundingBox
	* @author Юрин Роман @date 30.03.19
	**/
@js.native
@JSGlobal("TileBoundingVolume")
class TileBoundingVolume extends js.Object {

	/**
		* Calculates the distance between the tile and the camera.
		*
		* @param {FrameState} frameState The frame state.
		* @return {Number} The distance between the tile and the camera, in meters.
		*                  Returns 0.0 if the camera is inside the tile.
		*/
	def distanceToCamera(frameState:FrameState):Double = js.native


	/**
		* Determines which side of a plane this volume is located.
		*
		* @param {Plane} plane The plane to test against.
		* @returns {Intersect} {@link Intersect.INSIDE} if the entire volume is on the side of the plane
		*                      the normal is pointing, {@link Intersect.OUTSIDE} if the entire volume is
		*                      on the opposite side, and {@link Intersect.INTERSECTING} if the volume
		*                      intersects the plane.
		*/
	def intersectPlane(plane:Plane):Int =js.native

	/**
		* Creates a debug primitive that shows the outline of the tile bounding
		* volume.
		*
		* @param {Color} color The desired color of the primitive's mesh
		* @return {Primitive}
		*/
	def createDebugVolume(color:Color):Primitive = js.native


	/**
		* The underlying bounding sphere.
		*
		* @memberof TileBoundingVolume.prototype
		*
		* @type {BoundingSphere}
		* @readonly
		*/
	def boundingSphere:BoundingSphere = js.native


	/**
		* The underlying bounding volume.
		*
		* @memberof TileBoundingVolume.prototype
		*
		* @type {Object}
		* @readonly
		*/
	def boundingVolume:js.Dynamic =js.native
}
