public class Complex {
int real;
int img;

public Complex() {
}
public Complex(int real, int img) {
this.real = real;
this.img = img;
}
Complex Sum(Complex c1,Complex c2)
{
Complex temp =new Complex();
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
Complex Diff(Complex c1,Complex c2)
{
Complex temp =new Complex();
temp.real=c1.real-c2.real;
temp.img=c1.img-c2.img;
return temp;
}
Complex Mul(Complex c1,Complex c2)
{
Complex temp =new Complex();
temp.real=(c1.real*c2.real)-(c1.img*c2.img);
temp.img=(c1.real*c2.img)+(c1.img+c2.real);
return temp;
}
Complex Div(Complex c1,Complex c2)
{
Complex temp =new Complex();
int dval=c2.real*c2.real + c2.img*c2.img;
temp.real=((c1.real*c2.real)+(c1.img*c2.img)/dval);
temp.img=((c2.real*c2.img)-(c1.img*c1.real)/dval);
return temp;
}
double argument()
{
return Math.atan(this.img/this.real);
}
void print()
{
if(this.img<0)
System.out.println(this.real+this.img+"i");
else
System.out.println(this.real+ "+"+this.img+"i");
}
}
import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st complex number in format a+bi");
int a1=sc.nextInt();
int b1=sc.nextInt();
Complex c1=new Complex(a1, b1);
System.out.println("Enter 2nd complex number in format a+bi");
int a2=sc.nextInt();
int b2=sc.nextInt();
Complex c2=new Complex(a2, b2);
System.out.println("argument of 1st complex number"+c1.argument());
System.out.println("argument of 2nd complex number"+c2.argument());
Complex c3=new Complex();
System.out.println("Sum");
c3=c3.Sum(c1, c2);
c3.print();
System.out.println("Subtract");
c3=c3.Diff(c1, c2);
c3.print();
System.out.println("Multiply");
c3=c3.Mul(c1, c2);
c3.print();
System.out.println("Division");
c3=c3.Div(c1, c2);
c3.print();
sc.close();
}
