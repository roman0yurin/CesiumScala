package c60.sjs.cesium.scene

import c60.sjs.cesium.data.Cesium3DTileset

import scala.scalajs.js

/**
	* Represents the contents of a
	* {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/specification/TileFormats/Batched3DModel|Batched 3D Model}
	* tile in a {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/specification|3D Tiles} tileset.
	* <p>
	* Implements the {@link Cesium3DTileContent} interface.
	* </p>
	*
	* @alias Batched3DModel3DTileContent
	* @constructor
	* @author Юрин Роман @date 27.03.19
	**/
@js.native
trait Batched3DModel3DTileContent extends js.Object{
	def featuresLength:Int = js.native

	def pointsLength:Int = js.native

	def trianglesLength:Int = js.native


	def geometryByteLength:Int =js.native

	def texturesByteLength:Int = js.native


	def batchTableByteLength:Int = js.native

	def tileset:Cesium3DTileset = js.native

	def tile:Cesium3dTile = js.native

	def url:String = js.native

	def batchTable:js.Dynamic = js.native
}
