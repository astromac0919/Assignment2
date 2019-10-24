import java.util.ArrayList;
import java.util.Scanner;
public class Profiles {

    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int N = myObj.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i = 0; i < N; i++) {
            Student Student1 = new Student();
            Student1.getinfo();
            students.add(Student1);
        }
        System.out.println("Students Details, Department of ILT");
        for(int i=0; i<N; i++){
            Student currentstudent = students.get(i);
            currentstudent.displayinfo();
        }
        System.out.println("Total Number of Students: " + Student.count(students));
    }
}
