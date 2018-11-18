package com.company.view

import com.company.cntrl.Controller
import com.company.models.Ball
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JScrollPane

object View{

    val ball = Ball(0, 0)

    init {
        val text = JLabel()
        text.text = "Kotlin version"
        val scrollPane = JScrollPane(text)


        val frame =  JFrame("Battle")
        frame.contentPane.add(scrollPane, BorderLayout.NORTH)
        frame.contentPane.add(ball, BorderLayout.CENTER)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.size = Dimension(600, 400)
        frame.addKeyListener(Controller())
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }
}