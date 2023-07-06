package arrays;

import java.util.Arrays;

import static arrays.DoobleArr.*;

public class DoublArray {
    public static void main(String[] args) {
//        mno();
//        pot();
//        crossMatrix();
        mulMatrix();
//        int[] nums1={2, 3, 4, 5};
//        System.out.println( unLucky1(nums1));
        int[]num3={1,2,3,4,5,6};
        System.out.println(Arrays.toString(middel(num3)));

    }
}
class DoobleArr{
    public static void abb(){
        System.out.println("this is an multidimentional array");
        int[][] arr={{1,2,3},{2,3,4},{3,4,5,6,}};
    }
    public static void mno(){
        int[][] arra=new int[3][];
        arra[0]=new int[3];
        arra[1]=new int[4];
        arra[2]=new int[2];
        int count=0;
        for (int i=0;i<arra.length;i++){
            for (int j=0;j<arra[i].length;j++){
                arra[i][j]=count++;
//                System.out.println(count);
            }
        }
        for (int i=0;i<arra.length;i++){
            for (int j=0;j<arra[i].length;j++){
                System.out.print(arra[i][j]+" ");

            }
            System.out.println();
        }}
    public static void pot(){
        int[][]jaga=new int[3][];
        jaga[0]=new int[]{1,2,3};
        jaga[1]=new int[]{4,5,6,7};
        jaga[2]=new int[]{1,2,3,4,5,6};
//        System.out.println(jaga[0][1]);
//        System.out.println(jaga[1][0]);
//        System.out.println(jaga[2][3]);       Another way to do it
for (int i=0;i< jaga.length;i++){
    for (int j = 0;j<jaga[i].length;j++){
        System.out.print(jaga[i][j]+" ");
    }
    System.out.println();
}}
    public static boolean unLucky1(int[]nums){
        for(int i=0;i< nums.length;i++){
            if(nums[i]==1 &&nums[i+1]==3){
              return true;
            }
        }return false;
    }
    public static int[] middel(int[]nums){
        int middleaindex=nums.length/2;
         int []result=new int[3];
         result[0]=nums[middleaindex-1];
        result[1]=nums[middleaindex];
        result[2]=nums[middleaindex+1];
        return result;
    }
public static void crossMatrix(){
        int[][]q={{2,2,2},{4,4,4}};
        int[][]w={{2,2,2},{3,3,3}};

        int[][] result=new int[q.length][q[0].length];
        for (int i=0;i< q.length;i++){
            for (int j=0;j<q[0].length;j++){
                result[i][j]=q[i][j]+w[q.length-i-1][j];
            }
        }
    System.out.println("Matrix cross addition");
        for (int i=0;i< result.length;i++){
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
//        Mutiply two matrix

}
public static void mulMatrix(){
        int[][]e={{1,1,1},{2,2,2},{3,3,3}};
    int[][]f={{1,1,1},{2,2,2},{3,3,3}};

    int[][]g=new int[3][3];
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            g[i][j]=0;
            for (int k=0;k<3;k++){
              g[i][j]+=e[i][k]*f[k][j];

            }
            System.out.print(g[i][j]+" ");

        }
        System.out.println();
    }


}
    
}


