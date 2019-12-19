/**
 * Created by Ivan Osila on 29/11/2019
 */
public class BasicOperators {

    public static int sum, difference, product, quotient;

    public static int addition(int x, int y){
        sum = x + y;
        System.out.println("Sum: " +sum);
        return sum;
    }

    public static int subtraction(int x, int y){
        difference = x - y;
        System.out.println("Difference: " + difference);
        return difference;
    }

    public static int multiplication(int x, int y){
        product = x * y;
        System.out.println("Product: " + product);
        return product;
    }

    public static int division(int x, int y){
        quotient = x / y;
        System.out.println("Quotient: " + quotient);
        return quotient;
    }

}
