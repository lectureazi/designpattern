package g_builder.quiz;

public class Calculator {

    private int res;

    public Calculator(int res) {
        this.res = res;
    }

    // plus
    public Calculator plus(int n) {
        res += n;
        return this;
    }

    // minus
    public Calculator minus(int n) {
        res -= n;
        return this;
    }

    // calculate
    public int calculate(){
        return res;
    }
}
