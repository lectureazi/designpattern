package a_encapsulation.method;

public class Run {

    public static void main(String[] args) {
        SpringConcert concert = new SpringConcert();
        concert.start();

        System.out.println("=======================");
        SummerConcert summerConcert = new SummerConcert();
        summerConcert.start();
    }
}
