import java.util.Scanner;

public class ArrayQ2 {
    ArrayQ2(){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[7];
        int[] b=new int[9];
        int ca=0,cb=0;
        for (int i:a)
            ca++;
        for(int i:b)
            cb++;
        int coc=ca+cb;
        int[] c=new int[coc];
        int k=0;
        while(k<ca){
            a[k]=sc.nextInt();
            k++;
        }
        k=0;
        while(k<cb){
            b[k]=sc.nextInt();
            k++;
        }
        k=0;
        while(k<coc){
            if(k<ca)
                c[k]=a[k];
            else
                c[k]=b[k-ca];
            k++;
        }
        for(int i:c)
            System.out.println(i);
    }
    public static void main(String[] args) {
        ArrayQ2 q=new ArrayQ2();
    }
}

//using While and without using length operator
//2M_02_Abhinay sinha
