package problems;

import org.junit.Test;

import static org.junit.Assert.*;
import static problems.howGoodAreYou.betterThanAverage;

/**
 * Created by Bauyrzhan Aigelov on 01.07.2019.
 */
public class howGoodAreYouTest {
    @Test
    public void tests(){
        assertEquals(true, betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, betterThanAverage(new int[] {100, 90}, 11));
    }
}