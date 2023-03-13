package Oops.FinalConcept.FinalMethod;

/*
    Can not override a final method
    We must declare methods with the final keyword for which we are required to
    follow the same implementation throughout all the derived classes.
 */
public class FinalMethod {

    private String msg = "This is me";

    public final void finalMethod(){
        System.out.println(msg);
    }

    public void notFinalMethod(){
        System.out.println(msg);
    }

    public String getMsg() {
        return msg;
    }

}

