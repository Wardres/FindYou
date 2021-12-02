package com.example.findyou.helpers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
    private Validator validator;

    @Before
    public void setUp() throws Exception {
        this.validator = new Validator();
    }

    @Test
    public void confirmInputsRegister() throws Exception{

        assertEquals(true,validator.confirmInputsRegister("email@mail.com", "123","123"));
    }

    @Test
    public void confirmInputsLogin() throws Exception{
        assertEquals(true,validator.confirmInputsLogin("prueba@mail.com","123"));


    }

    @Test
    public void confirmInputsRegisterPass() throws Exception{

        assertEquals(false,validator.confirmInputsRegisterPass("321","123"));

    }
}