package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
import java.lang.*;



public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> mixedList = new ArrayList<Integer>();
        mixedList.add(2);
        mixedList.add(4);
        mixedList.add(5);
        mixedList.add(6);
        mixedList.add(78);
        mixedList.add(-12);
        mixedList.add(13);
        mixedList.add(2670);

        OddNumbersExterminator tester = new OddNumbersExterminator();
        tester.exterminate(mixedList);
        int a = mixedList.get(3);
        int b = tester.exterminate(mixedList).get(2);
        Assert.assertEquals(a, b);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testOddNumbersExterminatorEmptyList() throws Exception

    {
        ArrayList<Integer> mixedList = new ArrayList<Integer>();

        OddNumbersExterminator tester = new OddNumbersExterminator();
        tester.exterminate(mixedList);
        int a = mixedList.get(0);
        int b = tester.exterminate(mixedList).get(0);
        Assert.assertEquals(a, b);
    }
        }
