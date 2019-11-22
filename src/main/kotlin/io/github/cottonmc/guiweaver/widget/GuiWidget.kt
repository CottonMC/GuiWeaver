package io.github.cottonmc.guiweaver.widget

import io.github.cottonmc.guiweaver.data.Geometry

data class GuiWidgetStyle(
    val requestedGeometry: Geometry = Geometry.fill()
)

abstract class GuiWidget(val widgetStyle: GuiWidgetStyle = GuiWidgetStyle()) {
    var geometry: Geometry = Geometry.fill()

    abstract fun positionChildren()
    abstract fun draw()

    fun resize(geometry: Geometry) {
        if (geometry == this.geometry) {
            return
        }
        this.geometry = geometry
        positionChildren()
    }
}