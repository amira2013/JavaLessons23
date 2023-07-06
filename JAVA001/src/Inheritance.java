public class Inheritance {
    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.eat();
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
        Cat cat=new Cat();
        cat.eat();
        Breed breed=new Breed();
        breed.type();
        breed.bark();
        breed.eat();
        breed.sleep();

    }
}
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println(" This animal is sleeping");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}
class Breed extends Dog{
    void type(){
        System.out.println("I am a Lab");
    }
}


