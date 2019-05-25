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
        mixedList.add(3);
        mixedList.add(5);
        mixedList.add(6);


        OddNumbersExterminator evenList = new OddNumbersExterminator();
        ArrayList<Integer> afterMethod = evenList.exterminate(mixedList);

        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(2);
        testList.add(6);


        Assert.assertEquals(testList, afterMethod);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()

    {
        ArrayList<Integer> mixedList = new ArrayList<Integer>();

        OddNumbersExterminator evenList = new OddNumbersExterminator();
        ArrayList<Integer> afterMethod = evenList.exterminate(mixedList);

        ArrayList<Integer> testList = new ArrayList<Integer>();

        Assert.assertEquals(testList, afterMethod);
    }
        }
