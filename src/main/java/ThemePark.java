import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {


//    ThemePark stores all Attractions and Stalls in it.
//    ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.
//    Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions
//          and a method to add an attraction to the list.
//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1
//          and adds the attraction to the visitors visitedAttractions list.

    private ArrayList<IReviewed> reviewedArray;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollercoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;


    public ThemePark() {
        reviewedArray = new ArrayList<>();
    }


    public ArrayList getAllReviewed(){
//        There's surely a better way for the following?
        reviewedArray.add(dodgems);
        reviewedArray.add(park);
        reviewedArray.add(playground);
        reviewedArray.add(rollercoaster);
        reviewedArray.add(candyflossStall);
        reviewedArray.add(iceCreamStall);
        reviewedArray.add(tobaccoStall);
        return reviewedArray;
    }

    public int countReviewed(){
        return reviewedArray.size();
    }


}
