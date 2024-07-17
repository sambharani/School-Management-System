package school.management.system;

/**
 * This class is responsible for storing details of Teacher
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * new object of teacher
     * @param id id
     * @param name name
     * @param salary sal
     */
    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent();
    }

    @Override
    public String toString() {
        return "Name of teacher is"+ name + "Total salary earned so far"+ salaryEarned;
    }
}
