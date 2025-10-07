import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Khởi tạo các hình
        shapes.add(new Rectangle(new Point(0, 0), 4, 6));
        shapes.add(new Square(new Point(2, 3), 5));
        shapes.add(new Circle(new Point(-3, 4), 3));

        // 1️⃣ In số lượng hình đã khởi tạo
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getShapeCount());
        System.out.println("--------------------------------------------------");

        // 2️⃣ Danh sách chi tiết các hình
        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------");

        // 3️⃣ Danh sách tâm điểm
        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
