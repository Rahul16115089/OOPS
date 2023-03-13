package Oops.SOLID.DIP;

public class Calculator {

    //Our Calculator class is now relying on our abstraction which is the ICalculatorOps
    // rather than the specific implementations of the ICalculatorOps.
    ICalculatorOps iCalculatorOps;

    // ICalculatorOps is "injected" via the constructor.
    // This guarantees that the Calculator cannot be created without a calculator operation.
    // This makes the Calculator "dependent" on the ICalculatorOps.
    public Calculator(ICalculatorOps iCalculatorOps){
        this.iCalculatorOps = iCalculatorOps;
    }

    public double compute(double a, double b){
        return this.iCalculatorOps.calculate(a,b);
    }

}
