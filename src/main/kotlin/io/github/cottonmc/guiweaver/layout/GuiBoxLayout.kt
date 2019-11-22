package io.github.cottonmc.guiweaver.layout

import io.github.cottonmc.guiweaver.data.Geometry
import io.github.cottonmc.guiweaver.data.Padding
import io.github.cottonmc.guiweaver.data.Point
import io.github.cottonmc.guiweaver.widget.GuiWidget
import io.github.cottonmc.guiweaver.widget.GuiWidgetStyle

data class GuiBoxLayoutStyle(
    val padding: Padding = Padding.all(0),
    val fillHorizontal: Boolean = true,
    val fillVertical: Boolean = true,
    val offset: Point = Point(0, 0)
)

class GuiBoxLayout(
    val boxLayoutStyle: GuiBoxLayoutStyle = GuiBoxLayoutStyle(),
    widgetStyle: GuiWidgetStyle = GuiWidgetStyle(),
    val child: GuiWidget
) : GuiLayout(widgetStyle) {
    override fun positionChildren() {
        child.geometry = Geometry(
            start =  geometry.start  + boxLayoutStyle.padding.start,
            end =    geometry.end    - boxLayoutStyle.padding.end,
            top =    geometry.top    + boxLayoutStyle.padding.top,
            bottom = geometry.bottom - boxLayoutStyle.padding.bottom
        ).withOffset(boxLayoutStyle.offset).valid()
    }
}