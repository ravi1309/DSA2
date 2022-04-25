import java.util.Scanner;

public class Swap {
    Swap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 value");
        int x=sc.nextInt();
        System.out.println("Enter 2 value");
        int y=sc.nextInt();
        System.out.println("value 1: "+x);
        System.out.println("value 2: "+y);
        int z=x;
        x=y;
        y=z;
        System.out.println("After swapping");
        System.out.println("value 1: "+x);
        System.out.println("value 2: "+y);

    }

    public static void main(String[] args) {
        Swap p=new Swap();
    }

}
