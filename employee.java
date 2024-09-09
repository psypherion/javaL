class Employee {
    String name, address;
    int age;
    long phoneNumber;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class employee {
    public static void main(String[] args) {
        Officer officer = new Officer();
        officer.name = "John";
        officer.age = 30;
        officer.phoneNumber = 1234567890L;
        officer.address = "123 Elm Street";
        officer.salary = 50000;
        officer.specialization = "IT";
        officer.printSalary();

        Manager manager = new Manager();
        manager.name = "Alice";
        manager.age = 45;
        manager.phoneNumber = 9876543210L;
        manager.address = "456 Maple Avenue";
        manager.salary = 70000;
        manager.department = "HR";
        manager.printSalary();
    }
}
