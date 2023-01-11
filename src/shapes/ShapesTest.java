package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.printf("The area of the rectangle is %d.%nThe perimeter of the rectangle is %d.%n", box1.getArea(), box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.printf("The area of the square is %d.%nThe perimeter of the square is %d.%n", box2.getArea(), box2.getPerimeter());
}

//    9. Rectangle is not abstract and does not override abstract method getPerimeter in Measurable.
//    10.
