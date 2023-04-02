package lr2;

public class Example21_square implements Example21_figure{
    private double length;

    public Example21_square(double length) {
        this.length = length;
    }
    @Override
    public double Area() {
        return length * length;
    }
    @Override
    public double Perimeter() {
        return length * 4;
    }
}
