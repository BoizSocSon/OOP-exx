public class Square extends Rectangle {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Hình vuông - " + super.toString();
    }
}
