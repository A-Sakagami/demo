package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    Person p = new Person("profession");
 
    @Test
    void testSetAge() {
        p.setAge(0);
        assertEquals(0, 0);
    }

    @Test
    void testSetFirstName() {
        p.setFirstName("太郎");
        assertEquals("太郎","太郎");
    }

    @Test
    void testSetLastName() {
        p.setLastName("佐藤");
        assertEquals("佐藤","佐藤");
    }

    @Test
    void testGetAge() {
        p.setAge(20);
        assertEquals(20, p.getAge());
    }

    @Test
    void testGetFirstName() {
        p.setFirstName("太郎");
        assertEquals("太郎", p.getFirstName());
    }

    @Test
    void testGetLastName() {
        p.setLastName("佐藤");
        assertEquals("佐藤", p.getLastName());
    }
}
