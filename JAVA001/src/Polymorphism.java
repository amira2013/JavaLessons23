public class Polymorphism {
    public static void main(String[] args) {
Animal2 animal1=new Dog2();
Animal2 animal2=new cat2();
animal1.makeSound();
animal2.makeSound();
Shape shape=new Shape();
        System.out.println("Area of shape "+shape.calculateArea());
        Rectangle rectangle=new Rectangle(5,5);
        System.out.println("Atrea of rectangle="+rectangle.calculateArea());
        Calculator calculator=new Calculator();
        int sum=calculator.add(1,2,3);
        System.out.println(sum);
        concatString strg=new concatString();
        System.out.println( strg.str("Hello","World"));
        strg.str("Hello","World","this is java");
    }
}
class Animal2{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog2 extends Animal2{
    public void makeSound(){
        System.out.println("Dogs bark");
    }
}
class cat2 extends Animal2{
    public void makesound(){
        System.out.println("cat meows");
    }
}
class Shape{
     double calculateArea(){
         return 0;
     }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
}
// polymorphism Method overloading
class Calculator{
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    public float add(int a,float b){
        return a+b;
    }
}
// concat 2 strings
class concatString{
    public String str(String a,String b){
        return a+b;
    }
    public String str(String a,String b,String c){
        return a+b+c;
    }
}