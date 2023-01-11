package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(length, 2);
    }
}

//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea() {
//        return (int) Math.pow(side, 2);
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }
//
//    public static void main(String[] args) {
//        Square square1 = new Square(5);
//        System.out.printf("The area of the square is %d.%nThe perimeter of the square is %d.", square1.getArea(), square1.getPerimeter());
//    }
