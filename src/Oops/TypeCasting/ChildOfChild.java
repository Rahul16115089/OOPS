package Oops.TypeCasting;

public class ChildOfChild extends Child{

    Integer cc;

    ChildOfChild(Integer pa, Integer ca, Integer cc) {
        super(pa, ca);
        this.cc = cc;
    }

    public Integer multiply(Integer b){
        return cc * b * b;
    }

    public Integer sum(Integer c){
        return c + cc;
    }

    public Integer sub(Integer s){return cc-s;}
}
