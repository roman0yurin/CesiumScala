package c60.sjs.cesium.style

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//TODO описать содержимое фасада

/**
	* A style that is applied to a {@link Cesium3DTileset}.
	* <p>
	* Evaluates an expression defined using the
	* {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/Styling|3D Tiles Styling language}.
	* </p>
	*
	* @alias Cesium3DTileStyle
	* @constructor
	*
	* @param {Resource|String|Object} [style] The url of a style or an object defining a style.
	*
	* @example
	* tileset.style = new Cesium.Cesium3DTileStyle({
	*     color : {
	*         conditions : [
	*             ['${Height} >= 100', 'color("purple", 0.5)'],
	*             ['${Height} >= 50', 'color("red")'],
	*             ['true', 'color("blue")']
	*         ]
	*     },
	*     show : '${Height} > 0',
	*     meta : {
	*         description : '"Building id ${id} has height ${Height}."'
	*     }
	* });
	*
	* @example
	* tileset.style = new Cesium.Cesium3DTileStyle({
	*     color : 'vec4(${Temperature})',
	*     pointSize : '${Temperature} * 2.0'
	* });
	*
	* @see {@link https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/Styling|3D Tiles Styling language}
	*/
@js.native
@JSGlobal("Cesium.Cesium3DTileStyle")
class Cesium3DTileStyle(style:js.Object) extends js.Object{

}
