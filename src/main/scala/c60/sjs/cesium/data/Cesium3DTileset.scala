package c60.sjs.cesium.data

import c60.sjs.cesium.style.Cesium3DTileStyle
import cesium._

import scala.scalajs.js.Promise
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("Cesium.Cesium3DTileset")
class Cesium3DTileset(options: js.Object) extends js.Object{ //TODO расписать опции

	/**
		* Gets the tileset's asset object property, which contains metadata about the tileset.
		* <p>
		* See the {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/blob/master/schema/asset.schema.json|asset schema}
		* in the 3D Tiles spec for the full set of properties.
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Object}
		* @readonly
		*
		* @exception {DeveloperError} The tileset is not loaded.  Use Cesium3DTileset.readyPromise or wait for Cesium3DTileset.ready to be true.
		*/
	var asset:Object = js.native

	/**
		* Gets the tileset's properties dictionary object, which contains metadata about per-feature properties.
		* <p>
		* See the {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/blob/master/schema/properties.schema.json|properties schema}
		* in the 3D Tiles spec for the full set of properties.
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Object}
		* @readonly
		*
		* @exception {DeveloperError} The tileset is not loaded.  Use Cesium3DTileset.readyPromise or wait for Cesium3DTileset.ready to be true.
		*
		* @example
		* console.log('Maximum building height: ' + tileset.properties.height.maximum);
		* console.log('Minimum building height: ' + tileset.properties.height.minimum);
		*
		* @see Cesium3DTileFeature#getProperty
		* @see Cesium3DTileFeature#setProperty
		*/
	var properties:Object = js.native

	/**
		* When <code>true</code>, the tileset's root tile is loaded and the tileset is ready to render.
		* This is set to <code>true</code> right before {@link Cesium3DTileset#readyPromise} is resolved.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @default false
		*/
	var ready:Boolean = js.native

	/**
		* Gets the promise that will be resolved when the tileset's root tile is loaded and the tileset is ready to render.
		* <p>
		* This promise is resolved at the end of the frame before the first frame the tileset is rendered in.
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Promise.<Cesium3DTileset>}
		* @readonly
		*
		* @example
		* tileset.readyPromise.then(function(tileset) {
		*     // tile.properties is not defined until readyPromise resolves.
		*     var properties = tileset.properties;
		*     if (Cesium.defined(properties)) {
		*         for (var name in properties) {
		*             console.log(properties[name]);
		*         }
		*     }
		* });
		*/
	var readyPromise:Promise[Cesium3DTileset] = js.native

	/**
		* When <code>true</code>, all tiles that meet the screen space error this frame are loaded. The tileset is
		* completely loaded for this view.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Boolean}
		* @readonly
		*
		* @default false
		*
		* @see Cesium3DTileset#allTilesLoaded
		*/
	var tilesLoaded:Boolean = js.native

	/**
		* The url to a tileset.json file or to a directory containing a tileset.json file.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {String}
		* @readonly
		*/
	var url:String = js.native

	/**
		* The base path that non-absolute paths in tileset.json are relative to.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {String}
		* @readonly
		* @deprecated
		*/
	var basePath:String = js.native


	/**
		* The style, defined using the
		* {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/Styling|3D Tiles Styling language},
		* applied to each feature in the tileset.
		* <p>
		* Assign <code>undefined</code> to remove the style, which will restore the visual
		* appearance of the tileset to its default when no style was applied.
		* </p>
		* <p>
		* The style is applied to a tile before the {@link Cesium3DTileset#tileVisible}
		* event is raised, so code in <code>tileVisible</code> can manually set a feature's
		* properties (e.g. color and show) after the style is applied. When
		* a new style is assigned any manually set properties are overwritten.
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Cesium3DTileStyle}
		*
		* @default undefined
		*
		* @example
		* tileset.style = new Cesium.Cesium3DTileStyle({
		*    color : {
		*        conditions : [
		*            ['${Height} >= 100', 'color("purple", 0.5)'],
		*            ['${Height} >= 50', 'color("red")'],
		*            ['true', 'color("blue")']
		*        ]
		*    },
		*    show : '${Height} > 0',
		*    meta : {
		*        description : '"Building id ${id} has height ${Height}."'
		*    }
		* });
		*
		* @see {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/Styling|3D Tiles Styling language}
		*/
	var style:Cesium3DTileStyle = js.native


	/**
		* The maximum screen space error used to drive level of detail refinement.  This value helps determine when a tile
		* refines to its descendants, and therefore plays a major role in balancing performance with visual quality.
		* <p>
		* A tile's screen space error is roughly equivalent to the number of pixels wide that would be drawn if a sphere with a
		* radius equal to the tile's <b>geometric error</b> were rendered at the tile's position. If this value exceeds
		* <code>maximumScreenSpaceError</code> the tile refines to its descendants.
		* </p>
		* <p>
		* Depending on the tileset, <code>maximumScreenSpaceError</code> may need to be tweaked to achieve the right balance.
		* Higher values provide better performance but lower visual quality.
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Number}
		* @default 16
		*
		* @exception {DeveloperError} <code>maximumScreenSpaceError</code> must be greater than or equal to zero.
		*/
	var maximumScreenSpaceError:Float = js.native


	/**
		* The maximum amount of GPU memory (in MB) that may be used to cache tiles. This value is estimated from
		* geometry, textures, and batch table textures of loaded tiles. For point clouds, this value also
		* includes per-point metadata.
		* <p>
		* Tiles not in view are unloaded to enforce this.
		* </p>
		* <p>
		* If decreasing this value results in unloading tiles, the tiles are unloaded the next frame.
		* </p>
		* <p>
		* If tiles sized more than <code>maximumMemoryUsage</code> are needed
		* to meet the desired screen space error, determined by {@link Cesium3DTileset#maximumScreenSpaceError},
		* for the current view, then the memory usage of the tiles loaded will exceed
		* <code>maximumMemoryUsage</code>.  For example, if the maximum is 256 MB, but
		* 300 MB of tiles are needed to meet the screen space error, then 300 MB of tiles may be loaded.  When
		* these tiles go out of view, they will be unloaded.
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Number}
		* @default 512
		*
		* @exception {DeveloperError} <code>maximumMemoryUsage</code> must be greater than or equal to zero.
		* @see Cesium3DTileset#totalMemoryUsageInBytes
		*/
	var maximumMemoryUsage:Int = js.native

	/**
		* The tileset's bounding sphere.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {BoundingSphere}
		* @readonly
		*
		* @exception {DeveloperError} The tileset is not loaded.  Use Cesium3DTileset.readyPromise or wait for Cesium3DTileset.ready to be true.
		*
		* @example
		* var tileset = viewer.scene.primitives.add(new Cesium.Cesium3DTileset({
		*     url : 'http://localhost:8002/tilesets/Seattle'
		* }));
		*
		* tileset.readyPromise.then(function(tileset) {
		*     // Set the camera to view the newly added tileset
		*     viewer.camera.viewBoundingSphere(tileset.boundingSphere, new Cesium.HeadingPitchRange(0, -0.5, 0));
		* });
		*/
	var boundingSphere:BoundingSphere = js.native

	/**
		* A 4x4 transformation matrix that transforms the entire tileset.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Matrix4}
		* @default Matrix4.IDENTITY
		*
		* @example
		* // Adjust a tileset's height from the globe's surface.
		* var heightOffset = 20.0;
		* var boundingSphere = tileset.boundingSphere;
		* var cartographic = Cesium.Cartographic.fromCartesian(boundingSphere.center);
		* var surface = Cesium.Cartesian3.fromRadians(cartographic.longitude, cartographic.latitude, 0.0);
		* var offset = Cesium.Cartesian3.fromRadians(cartographic.longitude, cartographic.latitude, heightOffset);
		* var translation = Cesium.Cartesian3.subtract(offset, surface, new Cesium.Cartesian3());
		* tileset.modelMatrix = Cesium.Matrix4.fromTranslation(translation);
		*/
	var modelMatrix:Matrix4 = js.native

	/**
		* Returns the time, in milliseconds, since the tileset was loaded and first updated.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Number}
		* @readonly
		*/
	var timeSinceLoad:Long = js.native

	/**
		* The total amount of GPU memory in bytes used by the tileset. This value is estimated from
		* geometry, texture, and batch table textures of loaded tiles. For point clouds, this value also
		* includes per-point metadata.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Number}
		* @readonly
		*
		* @see Cesium3DTileset#maximumMemoryUsage
		*/
	var totalMemoryUsageInBytes:Long = js.native

	/**
		* Determines whether terrain, 3D Tiles or both will be classified by this tileset.
		* <p>
		* This option is only applied to tilesets containing batched 3D models, geometry data, or vector data. Even when undefined, vector data and geometry data
		* must render as classifications and will default to rendering on both terrain and other 3D Tiles tilesets.
		* </p>
		* <p>
		* When enabled for batched 3D model tilesets, there are a few requirements/limitations on the glTF:
		* <ul>
		*     <li>POSITION and _BATCHID semantics are required.</li>
		*     <li>All indices with the same batch id must occupy contiguous sections of the index buffer.</li>
		*     <li>All shaders and techniques are ignored. The generated shader simply multiplies the position by the model-view-projection matrix.</li>
		*     <li>The only supported extensions are CESIUM_RTC and WEB3D_quantized_attributes.</li>
		*     <li>Only one node is supported.</li>
		*     <li>Only one mesh per node is supported.</li>
		*     <li>Only one primitive per mesh is supported.</li>
		* </ul>
		* </p>
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {ClassificationType}
		* @default undefined
		*
		* @experimental This feature is using part of the 3D Tiles spec that is not final and is subject to change without Cesium's standard deprecation policy.
		* @readonly
		*/
	var classificationType:Int = js.native

	/**
		* Gets an ellipsoid describing the shape of the globe.
		*
		* @memberof Cesium3DTileset.prototype
		*
		* @type {Ellipsoid}
		* @readonly
		*/
	var ellipsoid:Ellipsoid = js.native

	/**
		* Provides a hook to override the method used to request the tileset json
		* useful when fetching tilesets from remote servers
		* @param {Resource|String} tilesetUrl The url of the json file to be fetched
		* @returns {Promise.<Object>} A promise that resolves with the fetched json data
		*/
	def loadJson(url: Resource | String):Promise[js.Object] = js.native

	/**
		* Marks the tileset's {@link Cesium3DTileset#style} as dirty, which forces all
		* features to re-evaluate the style in the next frame each is visible.
		*/
	def makeStyleDirty():Unit = js.native

}
