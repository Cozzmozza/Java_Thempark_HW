import attractions.Attraction;
import attractions.Park;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

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

    @Test
    public void reviewedArrayListContainsOurObjects(){
        themePark.getAllReviewed();
    }

//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1
//    and adds the attraction to the visitors visitedAttractions list.
//    Currently both tests are failing due to null object. The attraction object is null

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
}
