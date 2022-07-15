package com.designpatterns.AbstractFactory;

public class MacTextBox  implements ITextBox{

    @Override
    public void showText(){
        System.out.println("Mac TextBox");
    }
}
