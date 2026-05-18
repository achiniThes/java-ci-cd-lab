public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal=new Calculator();

        if(cal.add(2,3)==5){

            System.out.println("Test Passed");

        }else{

            System.out.println("Test Failed");
        }
    }
    
}