package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person me = new Person("Adenaan", "Davids", true);

    @Test
    public void equalityTest() {
        assertEquals(me.getName(), "Adenaan");     //wont pass if name is not the same as actual
        //assertNull(me.getName());                     //wont pass if object is not null
        //assertNotNull(me.getName());                //wont pass if object is null
    }

    @Test
    public void identityTest(){
        //assertTrue(me.getDeadOrAlive());                        //wont pass if constructor value is false
        //assertFalse(me.getDeadOrAlive());                   //wont pass if constructor value is true
        assertSame(true, me.getDeadOrAlive());          //wont pass if constructor value is false
    }

    @Ignore         //ignores disablingTest() test
    @Test
    public void disablingTest() {
        assertEquals(me.getName(), "Adenaan");     //wont pass if name is not the same as actual
    }

    @Test
    public void failingTest() {
        //Assert.fail("Deliberate fail");
        fail("Fail on purpose");
    }

    @Test (timeout = 1)
    public void timeOutTest(){
        me.timeOut();
    }

}