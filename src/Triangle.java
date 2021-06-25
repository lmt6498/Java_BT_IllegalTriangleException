import java.util.Scanner;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        sideA = sideB = sideC = 1;
    }

    public Triangle(double A, double B, double C) throws IllegalTriangleException {
        if (A + B <= C ||
                A + C <= B ||
                B + C <= A) throw new IllegalTriangleException(A,B,C);
        this.sideA = A;
        this.sideB = B;
        this.sideC = C;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
