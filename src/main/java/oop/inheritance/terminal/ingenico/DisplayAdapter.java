package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Display;
import oop.library.ingenico.services.IngenicoDisplay;

public class DisplayAdapter implements Display {

    private final IngenicoDisplay ingenicoDisplay;

    public DisplayAdapter()
    {
        ingenicoDisplay= new IngenicoDisplay();
    }

    @Override
    public void showMessage(int x, int y, String text) {
        ingenicoDisplay.showMessage(x,y,text);
    }

    @Override
    public void clear() {
        ingenicoDisplay.clear();
    }
}
