import java.util.Scanner;
class AddAmount{
double amount = 50;
public AddAmount(){
}
public AddAmount( double amt){
amount = amt + amount;
System.out.println("Amount is: "+amount);
}
}
public class Piggie{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double am;
System.out.println("Enter amount to be added=");
am = sc.nextDouble();
AddAmount obj = new AddAmount();
AddAmount ob = new AddAmount(am);
//ob.display();
}
}

