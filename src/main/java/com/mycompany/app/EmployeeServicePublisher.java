package com.mycompany.app;

import javax.xml.ws.Endpoint;

public class EmployeeServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish(
                "http://localhost:5080/employeeservicetopdown",
                new EmployeeServiceTopDownImpl());

    }
}