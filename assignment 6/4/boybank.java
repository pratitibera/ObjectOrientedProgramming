class Bank{
    double balance;
    double getBalance(){
        return(0);
    }
}


class BankA extends Bank{
    double getBalance(){
        return(1000);
    }
}

class BankB extends Bank{
    double getBalance(){
        return(1500);
    }
}


class BankC extends Bank{
    double getBalance(){
        return(2000);
    }
}


public class boybank {
    public static void main(String[] args) {
        Bank bk = new Bank();
        BankA ba = new BankA();
        BankB bb = new BankB();
        BankC bc = new BankC();

        System.out.println("Bank Balance: " + bk.getBalance());
        System.out.println("BankA Balance: " + ba.getBalance());
        System.out.println("BankB Balance: " + bb.getBalance());
        System.out.println("BankC Balance: " + bc.getBalance());
    }
}