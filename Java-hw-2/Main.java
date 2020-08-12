import java.lang.Math;
public class Math {
  public static void Main(String[] args) {
    double a = 1;
    double b = 15;
    double c = 50;
    double solution;
    solution = Math.sqrt((b^2)-4*a*c);
    solution = -b + solution;
    solution = solution/(2*a);
    System.out.println(solution);
  }
}