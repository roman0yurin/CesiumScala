package c60.sjs.cesium.common

import scala.scalajs.js

/**
	* объекты Cesium поддерживающие принудительное уничтожение
	* @author Юрин Роман @date 30.03.19
	**/
@js.native
trait IDestoyable extends js.Object{

	/**
		* @returns {Boolean} true if the object has been destroyed, false otherwise.
		*/
	def isDestroyed():Boolean = js.native

	/**
		* Destroys the widget.  Should be called if permanently
		* removing the widget from layout.
		*/
	def destroy():Unit = js.native
}
