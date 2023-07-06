package IOinJava;

import java.io.*;
import java.util.Scanner;

import static IOinJava.IoExample.scanner.scan;

public class IoExample {
    public static void main(String[] args) throws IOException {
        scan();
        writeExp();

        File file=new File("C:/Users/STUDENTLOANER/Desktop/Newfile.txt");
       try {
           FileReader fileReader=new FileReader(file);

        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        while(line!=null){
            System.out.println(line);
            break;
        }}catch (Exception  e){
           e.printStackTrace();
       }
        System.out.println("hiiiiiiiiiiiiiiiiii");}
    public static void writeExp(){
       File file=new File("C:/Users/STUDENTLOANER/Desktop/Newfile3.txt");

        try ( FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)){


        bufferedWriter.write("I am writing a new file");}
    catch (Exception ex){ex.printStackTrace();}
    }
    class scanner{
        public static void scan(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("please enter a num1");
            int num1=scanner.nextInt();
            System.out.println("please enter a num2");
            int num2=scanner.nextInt();
            System.out.println(num1+num2);
        }

    }
}
