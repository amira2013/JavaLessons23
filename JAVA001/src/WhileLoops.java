import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//w1();
// w2();
// w3();
w4();
//w5();
    }
    public static void w1(){
        int i=1;
        while (i<=10){
            System.out.print(i +" ");
            i++;
        }
    }
    public static void w2(){
        Scanner input=new Scanner(System.in);
        int number=0;
        while (number<=0){
            System.out.println("Enter a non negative number");

            number=input.nextInt();
        }
        System.out.println("You have entered "+number);
    }
    public static void w3(){
        Scanner input=new Scanner(System.in);
        int sum=0;
        int number;
        System.out.println("enter numbers(enter 0 to exit)");
        do{
            number=input.nextInt();
            sum +=number;}
            while (number!=0);
            System.out.println("The sum is:  "+sum);

    }
    public static void w4() {
        Scanner i = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:  ");
            System.out.println("1.option 1");
            System.out.println("2.option2");
            System.out.println("3.exit");
            System.out.println("Enter your choice:  ");
            choice = i.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("option 1 is seleted");
                case 2:
                    System.out.println("option 2 is seleted");
                case 3:
                    System.out.println("Exit");
                case 4:
                    System.out.println("Invalid choice");
                    break;

            }
        } while (choice != 3);
    }
    public static void w5(){
        Random random=new Random();
        int targetNum=6;
        int rolledNum;
        do{
         rolledNum=random.nextInt(6)+1;
            System.out.println("rolled: "+rolledNum);
        }while (rolledNum!=targetNum);
        System.out.println("Target rolled number");
    }
}


