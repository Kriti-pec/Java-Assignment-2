public class Ques4 {

    public static void main(String arr[])  {
        // Initialise the growth_rate, population and present year
        double growth_rate = 0.05;
        int population = 80000;
        int year = 0; // zero years from now -> the present time
        while(population<=150000)
        {
            population +=(int)(population*growth_rate);
            year++;
        }
        // Output results
        System.out.println("The population first goes over 150000 after "+year+" years.");
        System.out.println("The population is "+population+".");
    }
}