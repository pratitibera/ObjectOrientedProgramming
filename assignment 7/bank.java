import java.util.Scanner;
public class bank
    {
        double interest;
        bank()
        {
            interest = 0.0;
        }
        bank(double pr, double r, int ti)
        {
            interest = (pr*r*ti)/100;
        }
        void display()
        {
            System.out.println("Interest =" + interest);
        }
    
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int t;
            double p, r1, r2;
            System.out.println("Enter the time");
            t = sc.nextInt();
            System.out.println("Enter the principal");
            p = sc.nextDouble();
            System.out.println("Enter rate of interest for first bank");
            r1 = sc.nextDouble();
            System.out.println("Enter the rate of interest for second bank");
            r2 = sc.nextDouble();
            bank ubi = new bank(p, r1, t);
            ubi.display();
            bank hdfc = new bank(p, r2, t);
            hdfc.display();
        }
    }
    