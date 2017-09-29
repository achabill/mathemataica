public class Mathematica{
    public static int sum(int a, int b){
        return a + b;
    }
    public static int power (int a, int b) {
        int result = a;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }
    public static int Abs(int x){
        if (x > 0)
            return x;
        else
            return x * -1;
    }
    public static void factors(int x){
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                System.out.printf("factors of %d are : %d , ",x,i);
            }
        }
    }
}