import java.util.*;
 class ATMmachine {
    
   private double balance;

    public ATMmachine ( double initialBalance){
        this.balance =initialBalance;
    }
    public void deposite (double amount){
        if(amount > 0){

            balance += amount;
            System.out.println("Deposite successful!");
        }
        else{
            System.out.println("Please enter a valid amount.");
        }
    }
    public void withdraw(double amount){

        if(amount > 0 && amount <= balance){
            balance = balance-amount;
            System.out.println("Please collect your cash");
            System.out.println("Now your balance is Rs: " +balance);
        }
        
        else{
            System.out.println("insufficient balance to withdraw.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){

        ATMmachine atm = new ATMmachine(2000.0);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("**********WELCOME**********");

            System.out.println("ATM Menu: ");
            

            System.out.println("1. Check Amount");

            System.out.println("2. Deposite");

            System.out.println("3. Withdraw");

            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            System.out.println("-------------------------------------------");

            switch(choice){

                case 1:
                 System.out.println("Current amount:Rs" + atm.getBalance());
                break;

                case 2: System.out.println("Enter the deposite amount: Rs ");
                double depositeAmount = scanner.nextDouble();
                break;
                
                case 3: System.out.println("Enter the withdrawal amount: Rs");
                double withdrawAmount = scanner.nextDouble();
                atm.withdraw(withdrawAmount);
                break;

                case 4: System.out.println("Thanks for using ATM");
                System.exit(0);

                default:
                System.out.println("Invalid choice.Please select a valid option.");

            }
        }
    }

    
}

