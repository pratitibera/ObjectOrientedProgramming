import java.util.Scanner;
public class Wrapclass
    {
        public static void main(String args[])
        {
            float principal;
            float rate;
            float time;
            float interest;
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the principal amount");
            principal = sc.nextFloat();
            System.out.println("Enter the rate");
            rate = sc.nextFloat();
            System.out.println("Enter the time");
            time = sc.nextFloat();
        
            Float p=principal;
            Float r=rate;
            Float t=time;
            
            interest=(p*r*t)/100;
            Float i =Float.valueOf(interest);
            Float ints=interest;
            Float amt = ints + p; 
            
            System.out.println("The Interest is : "+ints);
            System.out.println("The Amount is:" + amt);
        }
    }
