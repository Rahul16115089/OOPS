package Oops.SOLID.DIP;

public class Main {

    public static void main(String[] args){

        ICalculatorOps addOps = new AddOps();
        ICalculatorOps subOps = new SubtractOps();

        Calculator addCal = new Calculator(addOps);
        System.out.println(addCal.compute(2,3));

        Calculator subCal = new Calculator(subOps);
        System.out.println(subCal.compute(8,3));
    }

}
