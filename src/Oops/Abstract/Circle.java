package Oops.Abstract;

public class Circle extends Shapes {

    private Integer radius;

    public Circle(Integer radius) {
        super("Circle","Gol Gol");
        this.radius = radius;
    }

    @Override
    public Integer Area() {
        return radius*radius;
    }

    @Override
    public String showDimension() {
        return "Circle with radius - " +radius;
    }


}
