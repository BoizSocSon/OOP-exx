public abstract class Shape {
    protected Point centerPoint;
    private static int shapeCount = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        shapeCount++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public static int getShapeCount() {
        return shapeCount;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Tâm: " + centerPoint;
    }
}
