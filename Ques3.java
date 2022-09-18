import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number_Of_Days_In_Month = 0; 
        String Name_Of_the_Month = "";

        System.out.print("Input a month number: ");
        int Number_of_month = input.nextInt();
        input.close();
        switch (Number_of_month) {
            case 1:
                Name_Of_the_Month = "January";
                number_Of_Days_In_Month = 31;
                break;
            case 2:
                Name_Of_the_Month = "February";
                number_Of_Days_In_Month = 28;
                break;
            case 3:
                Name_Of_the_Month = "March";
                number_Of_Days_In_Month = 31;
                break;
            case 4:
                Name_Of_the_Month = "April";
                number_Of_Days_In_Month = 30;
                break;
            case 5:
                Name_Of_the_Month = "May";
                number_Of_Days_In_Month = 31;
                break;
            case 6:
                Name_Of_the_Month = "June";
                number_Of_Days_In_Month = 30;
                break;
            case 7:
                Name_Of_the_Month = "July";
                number_Of_Days_In_Month = 31;
                break;
            case 8:
                Name_Of_the_Month = "August";
                number_Of_Days_In_Month = 31;
                break;
            case 9:
                Name_Of_the_Month = "September";
                number_Of_Days_In_Month = 30;
                break;
            case 10:
                Name_Of_the_Month = "October";
                number_Of_Days_In_Month = 31;
                break;
            case 11:
                Name_Of_the_Month = "November";
                number_Of_Days_In_Month = 30;
                break;
            case 12:
                Name_Of_the_Month = "December";
                number_Of_Days_In_Month = 31;
        }
        System.out.println("Name of the month is "+Name_Of_the_Month);
        System.out.println("Number of days in month is "+number_Of_Days_In_Month);
    }
}
