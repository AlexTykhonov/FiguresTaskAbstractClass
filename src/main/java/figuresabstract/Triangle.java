package figuresabstract;

public class Triangle extends Figures {

long sideA, sideB, sideC,heightToA;

    public Triangle(Long circleRadius, Long rectangleSideALength, Long rectangleSideBLength, Long squareSideLength, Long triangleAlength, Long triangleBlength, Long triangleClength, Long triangleHeighttoAlength, long sideA, long sideB, long sideC, long heightToA) {
        super(circleRadius, rectangleSideALength, rectangleSideBLength, squareSideLength, triangleAlength, triangleBlength, triangleClength, triangleHeighttoAlength);
        this.sideA = triangleAlength;
        this.sideB = triangleBlength;
        this.sideC = triangleClength;
        this.heightToA = triangleHeighttoAlength;
        get
    }
}
