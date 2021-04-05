abstract class parent
{
   abstract void message();
}
class child1 extends parent
{
    void message()
    {
        System.out.println("This is first subclass");
    }
}
class child2 extends parent
{
    void message()
    {
        System.out.println("This is second subclass");
    }
}
public class Program_1
{
    public static void main(String args[])
    {
        parent obj=new child1();
        obj.message();
        parent obj1=new child2();
        obj1.message();
    }
}