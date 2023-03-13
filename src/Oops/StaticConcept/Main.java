package Oops.StaticConcept;

public class Main {

    public static void main(String[] args){

        ConceptB.NestedStaticClass.printMessageStatic();
        //ConceptB.NestedNonStaticClass.printMessage(); error

        //To call non - static method we need to initialize NestedStaticClass first because printMessageNonStatic is a
        // method of object not class.
        ConceptB.NestedStaticClass nestedStaticClass = new ConceptB.NestedStaticClass();
        nestedStaticClass.printMessageNonStatic();

        // Note: In order to create instance of Inner class
        //  we need an Outer class instance

        // Creating Outer class instance for creating
        // non-static nested class
        ConceptB conceptB = new ConceptB();
        ConceptB.NestedNonStaticClass nonStaticClass = conceptB. new NestedNonStaticClass();
        nonStaticClass.printMessage();

    }
}
