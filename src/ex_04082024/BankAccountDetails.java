package ex_04082024;

public class BankAccountDetails {

    String bankName;
    String customerName;
    String bankCode;

    BankAccountDetails(String bn1, String cn1, String bc1){
        this.bankName = bn1;
        this.customerName = cn1;
        this.bankCode = bc1;
    }

    void getCustomerBankDetailsWithoutParams(){
        System.out.println("Customer Bank Name is -> "+bankName);
        System.out.println("Customer Name is -> "+customerName);
        System.out.println("Customer Bank Code is -> "+bankCode);
    }
}
