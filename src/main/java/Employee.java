class Employee implements SalaryHolder {
    protected double salary;
    protected String address;
    protected String firstName;
    protected String lastName;
    protected String description;
    protected int age;

    public Employee(double salary, String address, String firstName, String lastName, String description, int age) {
        this.salary = salary;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.age = age;
    }


    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public int getAge() {
        return age;
    }
}