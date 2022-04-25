import java.util.Scanner;

public class ArrayFifthProgram {
    ArrayFifthProgram(){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[7];
        int[] b=new int[9];
        int[] c=new int[a.length+b.length];
        System.out.println("Enter elements of array a");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter elements of array a");
        for(int i=0;i<b.length;i++)
            b[i]=sc.nextInt();
        for(int i=0;i<a.length+b.length;i++){
            if(i<a.length)
                c[i]=a[i];
            else
                c[i]=b[i-a.length];

        }
        System.out.println("Array c will be ");
        for(int i=0;i<c.length;i++)
            System.out.println("Index "+(i+1)+" Value is "+c[i]+" ");
    }
    public static void main(String[] args) {
        ArrayFifthProgram a=new ArrayFifthProgram();
    }
}
