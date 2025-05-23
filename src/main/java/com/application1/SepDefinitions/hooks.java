package com.application1.SepDefinitions;

import io.cucumber.java.Before;

public class hooks {

    @Before
    public static  void setupBeforeLogin()
    {
        System.out.println("Launch the url ");
    }
}
