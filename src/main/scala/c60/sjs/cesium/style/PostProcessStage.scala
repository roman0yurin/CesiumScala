package c60.sjs.cesium.style

import c60.sjs.cesium.scene.Cesium3DTileFeature
import cesium.{BoundingRectangle, Color}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	* Runs a post-process stage on either the texture rendered by the scene or the output of a previous post-process stage.
	*
	* @alias PostProcessStage
	* @constructor
	*
	* @param {Object} options An object with the following properties:
	* @param {String} options.fragmentShader The fragment shader to use. The default <code>sampler2D</code> uniforms are <code>colorTexture</code> and <code>depthTexture</code>. The color texture is the output of rendering the scene or the previous stage. The depth texture is the output from rendering the scene. The shader should contain one or both uniforms. There is also a <code>vec2</code> varying named <code>v_textureCoordinates</code> that can be used to sample the textures.
	* @param {Object} [options.uniforms] An object whose properties will be used to set the shaders uniforms. The properties can be constant values or a function. A constant value can also be a URI, data URI, or HTML element to use as a texture.
	* @param {Number} [options.textureScale=1.0] A number in the range (0.0, 1.0] used to scale the texture dimensions. A scale of 1.0 will render this post-process stage  to a texture the size of the viewport.
	* @param {Boolean} [options.forcePowerOfTwo=false] Whether or not to force the texture dimensions to be both equal powers of two. The power of two will be the next power of two of the minimum of the dimensions.
	* @param {PostProcessStageSampleMode} [options.sampleMode=PostProcessStageSampleMode.NEAREST] How to sample the input color texture.
	* @param {PixelFormat} [options.pixelFormat=PixelFormat.RGBA] The color pixel format of the output texture.
	* @param {PixelDatatype} [options.pixelDatatype=PixelDatatype.UNSIGNED_BYTE] The pixel data type of the output texture.
	* @param {Color} [options.clearColor=Color.BLACK] The color to clear the output texture to.
	* @param {BoundingRectangle} [options.scissorRectangle] The rectangle to use for the scissor test.
	* @param {String} [options.name=createGuid()] The unique name of this post-process stage for reference by other stages in a composite. If a name is not supplied, a GUID will be generated.
	*
	* @exception {DeveloperError} options.textureScale must be greater than 0.0 and less than or equal to 1.0.
	* @exception {DeveloperError} options.pixelFormat must be a color format.
	* @exception {DeveloperError} When options.pixelDatatype is FLOAT, this WebGL implementation must support the OES_texture_float extension.  Check context.floatingPointTexture.
	*
	* @see PostProcessStageComposite
	*
	* @example
	* // Simple stage to change the color
	* var fs =
	*     'uniform sampler2D colorTexture;\n' +
	*     'varying vec2 v_textureCoordinates;\n' +
	*     'uniform float scale;\n' +
	*     'uniform vec3 offset;\n' +
	*     'void main() {\n' +
	*     '    vec4 color = texture2D(colorTexture, v_textureCoordinates);\n' +
	*     '    gl_FragColor = vec4(color.rgb * scale + offset, 1.0);\n' +
	*     '}\n';
	* scene.postProcessStages.add(new Cesium.PostProcessStage({
	*     fragmentShader : fs,
	*     uniforms : {
	*         scale : 1.1,
	*         offset : function() {
	*             return new Cesium.Cartesian3(0.1, 0.2, 0.3);
	*         }
	*     }
	* }));
	*
	* @example
	* // Simple stage to change the color of what is selected.
	* // If czm_selected returns true, the current fragment belongs to geometry in the selected array.
	* var fs =
	*     'uniform sampler2D colorTexture;\n' +
	*     'varying vec2 v_textureCoordinates;\n' +
	*     'uniform vec4 highlight;\n' +
	*     'void main() {\n' +
	*     '    vec4 color = texture2D(colorTexture, v_textureCoordinates);\n' +
	*     '    if (czm_selected()) {\n' +
	*     '        vec3 highlighted = highlight.a * highlight.rgb + (1.0 - highlight.a) * color.rgb;\n' +
	*     '        gl_FragColor = vec4(highlighted, 1.0);\n' +
	*     '    } else { \n' +
	*     '        gl_FragColor = color;\n' +
	*     '    }\n' +
	*     '}\n';
	* var stage = scene.postProcessStages.add(new Cesium.PostProcessStage({
	*     fragmentShader : fs,
	*     uniforms : {
	*         highlight : function() {
	*             return new Cesium.Color(1.0, 0.0, 0.0, 0.5);
	*         }
	*     }
	* }));
	* stage.selected = [cesium3DTileFeature];
	*
	* @author Юрин Роман @date 26.03.19
	**/
@js.native
@JSGlobal("PostProcessStage")
class PostProcessStage(options: js.Dynamic) extends IPostProcessStage {

	/**
		* The fragment shader to use when execute this post-process stage.
		* <p>
		* The shader must contain a sampler uniform declaration for <code>colorTexture</code>, <code>depthTexture</code>,
		* or both.
		* </p>
		* <p>
		* The shader must contain a <code>vec2</code> varying declaration for <code>v_textureCoordinates</code> for sampling
		* the texture uniforms.
		* </p>
		*
		* @memberof PostProcessStage.prototype
		* @type {String}
		* @readonly
		*/
	val fragmentShader:js.Dynamic = js.native



	/**
		* A number in the range (0.0, 1.0] used to scale the output texture dimensions. A scale of 1.0 will render this post-process stage to a texture the size of the viewport.
		*
		* @memberof PostProcessStage.prototype
		* @type {Number}
		* @readonly
		*/
	val textureScale:Float = js.native

	/**
		* Whether or not to force the output texture dimensions to be both equal powers of two. The power of two will be the next power of two of the minimum of the dimensions.
		*
		* @memberof PostProcessStage.prototype
		* @type {Number}
		* @readonly
		*/
	val forcePowerOfTwo:Int = js.native

	/**
		* How to sample the input color texture.
		*
		* @memberof PostProcessStage.prototype
		* @type {PostProcessStageSampleMode}
		* @readonly
		*/
	val sampleMode:js.Any = js.native

	/**
		* The color pixel format of the output texture.
		*
		* @memberof PostProcessStage.prototype
		* @type {PixelFormat}
		* @readonly
		*/
	val pixelFormat:js.Any = js.native

	/**
		* The pixel data type of the output texture.
		*
		* @memberof PostProcessStage.prototype
		* @type {PixelDatatype}
		* @readonly
		*/
	val pixelDatatype:js.Dynamic = js.native

	/**
		* The color to clear the output texture to.
		*
		* @memberof PostProcessStage.prototype
		* @type {Color}
		* @readonly
		*/
	val clearColor:Color = js.native

	/**
		* The {@link BoundingRectangle} to use for the scissor test. A default bounding rectangle will disable the scissor test.
		*
		* @memberof PostProcessStage.prototype
		* @type {BoundingRectangle}
		* @readonly
		*/
	val scissorRectangle:BoundingRectangle = js.native

	/**
		* A reference to the texture written to when executing this post process stage.
		*
		* @memberof PostProcessStage.prototype
		* @type {Texture}
		* @readonly
		* @private
		*/
	val outputTexture:js.Dynamic = js.native
}

/**Набор параметров для спец. эффекта**/
@js.native
trait PotProcessUniforms extends js.Object{
	var length:Double = js.native
	var color:Color = js.native
}

/**Общий тип для операций пост-обработки сцены**/
@js.native
trait IPostProcessStage extends js.Object{

	/**
		* Determines if this post-process stage is ready to be executed. A stage is only executed when both <code>ready</code>
		* and {@link PostProcessStage#enabled} are <code>true</code>. A stage will not be ready while it is waiting on textures
		* to load.
		* */
	val ready:Boolean = js.native

	/**
		* The unique name of this post-process stage for reference by other stages in a {@link PostProcessStageComposite}.
		*/
	val name:String = js.native

	/**
		* An object whose properties are used to set the uniforms of the fragment shader.
		* <p>
		* The object property values can be either a constant or a function. The function will be called
		* each frame before the post-process stage is executed.
		* </p>
		* <p>
		* A constant value can also be a URI to an image, a data URI, or an HTML element that can be used as a texture, such as HTMLImageElement or HTMLCanvasElement.
		* </p>
		* <p>
		* If this post-process stage is part of a {@link PostProcessStageComposite} that does not execute in series, the constant value can also be
		* the name of another stage in a composite. This will set the uniform to the output texture the stage with that name.
		* </p>
		*
		* @memberof PostProcessStage.prototype
		* @type {Object}
		* @readonly
		*/
	val uniforms: PotProcessUniforms = js.native


	/**
		* The features selected for applying the post-process.
		* <p>
		* In the fragment shader, use <code>czm_selected</code> to determine whether or not to apply the post-process
		* stage to that fragment. For example:
		* <code>
		* if (czm_selected(v_textureCoordinates)) {
		*     // apply post-process stage
		* } else {
		*     gl_FragColor = texture2D(colorTexture, v_textureCordinates);
		* }
		* </code>
		* </p>
		*
		* @memberof PostProcessStage.prototype
		* @type {Array}
		*/
	var selected:js.Array[Cesium3DTileFeature] = js.native
}
