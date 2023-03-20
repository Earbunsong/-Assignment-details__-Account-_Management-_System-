import java.util.*;

class Account{
    int id;
    String ownerName;
    double balance;

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
public class Main {
    //acc id owner balance
    //add acc add edit remove show
    //show account information
    // 1. descending order by acc_id
    // 2. ascending order by acc_id
    // 3.descending order by balance

    public static void main(String[] args) {
        int option;
        List<Account> accountList = new ArrayList<>();
        Scanner song = new Scanner(System.in);
        do{
//            System.out.println("Please Enter the option : ");
            System.out.println("1 . Add Account : ");
            System.out.println("2 . Remove Account : ");
            System.out.println("3 . Edit Account : ");
            System.out.println("4 . Show account information : ");
            System.out.println("5 . Exit ");
            System.out.println("Choose option (1 - 5 ) : ");
            option = song.nextInt();

            switch (option){
                case 1 :
                    //enter account information
                    //object add list
                    //accountList.add();
                    System.out.println("Enter your account information ");
                    Account acc = new Account();
                    System.out.print("Input ID:");
                    acc.id = song.nextInt();
                    System.out.print("Name:");
                    song.nextLine();
                    acc.ownerName = song.nextLine();
                    System.out.print("Balance:");
                    acc.balance = song.nextInt();

                    accountList.add(acc);
                    //Iterator<String> i = accountList.iterator();

                    break;
                case 2 :
                    boolean idExist = false;
                    System.out.print("Enter the account ID to Remove  : ");
                    int editID = song.nextInt();
                    for (Account account : accountList) {
                        if (account.id == editID) {
                            idExist = true;
                            System.out.println("+++++++++++++++++++++Enter new account information++++++++++");
                            System.out.print(" Input new account Named  : ");
                            song.nextLine();
                            account.ownerName = song.nextLine();
                            System.out.print("Input new Balanced : ");
                            account.balance = song.nextDouble();
                            System.out.println("Account with ID : " + editID + " updated successfully. ");
                        }
                    }
                    if(!idExist) {
                        System.out.println(" Wrong ID  , Please input ID again .");
                    }
                    break;
                case 3 :
                    boolean idfound = false;
                    System.out.print("Enter the account ID to Edit : ");
                    int removeID = song.nextInt();
                    Iterator<Account> iter = accountList.iterator();
                    while (iter.hasNext()) {
                        Account a = iter.next();
                        if (a.id == removeID) {
                            idfound = true;
                            iter.remove();
                            System.out.println("Account with ID : " + removeID + " has removed successfully.");
                        }
                    }
                    if(!idfound) {
                        System.out.println("Wrong ID Please input again.");
                    }
                    break;
                case 4 :
                    int showOption ;
                    System.out.println("Show account information");
                    System.out.println("1. Ascending order (by ID )");
                    System.out.println("2. Descending order (by ID) ");
                    System.out.println("3. Descender order by balance ");

                    System.out.println("Choose show option : ");
                    showOption =  song.nextInt();
                    switch (showOption){
                        case 1:
                            Collections.sort(accountList, Comparator.comparingInt(a -> a.id));
                            for (Account account1: accountList) {
                                System.out.println(account1);
                            }
                        case 2:
                            Collections.sort(accountList, Comparator.comparingInt(Account::getId).reversed());
                            for (Account account : accountList) {
                                System.out.println(account);
                            }
                            break;
                        case 3:
                            Collections.sort(accountList, Comparator.comparingDouble(Account::getBalance).reversed());
                            for (Account account : accountList) {
                                System.out.println(account);
                            }
                            break;
                    }
                    break;
                case 5 :
                    System.out.println("Exit the program....!");
                    break;
                default:
                    System.out.println("Wrong Option! Please choose from (1-5).");
                    break;
            }
        }while (option !=5);
    }
}