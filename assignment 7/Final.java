import java.util.Scanner;
class Complex
    {
        double real;
        double imaginary;
        
        Complex()
        {
        }
        
        Complex(double real, double imaginary)
        {
            this.real = real;
            this.imaginary = imaginary;
        }
        
        Complex add(Complex C1, Complex C2)
        {
            Complex temp = new Complex();
            temp.real = C1.real + C2.real;
            temp.imaginary = C1.imaginary + C2.imaginary;
            //System.out.println(temp);
            return temp;
        }
        
        Complex sub(Complex C1, Complex C2)
        {
            Complex temp = new Complex();
            temp.real = C1.real - C2.real;
            temp.imaginary = C1.imaginary - C2.imaginary;
            //System.out.println(temp);
            return temp;
        }
        
        Complex mul(Complex C1, Complex C2)
        {
            Complex temp = new Complex();
            temp.real = C1.real * C2.real;
            temp.imaginary = C1.imaginary * C2.imaginary;
            //System.out.println(temp);
            return temp;
        }
        
        Complex div(Complex C1, Complex C2)
        {
            Complex temp = new Complex();
            temp.real = C1.real/C2.real;
            temp.imaginary = C1.imaginary/C2.imaginary;
            //System.out.println(temp);
            return temp;
        }
        
        void printcomplex()
        {
            System.out.println("Complex number is "+real +" + "+imaginary+" i ");
        }
    }
    public class Final
    {
        public static void main(String args[])
        {
            Complex C1 = new Complex(7,3);
            C1.printcomplex();
            Complex C2 = new Complex(2,5);
            C2.printcomplex();
            
            Complex C3 = new Complex();
            C3 = C3.add(C1,C2);
            System.out.println("Sum:");
            C3.printcomplex();
            System.out.println("The real part is "+C3.real +" The imaginary part is "+C3.imaginary);
            System.out.println("The arguement is "+Math.atan(C3.imaginary/C3.real));
            
            C3 = C3.sub(C1,C2);
            System.out.println("Difference:");
            C3.printcomplex();
            System.out.println("The real part is "+C3.real +" The imaginary part is "+C3.imaginary);
            System.out.println("The arguement is "+Math.atan(C3.imaginary/C3.real));
            
            C3 = C3.mul(C1,C2);
            System.out.println("Product:");
            C3.printcomplex();
            System.out.println("The real part is "+C3.real +" The imaginary part is "+C3.imaginary);
            System.out.println("The arguement is "+Math.atan(C3.imaginary/C3.real));
            
            C3 = C3.div(C1,C2);
            System.out.println("Division:");
            C3.printcomplex();
            System.out.println("The real part is "+C3.real +" The imaginary part is "+C3.imaginary);
            System.out.println("The arguement is "+Math.atan(C3.imaginary/C3.real));
        }
    }