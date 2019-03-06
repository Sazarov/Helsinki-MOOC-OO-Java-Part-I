
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account mattAccount = new Account("Matt's account", 1000d);
        Account myAccount = new Account("My account", 0d);

        mattAccount.withdrawal(100d);
        myAccount.deposit(100d);

        System.out.println(mattAccount);
        System.out.println(myAccount);
    }

}
