public class Circle {
    private double radius;
    private String color;

    // no-arg constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // keyword "this" is not used with this constructor because the parameters are not the same name as the variables
    public Circle (double r, String c) {
        radius = r;
        color = c;
    }

    // access radius and color
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.round((radius*radius*Math.PI)*100)/100.0;
    }

    // override toString() method so circle properties can be printed to console with easy implementation
    @Override
    public String toString() {
        return "Circle: [radius = " + radius + ", color = " + color + ", area = " +
                getArea() + "]";
    }
}
