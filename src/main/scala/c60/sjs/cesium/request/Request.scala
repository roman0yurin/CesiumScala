package c60.sjs.cesium.request

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSGlobal

/**
* @author Юрин Роман 14.02.21
**/
@js.native
@JSGlobal("Cesium.RequestScheduler")
class Request extends js.Object {

	/**
		* Whether to throttle the request by server.
		*/
	var throttleByServer: Boolean = js.native

	/**
	* Whether to throttle and prioritize the request. If false, the request will be sent immediately. If true, the request will be throttled and sent based on priority.
	*/
	var throttle: Boolean = js.native

	/**Адрес запроса**/
	var url:String = js.native

	/**
	* A key used to identify the server that a request is going to. It is derived from the url's authority and scheme.
	*
	* @type {String}
	*
	* @private
	*/
	var serverKey:UndefOr[String] = js.native

	/**
	* The current state of the request.
	*
	* @type {RequestState}
	* @readonly
	*/
	var state:Int = js.native

	/**
		* Whether the request was explicitly cancelled.
		*/
	var cancelled:Boolean = js.native


	/**
	* Priority is a unit-less value where lower values represent higher priority.
	* For world-based objects, this is usually the distance from the camera.
	* A request that does not have a priority function defaults to a priority of 0.
	*
	* If priorityFunction is defined, this value is updated every frame with the result of that call.
	*
	* @type {Number}
	* @default 0.0
	*/
	var priority:Float = js.native
}
