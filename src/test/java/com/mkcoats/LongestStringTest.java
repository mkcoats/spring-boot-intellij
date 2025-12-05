package com.mkcoats;

import org.junit.jupiter.api.*;

class LongestStringTest {
    @BeforeEach
    void setUp() {
        System.out.println("setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @Test
    void findLongestString() {
        System.out.println("findLongestString");
    }

    @Test
    void willNotFindWhenInputIsEmpty() {
        System.out.println("willNotFindWhenInputIsEmpty");
    }
}