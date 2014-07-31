package com.danibuiza.javacodegeeks.defaults.statics;

public class ExamplesMainWithStatics
{

    public static void main( String[] args )
    {
        InterfaceWithDefaultAndStatics instanceWithDefault = new ClassImplementingDefaultInterface();

        instanceWithDefault.defaultMethod();

        // it is possible to call static methods directly to the interface
        InterfaceWithDefaultAndStatics.giveMeFive(); // right

        ClassImplementingDefaultInterface.giveMeFive(); // wrong: The method giveMeFive() is undefined for the type ClassImplementingDefaultInterface
        
    }
}
