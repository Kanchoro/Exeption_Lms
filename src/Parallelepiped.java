public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double calculateVolume() {
        return length * width * height;
    }
}
