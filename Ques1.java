import java.util.Scanner;
class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input score number: ");
        double score = s.nextDouble();
        s.close();
        // Check if the score's value lies between 80 and 90 
        if(score>80 && score<90)
        {
            score+=5;
        }
        // print the score
        System.out.println("Score value " + score);
     
    }
}