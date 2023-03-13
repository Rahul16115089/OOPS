package Oops.TypeCasting;

public class Child extends Parent{

    private Integer ca;

    Child(Integer pa,Integer ca) {
        super(pa);
        this.ca = ca;
    }

    public Integer multiply(Integer b){
        return ca * b * b;
    }

    public Integer sum(Integer c){
        return c + ca;
    }

}
