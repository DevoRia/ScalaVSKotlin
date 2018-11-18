package com.company

import com.company.view.View
import javax.swing.SwingUtilities

object Start {

    @JvmStatic
    fun main(args: Array<String>) {
        SwingUtilities.invokeLater { View }
    }
}