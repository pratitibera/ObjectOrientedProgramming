abstract class Bank
{
    abstract void getBalance();
}
class BankA extends Bank
{
    void getBalance()
    {
        System.out.println("Bank A balance - $100");
    }
}
class BankB extends Bank
{
    void getBalance()
    {
        System.out.println("Bank B balance - $150");
    }
}
class BankC extends Bank
{
    void getBalance()
    {
        System.out.println("Bank C balance - $200");
    }
}
public class Program_2
{
    public static void main(String args[])
    {
        Bank obj=new BankA();
        obj.getBalance();
        Bank obj1=new BankB();
        obj1.getBalance();
		Bank obj2=new BankC();
        obj2.getBalance();
    }
}