package com.qaverse.smart.contracts.assertion;

public interface AssertionStrategy {
    void assertTrue(boolean condition, String message);
    void assertEquals(Object actual, Object expected, String message);
    void assertAll();
}