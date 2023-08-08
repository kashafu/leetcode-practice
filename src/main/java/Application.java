import java.util.List;

public class Application {

    public static void main(String[] args) {

        ProductOwner productOwner = new ProductOwner(80000, "Munich", "Harald", "Hechler", "Product Owner", 35);
        SalaryHolder intern = new Intern(20000, "Heilbronn", "Kashaf", "Arshad", "Intern", 27);
        SalaryHolder developer = new Developer(50000, "Munich", "Alex", "Reichmen", "Developer", 28);
        SalaryHolder productOwnerAdjustTest = new ProductOwner(productOwner);

        System.out.println("----------- Initial Salary ----------------- ");
        System.out.println("Intern's Salary: " + intern.getSalary());
        System.out.println("Developer's Salary: " + developer.getSalary());
        System.out.println("Product Owner's Salary: " + productOwner.getSalary());

        productOwner.adjustSalary(intern, 22000);
        productOwner.adjustSalary(developer, 55000);
//        productOwner.adjustSalary(productOwnerAdjustTest, 90000);

        System.out.println("\n----------- Adjusted Salary ----------------- ");
        System.out.println("Adjusted Intern's Salary: " + intern.getSalary());
        System.out.println("Adjusted Developer's Salary: " + developer.getSalary());
        System.out.println("Product Owner's Salary: " + productOwner.getSalary());
    }

}
