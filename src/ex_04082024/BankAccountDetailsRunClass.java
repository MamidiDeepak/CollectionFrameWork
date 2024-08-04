package ex_04082024;

public class BankAccountDetailsRunClass {

      public static void main(String[] args) {

        BankAccountDetails bad = new BankAccountDetails("ICICI", "RajKumar", "ICIC0000785");
        bad.getCustomerBankDetailsWithoutParams();

        BankAccountDetails bad1 = new BankAccountDetails("Syndicate", "Girish", "Synd3234220");
        System.out.println();
        bad1.getCustomerBankDetailsWithoutParams();

          BankAccountDetails bad2 = new BankAccountDetails("Axis", "javed", "Axis687674220");
          System.out.println();
          bad2.getCustomerBankDetailsWithoutParams();

          BankAccountDetails bad3 = new BankAccountDetails("IOB", "Umesh", "IOB000322");
          System.out.println();
          bad3.getCustomerBankDetailsWithoutParams();

    }
}
