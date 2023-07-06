public class NestedLoop {
    public static void main(String[] args) {
        NestedLoop n=new NestedLoop();
        n.f1();
    }
    public  void f1(){
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
