import java.util.Scanner;
public class ArrayPosNeg {
    ArrayPosNeg(){
        int[] a=new int[5];
        System.out.println("Enter element for array");
        int i=0,n=0,p=0,size=0;
        size=a.length;
        Scanner sc=new Scanner(System.in);
        while(i<a.length){
            a[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<a.length){
            if(a[i]>0)
                p++;
            else if(a[i]<0)
                n++;
            i++;
        }
        System.out.println("total number of elements "+size);
        System.out.println("number of positives are "+p);
        System.out.println("number of negatives are "+n);

    }
    public static void main(String[] args) {
        ArrayPosNeg h=new ArrayPosNeg();
    }
}
