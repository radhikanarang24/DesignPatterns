package com.designpatterns.AbstractFactory;

public class GUIAbstractFactory {
    public static IFactory createFactory(String os)
    {
        if(os.isBlank()) return null;
        switch (os) {
            case "Mac":
                return new MacFactory();
            case "Windows":
                return new WindowFactory();
            default:
                throw new IllegalArgumentException("Invalid os");
        }
    }
}
