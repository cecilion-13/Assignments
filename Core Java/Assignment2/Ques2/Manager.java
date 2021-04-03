package co.harsh.Assignment2.Ques2;

/**
 * This class is responsible for keeping track on Manager's Data
 */
public class Manager extends Employee{

    private int incentive = 2000;

    public Manager(int id,String name,int salary){
        super(id,name,salary);
    }
    @Override
    public int getTotalSalary() {
        System.out.println("2000 plus for incentive \nTherefore for Manager");
        return super.getTotalSalary()+incentive;
    }
}
