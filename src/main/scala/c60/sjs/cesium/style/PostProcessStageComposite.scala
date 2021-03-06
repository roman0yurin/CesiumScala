package c60.sjs.cesium.style

import c60.sjs.cesium.scene.Cesium3DTileFeature

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


/**
* A collection of {@link PostProcessStage}s or other post-process composite stages that execute together logically.
* <p>
* All stages are executed in the order of the array. The input texture changes based on the value of <code>inputPreviousStageTexture</code>.
* If <code>inputPreviousStageTexture</code> is <code>true</code>, the input to each stage is the output texture rendered to by the scene or of the stage that executed before it.
* If <code>inputPreviousStageTexture</code> is <code>false</code>, the input texture is the same for each stage in the composite. The input texture is the texture rendered to by the scene
* or the output texture of the previous stage.
* </p>
*
* @alias PostProcessStageComposite
* @constructor
*
* @param {Object} options An object with the following properties:
* @param {Array} options.stages An array of {@link PostProcessStage}s or composites to be executed in order.
* @param {Boolean} [options.inputPreviousStageTexture=true] Whether to execute each post-process stage where the input to one stage is the output of the previous. Otherwise, the input to each contained stage is the output of the stage that executed before the composite.
* @param {String} [options.name=createGuid()] The unique name of this post-process stage for reference by other composites. If a name is not supplied, a GUID will be generated.
* @param {Object} [options.uniforms] An alias to the uniforms of post-process stages.
*
* @exception {DeveloperError} options.stages.length must be greater than 0.0.
*
* @see PostProcessStage
*
* @example
* // Example 1: separable blur filter
* // The input to blurXDirection is the texture rendered to by the scene or the output of the previous stage.
* // The input to blurYDirection is the texture rendered to by blurXDirection.
* scene.postProcessStages.add(new Cesium.PostProcessStageComposite({
*     stages : [blurXDirection, blurYDirection]
* }));
*
* @example
* // Example 2: referencing the output of another post-process stage
* scene.postProcessStages.add(new Cesium.PostProcessStageComposite({
*     inputPreviousStageTexture : false,
*     stages : [
*         // The same as Example 1.
*         new Cesium.PostProcessStageComposite({
*             inputPreviousStageTexture : true
*             stages : [blurXDirection, blurYDirection],
*             name : 'blur'
*         }),
*         // The input texture for this stage is the same input texture to blurXDirection since inputPreviousStageTexture is false
*         new Cesium.PostProcessStage({
*             fragmentShader : compositeShader,
*             uniforms : {
*                 blurTexture : 'blur' // The output of the composite with name 'blur' (the texture that blurYDirection rendered to).
*             }
*         })
*     ]
* });
*
* @example
* // Example 3: create a uniform alias
* var uniforms = {};
* Cesium.defineProperties(uniforms, {
*     filterSize : {
*         get : function() {
*             return blurXDirection.uniforms.filterSize;
*         },
*         set : function(value) {
*             blurXDirection.uniforms.filterSize = blurYDirection.uniforms.filterSize = value;
*         }
*     }
* });
* scene.postProcessStages.add(new Cesium.PostProcessStageComposite({
*     stages : [blurXDirection, blurYDirection],
*     uniforms : uniforms
* }));
* @author Юрин Роман @date 26.03.19
**/
@js.native
@JSGlobal("PostProcessStageComposite")
class PostProcessStageComposite(options: PostProcessCompositeStageOptions) extends IPostProcessStage {

	/**Whether or not to execute this post-process stage when ready.**/
	var enabled:Boolean = js.native


/**
	* All post-process stages are executed in the order of the array. The input texture changes based on the value of <code>inputPreviousStageTexture</code>.
	* If <code>inputPreviousStageTexture</code> is <code>true</code>, the input to each stage is the output texture rendered to by the scene or of the stage that executed before it.
	* If <code>inputPreviousStageTexture</code> is <code>false</code>, the input texture is the same for each stage in the composite. The input texture is the texture rendered to by the scene
	* or the output texture of the previous stage.
	**/
	def inputPreviousStageTexture:Boolean = js.native

	/**The number of post-process stages in this composite.**/
	def length:Int = js.native

	/**
		* Returns true if this object was destroyed; otherwise, false.
		* <p>
		* If this object was destroyed, it should not be used; calling any function other than
		* <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
		* </p>
		*/
	def isDestroyed():Boolean = js.native


	/**
		* Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
		* release of WebGL resources, instead of relying on the garbage collector to destroy this object.
		* <p>
		* Once an object is destroyed, it should not be used; calling any function other than
		* <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
		* assign the return value (<code>undefined</code>) to the object as done in the example.
		* </p>
		*/
	def destroy():Unit = js.native
}


/**Опции для создания пост-обработки**/
@js.native
@JSGlobal("PostProcessCompositeStageOptions")
class PostProcessCompositeStageOptions(
		 val name:String = js.native,
		 val stages:js.Array[PostProcessStage] = js.native,
		 val uniforms:js.Dynamic
) extends js.Object