package c60.sjs.cesium.scene

import cesium.Cartesian3

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	* Освещение от заданного направления
	*
	* @author Юрин Роман 14.01.21
	**/
@js.native
@JSGlobal("Cesium.DirectionalLight")
class DirectionalLight(
												/**Откуда идет свет**/
												var direction:Cartesian3 = js.native
											) extends Light {


}
