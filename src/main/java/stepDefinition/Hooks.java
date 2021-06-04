package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@forgot")
    public void myMethod1()
    {
        System.out.println("===>> I am in before Hook >>>>");
    }

    @After ("@forgot")
    public void myMethod2()
    {
        System.out.println("===>> I am in After Hook >>>>");
    }
}
