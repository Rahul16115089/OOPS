package Oops.StaticAndImmutable;

public class Main {


    /*
     equals(Object otherObject) – verifies the equality of two objects. Its default implementation simply checks the
     object references of two objects to verify their equality.
     By default, two objects are equal if and only if they are refer to the same memory location. Most Java classes
     override this method to provide their own comparison logic.

    hashcode() – returns a unique integer value for the object in runtime.
    By default, integer value is derived from memory address of the object in heap (but it’s not mandatory).
    The object’s hash code is used for determining the index location, when this object needs to be stored in some
     HashTable like data structure.
     */
    public static void main(String[] args){
        String b = "rahul";
        String c = "rahul";
        String d = new String("rahul");
        System.out.println(b.equals(c));
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        Integer I = 23;
        System.out.println(I);
        System.out.println(I.hashCode());
        I = 12;
        System.out.println(I.hashCode());
        modify(I);
        System.out.println(I);

        Custom customA = new Custom("Rahul",2,44l);
        Custom customB = new Custom("Rahul",2,44l);
        Custom customC = customA;

        System.out.println(customA.equals(customB));
        System.out.println(customC.equals(customA));

    }

    private static void modify(Integer i) {
        System.out.println(i.hashCode());
        i = i + 1;
        System.out.println(i.hashCode());
    }
}
