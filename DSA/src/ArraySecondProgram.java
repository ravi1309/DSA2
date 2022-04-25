public class ArraySecondProgram {
    ArraySecondProgram(){
        int ar[]=new int[5];
        ar[0]=10;
        ar[1]=20;
        ar[2]=30;
        ar[3]=40;
        ar[4]=50;
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);
    }

    public static void main(String[] args) {
        ArraySecondProgram a=new ArraySecondProgram();
    }
}
