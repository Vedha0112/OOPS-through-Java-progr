abstract class Bank {
    abstract void  getBalance();
}
class BankA extends Bank {
    double balance = 1010.0; // Balance for Bank A
    void getBalance() {
        System.out.println(balance);
    }
}

class BankB extends Bank {
   double balance = 1050.0; // Balance for Bank B
    void getBalance() {
        System.out.println(balance);
    }
    }
class BankC extends Bank {
     double balance = 2500.0; // Balance for Bank C
    void getBalance() {
        System.out.println(balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
bankA.getBalance();
bankB.getBalance();
bankC.getBalance();
    }
}
