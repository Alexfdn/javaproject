package lr2;

public class Example_21_triangle implements Example21_figure {
    private double a_len;
    private double b_osn;
    private double c_len;
    private double height;

    public Example_21_triangle(double a_len, double b_osn, double c_len, double height) {
        this.a_len = a_len;
        this.b_osn= b_osn;
        this.c_len = c_len;
        this.height = height;
    }

    @Override
    public double Area() {
        return b_osn * height / 2;
    }

    @Override
    public double Perimeter() {
        return a_len + b_osn + c_len;
    }
}

