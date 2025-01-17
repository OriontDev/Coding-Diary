public class Student{
    String name;
    int age;
    double gpa;
    boolean IsEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.IsEnrolled = true;
    }

    void Study(){
        System.out.println(this.name+" Is studying");
    }
}