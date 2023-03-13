package Oops.DesignPattern.StrategyAndFactory;

import Oops.DesignPattern.StrategyAndFactory.DoProcess.DoProcess;
import Oops.DesignPattern.StrategyAndFactory.DoProcess.ServiceAProcess;
import Oops.DesignPattern.StrategyAndFactory.DoProcess.ServiceBProcess;

public class Main {
    public static void main(String[] args){
        DoProcess doProcess = new ServiceAProcess();
        doProcess.process("Aa");
        doProcess.process("Ab");
        doProcess = new ServiceBProcess();
        doProcess.process("Ba");
        doProcess.process("Bb");
    }
}
