package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.printf("The area of the rectangle is %d.%nThe perimeter of the rectangle is %d.%n", box1.getArea(), box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("The area of the square is %d.%nThe perimeter of the square is %d.%n", box2.getArea(), box2.getPerimeter());
    }
}