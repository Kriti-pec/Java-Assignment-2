
public class minOfThree {
  public static void main(String[] args) {
    int num1 = 8;
    int num2 = 67;
    int num3 = 81;
    int smallest;

    // find the smallest
    if (num1 < num2) {
      if (num3 < num1) {
        smallest = num3;
      } else {
        smallest = num1;
      }
    } 
    else {
      if (num2 < num1) {
        smallest = num2;
      } else {
        smallest = num3;
      }
    }

    System.out.println(smallest + " is the smallest.");
  }
}
