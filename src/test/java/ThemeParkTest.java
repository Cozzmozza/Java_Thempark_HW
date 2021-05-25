import attractions.Attraction;
import attractions.Park;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;


public class ThemeParkTest {

    ThemePark themePark;
    Park attraction;
//    Attraction attraction;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        attraction = new Park("Playpark", 5);
        visitor = new Visitor(20, 180, 20.00);
    }

    @Test
    public void returnsCountOfReviewed(){
        themePark.getAllReviewed();
        assertEquals(7, themePark.countReviewed());
    }

//    @Test
//    public void reviewedArrayListContainsOurObjects(){
////        Make a list of objects here to check they are added etc
//        themePark.getAllReviewed();
//    }

    @Test
    public void attractionVisitCountIncrementsBy1(){
        themePark.visit(visitor, attraction);
        assertEquals(1, attraction.getVisitCount());
    }

    @Test
    public void visitorAttractionsListSizeIncreasesByOne(){
        themePark.visit(visitor, attraction);
        assertEquals(1, visitor.getAttractionCount());
    }

    //    ThemePark has a method that can return a new HashMap<String, Integer> with all reviews.
//    The HashMap will have a key of the name and value of review.

    @Test
    public void themeparkCanReturnReviewsHashMapCount(){
        assertEquals(7, themePark.getReviewsCount());
    }
}
