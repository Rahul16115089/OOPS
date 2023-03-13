package Oops.StaticConcept;

public class ConceptA {

    static String brand = "Audi";

    public ConceptA(){
        System.out.println("Constructor called");
    }

    /*
        Static block can be printed without main method.
        Static blocks are automatically called as soon as class is loaded in memory
     */
    static {
        System.out.println("Static block called " + brand);
    }

    public static void main(String args[]){
        ConceptA car = new ConceptA();
    }
}
