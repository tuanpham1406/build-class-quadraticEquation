public class QuadraticEquation {
  private double a, b, c, delta, r1, r2;
  public QuadraticEquation() {
  }
  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double getDiscriminant() {
    return delta = this.b*this.b - 4*this.a*this.c;

  }
  public double getRoot1() {
    return r1 = (-this.b + Math.pow(delta, 0.5))/(2*this.a);
  }
  public double getRoot2() {
    return r2 = (-this.b - Math.pow(delta, 0.5))/(2*this.a);
  }
}