package com.company.cntrl.key

object Side {
    val TOP: Int = 38
    val BOTTOM: Int = 40
    val LEFT: Int = 37
    val RIGHT: Int = 39
}


object SideFactory {
    fun getMoveSide(key: Int): Repainter {
        return when (key){
            Side.TOP -> UpMove()
            Side.BOTTOM -> DownMove()
            Side.LEFT -> LeftMove()
            Side.RIGHT -> RightMove()
            else -> UpMove()
        }
    }

}