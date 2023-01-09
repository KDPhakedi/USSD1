import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Transaction Transaction1 = new Transaction("1234567891","Keoagile Phakedi", 50.00, "12345");




        Scanner input = new Scanner(System.in);
        Scanner inputValues = new Scanner(System.in);

        System.out.print("\nEnter the user transaction number1: ");
        String Acc_No = input.nextLine();


        double amount = Transaction1.getBalance();
        String pin = Transaction1.getPassword();
        System.out.print("Enter a pin: ");
        String password = input.nextLine();
        int options;
        String AccounNo = Transaction1.getAccount_No();

        do
        {
            System.out.print("\nWelcome" + "\t" + Transaction1.getName());
            if(password.equalsIgnoreCase(pin) && Acc_No.equalsIgnoreCase(AccounNo))
            {
                System.out.print("\nYour balance is : "+ amount);
                System.out.print("\nSelect an the option:\n 1. Deposit \n 2. Withdraw \n 3. Send money \n 4. Exit/Cancel \n");
                options = inputValues.nextInt();
                if(options == 1)
                {
                    System.out.print("Enter deposit amount for transaction1: R ");
                    double DepositCash = inputValues.nextDouble();
                    System.out.print(DepositCash +" has been deposited to your account\n");
                    Transaction1.deposit(DepositCash);
                    System.out.printf("%s balance: $%.2f%n", Transaction1.getName(),Transaction1.getBalance());
                    break;

                }
                else if(options == 2)
                {
                    System.out.print("Enter amount to Withdraw: R ");
                    double withdraw = inputValues.nextDouble();
                    if(Transaction1.getBalance() >= withdraw)
                    {
                        Transaction1.withdraw(withdraw);
                        System.out.print(withdraw + " Has been withdrawn\n");
                        System.out.printf("%s balance: $%.2f%n", Transaction1.getName(),Transaction1.getBalance());
                        break;
                    }
                    else
                    {
                        System.out.print("The amount " + withdraw + " is not available or is below limit (R30).");
                        break;
                    }
                }
                else if(options == 3)
                {
                    System.out.print("Enter amount to send: R ");
                    double Send = inputValues.nextDouble();
                    if(Transaction1.getBalance() >= Send)
                    {
                        System.out.print("Enter phone number to send to: ");
                        String number = input.next();
                        if(number.length() == 10)
                        {
                            System.out.print(Send + " has been send to "+ number);
                            Transaction1.SendMoney(Send);
                            System.out.print("\nBalance is: "+ Transaction1.getBalance());
                            break;
                        }
                        else
                        {
                            System.out.print("You entered incorrect phone number");
                            break;
                        }
                    }
                    else
                    {
                        System.out.print("The amount " + Send + " is not available or is below limit (R20).");
                        break;
                    }
                }
                else if(options == 4)
                {
                    System.out.print("Thank you!");
                    break;
                }
            }
            else
            {
                System.out.print("Entered a wrong pin or account number");
                break;
            }
        }
        while((options == 1 || options == 2 || options == 3));
    }
}