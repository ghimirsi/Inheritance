import java.util.ArrayList;
import java.util.Scanner;
public class InheritanceDemo
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        String straightLine = "-";
        for(int i = 0; i < 51; i++) straightLine += "-";
        ArrayList<Worker> workerList = new ArrayList<Worker>();
        System.out.print("\n");
        System.out.print("\n\tEnter the details of workers :\n");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("\n");
            System.out.println(straightLine);


            System.out.print("\n\tEnter the First Name\n\t"); // Getting the firstname
            String firstName = in.nextLine();


            System.out.print("\n\tEnter the Last Name\n\t"); // Getting the last name
            String lastName = in.nextLine();

            System.out.print("\n\tEnter weight\n\t"); // getting the weight
            double weight = in.nextDouble();
            in.nextLine();

            System.out.print("\n\tEnter height\n\t"); // getting the height
            double height = in.nextInt();
            in.nextLine();


            System.out.print("\n\tEnter hourly pay rate\n\t"); // getting the hourly pay rate
            double hourlyPayRate = in.nextDouble();
            in.nextLine();
            Worker tempWorker = new Worker(firstName, lastName, weight, height, hourlyPayRate);


            workerList.add(tempWorker); // adding it to arraylist
            System.out.print(straightLine);
            System.out.print("\n");
        }

        System.out.print("\n\tEnter the details of salaried workers :");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("\n");
            System.out.print(straightLine);
            System.out.print("\n\tEnter the First Name\n\t"); // Getting the firstName from user
            String firstName = in.nextLine();

            System.out.print("\n\tEnter the Last Name\n\t");   // Getting the lastName from user
            String lastName = in.nextLine();

            System.out.print("\n\tEnter weight\n\t"); // Getting weight from the user
            double weight = in.nextDouble();
            in.nextLine();

            System.out.print("\n\tEnter height\n\t"); // Getting height from the user
            double height = in.nextInt();
            in.nextLine();

            System.out.print("\n\tEnter hourly pay rate\n\t"); // Getting the hourly pay rate
            double hourlyPayRate = in.nextDouble();
            in.nextLine();

            SalaryWorker tempWorker = new SalaryWorker(firstName, lastName, weight, height, hourlyPayRate);// Creating worker object

            workerList.add(tempWorker); // Adding it to the arraylist
            System.out.print(straightLine);
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++)
        {
            switch (i) {
                case 0:
                    System.out.println("\n\n \tSimulating Week 1. Hours:40.");
                    for (Worker worker : workerList)
                    {
                        System.out.println(worker.displayWeeklyPay(40.00));
                    }
                    continue;

                case 1:
                    System.out.println("\n\n \tSimulating Week 2. Hours:50.\n");
                    for (Worker worker : workerList)
                    {
                        System.out.println(worker.displayWeeklyPay(50.00));
                    }
                    continue;

                case 2:
                    System.out.println("\n\n \tSimulating Week 3. Hours:40.\n");
                    for (Worker worker : workerList)
                    {
                        System.out.println(worker.displayWeeklyPay(40.00));
                    }
                    continue;

                default:break;
            }
            System.out.print("\n");
        }

    }
}
