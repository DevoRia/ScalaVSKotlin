package model

import java.awt.{Color, Graphics}

import javax.swing.JComponent

class Ball(var xPosition: Int,var yPosition: Int) extends JComponent{

  def repaintComponent(x: Int, y: Int): Unit ={
    this.xPosition = x
    this.yPosition = y
    repaint()
    paintComponent(this.getGraphics)
  }

  override def paintComponent(g: Graphics): Unit = {
    super.paintComponent(g)
    g.setColor(Color.red)
    g.fillOval(this.xPosition, this.yPosition, 50, 50)
  }

}
