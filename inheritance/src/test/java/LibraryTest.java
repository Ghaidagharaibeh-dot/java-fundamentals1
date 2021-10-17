package inheritance.src.test.java;//package inheritance.src.test.java;


import inheritance.src.main.java.Restaurant;
import inheritance.src.main.java.Review;
import org.junit.Test;

import javax.crypto.Mac;

public class LibraryTest {

//    @Test
//    public void toStringRestaurant(){
//        Restaurant restaurant =new Restaurant("Mac",5,100);
//        String output = restaurant.toString();
//        System.out.println(output);
//        String name;
//        String expected = Restaurant(name="Mac",rating=5,priceCategory=100);
//        assertEquals(output,expected);

//    }
    public Review review =new Review("Mac","ghgh",100);

    @Test
    public void toStringReview(){
        String output = review.toString();
        System.out.println(output);
//        String expected = "Review{(body=' Mac',author='ghgh',numOfStarts=100)}";
//        assertEquals(output,expected);
    }

//    private void assertEquals(String output, String expected) {
//    }

}

