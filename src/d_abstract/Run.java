package d_abstract;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<Figure>();
        figures.add(new Circle(5));
        figures.add(new Rectangle(5,5));

        for (Figure figure : figures) {
            System.out.println(figure.calArea());
        }
    }
}
