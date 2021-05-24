import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
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

}
