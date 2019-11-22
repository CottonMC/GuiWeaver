package io.github.cottonmc.guiweaver.data

data class Geometry(
    val start: Int,
    val end: Int,
    val top: Int,
    val bottom: Int,
    val fillHorizontal: Boolean = true,
    val fillVertical: Boolean = true
) {
    fun withOffset(offset: Point) = Geometry(
        start = this.start + offset.startToEnd,
        end = this.end + offset.startToEnd,
        top = this.top + offset.topToBottom,
        bottom = this.bottom + offset.topToBottom,
        fillHorizontal = this.fillHorizontal,
        fillVertical = this.fillVertical
    )

    fun valid() = Geometry(
        start = this.start,
        end = if (this.end < this.start) this.start else this.end,
        top = this.top,
        bottom = if (this.bottom < this.top) this.top else this.bottom,
        fillHorizontal = this.fillHorizontal,
        fillVertical = this.fillVertical
    )

    companion object {
        @JvmStatic
        fun fill(horizontal: Boolean = true, vertical: Boolean = true) = Geometry(
            start = 0,
            end = 0,
            top = 0,
            bottom = 0,
            fillHorizontal = horizontal,
            fillVertical = vertical
        )
    }
}