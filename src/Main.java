public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 100000);
        employees[1] = new Employee("Иванов Егор Иванович", 1, 120000);
        employees[2] = new Employee("Иванов Петр Иванович", 2, 110000);
        employees[3] = new Employee("Иванов Василий Иванович", 3, 130000);
        printEmployees();
        printSum();
        printEmployeeMinSalary();
        printEmployeeMaxSalary();
        printAverageSalary();
        printNames();
    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void printSum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Salary sum: " + sum);
    }

    private static void printEmployeeMinSalary() {
        double min = Double.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        System.out.println("Employee min salary: " + employeeMinSalary);
    }
    private static void printEmployeeMaxSalary() {
        double max = Double.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        System.out.println("Employee max salary: " + employeeMaxSalary);
    }

    private static void printAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.println("Average salary: " + sum / count);
    }

    private static void printNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}