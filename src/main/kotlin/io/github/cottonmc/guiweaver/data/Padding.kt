package io.github.cottonmc.guiweaver.data

data class Padding(val start: Int, val end: Int, val top: Int, val bottom: Int) {
    companion object {
        fun all(padding: Int) = Padding(
            start = padding,
            end = padding,
            top = padding,
            bottom = padding
        )
    }
}