package com.designpatterns.AbstractFactory;

public interface IFactory {
    public IButton createButton();
    public ITextBox createTextBox();
}
