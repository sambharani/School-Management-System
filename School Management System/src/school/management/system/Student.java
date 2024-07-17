package school.management.system;
// This Class is responsible for keeping records of students like fees, name , grade, fees paid or not
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Fees for every student is going to be 30K
     * Fees paid initially is 0
     * @param id uniqueness
     * @param name name of student
     * @param grade grade of student
     */

    public Student(int id,String name,int grade){
        //To create new student object
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //Not going to alter Students name,id
    //Used to update Students Grade - Parameter Grade is new Grade
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Add to the fees to already paid fees
     * @param fees Fees that is going to add on the feesPaid.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name"+ name + "Total fees paid so far"+ feesPaid
    }

}
