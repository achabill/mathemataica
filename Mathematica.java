public class Mathematica{
    public static int sum(int a, int b){
        return a + b;
    }
    public static int power(int a, int b) {
        int result = a;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int abs(int x){
        if (x > 0)
            return x;
        else
            return x * -1;
    }
    public static int factors(int x){
        int factor = 0;
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                factor = i;
            }
        }
        return factor;
    }
}