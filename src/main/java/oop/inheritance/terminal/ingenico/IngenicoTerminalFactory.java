package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Display;
import oop.inheritance.terminal.Keyboard;
import oop.inheritance.terminal.Printer;
import oop.inheritance.terminal.TerminalFactory;

public class IngenicoTerminalFactory extends TerminalFactory {
    @Override
    public Display getDisplay() {
        return new DisplayAdapter();
    }

    @Override
    public Keyboard getKeyboard() {
        return new KeyboardAdapter();
    }

    @Override
    public Printer getPrinter() {
        return new PrinterAdapter();
    }
}
