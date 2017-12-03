package ro.jtonic.handson.kotlin

import ro.jtonic.handson.java.Printer

/**
 * Created by Antonel Ernest Pazargic on 03/12/2017.
 * @author Antonel Ernest Pazargic
 */
class PrinterClient {

    fun print() {
        val printer = Printer()
        printer.printPage("page").length
        printer.printDocument("document").length
    }
}