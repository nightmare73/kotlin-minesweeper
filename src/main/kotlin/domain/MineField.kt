package domain

data class MineField(
    private val rectangle: Rectangle,
    val blocks: List<Block>
) {
    fun getWidth() = rectangle.width

    fun getHeight() = rectangle.height
}
