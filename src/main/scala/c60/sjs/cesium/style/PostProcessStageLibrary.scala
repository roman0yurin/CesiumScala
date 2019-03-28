package c60.sjs.cesium.style

import cesium.Scene

import scala.scalajs.js

/**
* Набор функций для пост-обработки изображения сцены
* @author Юрин Роман @date 26.03.19
**/
@js.native
trait PostProcessStageLibrary extends js.Object{

	/**
		* Creates a post-process stage that applies a Gaussian blur to the input texture. This stage is usually applied in conjunction with another stage.
		* <p>
		* This stage has the following uniforms: <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
		* </p>
		* <p>
		* <code>delta</code> and <code>sigma</code> are used to compute the weights of a Gaussian filter. The equation is <code>exp((-0.5 * delta * delta) / (sigma * sigma))</code>.
		* The default value for <code>delta</code> is <code>1.0</code>. The default value for <code>sigma</code> is <code>2.0</code>.
		* <code>stepSize</code> is the distance to the next texel. The default is <code>1.0</code>.
		* </p>
		* @return {PostProcessStageComposite} A post-process stage that applies a Gaussian blur to the input texture.
		*/
	def createBlurStage():PostProcessStageComposite = js.native

	/**
		* Creates a post-process stage that applies a depth of field effect.
		* <p>
		* Depth of field simulates camera focus. Objects in the scene that are in focus
		* will be clear whereas objects not in focus will be blurred.
		* </p>
		* <p>
		* This stage has the following uniforms: <code>focalDistance</code>, <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
		* </p>
		* <p>
		* <code>focalDistance</code> is the distance in meters from the camera to set the camera focus.
		* </p>
		* <p>
		* <code>delta</code>, <code>sigma</code>, and <code>stepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
		* The blur is applied to the areas out of focus.
		* </p>
		* @return {PostProcessStageComposite} A post-process stage that applies a depth of field effect.
		*/
	def createDepthOfFieldStage():PostProcessStageComposite = js.native


	/**
		* Whether or not a depth of field stage is supported.
		* <p>
		* This stage requires the WEBGL_depth_texture extension.
		* </p>
		*
		* @param {Scene} scene The scene.
		* @return {Boolean} Whether this post process stage is supported.
		*
		* @see {Context#depthTexture}
		* @see {@link http://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/|WEBGL_depth_texture}
		*/
	def isDepthOfFieldSupported():Boolean = js.native


	/**
		* Creates a post-process stage that detects edges.
		* <p>
		* Writes the color to the output texture with alpha set to 1.0 when it is on an edge.
		* </p>
		* <p>
		* This stage has the following uniforms: <code>color</code> and <code>length</code>
		* </p>
		* <ul>
		* <li><code>color</code> is the color of the highlighted edge. The default is {@link Color#BLACK}.</li>
		* <li><code>length</code> is the length of the edges in pixels. The default is <code>0.5</code>.</li>
		* </ul>
		* <p>
		* This stage is not supported in 2D.
		* </p>
		* @return {PostProcessStageComposite} A post-process stage that applies an edge detection effect.
		*
		* @example
		* // multiple silhouette effects
		* var yellowEdge = Cesium.PostProcessLibrary.createEdgeDetectionStage();
		* yellowEdge.uniforms.color = Cesium.Color.YELLOW;
		* yellowEdge.selected = [feature0];
		*
		* var greenEdge = Cesium.PostProcessLibrary.createEdgeDetectionStage();
		* greenEdge.uniforms.color = Cesium.Color.LIME;
		* greenEdge.selected = [feature1];
		*
		* // draw edges around feature0 and feature1
		* postProcessStages.add(Cesium.PostProcessLibrary.createSilhouetteEffect([yellowEdge, greenEdge]);
		*/
	def createEdgeDetectionStage():PostProcessStage = js.native

	/**
		* Whether or not an edge detection stage is supported.
		* <p>
		* This stage requires the WEBGL_depth_texture extension.
		* </p>
		*
		* @param {Scene} scene The scene.
		* @return {Boolean} Whether this post process stage is supported.
		*
		* @see {Context#depthTexture}
		* @see {@link http://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/|WEBGL_depth_texture}
		*/
	def isEdgeDetectionSupported(scene: Scene):Boolean = js.native


/**
	* Creates a post-process stage that applies a silhouette effect.
	* <p>
	* A silhouette effect composites the color from the edge detection pass with input color texture.
	* </p>
	* <p>
	* This stage has the following uniforms when <code>edgeDetectionStages</code> is <code>undefined</code>: <code>color</code> and <code>length</code>
	* </p>
	* <p>
	* <code>color</code> is the color of the highlighted edge. The default is {@link Color#BLACK}.
	* <code>length</code> is the length of the edges in pixels. The default is <code>0.5</code>.
	* </p>
	* @return {PostProcessStageComposite} A post-process stage that applies a silhouette effect.
	**/
	def createSilhouetteStage(edgeDetectionStages:js.Array[PostProcessStage]):PostProcessStageComposite = js.native

	/**
		* Whether or not a silhouette stage is supported.
		* <p>
		* This stage requires the WEBGL_depth_texture extension.
		* </p>
		*
		* @param {Scene} scene The scene.
		* @return {Boolean} Whether this post process stage is supported.
		*
		* @see {Context#depthTexture}
		* @see {@link http://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/|WEBGL_depth_texture}
		*/
	def isSilhouetteSupported(scene:Scene):Boolean = js.native

	/**
		* Creates a post-process stage that applies a bloom effect to the input texture.
		* <p>
		* A bloom effect adds glow effect, makes bright areas brighter, and dark areas darker.
		* </p>
		* <p>
		* This post-process stage has the following uniforms: <code>contrast</code>, <code>brightness</code>, <code>glowOnly</code>,
		* <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
		* </p>
		* <ul>
		* <li><code>contrast</code> is a scalar value in the range [-255.0, 255.0] and affects the contract of the effect. The default value is <code>128.0</code>.</li>
		* <li><code>brightness</code> is a scalar value. The input texture RGB value is converted to hue, saturation, and brightness (HSB) then this value is
		* added to the brightness. The default value is <code>-0.3</code>.</li>
		* <li><code>glowOnly</code> is a boolean value. When <code>true</code>, only the glow effect will be shown. When <code>false</code>, the glow will be added to the input texture.
		* The default value is <code>false</code>. This is a debug option for viewing the effects when changing the other uniform values.</li>
		* </ul>
		* <p>
		* <code>delta</code>, <code>sigma</code>, and <code>stepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
		* </p>
		* @return {PostProcessStageComposite} A post-process stage to applies a bloom effect.
		*
		* @private
		*/
	def createBloomStage():PostProcessStageComposite = js.native

	/**
		* Creates a post-process stage that Horizon-based Ambient Occlusion (HBAO) to the input texture.
		* <p>
		* Ambient occlusion simulates shadows from ambient light. These shadows would always be present when the
		* surface receives light and regardless of the light's position.
		* </p>
		* <p>
		* The uniforms have the following properties: <code>intensity</code>, <code>bias</code>, <code>lengthCap</code>,
		* <code>stepSize</code>, <code>frustumLength</code>, <code>randomTexture</code>, <code>ambientOcclusionOnly</code>,
		* <code>delta</code>, <code>sigma</code>, and <code>blurStepSize</code>.
		* </p>
		* <ul>
		* <li><code>intensity</code> is a scalar value used to lighten or darken the shadows exponentially. Higher values make the shadows darker. The default value is <code>3.0</code>.</li>
		* <li><code>bias</code> is a scalar value representing an angle in radians. If the dot product between the normal of the sample and the vector to the camera is less than this value,
		* sampling stops in the current direction. This is used to remove shadows from near planar edges. The default value is <code>0.1</code>.</li>
		* <li><code>lengthCap</code> is a scalar value representing a length in meters. If the distance from the current sample to first sample is greater than this value,
		* sampling stops in the current direction. The default value is <code>0.26</code>.</li>
		* <li><code>stepSize</code> is a scalar value indicating the distance to the next texel sample in the current direction. The default value is <code>1.95</code>.</li>
		* <li><code>frustumLength</code> is a scalar value in meters. If the current fragment has a distance from the camera greater than this value, ambient occlusion is not computed for the fragment.
		* The default value is <code>1000.0</code>.</li>
		* <li><code>randomTexture</code> is a texture where the red channel is a random value in [0.0, 1.0]. The default value is <code>undefined</code>. This texture needs to be set.</li>
		* <li><code>ambientOcclusionOnly</code> is a boolean value. When <code>true</code>, only the shadows generated are written to the output. When <code>false</code>, the input texture is modulated
		* with the ambient occlusion. This is a useful debug option for seeing the effects of changing the uniform values. The default value is <code>false</code>.</li>
		* </ul>
		* <p>
		* <code>delta</code>, <code>sigma</code>, and <code>blurStepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
		* The blur is applied to the shadows generated from the image to make them smoother.
		* </p>
		* @return {PostProcessStageComposite} A post-process stage that applies an ambient occlusion effect.
		*
		* @private
		*/
	def createAmbientOcclusionStage():PostProcessStageComposite = js.native

	/**
		* Whether or not an ambient occlusion stage is supported.
		* <p>
		* This stage requires the WEBGL_depth_texture extension.
		* </p>
		*
		* @param {Scene} scene The scene.
		* @return {Boolean} Whether this post process stage is supported.
		*
		* @see {Context#depthTexture}
		* @see {@link http://www.khronos.org/registry/webgl/extensions/WEBGL_depth_texture/|WEBGL_depth_texture}
		*/
	def isAmbientOcclusionSupported():Boolean = js.native

	/**
		* Creates a post-process stage that renders the input texture with black and white gradations.
		* <p>
		* This stage has one uniform value, <code>gradations</code>, which scales the luminance of each pixel.
		* </p>
		* @return {PostProcessStage} A post-process stage that renders the input texture with black and white gradations.
		*/
	def createBlackAndWhiteStage():PostProcessStage = js.native

	/**
		* Creates a post-process stage that saturates the input texture.
		* <p>
		* This stage has one uniform value, <code>brightness</code>, which scales the saturation of each pixel.
		* </p>
		* @return {PostProcessStage} A post-process stage that saturates the input texture.
		*/
	def createBrightnessStage():PostProcessStage = js.native


	/**
		* Creates a post-process stage that adds a night vision effect to the input texture.
		* @return {PostProcessStage} A post-process stage that adds a night vision effect to the input texture.
		*/
	def createNightVisionStage():PostProcessStage = js.native

	/**
		* Creates a post-process stage that applies an effect simulating light flaring a camera lens.
		* <p>
		* This stage has the following uniforms: <code>dirtTexture</code>, <code>starTexture</code>, <code>intensity</code>, <code>distortion</code>, <code>ghostDispersal</code>,
		* <code>haloWidth</code>, and <code>earthRadius</code>.
		* <ul>
		* <li><code>dirtTexture</code> is a texture sampled to simulate dirt on the lens.</li>
		* <li><code>starTexture</code> is the texture sampled for the star pattern of the flare.</li>
		* <li><code>intensity</code> is a scalar multiplied by the result of the lens flare. The default value is <code>2.0</code>.</li>
		* <li><code>distortion</code> is a scalar value that affects the chromatic effect distortion. The default value is <code>10.0</code>.</li>
		* <li><code>ghostDispersal</code> is a scalar indicating how far the halo effect is from the center of the texture. The default value is <code>0.4</code>.</li>
		* <li><code>haloWidth</code> is a scalar representing the width of the halo  from the ghost dispersal. The default value is <code>0.4</code>.</li>
		* <li><code>earthRadius</code> is the maximum radius of the earth. The default value is <code>Ellipsoid.WGS84.maximumRadius</code>.</li>
		* </ul>
		* </p>
		* @return {PostProcessStage} A post-process stage for applying a lens flare effect.
		*/
	def createLensFlareStage():PostProcessStage = js.native
}
