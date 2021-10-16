import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int x=2;
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(2);
        clock ();
    }
    public static String pluralize (String animal ,int num ){
        if(num == 0 || num > 1){
            return animal+ "s";
        }
        else {
            return animal;
        }

    }
    public static void flipNHeads(int num){
        int counter=0;
        int heads=0;

        while (heads != num ){
            double random = Math.random();
            if (random >= .5){
                System.out.println("heads");
                heads++;
            }
            else {
                System.out.println("tails");
                heads=0;
            }
            counter++ ;

        }
        System.out.println("It took " + counter + " to flip " + num + " heads in row");

    }
    public static void clock(){
        LocalDateTime nowDate =LocalDateTime.now();
        int sec =nowDate.getSecond();
        while (true){
            nowDate = LocalDateTime.now();
            if(nowDate.getSecond() - sec == 1 ||  nowDate.getSecond() - sec == -59){
                sec= nowDate.getSecond();
                String time=nowDate.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }
    }
}
