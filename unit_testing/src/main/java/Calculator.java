
public class Calculator {

    private double result; // Variable for the result
    private boolean on = false;

    public void reset() { // Resets the result variable
        result = 0;
    }

    public double getResult() {
        if (!on) {
            throw new Error("Power is off");
        }
        return result;
    }

    public void add(int n) {
        if (on) {
            result += n;
        }
    }

    public void subtract(int n) {
        if (on) {
            result -= n;
        }
    }

    public void multiply(int n) {
        if (on) {
            result *= n;
        }
    }

    public void divide(int n) {
        if (n == 0)
            throw new ArithmeticException("Cannot divide by zero");
        result /= n;
    }

    public void square(int n) {
        if (on) {
            result = n * n;
        }
    }

    public void squareRoot(int n) {
        if (on) {
            result = Math.sqrt(n);
        }
    }

    public void powerOn() {
        on = true;
    }

    public void powerOff() {
        reset();
        on = false;
    }

}
