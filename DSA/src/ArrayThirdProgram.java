import java.util.Scanner;

public class ArrayThirdProgram {
     ArrayThirdProgram(){
        int[] ar={10,12,14,16,18,20};
        int i=0,s=0;
        while(i<ar.length){
            //System.out.println(ar[i]);
            s = s + ar[i];
            i++;
        }
         System.out.println("Sum of array elements is "+s);

    }
    public static void main(String[] args) {
       ArrayThirdProgram a= new ArrayThirdProgram();
    }
}
