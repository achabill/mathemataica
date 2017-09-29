import java.util.ArrayList;
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
    public static ArrayList<Integer> getfactors(int x){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }
}