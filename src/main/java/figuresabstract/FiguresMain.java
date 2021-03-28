package figuresabstract;

import java.util.WeakHashMap;

public class FiguresMain {

    public static void main(String[] args) {
        new Triangle(12,15,20,15);
        new Circle(25);
        new Rectangle(12,25);
        new Square();// does not work!

    }
}
