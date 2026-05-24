public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal=new Calculator();

        if (cal.add(2, 3) == 5) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }

        if (cal.subtract(5, 2) == 3) {
            System.out.println("Subtraction Test Passed");
        } else {
            System.out.println("Subtraction Test Failed");
        }

        if (cal.multiply(4, 3) == 12) {
            System.out.println("Multiplication Test Passed");
        } else {
            System.out.println("Multiplication Test Failed");
        }

        if (cal.divide(10, 2) == 5) {
            System.out.println("Division Test Passed");
        } else {
            System.out.println("Division Test Failed");
        }
    }
    
}