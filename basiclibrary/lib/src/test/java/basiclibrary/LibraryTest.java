/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library testing= new Library();

    @Test public  void testRollNum(){
        int [] array=testing.roll(7);
        assertEquals(7,array.length);

    }
    @Test public void  testContainsDuplicates(){
        int[] arr1={4,3,6,7};
        int[] arr2={7,6,9,3,1,1,4,10};
assertTrue(testing.containsDuplicates(arr1));
        assertTrue(testing.containsDuplicates(arr2));    }
    @Test public void testCalculateAvg(){
        int [] arr1={4,4,4,4};
        assertEquals(4,testing.calculateAvg(arr1));
    }
    @Test public void  testlowestaverage() {
        int[][] arr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] exppectedValue={55, 54, 60, 53, 59, 57, 61};
        assertArrayEquals(exppectedValue,testing.lowestaverage(arr));
    }
    @Test public void teatWeatherData (){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected =
              "Never saw temperature: 59\n" +
                      "Never saw temperature: 61\n" +
                      "Never saw temperature: 62\n" +
                      "Never saw temperature: 63\n" +
                      "Never saw temperature: 67\n" +
                      "Never saw temperature: 68\n" +
                      "Never saw temperature: 69\n" +
                      "Max Value =70Min Value =52";


        assertEquals(expected,testing.weatherData(weeklyMonthTemperatures));
    }
    @Test public void testTally(){
        List<String> votes  = new ArrayList<>();
        votes .add("Bush");
        votes .add("Bush");
        votes .add("Bush");
        votes .add("Shrub");
        votes .add("Hedge");
        votes .add("Shrub");
        votes .add("Bush");
        votes .add("Hedge");
        votes .add("Bush");
        assertEquals("Bush",testing.tally(votes));
    }

    }




