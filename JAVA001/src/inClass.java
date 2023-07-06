import org.w3c.dom.ls.LSOutput;

public class inClass {
    public static void main(String[] args) {
//        if statement
//        1 .Simple if statement
        int a=10;int b=20;

        if(a+b>20){
            System.out.println("a+b is greater than 20");
        }
        if(a+b<20){
            System.out.println("a+b is greater than 20");
        }else {
            System.out.println("a+b is less than 20");
        }
        if(a+b==50){
            System.out.println("a+b is equal to 50");
        } else if (a+b>10) {
            System.out.println("a+b is greater than 50");
        }
        else {
            System.out.println("a+b is less than 50");
        }
//        nested
        String city="mary,usa";
                if(city.endsWith("usa")){
                    if(city.contains("virginia")){
                        System.out.println("you live in virginia");
                    }else if (city.contains("colorado")){
                        System.out.println("you live in colorado");
                    }else{
                        System.out.println(city.split(",")[0]);
                    }}
                else{
                    System.out.println("You are from space alien");
                }}}

