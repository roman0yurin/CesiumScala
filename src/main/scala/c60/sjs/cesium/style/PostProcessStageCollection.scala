package c60.sjs.cesium.style

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

/**
	* A collection of {@link PostProcessStage}s and/or {@link PostProcessStageComposite}s.
	* <p>
	* The input texture for each post-process stage is the texture rendered to by the scene or the texture rendered
	* to by the previous stage in the collection.
	* </p>
	* <p>
	* If the ambient occlusion or bloom stages are enabled, they will execute before all other stages.
	* </p>
	* <p>
	* If the FXAA stage is enabled, it will execute after all other stages.
	* </p>
	*
	* @alias PostProcessStageCollection
	* @constructor
	*
	* @author Юрин Роман @date 26.03.19
	**/
@js.native
@JSGlobal("PostProcessStageCollection")
class PostProcessStageCollection() extends js.Object {
	/**
		* Determines if all of the post-process stages in the collection are ready to be executed.
		*
		* @memberof PostProcessStageCollection.prototype
		* @type {Boolean}
		* @readonly
		*/
	def ready:Boolean = js.native

	/**
		* A post-process stage for Fast Approximate Anti-aliasing.
		* <p>
		* When enabled, this stage will execute after all others.
		* </p>
		*
		* @memberof PostProcessStageCollection.prototype
		* @type {PostProcessStage}
		* @readonly
		*/
	def fxaa:PostProcessStage = js.native

	/**
		* A post-process stage that applies Horizon-based Ambient Occlusion (HBAO) to the input texture.
		* <p>
		* Ambient occlusion simulates shadows from ambient light. These shadows would always be present when the
		* surface receives light and regardless of the light's position.
		* </p>
		* <p>
		* The uniforms have the following properties: <code>intensity</code>, <code>bias</code>, <code>lengthCap</code>,
		* <code>stepSize</code>, <code>frustumLength</code>, <code>ambientOcclusionOnly</code>,
		* <code>delta</code>, <code>sigma</code>, and <code>blurStepSize</code>.
		* </p>
		* <ul>
		* <li><code>intensity</code> is a scalar value used to lighten or darken the shadows exponentially. Higher values make the shadows darker. The default value is <code>3.0</code>.</li>
		*
		* <li><code>bias</code> is a scalar value representing an angle in radians. If the dot product between the normal of the sample and the vector to the camera is less than this value,
		* sampling stops in the current direction. This is used to remove shadows from near planar edges. The default value is <code>0.1</code>.</li>
		*
		* <li><code>lengthCap</code> is a scalar value representing a length in meters. If the distance from the current sample to first sample is greater than this value,
		* sampling stops in the current direction. The default value is <code>0.26</code>.</li>
		*
		* <li><code>stepSize</code> is a scalar value indicating the distance to the next texel sample in the current direction. The default value is <code>1.95</code>.</li>
		*
		* <li><code>frustumLength</code> is a scalar value in meters. If the current fragment has a distance from the camera greater than this value, ambient occlusion is not computed for the fragment.
		* The default value is <code>1000.0</code>.</li>
		*
		* <li><code>ambientOcclusionOnly</code> is a boolean value. When <code>true</code>, only the shadows generated are written to the output. When <code>false</code>, the input texture is modulated
		* with the ambient occlusion. This is a useful debug option for seeing the effects of changing the uniform values. The default value is <code>false</code>.</li>
		* </ul>
		* <p>
		* <code>delta</code>, <code>sigma</code>, and <code>blurStepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
		* The blur is applied to the shadows generated from the image to make them smoother.
		* </p>
		* <p>
		* When enabled, this stage will execute before all others.
		* </p>
		*
		* @memberof PostProcessStageCollection.prototype
		* @type {PostProcessStageComposite}
		* @readonly
		*/
	def ambientOcclusion:PostProcessStageComposite = js.native

	/**
		* A post-process stage for a bloom effect.
		* <p>
		* A bloom effect adds glow effect, makes bright areas brighter, and dark areas darker.
		* </p>
		* <p>
		* This stage has the following uniforms: <code>contrast</code>, <code>brightness</code>, <code>glowOnly</code>,
		* <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
		* </p>
		* <ul>
		* <li><code>contrast</code> is a scalar value in the range [-255.0, 255.0] and affects the contract of the effect. The default value is <code>128.0</code>.</li>
		*
		* <li><code>brightness</code> is a scalar value. The input texture RGB value is converted to hue, saturation, and brightness (HSB) then this value is
		* added to the brightness. The default value is <code>-0.3</code>.</li>
		*
		* <li><code>glowOnly</code> is a boolean value. When <code>true</code>, only the glow effect will be shown. When <code>false</code>, the glow will be added to the input texture.
		* The default value is <code>false</code>. This is a debug option for viewing the effects when changing the other uniform values.</li>
		* </ul>
		* <p>
		* <code>delta</code>, <code>sigma</code>, and <code>stepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
		* The blur is applied to the shadows generated from the image to make them smoother.
		* </p>
		* <p>
		* When enabled, this stage will execute before all others.
		* </p>
		*
		* @memberOf PostProcessStageCollection.prototype
		* @type {PostProcessStageComposite}
		* @readonly
		*/
	def bloom:PostProcessStageComposite = js.native

	/**
		* The number of post-process stages in this collection.
		*
		* @memberof PostProcessStageCollection.prototype
		* @type {Number}
		* @readonly
		*/
	def length:Int = js.native

	/**
		* A reference to the last texture written to when executing the post-process stages in this collection.
		*
		* @memberof PostProcessStageCollection.prototype
		* @type {Texture}
		* @readonly
		* @private
		*/
	def outputTexture:js.Dynamic = js.native

	/**
		* Whether the collection has a stage that has selected features.
		*
		* @memberof PostProcessStageCollection.prototype
		* @type {Boolean}
		* @readonly
		* @private
		*/
	def hasSelected:Boolean = js.native


	def removeStages(collection:PostProcessStageCollection):Unit = js.native

	/**
		* Adds the post-process stage to the collection.
		* @return {PostProcessStage|PostProcessStageComposite} The post-process stage that was added to the collection.
		*
		* @exception {DeveloperError} The post-process stage has already been added to the collection or does not have a unique name.
		*/
	def add(stage:IPostProcessStage): IPostProcessStage = js.native

	/**
		* Removes a post-process stage from the collection and destroys it.
		*
		* @param {PostProcessStage|PostProcessStageComposite} stage The post-process stage to remove from the collection.
		* @return {Boolean} Whether the post-process stage was removed.
		*/
	def remove(stage:IPostProcessStage): Boolean = js.native

	/**
		* Returns whether the collection contains a post-process stage.
		*
		* @param {PostProcessStage|PostProcessStageComposite} stage The post-process stage.
		* @return {Boolean} Whether the collection contains the post-process stage.
		*/
	def contains(stage:IPostProcessStage) : Boolean = js.native

	/**
		* Gets the post-process stage at <code>index</code>.
		*
		* @param {Number} index The index of the post-process stage.
		* @return {PostProcessStage|PostProcessStageComposite} The post-process stage at index.
		*/
	def get(index:Int): IPostProcessStage = js.native

	/**
		* Removes all post-process stages from the collection and destroys them.
		*/
	def removeAll():Unit = js.native


	def getStageByName(name:String):IPostProcessStage = js.native

	/**
		* Clears all of the framebuffers used by the stages.
		*
		* @param {Context} context The context.
		*
		* @private
		*/
	def clear():Unit = js.native


	def getOutputTexture(stage:IPostProcessStage):js.Dynamic = js.native

	/**
		* Returns true if this object was destroyed; otherwise, false.
		* <p>
		* If this object was destroyed, it should not be used; calling any function other than
		* <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
		* </p>
		*
		* @returns {Boolean} <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
		*
		* @see PostProcessStageCollection#destroy
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
		*
		* @exception {DeveloperError} This object was destroyed, i.e., destroy() was called.
		*
		* @see PostProcessStageCollection#isDestroyed
		*/
	def destroy():Unit = js.native
}
