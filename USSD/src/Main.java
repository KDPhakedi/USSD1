
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
        {
            Transaction Transaction1 = new Transaction();


            Scanner input = new Scanner(System.in);
            Scanner inputValues = new Scanner(System.in);

            System.out.print("\nEnter the user account number: ");
            String Acc_No = input.nextLine();


            double amount = Transaction1.getbalance();
            String pin = Transaction1.getPassword();
            System.out.print("Enter a pin: ");
            String password = input.nextLine();
            int options;
            String AccounNo = Transaction1.getAccount_No();

            do
            {
                System.out.print("\nWelcome" + "\t" + Transaction1.getNameSurname());
                if(password.equalsIgnoreCase(pin) && Acc_No.equalsIgnoreCase(AccounNo))
                {
                    System.out.print("\nYour balance is : "+ amount);
                    System.out.print("\nSelect an the option:\n 1. Deposit \n 2. Withdraw \n 3. Send money \n 4. Exit/Cancel \n");
                    options = inputValues.nextInt();
                    if(options == 1)
                    {
                        System.out.print("Enter amount to deposit: R ");
                        double DepositCash = inputValues.nextDouble();
                        amount = amount + DepositCash;
                        System.out.print(DepositCash +" has been deposited to your account");


                    }
                    else if(options == 2)
                    {
                        System.out.print("Enter amount to Withdraw: R ");
                        double withdraw = inputValues.nextDouble();
                        if(amount >= withdraw && amount >= 50 && withdraw >= 20)
                        {
                            System.out.print(withdraw + " Has been printed");
                            amount = amount - withdraw;
                        }
                        else
                        {
                            System.out.print("The amount " + withdraw + " is not available or is below limit (R20).");
                        }
                    }
                    else if(options == 3)
                    {
                        System.out.print("Enter amount to send: R ");
                        double Sendmoney = inputValues.nextDouble();
                        if(amount >= Sendmoney && amount >= 50 && Sendmoney >= 20)
                        {
                            System.out.print("Enter phone number to send to: ");
                            String number = input.next();
                            if(number.length() == 10)
                            {
                                amount = amount - Sendmoney;
                                System.out.print(Sendmoney + " has been send to "+ number);
                                System.out.print("\nBalance is: "+ amount);

                            }
                            else
                            {
                                System.out.print("You entered incorrect phone number");
                            }
                        }
                        else
                        {
                            System.out.print("The amount " + Sendmoney + " is not available or is below limit (R20).");
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

