package arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sim=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any number");
        int number= sc.nextInt();
        for (int i=0;i<number;i++){
            if(i%2==0){
              sim+=i;
            }
        }
        System.out.println(sim);
        String origin="Hello";
        String reverse="";
        for (int i=0;i<origin.length();i++){
            reverse=origin.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}


