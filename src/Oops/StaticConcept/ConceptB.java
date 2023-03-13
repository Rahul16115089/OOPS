package Oops.StaticConcept;


//Non - static fields/methods are the properties of Object(when object is initialized from class) while
// static are properties of class.
//Outer Class
public class ConceptB {

    private static String conceptStaticMsg = "Static Concept";

    private String conceptNonStaticMsg = "Non - Static Concept";

    // Static nested class
    public static class NestedStaticClass{

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public static void printMessageStatic(){
            System.out.println("Nested static class static method - " + conceptStaticMsg);
            //System.out.println("Nested static class method - " + conceptNonStaticMsg); gives error
        }
        public void printMessageNonStatic(){
            System.out.println("Nested static class non - static method - " + conceptStaticMsg);
            //System.out.println("Nested static class non - static method - " + conceptNonStaticMsg); gives error
        }

    }

    public class NestedNonStaticClass{

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void printMessage(){
            System.out.println("Nested non-static class method accessing static field- " + conceptStaticMsg);
            System.out.println("Nested non-static class method accessing non-static field- " + conceptNonStaticMsg);
        }
    }

}
