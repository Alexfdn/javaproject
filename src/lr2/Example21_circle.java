package lr2;

public class Example21_circle implements Example21_figure{
    private double radius;
    public Example21_circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }


}

