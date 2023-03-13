package Oops.DesignPattern.StrategyAndFactory.DoProcess;


import Oops.DesignPattern.StrategyAndFactory.Process.Process;

public abstract class DoProcess {

    /*
    We have defined Process as interface and implemented them is child classes
    Each Child Process defines a strategy, so we used Strategy Pattern here
    Instead of extending and implementing Process in DoProcess we just used composition.
    */
    Process process;

    public void process(String type){
        this.process = getProcess(type);
        process.executeProcess();
    }

    /*
    To get process based on type, or we can say Object creation is decoupled from rest of the
    code and moved to factory method and this method is defined abstract so that subclasses
    decides which class to instantiate.
    A factory method handles object creation and encapsulates it in a subclass. This
    decouples the client code in the superclass from the object creation code in the subclass.
     */
    abstract Process getProcess(String type);

}

