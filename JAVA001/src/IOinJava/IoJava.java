package IOinJava;

import javax.imageio.IIOException;
import java.io.*;

public class IoJava {
    public static void main(String[] args) {
        Standarinput();
        writeFile();
        File file=new File("C:/Users/STUDENTLOANER/Desktop/MyFile.txt");
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeFile(){
        File file=new File("C:/Users/STUDENTLOANER/Desktop/MyFile1.txt");
        try
                ( FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)){
            bufferedWriter.write("Hello I wrote IO java in my file");
            System.out.println("File writing is complete");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Standarinput(){
        try (BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))){
        System.out.println("Enter your name :");
        String name=bufferedReader.readLine();
            System.out.println("Hello "+name+"!");
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }}
