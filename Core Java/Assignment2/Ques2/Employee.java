package co.harsh.Assignment2.Ques2;

/**
 * This class is keeping track on Employees of the company
 */
public class Employee {
    private int id;
    private String name;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * used to create empty object of employee
     */
    public Employee(){

    }

    /**
     * create an object of employee class
     * @param id is id of the employee unique
     * @param name is name of the employee
     * @param salary is salary of the employee
     */
    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    //not going to update employee id and name.

    /**
     * update the salary of an employee
     * @param salary is the amount upto which salary has to be updated
     */
    public void updateSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @return id of the employee
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of the employee
     */
    public int getTotalSalary() {
        System.out.println("Salary is ");
        return salary;
    }

}
