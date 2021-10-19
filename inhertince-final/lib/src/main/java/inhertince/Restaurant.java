package inhertince;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double starts;
    private String priceCategory;



    public Restaurant (String name, String priceCategory){
        this.name=name;
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



    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }



    private ArrayList<Review> review = new ArrayList<>();

    public ArrayList<Review> getReviews() {
        return review;
    }
    public void addReview(Review review){
        this.review.add(review);
        updateStarts();
    }
    public void  updateStarts(){
        double value = 0;
        for(int i = 0; i < getReviews().size(); i++){
            value += getReviews().get(i).getNumOfStars();
        }
        value = value/(getReviews().size());
        value = Math.round(value );
        this.starts = value;
    }




//    public ArrayList<Review> getRatingList() {
//        return ratingList;
//    }
//
//    public void setRatingList(ArrayList<Review> ratingList) {
//        this.ratingList = ratingList;
//    }




    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Review review : this.review){
            stringBuilder.append(review);
        }

        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + starts +
                ", priceCategory=" + priceCategory +
                ", Reviews=" + stringBuilder +
                '}';
    }

//    public void addReview(Review review) {
//
//    }
}
