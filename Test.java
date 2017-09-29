public class Test{
    public static void main(String[] args){
        int r = Mathematica.sum(1,2);
        System.out.println("sum(1,2) : " + r);

        r = Mathematica.abs(-1);
        System.out.println("Abs(-1) : "+ r);

        r = Mathematica.divide(4, 2);
        System.out.println("division(4 , 2) : " + r);

        r = Mathematica.power(3, 5);
        System.out.println("power(3 , 5) : " + r);

        Mathematica.factors(12);


    }
}