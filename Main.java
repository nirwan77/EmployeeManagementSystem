public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee(1, "Shlok", "QA", 50000));
        manager.addEmployee(new Employee(2, "Nirwan", "Developer", 5000));

        System.out.println("All Employees:");
        manager.displayEmployees();
    }
}
