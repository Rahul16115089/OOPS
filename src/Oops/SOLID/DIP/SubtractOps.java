package Oops.SOLID.DIP;

public class SubtractOps implements ICalculatorOps{

    @Override
    public double calculate(double a, double b) {
        return a-b;
    }

}
