package coleectionsFramework;


import java.util.*;

public class javaCollections {
    public static void main(String[] args) {
//        arrList();
//        LinkList();
//        vector();
//        stack();
//        hashSet();
        treeSet();
    }
    public static void arrList(){
//        Arraylist of integers
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Element at index 2  :"+numbers.get(2));
//     Update
        numbers.set(3,45);
        System.out.println("Updated elememnt at index 3 is  :"+numbers.get(3));
//        Removing element from arraylist
        numbers.remove(1);
        System.out.println("Array size is modified by removing elenent  1 ===> "+numbers);
//        checking if element is present in the array
        System.out.println("is there number 50? :   "+numbers.contains(70));
//        for each loop
        System.out.println("Element in the arraylist :");
        for (int number:numbers){
            System.out.print(number +" ");
        }
        System.out.println();
        System.out.println("The size of numbers element :"+numbers.size());


    }
    public static void LinkList(){
       LinkedList<String>names=new LinkedList<>();
       names.add("Bob");
        names.add("Charlie");
        names.add("Joe");
        names.add("Eva");
        names.add("David");
        System.out.println("Element in the Linkedlist are: "+names);
//        At given index
        System.out.println("name at given index :"+names.get(3));

//        Iterating throuph the Linkedlist
        for ( String name:names){
            System.out.print(name+" ");
        }
        System.out.println();
    }
    public static void vector(){
        Vector<String> vector=new Vector<>();
//        adding Elements
        vector.add("Bob");
        vector.add("Charlie");
        vector.add("Joe");
        vector.add("Eva");
        vector.add("David");

//       Print all element
        System.out.println("vector contains : "+vector);
//        Getting the capacity
        System.out.println("Capacity of vector is :"+vector.capacity());
//        trim
        vector.trimToSize();
        System.out.println("size of vector after trim to size :"+vector.capacity());
//        Adding element
        vector.add("Alice");
        vector.add("Katrina");
        System.out.println("Capacity after adding :"+vector.capacity());
        System.out.println("New vector :"+vector);
        String firstElement= vector.firstElement();
        String lastElenent =vector.lastElement();
        System.out.println(firstElement);
        System.out.println(lastElenent);
    }
    public static void stack(){
        Stack<String>stack=new Stack<>();
        stack.push("Gayatri");
        stack.push("Driss");
        stack.push("Ekuyee");
        stack.push("Claudia");
//        check     if stack is empty
        System.out.println("Check if stack is empty : "+stack.empty());
//        peaking top element in the stack
        String topElement=stack.peek();
        System.out.println(topElement);

//Popping elemenet
        String popElement=stack.pop();
        System.out.println(popElement);
//        Search of element
        int index=stack.search("Driss");
        System.out.println("Index of searched element is :"+index);
    }
    public static void hashSet(){
        HashSet<String>set=new HashSet<>();
        set.add("apple");
        set.add("bannana");
        set.add("Orange");
        set.add("pineapple");
//        adding duolicate element
        set.add("apple");
        System.out.println(set);
//        Checking size
        System.out.println(set.size());
//        iterating
for (String element:set){
    System.out.print(element +" ");
}
        System.out.println();

    }
    public static void treeSet(){
        TreeSet<Integer>tset=new TreeSet<>();
        tset.add(6);
        tset.add(4);
        tset.add(3);
        tset.add(2);
        tset.add(5);
        tset.add(1);
//        add duplicate
        tset.add(7);
        System.out.println(tset.size());
        System.out.println(tset);






    }
}
