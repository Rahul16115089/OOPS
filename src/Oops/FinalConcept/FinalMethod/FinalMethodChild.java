package Oops.FinalConcept.FinalMethod;

public class FinalMethodChild extends FinalMethod {

/*
    This is invalid
    @Override
    public final void finalMethod(){
        System.out.println(super.msg);
    }
*/

    @Override
    public void notFinalMethod(){
        System.out.println("Not a final method hence overridable " + super.getMsg());
    }

    public static void main(String[] args){
        FinalMethodChild finalMethodChild = new FinalMethodChild();
        finalMethodChild.finalMethod();
        finalMethodChild.notFinalMethod();
    }

}
