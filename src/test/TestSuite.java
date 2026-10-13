/*
 * Course: CSC-1110
 * Homework 6: Vending Machine
 * Test Suite
 * Name: TODO
 * Last Updated: TODO
 */
package test;

import username.VendingMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * A small series of tests to verify the structure of the VendingMachine.java class
 */
public class TestSuite {
    @DisplayName("Testing VendingMachine internals")
    @Order(1)
    @Test
    void paymentSumIsPrivateDouble() throws NoSuchFieldException {
        Class<?> vendingMachineClass = VendingMachine.class;
        Field paymentSum = vendingMachineClass.getDeclaredField("paymentSum");
        Assertions.assertEquals(double.class, paymentSum.getType(),
                "paymentSum should be of type double");
        Assertions.assertTrue(Modifier.isPrivate(paymentSum.getModifiers()),
                "paymentSum should be private");
        Assertions.assertFalse(Modifier.isStatic(paymentSum.getModifiers()),
                "paymentSum should be an instance paymentSum (not static)");
    }

    @Test
    void insertMoneyIsPublicVoidScannerParam() throws NoSuchMethodException {
        Class<?> vendingMachineClass = VendingMachine.class;
        Method insertMoney = vendingMachineClass.getDeclaredMethod("insertMoney", Scanner.class);
        Assertions.assertTrue(Modifier.isPublic(insertMoney.getModifiers()),
                "insertMoney() should be public");
        Assertions.assertFalse(Modifier.isStatic(insertMoney.getModifiers()),
                "insertMoney() is an instance method (not static)");
        Assertions.assertEquals(void.class, insertMoney.getReturnType(),
                "insertMoney() should return void");
        Assertions.assertEquals(1, insertMoney.getParameterCount(),
                "insertMoney() should have exactly one parameter");
        Assertions.assertEquals(Scanner.class, insertMoney.getParameterTypes()[0],
                "insertMoney() parameter type should be Scanner");
    }

    @Test
    void selectItemIsPublicVoidScannerParam() throws NoSuchMethodException {
        Class<?> vendingMachineClass = VendingMachine.class;
        Method selectItem = vendingMachineClass.getDeclaredMethod("selectItem", Scanner.class);
        Assertions.assertTrue(Modifier.isPublic(selectItem.getModifiers()),
                "selectItem() should be public");
        Assertions.assertFalse(Modifier.isStatic(selectItem.getModifiers()),
                "selectItem() is an instance method (not static)");
        Assertions.assertEquals(void.class, selectItem.getReturnType(),
                "selectItem() should return void");
        Assertions.assertEquals(1, selectItem.getParameterCount(),
                "selectItem() should have exactly one parameter");
        Assertions.assertEquals(Scanner.class, selectItem.getParameterTypes()[0],
                "selectItem() parameter type should be Scanner");
    }
}
