package com.driver.test;

import static org.junit.Assert.*;

import com.driver.RWOnly;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args) {
        testSetterGetter();
    }

    public static void testSetterGetter() {
        RWOnly obj = new RWOnly();

        // Test setting and getting name
        obj.setName("Alice");
        assert obj.getName().equals("Alice") : "Error in testSetterGetter: Failed to set or get name correctly.";

        // Test setting and getting another name
        obj.setName("Bob");
        assert obj.getName().equals("Bob") : "Error in testSetterGetter: Failed to set or get name correctly.";

        // Test setting and getting name with spaces
        obj.setName("Charlie Smith");
        assert obj.getName().equals("Charlie Smith") : "Error in testSetterGetter: Failed to set or get name correctly.";

        System.out.println("testSetterGetter passed successfully.");
    }
}
