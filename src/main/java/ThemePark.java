import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {


//    ThemePark stores all Attractions and Stalls in it.
//    ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.
//    Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions
//          and a method to add an attraction to the list.
//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1
//          and adds the attraction to the visitors visitedAttractions list.

    private ArrayList<IReviewed> reviewedArray;
    private HashMap<String, Integer> reviewsHashMap;

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollercoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;


    public ThemePark() {
        reviewedArray = new ArrayList<>();
        reviewsHashMap = new HashMap<>();
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


//    ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1
//    and adds the attraction to the visitors visitedAttractions list.

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.increaseVisitCounter();
        visitor.addAttraction(attraction);
    }

//    ThemePark has a method that can return a new HashMap<String, Integer> with all reviews.
//    The HashMap will have a key of the name and value of review.

    public void setReviews() {
//        This method will loop through the arraylist of ireviewed, and add the properties to hashmap
        // confusion over rating.. or visitor review..?

        this.getAllReviewed(); // this is giving us a null problem when trying to do line 73
        for(IReviewed review : reviewedArray){
            reviewsHashMap.put(review.getName(), review.getRating());
        }
//        Debugger shows that the reviewedArray does have all 7 IReviewed objects, but they are all..null..
//        Do we need to initialise all the attractions first in our test?
    }

    public int getReviewsCount() {
        setReviews();
        return reviewsHashMap.size();
    }

}
