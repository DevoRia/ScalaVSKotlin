package com.company.cntrl.key

import com.company.models.Ball

class LeftMove : Repainter {
    override fun move(ball: Ball) {
        val x = ball.xPosition
        val y = ball.yPosition

        if (ball.xPosition < 0) return
        ball.repaintComponent(x - 10, y)
    }
}

class RightMove : Repainter {
    override fun move(ball: Ball){
        val x = ball.xPosition
        val y = ball.yPosition

        if (ball.xPosition > 540) return

        ball.repaintComponent(
                x + 10,
                y
        )
    }
}

class UpMove : Repainter {
    override fun move(ball: Ball) {
        val x = ball.xPosition
        val y = ball.yPosition

        if (ball.yPosition < 0) return

        ball.repaintComponent(
                x,
                y - 10
        )
    }
}

class DownMove : Repainter {
    override fun move(ball: Ball){
        val x = ball.xPosition
        val y = ball.yPosition

        if (ball.yPosition > 340) return

        ball.repaintComponent(
                x,y + 10
        )
    }
}