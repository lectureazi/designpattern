package k_templatecallback;

public class TimeChecker {
    public void measure(Measurable target){
        long start = System.currentTimeMillis();

        target.measure();

        long end = System.currentTimeMillis();
        System.out.printf( "소요시간 : %s \n", end - start);
    }
}
