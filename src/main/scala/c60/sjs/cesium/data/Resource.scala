package c60.sjs.cesium.data

import cesium._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}
import scala.scalajs.js.|

@js.native
@JSGlobal("Cesium.Resource")
class Resource(options: ResourceOptions | String ) extends js.Object{

	var xhrBlobSupported:js.Function0[Boolean] = js.native

	/**
		* Returns true if blobs are supported.
		*/
	var isBlobSupported:Boolean = js.native

	/**
	* Query parameters appended to the url.
	*/
	var queryParameters:js.Object = js.native

	/**
		* The key/value pairs used to replace template parameters in the url.
		*/
	var templateValues:js.Object = js.native

	/**
		* The url to the resource with template values replaced, query string appended and encoded by proxy if one was set.
		*/
	var url:String = js.native

	/**
		* The file extension of the resource.
		*/
	var extension:String = js.native

	/**
		* True if the Resource refers to a data URI.
		*/
	var isDataUri:Boolean = js.native

	/**
		* True if the Resource refers to a blob URI.
		*/
	var isBlobUri:Boolean = js.native

	/**
		* True if the Resource refers to a cross origin URL.
		*/
	var isCrossOriginUrl:Boolean = js.native

	/**
		* True if the Resource has request headers. This is equivalent to checking if the headers property has any keys.
		*/
	var hasHeaders:Boolean = js.native
}

/**
* Набор параметров для конструирования ресурса
*/
@ScalaJSDefined
class ResourceOptions extends js.Object{
	/**
		* The url of the resource.
		*/
	var url:String = _

	/**
		*  An object containing query parameters that will be sent when retrieving the resource.
		*/
	var queryParameters:js.Object = _

	/**
		* Key/Value pairs that are used to replace template values (eg. {x}).
		*/
	var templateValues:js.Object = _

	/**
		* Additional HTTP headers that will be sent.
		*/
	var headers:js.Object = _
	/**A proxy to be used when loading the resource.**/
	var proxy:Proxy = _

	/**
		* The Function to call when a request for this resource fails. If it returns true, the request will be retried.
		*/
	var retryCallback:js.Function0[Boolean] = _

	/**
		* The number of times the retryCallback should be called before giving up.
		*/
	var retryAttempts:Int = _

	/**
		* A Request object that will be used. Intended for internal use only.
		*/
	var request:js.Object = _
}
