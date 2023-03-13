package Oops.DesignPattern.BuilderPattern.InterviewShit;

public class Builder {

    ToBeBuilded toBeBuilded;

    public Builder(){
        toBeBuilded = new ToBeBuilded();
    }

    public static Builder newBuilderInstance(){
        return new Builder();
    }

    public Builder setPropA(Integer propA){
        this.toBeBuilded.setPropA(propA);
        return this;
    }

    public Builder setPropB(String propB){
        this.toBeBuilded.setPropB(propB);
        return this;
    }

    public Builder setPropC(Long propC){
        this.toBeBuilded.setPropC(propC);
        return this;
    }

    public ToBeBuilded build(){
        return toBeBuilded;
    }
}
