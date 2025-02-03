import java.util.Scanner;
class ATM{
    float Balance;
    int PIN =12345;


    public void checkpin(){
    System.out.println("Enter your pin: ");
    Scanner sc=new Scanner(System.in);
    int enteredpin=sc.nextInt();

    if(enteredpin==PIN){
        menu();

    }
    else{
        System.out.println("Enter a valid pin");
    }}

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check your A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3.Deposit Moeny");
        System.out.println("4.EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt ==1){
            CheckBalance();

        }
        else if(opt==2){
            WithdrawMoney();


        }
        else if(opt==3){
            depositMoney();

        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }

    public void CheckBalance(){
        System.out.println("Balance: "+ Balance);
        menu();

    }


    public void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Funds.");

        }else{
            Balance=Balance- amount;
            System.out.println("Money Withdraw Successfull");
        }
        menu();

    }

    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        Balance = Balance +amount;
        System.out.println("Money Deposited Successfully");



    }

}
public class ATMMachine {
    public static void main(String[] args){

        ATM obj=new ATM();
        obj.checkpin();


    }
}
