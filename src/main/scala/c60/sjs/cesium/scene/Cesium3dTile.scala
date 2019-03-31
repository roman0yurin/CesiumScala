package c60.sjs.cesium.scene

import c60.sjs.cesium.bound.TileBoundingVolume
import c60.sjs.cesium.common.IDestoyable
import c60.sjs.cesium.data.Cesium3DTileset
import cesium.{BoundingSphere, Color}

import scala.concurrent.Promise
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	*      * A tile in a {@link Cesium3DTileset}.  When a tile is first created, its content is not loaded;
	* the content is loaded on-demand when needed based on the view.
	* <p>
	* Do not construct this directly, instead access tiles through {@link Cesium3DTileset#tileVisible}.
	* </p>
	* @author Юрин Роман @date 30.03.19
	**/
@js.native
@JSGlobal("Cesium3DTile")
class Cesium3dTile(
									 val tileset:Cesium3DTileset,
									 baseResource:js.Dynamic,
									 header:js.Dynamic,
									 val parent:Cesium3DTileset
									) extends IDestoyable{

	/**
		* The tile's content.  This represents the actual tile's payload,
		* not the content's metadata in the tileset JSON file.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {Cesium3DTileContent}
		* @readonly
		*/
	def content:Batched3DModel3DTileContent = js.native

	/**
		* The error, in meters, introduced if this tile is rendered and its children are not.
		* This is used to compute screen space error, i.e., the error measured in pixels.
		*
		* @type {Number}
		* @readonly
		*/
	def geometricError:Double = js.native

	/**
		* Get the tile's bounding volume.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {TileBoundingVolume}
		* @readonly
		* @private
		*/
	def boundingVolume:TileBoundingVolume = js.native

	/**
		* Get the bounding volume of the tile's contents.  This defaults to the
		* tile's bounding volume when the content's bounding volume is
		* <code>undefined</code>.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {TileBoundingVolume}
		* @readonly
		* @private
		*/
	def contentBoundingVolume:TileBoundingVolume = js.native

	/**
		* Get the bounding sphere derived from the tile's bounding volume.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {BoundingSphere}
		* @readonly
		*/
	def boundingSphere:BoundingSphere = js.native

	/**
		* Returns the <code>extras</code> property in the tileset JSON for this tile, which contains application specific metadata.
		* Returns <code>undefined</code> if <code>extras</code> does not exist.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {*}
		* @readonly
		* @see {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/specification#specifying-extensions-and-application-specific-extras|Extras in the 3D Tiles specification.}
		*/
	def extras:js.Dynamic = js.native

	/**
		* Gets or sets the tile's highlight color.
		*/
	var color:Color = js.native

	/**
		* Determines if the tile has available content to render.  <code>true</code> if the tile's
		* content is ready or if it has expired content that renders while new content loads; otherwise,
		* <code>false</code>.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @private
		*/
	def contentAvailable:Boolean  = js.native

	/**
		* Determines if the tile's content is ready. This is automatically <code>true</code> for
		* tile's with empty content.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @private
		*/
	def contentReady:Boolean = js.native


	/**
		* Determines if the tile's content has not be requested. <code>true</code> if tile's
		* content has not be requested; otherwise, <code>false</code>.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @private
		*/
	def contentUnloaded:Boolean = js.native

	/**
		* Determines if the tile's content is expired. <code>true</code> if tile's
		* content is expired; otherwise, <code>false</code>.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @private
		*/
	def contentExpired:Boolean = js.native

	/**
		* Determines if the tile's content failed to load.  <code>true</code> if the tile's
		* content failed to load; otherwise, <code>false</code>.
		*
		* @memberof Cesium3DTile.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @private
		*/
	def contentFailed:Boolean = js.native



	def contentReadyToProcessPromise:Promise[js.Dynamic] = js.native
	def contentReadyPromise:Promise[js.Dynamic] = js.native

	/**
		* Returns the number of draw commands used by this tile.
		* @return
		*/
	def commandsLength:Int = js.native


	def updateExpireDate(tile:Cesium3dTile):Unit = js.native
}
