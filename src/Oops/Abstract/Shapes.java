package Oops.Abstract;

public abstract class Shapes {
    String shape = "Shapes";

    String usage = "Not yet";

    public Shapes(String shape,String usage){
        this.shape = shape;
        this.usage = usage;
    }

    public abstract Integer Area();
    public abstract String showDimension();

    public String getShapeName(){
        return shape + " " + usage;
    }

}
