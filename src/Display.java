import java.util.Scanner;

public class Display {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a = ");
    Double a = sc.nextDouble();
    System.out.print("b = ");
    Double b = sc.nextDouble();
    System.out.print("c = ");
    Double c = sc.nextDouble();
    QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
    double delta = quadraticEquation.getDiscriminant();
    if (delta >= 0) {
      System.out.println("Root 1 = " + quadraticEquation.getRoot1() + " Root 2 = " + quadraticEquation.getRoot2());
    } else if (delta == 0) {
      System.out.println("Root = " + quadraticEquation.getRoot1());
    } else {
      System.out.println("The equation has no roots");
    }
  }
}
