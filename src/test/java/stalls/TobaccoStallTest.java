package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void ageCheckCanReturnTrue(){
        visitor = new Visitor(18, 150, 20.00);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void ageCheckCanReturnFalse(){
        visitor = new Visitor(17, 150, 20.00);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(1, tobaccoStall.getRating());
    }
}
