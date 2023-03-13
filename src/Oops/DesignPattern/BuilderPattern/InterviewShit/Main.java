package Oops.DesignPattern.BuilderPattern.InterviewShit;

public class Main {

    public static void main(String[] args){
//        Builder builder = new Builder();
//        ToBeBuilded toBeBuilded = builder.newBuilderInstance().setPropA(3).setPropB("Rahul").build();
//        System.out.println(toBeBuilded.toString());
        ToBeBuilded toBeBuilded = Builder.newBuilderInstance().setPropA(2).setPropB("Rahul").setPropC(3l).build();
        System.out.println(toBeBuilded.toString());
    }

}
