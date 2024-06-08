public class RecursiveMethod {
    
    static int fact(int num) {
        if (num != 0)  
            return num * fact(num-1); 
        else
            return 1;
    }

    public static void main(String[] args) {
        int num1 = 6, res;
        res = fact(num1);
        System.out.println("Factorial of " + num1 + " is " + res);
    }
}