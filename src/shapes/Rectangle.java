package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

//    protected int length;
//
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    public static void main(String[] args) {
//        Rectangle rect1 = new Rectangle(10, 17);
//        System.out.printf("The area of the rectangle is %d.%nThe perimeter of the rectangle is %d.", rect1.getArea(), rect1.getPerimeter());
//    }


