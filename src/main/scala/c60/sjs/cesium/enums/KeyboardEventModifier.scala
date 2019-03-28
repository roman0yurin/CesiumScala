package c60.sjs.cesium.enums

/**
	* Позволяет задать сочетание клавиш для обработки событий
	* @author Юрин Роман @date 26.03.19
	**/
case class KeyboardEventModifier private(code: Int)
object KeyboardEventModifier{
	/**
		* Represents the shift key being held down.
		*/
	val SHIFT = KeyboardEventModifier(0)

	/**
		* Represents the control key being held down.
		*/
	val CTRL = KeyboardEventModifier(1)

	/**
		* Represents the alt key being held down.
		*/
	val ALT = KeyboardEventModifier(2)
}
