import java.util.Scanner;
public class Triangle {
    public static double triangle_area(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }

  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Input Side-1: ");
         double s1 = sc.nextDouble();
         System.out.print("Input Side-2: ");
         double s2 = sc.nextDouble();
         System.out.print("Input Side-3: ");
         double s3 = sc.nextDouble();
         if(s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {
            System.out.println("The area of the triangle is " + triangle_area(s1, s2, s3));
         }
         else {
            System.out.println("Triangle not possible");
         }
    }
}
