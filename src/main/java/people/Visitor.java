package people;

import attractions.Attraction;
import behaviours.IReviewed;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
//    private ArrayList<Attraction> visitorAttractions;

    private ArrayList<IReviewed> visitorAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitorAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

//    public void addAttraction(Attraction attraction){
//        visitorAttractions.add(attraction);
//    }

    public void addAttraction(IReviewed attraction){
        visitorAttractions.add(attraction);
    }

    public ArrayList getAttractions(){
        return visitorAttractions;
    }

    public int getAttractionCount(){
        return visitorAttractions.size();
    }
}
