public class IllegalTriangleException extends Exception{
    private double sideA;
    private double sideB;
    private double sideC;

    public IllegalTriangleException(double a, double b, double c) {
        super("Illegal sides " + a + " " + b + " " + c);
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
