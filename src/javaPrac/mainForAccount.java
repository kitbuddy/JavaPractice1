package javaPrac;

import java.util.ArrayList;

public class mainForAccount {

    public static void main(String[] args) {

        int noOfOwners = 3;

        ArrayList<Account> accounts = new ArrayList<Account>();

        Account account = new Account("Ankit", 2, 3);
        Account account2 = new Account("seepika", 1, 4);
        Account account3 = new Account("pulkit", 3, 1);

        accounts.add(account);
        accounts.add(account2);
        accounts.add(account3);

        for (int i = 0; i < noOfOwners-1; i++) {
            mainForAccount.compareTwoAccounts(accounts.get(i), accounts.get(i + 1));
        }

    }

    private static void compareTwoAccounts(Account account, Account account2)  {

        if( account.compareTo(account2) > account2.compareTo(account)) {
            System.out.println(account.toString());
        } else {
            System.out.println(account2.toString());
        }

    }
}
