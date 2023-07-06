package arrays;

public class ArrExample {
    public static void main(String[] args) {

        int[]a = {7,1, 2, 3, 4, 5};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if ( a[i]<min)
                min = a[i];
        }
        System.out.println(min);
    }
}
