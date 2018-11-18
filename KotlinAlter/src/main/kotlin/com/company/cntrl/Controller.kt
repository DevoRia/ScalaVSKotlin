package com.company.cntrl

import com.company.cntrl.key.Repainter
import com.company.cntrl.key.SideFactory
import com.company.view.View
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

class Controller : KeyListener {

    override fun keyTyped(keyEvent: KeyEvent?) {}

    override fun keyPressed(keyEvent: KeyEvent?) {
        val repainter: Repainter = SideFactory.getMoveSide(keyEvent!!.keyCode)
        repainter.move(View.ball)
    }

    override fun keyReleased(keyEvent: KeyEvent?) {
        keyPressed(keyEvent)
    }
}