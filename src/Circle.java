public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Hình tròn - " + super.toString() +
                ", Bán kính: " + radius +
                ", Diện tích: " + String.format("%.2f", getArea()) +
                ", Chu vi: " + String.format("%.2f", getPerimeter());
    }
}
