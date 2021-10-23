package inhertince;

import java.util.LinkedList;

public class Shop {

    private String name;
    private String description;
    private int numberOfDollarSigns;

    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    LinkedList<Review> reviewShop = new LinkedList<>();

    public LinkedList<Review> getReviewShop() {
        return reviewShop;
    }

    public void setReviewShop(LinkedList<Review> reviewShop) {
        this.reviewShop = reviewShop;
    }

    public void shopReview(Review review){
        this.reviewShop.add(review);
    }

    public String dollarNum(int numberOfDollarSigns) {
        if (numberOfDollarSigns <= 10) {
            return "$";
        } else if (numberOfDollarSigns<10 || numberOfDollarSigns <= 25) {
            return "$$";
        } if (numberOfDollarSigns<25 || numberOfDollarSigns <= 50) {
            return "$$$";
        } else {
            return "$$$$";
        }
    }
    public String toString(){
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSign=" + numberOfDollarSigns +
                '}';
    }

}
