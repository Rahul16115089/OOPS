package Oops.TypeCasting;

public class Main {

    public static Parent parent(){
        return new Parent(1);
//        return new Child(1,2);
//        return new ChildOfChild(1,2,3);
        // all can be returned in interchangeably
    }

    public static void main(String[] args){

/*
        //DownCasting that is not possible
        Parent P = new Parent(5);
        Child C = (Child) P;
        C.sum(2);
*/
        //DownCasting
        Parent P = new Child(3,5);
        Child C = (Child) P; //We are doing it explicitly
        System.out.println(C.sum(2));

        //Upcasting
        Parent parent = new Child(2,3); //It is happening implicitly
        System.out.println(parent.multiply(2));

        Parent p = new ChildOfChild(1,2,3);
        ChildOfChild childOfChild = new ChildOfChild(1,2,3);
        Child child = (Child) childOfChild;

    }


}