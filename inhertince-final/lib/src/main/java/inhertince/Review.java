package inhertince;

public class Review {

    private String body;
    private String author;
    private int numOfStars;

    public Review(String body, String author, int numOfStarts) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStarts;
//
//
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStarts=" + numOfStars +
                '}';
    }
}
