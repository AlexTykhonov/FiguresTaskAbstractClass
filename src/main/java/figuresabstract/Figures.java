package figuresabstract;


//Сделай иерархию по геометрическим фигурам(базовый класс фигура) абстрактные методы
// вычисления площади/периметра и конкретные классы треугольник, прямоугольник и т.д.

public abstract class Figures {

    Long circleRadius;
    Long rectangleSideALength;
    Long rectangleSideBLength;
    Long squareSideLength;
    Long triangleAlength;
    Long triangleBlength;
    Long triangleClength;
    Long triangleHeighttoAlength;


    public Figures(Long triangleAlength, Long triangleBlength, Long triangleClength, Long triangleHeighttoAlength) {
        this.triangleAlength = triangleAlength;
        this.triangleBlength = triangleBlength;
        this.triangleClength = triangleClength;
        this.triangleHeighttoAlength = triangleHeighttoAlength;
    }

    public Figures(Long circleRadius) {
        this.circleRadius = circleRadius;
    }

    public Figures(Long rectangleSideALength, Long rectangleSideBLength) {
        this.rectangleSideALength = rectangleSideALength;
        this.rectangleSideBLength = rectangleSideBLength;
    }


    //circle
    long getSquareCircle(long circleRadius) {
        return (long) (3.14159265156 * circleRadius*circleRadius);
    }

    long getPerimeterCircle(long circleRadius) {
        return (long) (2*3.14159265156 * circleRadius);    }

    // rectangle
    long getSquareRect(long rectangleSideALength, long rectangleSideBLength) {
        return rectangleSideALength * rectangleSideBLength;
    }

    long getPerimeterRect(long rectangleSideALength, long rectangleSideBLength) {
        return (rectangleSideALength + rectangleSideBLength) * 2;
    }

    //quadrat
    long getSquareQuad(long squareSideLength) {
        return squareSideLength * 2;
    }

    long getPerimeterQuad(long squareSideLength) {
        return squareSideLength * 4;
    }

    // triangle

    long getSquareTriangle(long sideA, long triangleHeighttoAlength) {
        return sideA * triangleHeighttoAlength / 2;
    }

    long getPerimeterTriangle(long triangleAlength, long triangleBlength, long triangleClength) {
        return triangleAlength + triangleBlength + triangleClength;

    }

}
