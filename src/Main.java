public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Nguyen Van A", "a@school.edu", "SV001");
        Student st2 = new Student("Le Thi B", "b@school.edu", "SV002");

        Teacher tc1 = new Teacher("Dr. Tran Van C", "c@school.edu", "GV001", "PhD");
        Advisor ad1 = new Advisor("Nguyen Van D", "d@company.com");

    // Use Person as the advisor type in KLTN to avoid generic invariance issues
    KLTN<Student, Person> kltn1 = new KLTN<>("AI in Healthcare", st1, tc1);
    KLTN<Student, Person> kltn2 = new KLTN<>("Blockchain in Finance", st2, ad1);

    ListSortable<KLTN<Student, Person>> listKLTN = new ListSortable<>();
        listKLTN.add(kltn1);
        listKLTN.add(kltn2);

        System.out.println("Danh sách các khóa luận sau khi sắp xếp:");
        listKLTN.print();
    }
}
