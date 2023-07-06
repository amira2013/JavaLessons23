package lambdaExpressions;

import java.util.*;

import static lambdaExpressions.JavaLambda.Lambda.Vehicle;

public class JavaLambda {
    public static void main(String[] args) {
        Vehicle();
        List<String>fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
//        using lambda expressions to iterate over the list
//        fruits.forEach(fruit-> System.out.println(fruit));
//                using lambda expressions with multiple statements
        System.out.println("Fruit name in upper case");
        fruits.forEach(fruit->{
//            String modifiedfruit=fruit.toUpperCase();
//            System.out.println(modifiedfruit);
     });
//        fruits.forEach(System.out::println);
    }
    public class Lambda{
        public static void Vehicle(){
            List<String>vehicle=new ArrayList<>();
            vehicle.add("Ford");
            vehicle.add("Honda");
            vehicle.add("Kia");
            vehicle.add("bmw");
            vehicle.forEach(car-> System.out.println(car.toUpperCase()));
            vehicle.forEach(System.out::println);

    }
}}
