package view

import java.awt.{BorderLayout, Dimension}

import cntrl.Controller
import javax.swing.{JFrame, JLabel, JScrollPane}
import model.Ball

object View extends App {

  val text = new JLabel()
  text.setText("Scala Version")
  val scrollPane = new JScrollPane(text)
  val ball = new Ball(0,0)


  val frame = new JFrame("Battle")
  frame.getContentPane.add(scrollPane, BorderLayout.NORTH)
  frame.getContentPane.add(ball, BorderLayout.CENTER)
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
  frame.setSize(new Dimension(600, 400))
  frame.addKeyListener(new Controller())
  frame.setLocationRelativeTo(null)
  frame.setVisible(true)

}