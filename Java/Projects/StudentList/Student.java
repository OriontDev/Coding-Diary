public class Student{
    String nama;
    String kelas;
    double gpa;
    static int total;

    public Student(String nama, String kelas, double gpa){
        this.nama = nama;
        this.kelas = kelas;
        this.gpa = gpa;
        total++;
    }

    static int totalStudent(){
        return total;
    }
    public void setData(String nama, String kelas, double gpa){
        this.nama = nama;
        this.kelas = kelas;
        this.gpa = gpa;
    }

    public void showInfo(){
        System.out.printf("%-18s %-8s %-5.1f%n", this.nama, this.kelas, this.gpa);
    }
}