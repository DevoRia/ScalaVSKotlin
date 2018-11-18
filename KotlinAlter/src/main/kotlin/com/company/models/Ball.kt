package com.company.models

import java.awt.Color
import java.awt.Graphics
import javax.swing.JComponent

class Ball(internal var xPosition: Int, internal var yPosition: Int): JComponent() {

    fun repaintComponent(x: Int, y: Int){
        this.xPosition = x
        this.yPosition = y
        repaint()
        paintComponent(this.graphics)
    }

    override fun paintComponent(g: Graphics){
        super.paintComponent(g)
        g.color = Color.red
        g.fillOval(this.xPosition, this.yPosition, 50, 50)
    }

}