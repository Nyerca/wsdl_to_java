package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeProfilePortTypeImpl empImp = new EmployeeProfilePortTypeImpl();
        System.out.println( empImp.getEmployeeProfile("enrico").getEmail());
    }
}
