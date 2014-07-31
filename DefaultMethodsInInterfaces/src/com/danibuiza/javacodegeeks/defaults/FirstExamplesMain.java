package com.danibuiza.javacodegeeks.defaults;

public class FirstExamplesMain
{

    public static void main( String[] args )
    {
        InterfaceWithDefault instanceWithDefault = new ClassImplementingDefaultInterface();

        instanceWithDefault.defaultMethod();

    }
}
