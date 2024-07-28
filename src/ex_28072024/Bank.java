package ex_28072024;

public class Bank {

    String bankName;

    String bankAddress;

    void deposit(){
        System.out.println("Can deposit..");
    }

    void withDraw(){
        System.out.println("Can withdraw");
    }

    public static void main(String[] args) {

        Bank f1 = new Bank();
        f1.bankName = "HDFC";
        System.out.println(f1.bankName);
        f1.deposit();

        Bank f2 = new Bank();
        f2.bankName = "ICICI";
        System.out.println(f2.bankName);
        f2.withDraw();
    }
}
