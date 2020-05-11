package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        bankAccount Anna= new bankAccount();
        Anna.accountHolder="Anna";
        Anna.accountNumber=123456;

        Anna.checkingBalance();
        Anna.deposit(33.00);

        Anna.checkingBalance();
        Anna.withdraw(10);
        Anna.checkingBalance();
        Anna.withdraw(1000);
        Anna.checkingBalance();
      //  System.out.println(Anna);THIS will give day33_CustomClass.bankAccount@1b6d3586

        System.out.println("===============");

        System.out.println(Anna);
    }
}
