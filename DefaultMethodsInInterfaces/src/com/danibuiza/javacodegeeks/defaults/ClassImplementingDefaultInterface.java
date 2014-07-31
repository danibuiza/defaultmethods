package com.danibuiza.javacodegeeks.defaults;

public class ClassImplementingDefaultInterface implements InterfaceWithDefault
{

    public void callDefault()
    {
        this.defaultMethod();
    }

    @Override
    public void toImplementMethod()
    {
        System.out.println( "to implement method" );

    }

}
