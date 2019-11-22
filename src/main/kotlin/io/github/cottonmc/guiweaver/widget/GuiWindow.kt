package io.github.cottonmc.guiweaver.widget

import io.github.cottonmc.guiweaver.data.Geometry
import io.github.cottonmc.guiweaver.layout.GuiLayout

class GuiWindow(val child: GuiWidget) : GuiLayout(
    widgetStyle = GuiWidgetStyle(
        requestedGeometry = Geometry.fill()
    )
) {
    override fun positionChildren() {
        child.positionChildren()
    }

    override fun draw() {
        child.draw()
    }
}