public class fibonacci {
    public static int fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci.fib(6));
    }
}
