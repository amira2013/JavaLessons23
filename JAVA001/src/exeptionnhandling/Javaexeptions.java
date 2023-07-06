package exeptionnhandling;

public class Javaexeptions {
    public static void main(String[] args) {
ex5();
ex6();
    ex1();
    ex8(12);
    ex9(5,6);
    ex10();}
    public static void ex1(){

try {
    int a=9;
    int b=0;
    int c =a/b;
        System.out.println(c);}

catch (Exception ex){
    System.out.println(ex);
}
System.out.println("Hello java");
    }
public static void ex5(){
        try{
            int[]arr={1,2,3};
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
}
public static void ex6(){
        try{
            int[]arr=new int[5];
            arr[6]=30/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Even more code");
        }}
//   Throw and Throws Key Words
    public static void ex8(int a){
        try {
            if(a<18){
            throw new ArithmeticException("He can not drive");
        }else {
            System.out.println("He can drive");
        }}catch (Exception e){
            System.out.println(e);
        }


    }
    public static void ex9(int d,int dd) throws ArithmeticException {
        if (dd == 0) {
            throw new ArithmeticException("dd is not equal to 0");
        } else {
            System.out.println("dd is not equal ti 0");
        }

    }
    public static void ex10(){
        try{throw new UserDefinitionExeption("this is a user defined exeption");
    }
        catch (UserDefinitionExeption ude){
            System.out.println(ude.getMessage());
        }
    }}
    class UserDefinitionExeption extends Exception{
        public UserDefinitionExeption(String str){
            super(str);
        }
    }

