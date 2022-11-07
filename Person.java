public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    double height;
    private double weight;

    public Person(String firstName,String lastName, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.age=21;
    }
    public Person(String firstName,String lastName, double height, double weight,int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public int age()
    {
        this.age++;
        return this.age;
    }

    public void ageMany(int many)
    {
        this.age = this.age + many;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public double getHeight()
    {
        return this.height;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public int getAge()
    {
        return this.age;
    }
}

