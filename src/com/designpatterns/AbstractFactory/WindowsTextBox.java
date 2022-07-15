package com.designpatterns.AbstractFactory;

public class WindowsTextBox implements ITextBox{

    @Override
    public void showText(){
        System.out.println("Windows TextBox");
    }
}