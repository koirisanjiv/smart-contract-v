package com.qaverse.smart.contracts.assertion;

public interface AssertionListener {
    void onSuccess(String message);
    void onFailure(String message, Throwable error);
}