package c60.sjs.cesium.dsl

import c60.sjs.cesium.enums.{KeyboardEventModifier, ScreenSpaceEventType}
import c60.sjs.cesium.structure.{IMouseEvent, WheelEvent}
import cesium.ScreenSpaceEventHandler
import ScreenSpaceEventType._
import c60.sjs.cesium.scene.Cesium3DTileFeature

import scala.scalajs.js

object CesiumWork extends ICesiumWork

/**
	* Неявные преобразования для работы с Cesium API
	*
	* @author Юрин Роман @date 26.03.19
	**/
trait ICesiumWork {

	/**Создаем более явное API для обработчика событий**/
	implicit class ScreenSpaceEventHandlerWrapper(handler: ScreenSpaceEventHandler){
		/**Установить обработчик на данный тип событий, можно так же задать модификатор**/
		def setupInputAction[EVENT_STRUCT <: IMouseEvent](eventType:ScreenSpaceEventType[EVENT_STRUCT], modifier: KeyboardEventModifier = null)(funcHandler:(EVENT_STRUCT)⇒Unit){
			val h:js.Function = if(eventType == WHEEL){
				(delta:Double) ⇒{ //Для колеса вместо структуры передается просто число
					funcHandler(new WheelEvent(delta.toInt).asInstanceOf[EVENT_STRUCT])
				}
			}else{
				funcHandler
			}
			if(modifier != null)
				handler.setInputAction(h, eventType.code, modifier.code)
			else
				handler.setInputAction(h, eventType.code)
		}

		/**Удалить обработчик на данный тип событий, можно так же задать модификатор**/
		def deleteInputAction(eventType:ScreenSpaceEventType[_], modifier: KeyboardEventModifier = null){
			if(modifier != null)
				handler.removeInputAction(eventType.code, modifier.code)
			else
				handler.removeInputAction(eventType.code)
		}
	}


	/**Дополнительные удобства для объектов сцены**/
	implicit class Feature3dWrapper(feature: Cesium3DTileFeature){
		def property[VALUE](name:String) : Option[VALUE] = {
			if(feature.hasProperty(name))
				Some(feature.getProperty(name).asInstanceOf[VALUE])
			else
				None
		}
	}

}
