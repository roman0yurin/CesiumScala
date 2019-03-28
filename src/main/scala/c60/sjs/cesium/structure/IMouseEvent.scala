package c60.sjs.cesium.structure

import cesium.Cartesian2

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
* Общий тип для различных событий от мыши или сенсорного экрана
* @author Юрин Роман @date 26.03.19
**/
@js.native
trait IMouseEvent extends js.Object{}

@js.native
@JSGlobal
class MouseDownEvent(
		val position: Cartesian2 = js.native
										 ) extends IMouseEvent


@js.native
@JSGlobal
class MouseUpEvent(
											val position: Cartesian2 = js.native
										) extends IMouseEvent


@js.native
@JSGlobal
class MouseClickEvent(
										val position: Cartesian2 = js.native
									) extends IMouseEvent


@js.native
@JSGlobal
class MouseDblClickEvent(
											 val position: Cartesian2 = js.native
										 ) extends IMouseEvent


/**Касание одним или двумя пальцами**/
@js.native
trait ITouchStartEvt extends IMouseEvent

@js.native
@JSGlobal
class TouchStartEvent(
													val position: Cartesian2 = js.native
												) extends ITouchStartEvt


@js.native
@JSGlobal
class TouchEndEvent(
											 val position: Cartesian2 = js.native
										 ) extends IMouseEvent

@js.native
@JSGlobal
class Touch2StartEvent(
											 val position1: Cartesian2 = js.native,
											 val position2: Cartesian2 = js.native
										 ) extends  ITouchStartEvt

@js.native
@JSGlobal
class MouseMoveEvent(
											 startPosition: Cartesian2,
											 endPosition: Cartesian2
										 ) extends ScreenRange(startPosition, endPosition) with IMouseEvent


@js.native
@JSGlobal
class TouchMoveEvent(
											startPosition: Cartesian2,
											endPosition: Cartesian2
										) extends ScreenRange(startPosition, endPosition) with  IMouseEvent


@js.native
@JSGlobal
class ScreenRange(
											val startPosition: Cartesian2 = js.native,
											val endPosition: Cartesian2 = js.native
										) extends js.Object


@js.native
@JSGlobal
class TouchPinchMovementEvent(val distance:ScreenRange, val angleAndHeight:ScreenRange) extends IMouseEvent

@js.native
@JSGlobal
class WheelEvent(val delta:Int = js.native) extends IMouseEvent