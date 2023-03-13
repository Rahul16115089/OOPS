package Oops.SOLID.DIP;

public class AddOps implements ICalculatorOps{

    @Override
    public double calculate(double a, double b) {
        return a+b;
    }

}
