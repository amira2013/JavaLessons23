
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int a=12;
//        int b=8;
//        int c=a+b;
//        System.out.println(c);
//        int Myint=100;
//        System.out.println(Myint);
//        double Mydouble=Myint;
//        System.out.println(Mydouble);
//        double myDouble2=10.25d;
//        System.out.println(myDouble2);
//        int newInt=(int)myDouble2;
//        System.out.println(newInt);
//        int Int=(int)myDouble2;
//        System.out.println(Int);
//        String stri="10";
//        int st=10;
//        System.out.println(stri+st);
//        System.out.println(st+st);
//
//        int numberOne=7;
//        int numberTwo=10;
//        double two=numberTwo/numberOne;
//        System.out.print(numberOne+numberTwo +"   ");
//
//        System.out.print(numberOne-numberTwo +"   ");
//        System.out.print(two+"    ");
//        System.out.print(numberOne*numberTwo +"  ");
//        System.out.println(numberTwo%numberOne);
//        System.out.println(Math.max(7,10.23));
//        System.out.println(Math.sqrt(25));
        System.out.println();
//        -----------------------------String in java------------------------------------
        String Str = "           I am learning Java  ";
        System.out.println(Str.length());
        System.out.println(Str.charAt(5));
        System.out.println(Str.indexOf('a'));
        System.out.println(Str.toUpperCase());
        System.out.println(Str.trim());
        System.out.println(Str.contains("z"));
        System.out.println(Str.endsWith("q"));
        System.out.println(Str.isEmpty());
        System.out.println(Str.replace('a', 'B'));
        System.out.println(Str.replaceAll("Java", "Python"));
        String[] words = Str.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

//---------------------------------java Math method---------------------------------------
      int x=Math.max(4,23);
        int y=Math.min(4,23);
        System.out.println(x);
        System.out.println(y);
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-6));
        System.out.println(Math.random());
        System.out.println(Math.cbrt(125));
        System.out.println(Math.cos(6));
        System.out.println(Math.exp(4));
    }}