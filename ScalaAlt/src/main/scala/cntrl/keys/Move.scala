package cntrl.keys
import model.Ball


class LeftMove extends BallRepainter {
  override def move(ball: Ball): Unit = {
    val x = ball.xPosition
    val y = ball.yPosition

    if (ball.xPosition < 0) return
    ball.repaintComponent(
      x - 10,
      y
    )
  }
}

class RightMove extends BallRepainter {
  override def move(ball: Ball): Unit = {
    val x = ball.xPosition
    val y = ball.yPosition

    if (ball.xPosition > 540) return

    ball.repaintComponent(
      x + 10,
      y
    )
  }
}

class UpMove extends BallRepainter {
  override def move(ball: Ball): Unit = {
    val x = ball.xPosition
    val y = ball.yPosition

    if (ball.yPosition < 0) return

    ball.repaintComponent(
      x,
      y - 10
    )
  }
}

class DownMove extends BallRepainter {
  override def move(ball: Ball): Unit = {
    val x = ball.xPosition
    val y = ball.yPosition

    if (ball.yPosition > 340) return

    ball.repaintComponent(
      x,y + 10
    )
  }
}