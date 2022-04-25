import java.util.Scanner;

public class ArrayInput {
    ArrayInput(){
        Scanner sc=new Scanner(System.in);
        int[] ar=new int[5];
        System.out.println("Enter 5 elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("elements in array are:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        ArrayInput a=new ArrayInput();
    }
}
