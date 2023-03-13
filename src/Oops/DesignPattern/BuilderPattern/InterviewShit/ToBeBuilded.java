package Oops.DesignPattern.BuilderPattern.InterviewShit;

public class ToBeBuilded {

    private Integer propA;

    private String propB;

    private Long propC;

    public Integer getPropA() {
        return propA;
    }

    public void setPropA(Integer propA) {
        this.propA = propA;
    }

    public String getPropB() {
        return propB;
    }

    public void setPropB(String propB) {
        this.propB = propB;
    }

    public Long getPropC() {
        return propC;
    }

    public void setPropC(Long propC) {
        this.propC = propC;
    }

    @Override
    public String toString() {
        return "ToBeBuilded{" +
                "propA=" + propA +
                ", propB='" + propB + '\'' +
                ", propC=" + propC +
                '}';
    }
}
