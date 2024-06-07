public class MethodIf {
    static int Details(int num) {
        int fact = 1;
        for (int i=2; i<=num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        System.out.println(Details(3));
        System.out.println(Details(4));
        System.out.println(Details(5));
    }
}