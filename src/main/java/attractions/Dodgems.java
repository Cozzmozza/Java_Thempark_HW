package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        defaultPrice = 4.50;
    }

//    Dodgems implements ITicketed and charge half price to children under 12 years old

    public double defaultPrice(){
        return defaultPrice;
    }

    public double priceFor(Visitor visitor){
//        Assumed 12 and over do not get discount
        if (visitor.getAge() < 12){
            return defaultPrice / 2;
        } return defaultPrice;
    }
}
