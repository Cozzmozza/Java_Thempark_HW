package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void heightAgeCheckCanReturnTrueForGoodAgeAndHeight(){
        visitor = new Visitor(18, 150, 20.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void heightAgeCheckCanReturnFalseForGoodAgeAndBadHeight(){
        visitor = new Visitor(18, 140, 20.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void heightAgeCheckCanReturnFalseForBadAgeAndGoodHeight(){
        visitor = new Visitor(11, 150, 20.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void heightAgeCheckCanReturnFalseForBadAgeAndHeight(){
        visitor = new Visitor(11, 140, 20.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChangePriceForTallPeople(){
        visitor = new Visitor(20, 201, 20.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void defaultPriceForNonTallPeople(){
        visitor = new Visitor(20, 199, 20.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void canIncreaseVisitCount(){
        rollerCoaster.increaseVisitCounter();
        assertEquals(1, rollerCoaster.getVisitCount());
    }
}
