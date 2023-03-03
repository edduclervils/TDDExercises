package org.example;

import org.junit.*;
import java.util.*;


public class CollectionTest {
    static Collection collection;
    Queue<String> names = new PriorityQueue<>();
    Set<Integer> grades = new TreeSet<>();
    List<Integer> newList = new ArrayList<>();
    @Before
    public void setUp(){

        names.add("Mario");
        names.add("Luigi");
        names.add("Peach");
        names.add("Bowser");
        names.add("Link");
        names.add("Zelda");
        names.add("Ganandorf");
        names.add("Sheik");
        names.add("Saria");
        names.add("Beedle");
        names.add("Sochan");

        grades.add(100);
        grades.add(1);
        grades.add(12);
        grades.add(34);
        grades.add(23);
        grades.add(56);
        grades.add(40);
        grades.add(62);
        grades.add(73);
        grades.add(86);
        grades.add(99);
        grades.add(-4);
        grades.add(-19);

        newList.add(41);
        newList.add(17);
        newList.add(-22);
        newList.add(45);
        newList.add(34);
        newList.add(66);
        newList.add(54);
        newList.add(-85);
        newList.add(-2);
        newList.add(69);
        newList.add(91);
        newList.add(91);
        newList.add(-7);
    }


    @Test
    public void testFindMax(){
        Assert.assertEquals(91, collection.findMax(newList));
    }

    @Test
    public void testFindMin(){
        Assert.assertEquals(-85, collection.findMin(newList));
    }

    @Test
    public void testRemoveLessThan(){
        Set<Integer> testSet = new TreeSet<>();
        testSet.add(100);
        testSet.add(56);
        testSet.add(62);
        testSet.add(73);
        testSet.add(86);
        testSet.add(99);
        collection.removeLessThan(grades,50);
        Assert.assertEquals(testSet, grades );
    }

    @Test
    public void testRemoveGreaterThan(){
        Set<Integer> testSet = new TreeSet<>();
        testSet.add(-19);
        testSet.add(-4);
        testSet.add(1);
        testSet.add(12);
        testSet.add(23);
        testSet.add(34);
        testSet.add(40);
        collection.removeGreaterThan(grades,50);
        Assert.assertEquals(testSet, grades );
    }



    @Test
    public void testRemoveHalfOdd(){
        int oldLength = names.size();
        collection.removeHalf(names);
        Assert.assertEquals((int)java.lang.Math.floor(oldLength/2), names.size());
    }




    @Test
    public void testRemoveHalfEven(){
        names.add("Keldon");
        int oldLength = names.size();
        collection.removeHalf(names);
        Assert.assertEquals(oldLength/2, names.size() );
    }

}