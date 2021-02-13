package c60.sjs.cesium.request

import cesium.Event

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSGlobal

/**
* Контроллирует процесс загрузки ресурсов с внешних сервисов, собирает статистику,
* контроллирует количество общих и одновременных запросов.
* @author Юрин Роман 13.02.21
**/
@js.native
@JSGlobal("Cesium.RequestScheduler")
class RequestScheduler extends js.Object{

	/**
	* The maximum number of simultaneous active requests per server. Un-throttled requests or servers specifically
	* listed in {@link requestsByServer} do not observe this limit.
	* @type {Number}
	* @default 6
	*/
	var maximumRequestsPerServer: Int = js.native

	/**
		* The maximum number of simultaneous active requests. Un-throttled requests do not observe this limit.
		* @type {Number}
		* @default 50
		*/
	var maximumRequests: Int = js.native

	/**
	* When true, log statistics to the console every frame
	*/
	var debugShowStatistics: Boolean = js.native

	var requestCompletedEvent:Event = js.native

	/**
	* Функция позволяющая прикладной стороне вставить свою логику для упрвления
	* временем и очередностью запуска запросов.
	* @param request запрос на внешний ресурс
	* @param requestRun беспараметрическая функция, обеспечивающая запуск данного запроса. Запрос завершается, когда завершатеся возвращаемое обещание
	**/
	var customScheduler:js.Function2[Request, js.Function0[js.Promise[js.Any]], Unit] = js.native
}
