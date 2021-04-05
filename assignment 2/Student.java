import java.util.*;
class StudentDetails {
    int age;
    String name, add;
    StudentDetails() {
    	name = "unknown";
        age = 0;
        add = "not available";
    }
    
    StudentDetails(String name,int age,String add) {
    this.name=name;
    this.age=age;
    this.add=add;
    }

    void setinfo(String nam, int ag) {
        name = nam;
        age = ag;
        System.out.println("The details of students is " + "Name: " + name + " Age: " + age);

    }

    void setinfo(String nam, int ag, String addres) {
        name = nam;
        age = ag;
        add = addres;
        System.out.println("The details of students is " + "Name: " + name + " Age is: " + age + "Address is: " + add);
    }
}
class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age;
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        String Name, Address;
        System.out.println(" Enter Details of Students ");

        for (int i = 0; i < n; i++) {
            System.out.println(" Enter details of " + (i + 1) + " Student");
            System.out.println("Name : ");
            Name = sc.next();
            System.out.println("Age : ");
            Age = sc.nextInt();
            System.out.println("Address : ");
            Address = sc.next();
            StudentDetails obj = new StudentDetails();
            obj.setinfo(Name,Age,Address);
        }
    }
}


