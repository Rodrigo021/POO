

public class Rectangles {

    private double Width;
    private double Height;

    public void width(double w) {
        this.Width = w;
    }
    public void height(double h) {
        this.Height = h;
    }

    public double area() {
        return Width * Height;
    }

    public double perimeter() {
        return 2*(Width + Height);
    }

    public double diagonal() {
        double m = Math.sqrt(Math.pow(Width, 2)+Math.pow(Height, 2));
        return m;
    }
}
