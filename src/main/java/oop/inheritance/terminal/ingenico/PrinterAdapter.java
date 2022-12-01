package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Printer;
import oop.library.ingenico.services.IngenicoPrinter;

public class PrinterAdapter implements Printer {

    private final IngenicoPrinter ingenicoPrinter;

    public PrinterAdapter()
    {
        ingenicoPrinter=new IngenicoPrinter();
    }
    @Override
    public void print(int num, String text) {
        ingenicoPrinter.print(num,text);
    }

    @Override
    public void lineFeed() {
        ingenicoPrinter.lineFeed();
    }
}
