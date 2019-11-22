package io.github.cottonmc.guiweaver.data

enum class WidgetSide(val axis: Axis) {
    TOP(Axis.VERTICAL),
    RIGHT(Axis.HORIZONTAL),
    BOTTOM(Axis.VERTICAL),
    LEFT(Axis.HORIZONTAL)
}