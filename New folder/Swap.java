public class Swap {
    void swapping(int a,int b)
    {
       int temp;
       temp=a;
       a=b;
       b=temp;
       System.out.println(a+ " "+ b);


    }
    public static void main(String[] args) {
       // int a=10;
       // int b=20;
        Swap s1=new Swap();
         System.out.println(s1.swapping(10,20));

    }
}
