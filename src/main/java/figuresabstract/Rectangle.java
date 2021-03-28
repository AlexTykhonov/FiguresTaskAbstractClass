package figuresabstract;

public class Rectangle extends Figures {

    public Rectangle(long rectangleSideALength, long rectangleSideBLength) {
        super(rectangleSideALength, rectangleSideBLength);
        System.out.println("Периметр прямоугольника "+getPerimeterRect(rectangleSideALength,rectangleSideBLength));
        System.out.println("Площадь прямоугольника "+getSquareRect(rectangleSideALength, rectangleSideBLength));
    }
}
