package cntrl.keys

object Side extends Enumeration {
  val TOP = 38
  val BOTTOM = 40
  val LEFT = 37
  val RIGHT = 39

}

object SideFactory {

  def getMoveSide(key: Int): BallRepainter = key match {
    case Side.TOP => new UpMove()
    case Side.BOTTOM => new DownMove()
    case Side.LEFT => new LeftMove()
    case Side.RIGHT => new RightMove()
  }

}
