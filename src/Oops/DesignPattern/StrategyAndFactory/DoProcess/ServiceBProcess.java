package Oops.DesignPattern.StrategyAndFactory.DoProcess;

import Oops.DesignPattern.StrategyAndFactory.Process.Process;
import Oops.DesignPattern.StrategyAndFactory.Process.ProcessBa;
import Oops.DesignPattern.StrategyAndFactory.Process.ProcessBb;

public class ServiceBProcess extends DoProcess{
    @Override
    Process getProcess(String type) {
        if(type.equals("Ba")){
            return new ProcessBa();
        }
        else if (type.equals("Bb")) {
            return new ProcessBb();
        }
        return null;
    }
}
