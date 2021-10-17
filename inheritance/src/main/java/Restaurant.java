package inheritance.src.main.java;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double starts;
    private double priceCategory;
    private double ratingNum=0;
    private double rate=0;
    private ArrayList<Review> ratingList = new ArrayList<>();


    public Restaurant (String name,double rating,double priceCategory){
        this.name=name;
        this.starts=rating;
        this.priceCategory=priceCategory;

    }

    public String getName() {
        return name;
    }

    public double getStarts() {
        return starts;
    }

    public void setStarts(double starts) {
        this.starts = starts;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }



    public ArrayList<Review> getRatingList() {
        return ratingList;
    }

    public void setRatingList(ArrayList<Review> ratingList) {
        this.ratingList = ratingList;
    }




    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + starts +
                ", priceCategory=" + priceCategory +
                '}';
    }

    public void addReview(Review review) {

    }
}
