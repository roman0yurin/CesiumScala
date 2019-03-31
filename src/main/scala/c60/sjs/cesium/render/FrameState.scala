package c60.sjs.cesium.render

import cesium.CreditDisplay

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
	* State information about the current frame.  An instance of this class
	* is provided to update functions.
	*
	* @param  context The rendering context
	* @param  creditDisplay Handles adding and removing credits from an HTML element
	* @param  jobScheduler The job scheduler
	*
	* @author Юрин Роман @date 30.03.19
	**/
@js.native
@JSGlobal("FrameState")
class FrameState(val context:js.Dynamic, creditDisplay:CreditDisplay, jobScheduler:js.Dynamic) extends js.Object{
  	//TODO внутренне описание
}
