import java.util.Scanner;
class Rectangle{
double l,b;
public Rectangle(){ 
    l=0.0;
    b=0.0;
}
public Rectangle(double l, double b){
    this.l = l;
    this.b = b;
}
public Rectangle(double x){
l = x;
b = x;
}
public void display(){
System.out.println("Area = " + (l*b));
}
}
public class RectangleArea{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double len, bre;
System.out.println("Enter the length");
len = sc.nextDouble();
System.out.println("Enter the breadth");
bre = sc.nextDouble();
System.out.println("Enter a value");
double val = sc.nextDouble();
Rectangle ob = new Rectangle();
Rectangle obj = new Rectangle(len, bre);
Rectangle obje = new Rectangle(val);
obj.display();
}
}

