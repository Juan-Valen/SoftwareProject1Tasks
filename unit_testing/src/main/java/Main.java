
public class Main {
    private static Calculator calculator = new Calculator();

    public static void main(String[] args) {

        calculator.powerOn();
        System.out.println("...Power on...");

        calculator.add(500);
        System.out.println("Add 500      = " + calculator.getResult());

        calculator.add(200);
        System.out.println("Add 200      = " + calculator.getResult());

        calculator.subtract(100);
        System.out.println("Subtract 100 = " + calculator.getResult());

        calculator.divide(2);
        System.out.println("Divide by 2  = " + calculator.getResult());

        calculator.multiply(10);
        System.out.println("Multiply by 10 = " + calculator.getResult());

        System.out.println("...Resetting...");
        calculator.reset();

        calculator.add(500);
        System.out.println("Add 500      = " + calculator.getResult());

        calculator.powerOff();
        System.out.println("...Power off...");

        calculator.add(1);
        System.out.println("Add 1      = " + calculator.getResult());
        calculator.add(2);
        System.out.println("Add 2      = " + calculator.getResult());
        calculator.reset();
        calculator.add(10);
        System.out.println("Add 10      = " + calculator.getResult());
        calculator.subtract(2);
        System.out.println("Subtract 2      = " + calculator.getResult());
        calculator.reset();
        calculator.add(8);
        System.out.println("Add 8      = " + calculator.getResult());
        calculator.divide(2);
        System.out.println("Divide by 2      = " + calculator.getResult());

    }
}
