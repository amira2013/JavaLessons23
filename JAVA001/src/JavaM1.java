import java.util.Arrays;

public class JavaM1 {
    public static void main(String[] args) {
//        JavaM2 jvm=new JavaM2();
//        jvm.calculateFee();
//        System.out.println(jvm.name);
        int[] nums = {1, 2, 3, 4, 5};
        num(nums);
        System.out.println(Arrays.toString(nums));
    }
public static int[] num(int[]nums){


   int temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;


    return nums;
}}







