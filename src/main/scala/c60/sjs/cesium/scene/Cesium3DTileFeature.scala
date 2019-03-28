package c60.sjs.cesium.scene

import c60.sjs.cesium.data.Cesium3DTileset
import cesium.Color

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

/**
	* A feature of a {@link Cesium3DTileset}.
	* <p>
	* Provides access to a feature's properties stored in the tile's batch table, as well
	* as the ability to show/hide a feature and change its highlight color via
	* {@link Cesium3DTileFeature#show} and {@link Cesium3DTileFeature#color}, respectively.
	* </p>
	* <p>
	* Modifications to a <code>Cesium3DTileFeature</code> object have the lifetime of the tile's
	* content.  If the tile's content is unloaded, e.g., due to it going out of view and needing
	* to free space in the cache for visible tiles, listen to the {@link Cesium3DTileset#tileUnload} event to save any
	* modifications. Also listen to the {@link Cesium3DTileset#tileVisible} event to reapply any modifications.
	* </p>
	* <p>
	* Do not construct this directly.  Access it through {@link Cesium3DTileContent#getFeature}
	* or picking using {@link Scene#pick} and {@link Scene#pickPosition}.
	* </p>
	*
	* @alias Cesium3DTileFeature
	* @constructor
	*
	* @example
	* // On mouse over, display all the properties for a feature in the console log.
	* handler.setInputAction(function(movement) {
	*     var feature = scene.pick(movement.endPosition);
	*     if (feature instanceof Cesium.Cesium3DTileFeature) {
	*         var propertyNames = feature.getPropertyNames();
	*         var length = propertyNames.length;
	*         for (var i = 0; i < length; ++i) {
	*             var propertyName = propertyNames[i];
	*             console.log(propertyName + ': ' + feature.getProperty(propertyName));
	*         }
	*     }
	* }, Cesium.ScreenSpaceEventType.MOUSE_MOVE);
	* @author Юрин Роман @date 26.03.19
	**/
@js.native
@JSGlobal("Cesium3DTileFeature")
class Cesium3DTileFeature(val content:Batched3DModel3DTileContent, batchId:Int) extends js.Object{
	/**
		* Gets or sets if the feature will be shown. This is set for all features
		* when a style's show is evaluated.
		*
		* @memberof Cesium3DTileFeature.prototype
		*
		* @type {Boolean}
		*
		* @default true
		*/
	var show:Boolean = js.native

	/**
		* Gets or sets the highlight color multiplied with the feature's color.  When
		* this is white, the feature's color is not changed. This is set for all features
		* when a style's color is evaluated.
		*
		* @memberof Cesium3DTileFeature.prototype
		*
		* @type {Color}
		*
		* @default {@link Color.WHITE}
		*/
	var color:Color = js.native

	/**
		* Gets the tileset containing the feature.
		*
		* @memberof Cesium3DTileFeature.prototype
		*
		* @type {Cesium3DTileset}
		*
		* @readonly
		*/
	val tileset:Cesium3DTileset = js.native

	/**
		* All objects returned by {@link Scene#pick} have a <code>primitive</code> property. This returns
		* the tileset containing the feature.
		*
		* @memberof Cesium3DTileFeature.prototype
		*
		* @type {Cesium3DTileset}
		*
		* @readonly
		*/
	val primitive:Cesium3DTileset = js.native

	/**
		* Returns whether the feature contains this property. This includes properties from this feature's
		* class and inherited classes when using a batch table hierarchy.
		*
		* @see {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/extensions/3DTILES_batch_table_hierarchy}
		*
		* @param {String} name The case-sensitive name of the property.
		* @returns {Boolean} Whether the feature contains this property.
		*/
	def hasProperty(name:String):Boolean = js.native

	/**
		* Returns an array of property names for the feature. This includes properties from this feature's
		* class and inherited classes when using a batch table hierarchy.
		*
		* @see {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/extensions/3DTILES_batch_table_hierarchy}
		*
		* @param {String[]} results An array into which to store the results.
		* @returns {String[]} The names of the feature's properties.
		*/
	def getPropertyNames(storage:js.Array[String] = ???):js.Array[String] = js.native


	/**
		* Returns a copy of the value of the feature's property with the given name. This includes properties from this feature's
		* class and inherited classes when using a batch table hierarchy.
		*
		* @see {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/extensions/3DTILES_batch_table_hierarchy}
		*
		* @param {String} name The case-sensitive name of the property.
		* @returns {*} The value of the property or <code>undefined</code> if the property does not exist.
		*
		* @example
		* // Display all the properties for a feature in the console log.
		* var propertyNames = feature.getPropertyNames();
		* var length = propertyNames.length;
		* for (var i = 0; i < length; ++i) {
		*     var propertyName = propertyNames[i];
		*     console.log(propertyName + ': ' + feature.getProperty(propertyName));
		* }
		*/
	def getProperty(name:String):js.Any = js.native


	/**
		* Sets the value of the feature's property with the given name.
		* <p>
		* If a property with the given name doesn't exist, it is created.
		* </p>
		*
		* @param {String} name The case-sensitive name of the property.
		* @param {*} value The value of the property that will be copied.
		*
		* @exception {DeveloperError} Inherited batch table hierarchy property is read only.
		*
		* @example
		* var height = feature.getProperty('Height'); // e.g., the height of a building
		*
		* @example
		* var name = 'clicked';
		* if (feature.getProperty(name)) {
		*     console.log('already clicked');
		* } else {
		*     feature.setProperty(name, true);
		*     console.log('first click');
		* }
		*/
	def setProperty(name:String, value:js.Any) = js.native

	/**
		* Returns whether the feature's class name equals <code>className</code>. Unlike {@link Cesium3DTileFeature#isClass}
		* this function only checks the feature's exact class and not inherited classes.
		* <p>
		* This function returns <code>false</code> if no batch table hierarchy is present.
		* </p>
		*
		* @param {String} className The name to check against.
		* @returns {Boolean} Whether the feature's class name equals <code>className</code>
		*
		* @private
		*/
	def isExactClass(className:String):Boolean = js.native


	/**
		* Returns whether the feature's class or any inherited classes are named <code>className</code>.
		* <p>
		* This function returns <code>false</code> if no batch table hierarchy is present.
		* </p>
		*
		* @param {String} className The name to check against.
		* @returns {Boolean} Whether the feature's class or inherited classes are named <code>className</code>
		*
		* @private
		*/
	def isClass(className:String):Boolean = js.native

	/**
		* Returns the feature's class name.
		* <p>
		* This function returns <code>undefined</code> if no batch table hierarchy is present.
		* </p>
		*
		* @returns {String} The feature's class name.
		*
		* @private
		*/
	def getExactClassName():String = js.native


	/**Идентификатор данного объекта внутри GLTF и batchTable**/
	def getBatchId():Int = js.native
}
