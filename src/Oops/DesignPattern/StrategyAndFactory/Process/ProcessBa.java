package Oops.DesignPattern.StrategyAndFactory.Process;

public class ProcessBa implements Process{
    @Override
    public void executeProcess() {
        System.out.println("Through Process B in : " +this.getClass().toString());
    }
}
