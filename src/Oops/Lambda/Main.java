package Oops.Lambda;

//Oops.Lambda expressions basically express instances of functional interfaces
//Enable to treat functionality as a method argument, or code as data.
//A function that can be created without belonging to any class.
//A lambda expression can be passed around as if it was an object and executed on demand.
public class Main {

    public static void operation(Integer a, FunctionalInterfaceA A){
        System.out.println(A.operation(a));
    }

    public static void main(String[] args){

        FunctionalInterfaceA fiA = (Integer a) -> 2*a;
        operation(4,fiA);

//        FunctionalInterfaceB fiB = (String a) -> {return a+a; };
//        System.out.println(fiB.operation("Rahul"));
        // Gives error because we added two abstract methods while functional only one.

        // Using default keyword we can assign methods in an interface an implementation.
        // See interface FunctionalInterfaceC
        FunctionalInterfaceC fiC = (Integer a) ->  a*a;

    }

}
