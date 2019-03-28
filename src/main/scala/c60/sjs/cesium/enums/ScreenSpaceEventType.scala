package c60.sjs.cesium.enums

import c60.sjs.cesium.structure._

/**
	* Перечень типов событий мыши
 *
	* @author Юрин Роман @date 26.03.19
	**/
case class ScreenSpaceEventType[EVENT_STRUCT <: IMouseEvent] private(code:Int) {}
object ScreenSpaceEventType{
	/**
		* Represents a mouse left button down event.
		*/
	val LEFT_DOWN = ScreenSpaceEventType[MouseDownEvent](0)

	/**
		* Represents a mouse left button up event.
		*/
	val LEFT_UP = ScreenSpaceEventType[MouseUpEvent](1)

	/**
		* Represents a mouse left click event.
		*/
	val LEFT_CLICK = ScreenSpaceEventType[MouseClickEvent](2)

	/**
		* Represents a mouse left double click event.
		*/
	val LEFT_DOUBLE_CLICK = ScreenSpaceEventType[MouseDblClickEvent](3)

	/**
		* Represents a mouse left button down event.
		*/
	val RIGHT_DOWN = ScreenSpaceEventType[MouseDownEvent](5)

	/**
		* Represents a mouse right button up event.
		*/
	val RIGHT_UP = ScreenSpaceEventType[MouseUpEvent](6)

	/**
		* Represents a mouse right click event.
		*/
	val RIGHT_CLICK = ScreenSpaceEventType[MouseClickEvent](7)

	/**
		* Represents a mouse middle button down event.
		*/
	val MIDDLE_DOWN = ScreenSpaceEventType[MouseDownEvent](10)

	/**
		* Represents a mouse middle button up event.
		*/
	val MIDDLE_UP = ScreenSpaceEventType[MouseUpEvent](11)

	/**
		* Represents a mouse middle click event.
		*/
	val MIDDLE_CLICK = ScreenSpaceEventType[MouseClickEvent](12)

	/**
		* Represents aouse move event.
		*/
	val MOUSE_MOVE = ScreenSpaceEventType[MouseMoveEvent](15)

	/**
		* Represents a mouse wheel event.
		*/
	val WHEEL = ScreenSpaceEventType[WheelEvent](16)

	/**
		* Represents the start of a two-finger event on a touch surface.
		*/
	val PINCH_START = ScreenSpaceEventType[ITouchStartEvt](17)

	/**
		* Represents the end of a two-finger event on a touch surface.
		*/
	val PINCH_END = ScreenSpaceEventType[TouchEndEvent](18)

	/**
		* Represents a change of a two-finger event on a touch surface.
		*/
	val PINCH_MOVE = ScreenSpaceEventType[TouchMoveEvent](19)
}
