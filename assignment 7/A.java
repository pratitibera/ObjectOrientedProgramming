public class A
    {
        static void print()
        {
            System.out.println("Parent");
        }
        
        public static void main(String args[])
        {
            A a = new A();
            B b = new B();
            System.out.println("This is normal function call :-");
            a.print();
            b.print();
            A a2 = new A();
            A b2 = new B();
            System.out.println("This is parent reference function call :-");
            a2.print();
            b2.print();
        }
    }
    
    class B extends A
    {
        static void print()
        {
            System.out.println("Child");
        }
    }