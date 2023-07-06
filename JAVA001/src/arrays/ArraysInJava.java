package arrays;

public class ArraysInJava {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        min(a);
        int arr3[]=arGet();
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
//evenArray();
//strName();
//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    int[][]arry={{1,2,3},{4,5,6,7,8}};
//    for (int x=0;x<arry.length;x++){
//        for (int y=0;y<arry[x].length;y++){
//  System.out.print(arry[x][y]+" ");
// }}
        int[] arr1 = {1, 2, 3, 4, 5, 6, 10};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }

    public static void evenArray() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 10};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }

    public static void strName() {
        String[] name = {"John", "Victor", "Sam", "Donald", "Eva", "Mark", "John", "Sam"};
        int length = name.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (name[i].equals(name[j])) {
                    name[j] = name[length - 1];
                    length--;
                    j--;
                }
            }
        }
        System.out.println("names after removing duplicates");
        for (int i = 0; i < length; i++) {
            System.out.println(name[i]);
        }
    }

    public static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            System.out.println(min);


        }
    }

    static int[] arGet() {
return new int[]{10,20,30,40,50,60,70,80,90};
    }}


