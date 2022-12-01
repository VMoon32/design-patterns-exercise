package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Printer;
import oop.library.v240m.VerifoneV240mPrinter;

public class PrinterAdapter implements Printer {

    private final VerifoneV240mPrinter verifoneV240mPrinter;

    public PrinterAdapter()
    {
        verifoneV240mPrinter=new VerifoneV240mPrinter();
    }

    @Override
    public void print(int num, String text) {
        verifoneV240mPrinter.print(num,text);
    }

    @Override
    public void lineFeed() {
        verifoneV240mPrinter.lineFeed();
    }
}
