import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void main(String[] args) {

        while(true){
            clearScreen();
            System.out.printf("\n%-18s %-8s %-5s%n", "Nama", "Class", "GPA");
            System.out.println("===============================");
            for(Student s : students){
                s.showInfo();
            }
            System.out.println("===============================");
            System.out.println("1. Add new student");
            System.out.println("2. Edit student data");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> addStudent();
                case 2 -> editStudents();
                case 3 -> removeStudent();
                case 4 -> System.exit(0);
            }
        }

    }
    public static void addStudent(){
        String nama, kelas;
        double gpa;
        char confirm = 'N';

        do{
            scanner.nextLine();
            clearScreen();
            System.out.println("=====ADD STUDENT=====");
            System.out.print("Enter name : ");
            nama = scanner.nextLine();

            System.out.print("Enter class : ");
            kelas = scanner.nextLine();

            System.out.print("Enter GPA : ");
            gpa = scanner.nextDouble();

            scanner.nextLine();
            System.out.println("====Is this the correct data?====");
            System.out.printf("%-18s %-8s %-5.1f\n", nama, kelas, gpa);
            System.out.print("Enter answer (Y/N) : ");
            confirm = scanner.nextLine().toUpperCase().charAt(0);
            if(confirm == 'N'){
                System.out.print("Press Enter to refill the data! ");
            }
        }while(confirm == 'N');
        students.add(new Student(nama, kelas, gpa));
    }

    public static void removeStudent() {
        clearScreen();
        if (students.isEmpty()) {
            System.out.println("No students to remove!");
            return;
        }

        System.out.println("===== STUDENT LIST =====");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%d. %-15s %-8s %-5.1f%n", i, students.get(i).nama, students.get(i).kelas, students.get(i).gpa);
        }

        System.out.print("Enter index of student to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < students.size()) {
            System.out.println("Removing: " + students.get(index).nama);
            students.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void editStudents() {
        clearScreen();
        if (students.isEmpty()) {
            System.out.println("No students to edit!");
            return;
        }

        System.out.println("===== STUDENT LIST =====");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%d. %-15s %-8s %-5.1f%n", i, students.get(i).nama, students.get(i).kelas, students.get(i).gpa);
        }

        System.out.print("Enter index of student to modify: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < students.size()) {
            System.out.println("Choosen Student's Data : ");
            System.out.printf("%-15s %-8s %-5.1f%n", students.get(index).nama, students.get(index).kelas, students.get(index).gpa);
            System.out.print("Enter name : ");
            students.get(index).nama = scanner.nextLine();

            System.out.print("Enter class : ");
            students.get(index).kelas = scanner.nextLine();

            System.out.print("Enter GPA : ");
            students.get(index).gpa = scanner.nextDouble();

            scanner.nextLine();   
        } else {
            System.out.println("Invalid index!");
        }
    }
}