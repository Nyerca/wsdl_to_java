package com.mycompany.app;

import com.msinfo.code.generate.ws.CountEmployees;
import com.msinfo.code.generate.ws.EmployeeServiceTopDown;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
        name = "EmployeeServiceTopDown",
        targetNamespace = "http://topdown.server.jaxws.baeldung.com/")
public class EmployeeServiceTopDownImpl
        implements EmployeeServiceTopDown {

    @WebMethod
    public int countEmployees(CountEmployees parameters) {

        System.out.println("Num: " + parameters.getEmployee().size());
        return parameters.getEmployee().size();
    }
}