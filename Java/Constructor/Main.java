public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Oriont", 15, 3.5);
        Student student2 = new Student("Yana", 16, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        student1.Study();
        student2.Study();
    }
}