package figuresabstract;

public class Triangle extends Figures {

    public Triangle(long triangleAlength, long triangleBlength, long triangleClength, long triangleHeighttoAlength) {
        super(triangleAlength, triangleBlength, triangleClength, triangleHeighttoAlength);
        System.out.println("Периметр треугольника: "+getPerimeterTriangle(triangleAlength, triangleBlength,triangleClength));
        System.out.println("Площадь треугольника: "+getSquareTriangle(triangleAlength, triangleHeighttoAlength));
    }

}
