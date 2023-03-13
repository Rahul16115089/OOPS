package Oops.Lambda;

public interface FunctionalInterfaceC {

    Integer abstractOperation(Integer a);


    // Using default keyword we can assign methods in an interface an implementation.
    default Integer operation(Integer a){
        return a*2;
    }

}
