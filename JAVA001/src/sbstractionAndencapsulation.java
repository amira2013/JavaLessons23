public class sbstractionAndencapsulation {
    public static void main(String[] args) {
        Shapes circle=new Cirles() ;
        circle.draw();
        Shapes rec=new Rectangles();
        rec.draw();
        Cars cars=new Cars("petrol",20.90);
        cars.start();
        cars.stop();
        Bus bus=new Bus("Diesel",100.20);
        bus.start();
        bus.stop();
        Employee employee=new Employee();
        employee.setId(123);
        employee.setName("Harsh");
        employee.setSalary(1222222.00);
        System.out.print(employee.getId()+" ");
        System.out.print(employee.getName()+"  ");
        System.out.println(employee.getSalary());
    }
}
abstract class Shapes{
    public abstract void draw();

    }
    class Cirles extends Shapes{
    public void draw(){

        System.out.println("Drawing a circle");
    }
    }
    class Rectangles extends Shapes{
    public void draw(){

        System.out.println("Drawing Rectangle");
    }
    }
abstract class vehicle{
    private int numWheels;
    private String enginType;
    private double fuelCapacity;
    public vehicle(int numWheels,String enginType,double fuelCapacity){
        this.numWheels=numWheels;
        this .enginType=enginType;
        this.fuelCapacity=fuelCapacity;
    }
    public abstract void start();
    public abstract void stop();
}
class Cars extends vehicle {
    public Cars(String enginType, double fuelCapacity) {
        super(4, enginType, fuelCapacity);

    }

    public void start() {
        System.out.println("Car is Starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }}

    class Bus extends vehicle {
        public Bus(String enginType, double fuelCapacity) {

            super(6, enginType, fuelCapacity);
        }

        public void start() {
            System.out.println("bus is Starting");
        }

        public void stop() {
            System.out.println("bus is stopping");
        }

    }

//========================ENCAPSULATION=============================
 class Employee{
    private String name;
    private  int id;
    private  double salary;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(double salary){
    this.salary=salary;
    }
}