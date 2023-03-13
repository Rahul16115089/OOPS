package Oops.DesignPattern.StrategyAndFactory.DoProcess;

import Oops.DesignPattern.StrategyAndFactory.Process.Process;
import Oops.DesignPattern.StrategyAndFactory.Process.ProcessAa;
import Oops.DesignPattern.StrategyAndFactory.Process.ProcessAb;

public class ServiceAProcess extends DoProcess {
    @Override
    Process getProcess(String type) {
        if(type.equals("Aa")){
            return new ProcessAa();
        }
        else if (type.equals("Ab")) {
            return new ProcessAb();
        }
        return null;
    }
}
