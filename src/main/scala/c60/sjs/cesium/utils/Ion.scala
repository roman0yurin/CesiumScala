package c60.sjs.cesium.utils

import c60.sjs.cesium.data.{Cesium3DTileset, Resource}
import cesium.ImageryProvider

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, ScalaJSDefined}
import scala.scalajs.js.Promise
/**
* Utility object for working with the Cesium ion API.
* @experimental This class is part of Cesium ion beta functionality and may change without our normal deprecation policy.
*/
@JSGlobal("Cesium.CesiumIon")
@js.native
object Ion extends js.Object{

	/**
	* The default Cesium ion access token to use.
	*/
	var defaultAccessToken:String = js.native

	/**
		* The default Cesium ion server to use.
		*/
	var defaultServerUrl:String = js.native

	/**
		* Asynchronously creates a {@link Resource} representing a Cesium ion asset.
		*
		* @param assetId The Cesium ion asset id.
		* @param [options] An object with the following properties:
		* param {String} [options.accessToken=CesiumIon.defaultAccessToken] The access token to use.
		* param {String} [options.serverUrl=CesiumIon.defaultServerUrl] The url to the Cesium ion API server.
		* @returns {Promise.<Resource>} A Promise to a Resource representing the Cesium ion Asset.
		*
		* @example
		* //Load a Cesium3DTileset with asset ID of 124624234
		* Cesium.CesiumIon.createResource(124624234)
		*   .then(function (resource) {
		*     viewer.scene.primitives.add(new Cesium.Cesium3DTileset({ url: resource }));
		* });
		*
		* @example
		* //Load a CZML file with asset ID of 10890
		* Cesium.CesiumIon.createResource(10890)
		*   .then(function (resource) {
		*     viewer.dataSources.add(Cesium.CzmlDataSource.load(resource));
		*   });
		*
		* @example
		* //Load an ImageryProvider with asset ID of 2347923
		* Cesium.CesiumIon.createResource(2347923)
		*   .then(function (resource) {
		*     viewer.imageryLayers.addProvider(Cesium.createTileMapServiceImageryProvider({url : resource }));
		*   });
	*/
	def createResource(assetId:Int, options:js.UndefOr[js.Dynamic] = js.undefined): Promise[Resource] = js.native

	/**
		* These values are the unofficial list of supported external imagery
    * assets in the Cesium ion beta. They are subject to change.
		*/
	var ImageryProviderMapping:js.Object = js.native

	/**
		* Asynchronously creates an {@link ImageryProvider} representing a Cesium ion imagery asset and
		* waits for it to become ready. Unlike {@link CesiumIon.createResource}, this function supports
		* external asset functionality.
		*
		* @param  assetId The Cesium ion asset id..
		* @returns {Promise<ImageryProvider>} A promise to a ready imagery provider representing the requested Cesium ion Asset.
		*
		* @example
		* //Load an ImageryProvider with asset ID of 2347923
		* Cesium.CesiumIon.createImageryProvider(2347923)
		*   .then(function (imageryProvider) {
		*     viewer.imageryLayers.addProvider(imageryProvider);
		*   });
		*/
	def createImageryProvider(assetId:Int, options:js.UndefOr[js.Dynamic] = js.undefined):Promise[ImageryProvider] = js.native
}

