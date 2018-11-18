package cntrl

import java.awt.event.{KeyEvent, KeyListener}

import cntrl.keys.{BallRepainter, SideFactory}
import view.View

class Controller extends KeyListener{

  override def keyPressed(keyEvent: KeyEvent): Unit = {
    val repainter: BallRepainter = SideFactory.getMoveSide(keyEvent.getKeyCode)
    repainter.move(View.ball)
  }

  override def keyTyped(keyEvent: KeyEvent): Unit = ???

  override def keyReleased(keyEvent: KeyEvent): Unit = {
    keyPressed(keyEvent)
  }
}
