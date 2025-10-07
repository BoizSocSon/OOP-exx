public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật - " + super.toString() +
                ", Rộng: " + width + ", Cao: " + height +
                ", Diện tích: " + getArea() +
                ", Chu vi: " + getPerimeter();
    }
}
