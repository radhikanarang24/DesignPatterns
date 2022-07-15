package com.designpatterns.AbstractFactory;

public class AbstractFactory {
    public static void main(String args[])
    {
        IFactory factory = GUIAbstractFactory.createFactory("Mac");
        IButton button = factory.createButton();
        button.press();

        ITextBox textBox=factory.createTextBox();
        textBox.showText();
    }
}
