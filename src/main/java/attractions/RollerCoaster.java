package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

    private double defaultPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        defaultPrice = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor){
//        Have assumed >=12 and >=145 are okay
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } return false;
    }

    public double defaultPrice(){
        return defaultPrice;
    }

    public double priceFor(Visitor visitor){
//        Have assumed >= 200 is double price
        if (visitor.getHeight() < 200){
            return defaultPrice;
        }
        return defaultPrice * 2;
    }

}
