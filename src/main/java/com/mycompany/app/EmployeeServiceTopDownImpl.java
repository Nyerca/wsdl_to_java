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
        for(int i=0; i < parameters.getEmployee().size(); i++) {
            CountEmployees.Employee emp = parameters.getEmployee().get(i);
            System.out.println("Name: " + emp.getName() + " pay: " + emp.getPay() + " contribution: " + emp.getContribution());
        }
        return parameters.getEmployee().size();
    }
}