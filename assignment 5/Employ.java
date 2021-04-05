import java.util.Scanner;
class Employee {
 String name,address;
 int age;
 Employee(String name, String address , int age){
 this.name=name;
 this.address=address;
 this.age=age;
 }
 void display(){
 System.out.println("Name : "+this.name);
 System.out.println("Address : "+this.address);
 System.out.println("Age : "+this.age);
 }
}
 class Manager extends Employee{
 String department;
 int salary;
 Manager(String name, String address , int age, String department , int salary){
 super(name, address, age);
 this.department=department;
 this.salary=salary;
 }
 void display(){
 super.display();
 System.out.println("Department : "+this.department);
 System.out.println("Salary : "+this.salary);
 }
}
 class Worker extends Employee{
 int worked_days,daily_wages,total_salary;
 Worker(String name, String address , int age , int worked_days, int daily_wages,int total_salary ){
 super(name, address, age);
 this.worked_days=worked_days;
 this.daily_wages=daily_wages;
 this.total_salary=total_salary;
 }
 void display(){
 super.display();
 System.out.println("Worked days : "+this.worked_days);
 System.out.println("Daily Wages : "+this.daily_wages);
 System.out.println("Total Salary : "+this.total_salary);
 }
}
public class Employ {
	public static void main(String args[]) {
 String name,address,department;
 int age,salary,worked_days,daily_wages,total_salary;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Name of Manager : ");
 name=sc.nextLine();
 System.out.print("Enter Address of Manager : ");
 address=sc.nextLine();
 System.out.print("Enter Age of Manager : ");
 age=Integer.parseInt(sc.nextLine());
 System.out.print("Enter Department of Manager : ");
 department=sc.nextLine();
 System.out.print("Enter Salary of Manager : ");
 salary=Integer.parseInt(sc.nextLine());
 Manager m =new Manager(name, address, age,
department, salary);
 m.display();
 System.out.print("Enter Name of Worker : ");
 name=sc.nextLine();
 System.out.print("Enter Address of Worker : ");
 address=sc.nextLine();
 System.out.print("Enter Age of Worker : ");
 age=Integer.parseInt(sc.nextLine());
 System.out.print("Enter Worked Days of Worker : ");
 worked_days=Integer.parseInt(sc.nextLine());
 System.out.print("Enter Daily Wages of Worker : ");
 daily_wages=Integer.parseInt(sc.nextLine());
 System.out.print("Enter Total Salary of Worker : ");
 total_salary=Integer.parseInt(sc.nextLine());
 Worker w=new Worker(name, address, age, worked_days,
daily_wages, total_salary);
 w.display();
 sc.close();
 }
}

