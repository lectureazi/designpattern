package g_builder.quiz;

public class Run {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10);
        int res = cal.plus(100).plus(50).plus(50).minus(100).calculate();
        System.out.println(res);
    }
}
