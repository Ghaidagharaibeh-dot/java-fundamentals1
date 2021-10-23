package inhertince;

import java.util.HashMap;
import java.util.LinkedList;

public class Theater {
    private String name;
    private LinkedList<String> moviesList = new LinkedList<>();
    private HashMap<Review, String> reviewsForTheater = new HashMap<>();

    private int numOfRatingTheater=0;
    private double theaterRate=0;


    public Theater(String name) {
        this.name = name;
    }

    public String addMovies(String movie){
        if (moviesList.contains(movie)){
            return " The movie exist in the list";
        }else {
            this.moviesList.add(movie);
            return " Add "+movie+" to list";}
    }
    public void removeMovies(String movie){
        this.moviesList.remove(movie);
    }

    public HashMap<Review, String> getReviewsForTheater() {
        return reviewsForTheater;
    }

    public String reviewTheater( Review review,String movie){
        if( review.getNumOfStars()<0 || review.getNumOfStars() > 5){
            return ("number of starts for review only between 0 and 5");
        }
        else {
            reviewsForTheater.put(review,movie);
            numOfRatingTheater++;
            theaterRate=((review.getNumOfStars()+theaterRate)/numOfRatingTheater);
            this.theaterRate=theaterRate;
            return "new rating have been added for "+name+" the rate is "+ review.getNumOfStars() ;



        }
    }
    @Override
    public String toString(){
        return  "Theater{" +
                "name='" + name + '\'' +
                ", moviesName=" + moviesList +
                '}';
    }
}
