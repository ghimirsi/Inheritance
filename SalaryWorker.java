public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, double height, double weight, double annualSalary)
    {
        super(firstName, lastName, height, weight);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String firstName, String lastName, double height, double weight)
    {
        super(firstName, lastName, height, weight);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){return annualSalary/52.00;}


    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        String straightLine = "-";
        for(int i = 0; i < 51; i++) straightLine += "-";
        String result = String.format("\n\n \tPay Breakdown for %-15s\t:\n%s\n \tWeekly Pay is :\t$%-2.2f\n%s\n \tWeekly salary calculated by dividing the annual salary by 52.\n\n",
                this.getFirstName()+ " "+this.getLastName() ,straightLine,calculateWeeklyPay(0),straightLine);
        return result;
    }

}

