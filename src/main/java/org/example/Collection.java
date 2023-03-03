package org.example;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
    /**
     * Given a list of integers, return the highest integer
     * @param numbers - a list of integers
     * @return the largest integer
     */
    public static int findMax(List<Integer> numbers) {
        TreeSet<Integer> setMakesLifeEasy = new TreeSet<>();
        setMakesLifeEasy.addAll(numbers);
        return setMakesLifeEasy.pollLast();
    }

    /**
     * Given a list of integers, return the lowest integer
     * @param numbers - a list of integers
     * @return the smallest integer
     */
    public static int findMin(List<Integer> numbers) {
        TreeSet<Integer> setMakesLifeEasy = new TreeSet<>();
        setMakesLifeEasy.addAll(numbers);
        return setMakesLifeEasy.pollFirst();
    }

    /**
     * Given a set of integers, remove all integers which are less than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeLessThan(Set<Integer> numbers, int target) {
        TreeSet<Integer> sampleSet = new TreeSet<>();
        sampleSet.addAll(numbers);
        numbers.removeAll(sampleSet.headSet(target));
    }

    /**
     * Given a set of integers, remove all integers which are greater than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeGreaterThan(Set<Integer> numbers, int target) {
        TreeSet<Integer> sampleSet = new TreeSet<>();
        sampleSet.addAll(numbers);

        numbers.retainAll(sampleSet.headSet(target+1));

    }

    /**
     * Given a queue of strings, remove half of all strings
     * Specifically, the size of the queue after the method is invoked should be equal to
     * floor(N/2) where N is the original size
     * @param strings - the queue of strings to mutuate
     */
    public static void removeHalf(Queue<String> strings) {
        int removeLength = (int) java.lang.Math.floor(strings.size()/2);
        int count = 0;
        while(strings.size() > removeLength){
            strings.remove();
        }

    }
}
