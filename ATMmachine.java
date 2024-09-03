package ATMmachine;

import java.util.Scanner;

class ATM
{
    int pin=7029;
    float Bal;

    public void checkPin()
    {
        System.out.println("Enter your pin :: ");
        Scanner sc=new Scanner(System.in);
        int enterepin =sc.nextInt();
        if (enterepin==pin)
        {
            menu();
        }
        else
        {
            System.out.println("!Wrong Pin!");
            System.out.println("Enter a valid pin\n");
            checkPin();
        }
    }

    public void menu()
    {
        System.out.println("Enter your Choice ::");
        System.out.println("1. Check A/C Balance ::");
        System.out.println("2. Withdraw Money ::");
        System.out.println("3. Deposit Money ::");
        System.out.println("4. Exit ::");
        Scanner sc=new Scanner(System.in);
        int ch= sc.nextInt();
        switch (ch)
        {
            case 1:
                checkbalance();
                break;

            case 2:
               withdrawmoney();
               break;
            case 3:
                depositmoney();
                break;
            case 4:
                break;
            default:
                System.out.println("Enter a valid Choice!!");
        }

    }


    public void checkbalance()
    {
        System.out.println("Balance :: "+Bal);
        menu();
    }


    public void withdrawmoney()
    {
        System.out.println("Enter amount to Withdraw ::");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        if(amount>Bal)
        {
            System.out.println("Insufficient Balance!!");
        }
        else
        {
            Bal = Bal - amount;
            System.out.println("Money Withdraw Successful");
        }
        menu();
    }

    public void depositmoney()
    {
        System.out.println("Enter amount ::");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        Bal = Bal + amount;
        System.out.println("Money Deposit Successful");
        menu();
    }
}
public class ATMmachine {
    public static void main(String[] args) {

        ATM A = new ATM();
        A.checkPin();
    }
}
