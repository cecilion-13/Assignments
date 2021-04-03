package co.harsh.Assignment2.Ques2;

public class Test {
    public static void main(String[] args) {

        Employee manager = new Manager(3,"Zoe",18000);
        System.out.println(manager.getTotalSalary());

        Employee labour = new Labour(4,"Harris",4000);
        System.out.println(labour.getTotalSalary());

        Employee employee = new Employee(5,"Joe",10000);
        System.out.println(employee.getTotalSalary());
    }
}
