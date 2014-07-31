package com.danibuiza.javacodegeeks.defaults;

public interface InterfaceWithDefault
{

    public default void defaultMethod()
    {
        System.out.println( "I am the default method of the interface " );
    }

    public void toImplementMethod();
}
