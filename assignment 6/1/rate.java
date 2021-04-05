import java.util.Scanner;
class Bank {
    double r;
    Bank(double r) {
        this.r = r;
    }
    void display () {
        System.out.println("Rate of interest is:" + r +'%');
    }
}
class sbi extends Bank {
    sbi(double r){
        super(r);
    }
    void display(){
        super.display();
    }
}
class icici extends Bank {
    icici(double r){
        super(r);
    }
    void display(){
        super.display();
    }
}
class axis extends Bank {
    axis(double r){
        super(r);
    }
    void display(){
        super.display();
    }
}
public class rate {
    public static void main(String args[]) {
 double r1, r2,r3;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter rate of interest of sbi bank: ");
 r1=sc.nextDouble();
 sbi s = new sbi(r1);
 s.display();
 System.out.print("Enter rate of interest of icici bank:");
 r2=sc.nextDouble();
 icici i = new icici(r2);
 i.display();
 System.out.print("Enter rate of interest of axis bank:");
 r3=sc.nextDouble();
 axis a = new axis(r3);
 a.display();
 }
}
