package Oops.FinalConcept.FinalVariable;

/*
The only difference between a normal variable and a final variable is that we can re-assign the value to a
normal variable, but we cannot change the value of a final variable once assigned.
 */
public class FinalVariable {

    public static void main(String[] args){
        final int A = 10;
        System.out.println(A);
        //A = 20; showing error

        int[] B = {1,2,3,4};
        for (final int b : B)System.out.println(b);
        //Valid here because on each iteration b is going out of scope.
        // It is actually re-declaration each iteration
    }
}
