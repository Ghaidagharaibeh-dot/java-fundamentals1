package inheritance.src.main.java;

import org.w3c.dom.ls.LSOutput;

public class Review {

    private String body;
    private String author;
    private int numOfStarts;

    public Review(String body, String author, int numOfStarts) {
        this.body = body;
        this.author = author;
        this.numOfStarts = numOfStarts;
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

    public int getNumOfStarts() {
        return numOfStarts;
    }

    public void setNumOfStarts(int numOfStarts) {
        this.numOfStarts = numOfStarts;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStarts=" + numOfStarts +
                '}';
    }
}

