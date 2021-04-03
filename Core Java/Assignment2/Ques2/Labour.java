package co.harsh.Assignment2.Ques2;

/**
 * this class is responsible for keeping track on labour
 */
public class Labour extends Employee{
    private int overtime = 1000;

    public Labour(int id,String name,int salary){
        super(id,name,salary);
    }

    @Override
    public int getTotalSalary() {
        System.out.println("1000 plus for overtime \nTherefore for Labour ");
        return super.getTotalSalary()+overtime;
    }
}
