import java.util.Scanner;
class Student{
    String name = "";
    public Student(){
        name = "Unknown";
    }
    public Student(String n){
        name = n;
        System.out.println(name);
    }
}
public class StudentName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String na[] = new String [100];
        int i, c;
        System.out.println("Enter the number of students");
        c = sc.nextInt();
        for (i=0;i<c;i++){
            System.out.println("Enter the name");
            na[i] = sc.next();
            Student obj = new Student(na[i]);
        }
    }
}
