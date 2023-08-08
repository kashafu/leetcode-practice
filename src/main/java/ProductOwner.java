class ProductOwner extends Employee implements SalaryAdjuster {
    public ProductOwner(double salary, String address, String firstName, String lastName, String description, int age) {
        super(salary, address, firstName, lastName, description, age);
    }

    public ProductOwner(ProductOwner productOwner) {
        super(productOwner.salary, productOwner.address, productOwner.firstName, productOwner.lastName, productOwner.description, productOwner.age);
    }

    public void adjustSalary(SalaryHolder employee, double newSalary) {
        if (employee instanceof Employee && !(employee instanceof ProductOwner)) {
            ((Employee) employee).salary = newSalary;
        } else {
            System.out.println("Product Owners cannot adjust their own salary.");
        }
    }
}