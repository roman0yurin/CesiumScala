package c60.sjs.cesium.render

import cesium.{BoundingRectangle, Cartesian3, Matrix4}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

/**
	* Фасад над классом Cesium, который хранит набор значений для заполнения униформ переменных шейдеров.
	* Например, матрицы перехода, положение камеры, область экрана.
	*
	* @author Андрей Палкин @date 08.06.21
	**/
@js.native
@JSGlobal("UniformState")
class UniformState() extends js.Object {
	@JSName("_cameraPosition")
	val cameraPosition: Cartesian3 = js.native

	/** Model-view-projection relative to eye matrix. **/
	val modelViewProjectionRelativeToEye: Matrix4 = js.native

	/** Область экрана, в которую рендерится кадр **/
	val viewport: BoundingRectangle = js.native
}
