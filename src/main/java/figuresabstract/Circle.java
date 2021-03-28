package figuresabstract;

public class Circle extends Figures {
    public Circle(long circleRadius) {
        super(circleRadius);
        System.out.println("Периметр круга - "+getPerimeterCircle(circleRadius));
        System.out.println("Площадь круга - "+getSquareCircle(circleRadius));
    }
}
