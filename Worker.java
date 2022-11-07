public class Worker extends Person
{

    private double hourlyPayRate;

    public Worker(String firstName,String lastName,double height,double weight,double hourlyPayRate)
    {
        super(firstName, lastName, height, weight);
        this.hourlyPayRate = hourlyPayRate;
    }
    public Worker(String firstName,String lastName,double height,double weight)
    {
        super(firstName, lastName, height, weight);
    }
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public double calculateWeeklyPay(double hoursWorked)
    {
        double result;

        if(hoursWorked<=40)
        {
            result = hourlyPayRate*hoursWorked;
        }
        else
        {
            double overtime = hoursWorked-40.00;
            double overtimePay=overtime*(hourlyPayRate*1.5);
            result = (40.00*hourlyPayRate) + overtimePay;
        }
        return result;
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        String result;
        String straightLine = "-";
        for(int i = 0; i < 51; i++) straightLine += "-";

        if(hoursWorked <= 40.00)
        {
            double total = calculateWeeklyPay(hoursWorked);
            result = String.format( "\n\n [-]\tPay Breakdown for %-15s :\n%s",getFirstName(),straightLine);
            result += String.format("\n \tStandard Pay:\t%-2.2f",hourlyPayRate);
            result += String.format("\n \tHours Worked this week :  %-2.2f",hoursWorked);
            result += String.format("\n%s\n \tTotal Payment :\t%-2.2f\n%s\n\n", straightLine, total, straightLine);
        }
        else
        {
            double overtime = hoursWorked - 40.00;
            double overtimePay = overtime * (hourlyPayRate*1.5);
            double standardPay = calculateWeeklyPay(40);
            double total = calculateWeeklyPay(hoursWorked);
            result = String.format( "\n\n [-]\tWeekly pay details for %-20s :\n%s",getFirstName(),straightLine);
            result += String.format("\n \tOvertime Pay Applied!\n%s\n \tHours Worked this week :\t%-2.2f\n%s\n",straightLine,hoursWorked,straightLine);
            result += String.format("\n [-]\tOvertime Pay Breakdown :\n\n\t \tOvertime Hours : %-2.2f\n\t \tOvertime Pay :\t$%-2.2f\n\t \tPayment Due :\t$%4.4f", overtime, hourlyPayRate*1.5, overtimePay);
            result += String.format("\n\n [-]\tStandard Pay Breakdown:\n\n\t \tStandard Pay Hours : %-2.2f\n\t \tStandard Pay :\t$%-2.2f\n\t \tPayment Due :\t$%-4.4f", hoursWorked , 40.00, standardPay);
            result += String.format("\n%s\n \tTotal Payment Due :\t%-4.4f\n%s\n\n", straightLine, total, straightLine);
        }

        return result;
    }
}


