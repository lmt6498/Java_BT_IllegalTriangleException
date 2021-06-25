import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input triangle side A");
        int A = input.nextInt();
        System.out.println("Input triangle side B");
        int B = input.nextInt();
        System.out.println("Input triangle side C");
        int C = input.nextInt();
        try {
            Triangle triangle = new Triangle(A, B, C);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
