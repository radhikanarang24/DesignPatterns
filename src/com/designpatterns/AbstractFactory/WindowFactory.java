package com.designpatterns.AbstractFactory;

public class WindowFactory implements IFactory{

    @Override
    public IButton createButton()
    {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox(){
        return new WindowsTextBox();
    }
}

