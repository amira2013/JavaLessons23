public class ObjectandClasses {
    public static void main(String[] args) {
        Car.car();
        Circle.cArea();

    }
}
class Car{
    String brand;String made;String year;
    public static void car(){
        Car myCar=new Car();
        Car tear=new Car();

        myCar.brand="BMW";
        myCar.made="X5";
        myCar.year="2023";

        System.out.println(myCar.brand);
        System.out.println(myCar.made);
        System.out.println(myCar.year);

        tear.brand="Toyota";
        tear.made="Camry";
        tear.year="1999";

        System.out.println(tear.made);
        System.out.println(tear.brand);
        System.out.println(tear.year);
    }}
    class Circle{
        double radius;
        double area(){
            return Math.PI*radius*radius;
        }
//       Circle c=new Circle();

         static void cArea(){
             Circle circle1=new Circle();
             circle1.radius=5.0;
             double circle1area=circle1.area();
             System.out.println(circle1area);
         }
    }


