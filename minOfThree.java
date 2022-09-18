
public class minOfThree {
     public static void main(String[] args) {
      int num1 = 8;
      int num2 = 67;
      int num3 = 81;
      if(num1<num2 && num2<num3)
      {
          System.out.println("Smallest number is "+num1);
      }
      else if(num2<num1 && num1<num3)
      { 
        System.out.println("Smallest number is "+num2);
      }
      else{
        System.out.println("Smallest number is "+num3);
      }
    }
}
