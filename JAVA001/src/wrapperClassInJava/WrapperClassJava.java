package wrapperClassInJava;

public class WrapperClassJava {
    public static void main(String[] args) {
        Integer myInt=1234;
        String mySting=myInt.toString();
        int parseNum=Integer.parseInt(String.valueOf(myInt));
        System.out.println(parseNum);
        System.out.println(mySting.length());
        Integer a=18;
        Double b=5.5;
        System.out.println(a+" "+b);
        System.out.println(fibonnachi(8));
        int number=42;
        Integer num=Integer.valueOf(number);
        System.out.println(num);
        Integer wrapperNumber=Integer.valueOf(number);
        String numberAsString=wrapperNumber.toString();
        int parseNumber=Integer.parseInt("42");
        System.out.println(number);
        System.out.println(wrapperNumber);
        System.out.println(numberAsString);
        System.out.println(parseNumber);

        boolean flag=true;
        Boolean wraperFlag=Boolean.valueOf(flag);
        String flagAsString=wraperFlag.toString();

//        JAVA RECURSION ==>a method


    }
    public static int fibonnachi(int n){
        if(n==0||n==1){
            return n;
        }else {
            return fibonnachi(n-1)+fibonnachi(n-2);
        }
    }
}
