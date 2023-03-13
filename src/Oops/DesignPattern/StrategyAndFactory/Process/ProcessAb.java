package Oops.DesignPattern.StrategyAndFactory.Process;

public class ProcessAb implements Process{
    @Override
    public void executeProcess() {
        System.out.println("Process with some fun : " + this.getClass().toString());
    }
}
