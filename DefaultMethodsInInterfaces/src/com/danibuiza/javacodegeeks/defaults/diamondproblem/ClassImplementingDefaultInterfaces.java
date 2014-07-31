package com.danibuiza.javacodegeeks.defaults.diamondproblem;

/**
 * This class shows the diamond problem: one class implements two interfaces that contain different
 * implementation for the same default method. This is solved by implementing the method in the
 * class directly, in order to prioritize one of the default implementations it is possible to use
 * it by InterfaceAWithDefault.super.defaultMethod();
 * 
 * @author dgutierrez-diez
 */
public class ClassImplementingDefaultInterfaces implements InterfaceAWithDefault, InterfaceBWithDefault
{
    /*
     * if this method is not implemented following compilation error occurs: Duplicate default
     * methods named defaultMethod with the parameters () and () are inherited from the types
     * InterfaceBWithDefault and InterfaceAWithDefault
     */
    public void defaultMethod()
    {
        InterfaceAWithDefault.super.defaultMethod();
    }

    public void callDefault()
    {
        this.defaultMethod();
    }

    @Override
    public void toImplementBMethod()
    {
        System.out.println( "toImplementBMethod " );

    }

    @Override
    public void toImplementAMethod()
    {
        System.out.println( "toImplementAMethod" );

    }

}
