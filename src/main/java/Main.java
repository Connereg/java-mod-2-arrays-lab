import java.util.Scanner;

class Student {
    public String name;
}

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        String[] nameList = new String[10];
        for (int i = 0; i < 10; i++) {
            askStudentName();
            String replyInput = scanner.nextLine();
            Student thisStudent = new Student();
            thisStudent.name = replyInput;
            System.out.println("Adding this student to studentlist: " + thisStudent.name);
            nameList[i] = thisStudent.name;
        }
        scanner.close();
        for (String student : nameList) {
            System.out.println(student);
        }
        
    } // MAIN END

    public static void askStudentName() {
        System.out.println("Enter student's name: ");
        
    }
}
