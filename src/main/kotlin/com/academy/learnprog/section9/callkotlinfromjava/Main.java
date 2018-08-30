package com.academy.learnprog.section9.callkotlinfromjava;

import com.academy.learnprog.section9.kotlincode.Challenge;
import com.academy.learnprog.section9.kotlincode.Employee;
import com.academy.learnprog.section9.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");

    }
}
