package c60.sjs.cesium.scene

import cesium.Color

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	* Описывает абстрактный источник света
	* @author Юрин Роман 14.01.21
	**/
@js.native
@JSGlobal("Cesium.Light")
abstract class Light extends js.Object{

	/**Окраска источника освещения**/
	var color:Color = js.native

	/**Интенсивность освещения**/
	var intensity:Double = js.native
}
