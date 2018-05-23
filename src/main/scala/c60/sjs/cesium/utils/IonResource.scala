package c60.sjs.cesium.utils

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSGlobal

/**
	* @author Юрин Роман @date 24.05.18.
	*/
/**
	* A {@link Resource} instance that encapsulates Cesium ion asset access.
	* This object is normally not instantiated directly, use {@link IonResource.fromAssetId}.
	*
	* @alias IonResource
	* @constructor
	* @augments Resource
	*
	* @param {Object} endpoint The result of the Cesium ion asset endpoint service.
	* @param {Resource} endpointResource The resource used to retreive the endpoint.
	*
	* @see Ion
	* @see IonImageryProvider
	* @see createWorldTerrain
	* @see https://cesium.com
	*/
//TODO Дополнить при необходимости
@JSGlobal("Cesium.IonResource")
@js.native
object IonResource extends js.Object {


	/**
		* Asynchronously creates an instance.
		*
		* @param {Number} assetId The Cesium ion asset id.
		* @param {Object} [options] An object with the following properties:
		* @param {String} [options.accessToken=Ion.defaultAccessToken] The access token to use.
		* @param {String|Resource} [options.server=Ion.defaultServer] The resource to the Cesium ion API server.
		* @returns {Promise.<IonResource>} A Promise to am instance representing the Cesium ion Asset.
		*
		* @example
		* //Load a Cesium3DTileset with asset ID of 124624234
		* viewer.scene.primitives.add(new Cesium.Cesium3DTileset({ url: Cesium.IonResource.fromAssetId(124624234) }));
		*
		* @example
		* //Load a CZML file with asset ID of 10890
		* Cesium.IonResource.fromAssetId(10890)
		*   .then(function (resource) {
		*     viewer.dataSources.add(Cesium.CzmlDataSource.load(resource));
		*   });
		*/
	def fromAssetId(id:Int, options:js.UndefOr[js.Dynamic] = js.undefined):Promise[AnyRef] = js.native
}
