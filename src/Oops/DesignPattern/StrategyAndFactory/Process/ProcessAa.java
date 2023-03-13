package Oops.DesignPattern.StrategyAndFactory.Process;

public class ProcessAa implements Process{

    @Override
    public void executeProcess() {
        System.out.println(this.getClass().toString());
    }

}
