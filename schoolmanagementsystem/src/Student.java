public class Student {
    //Using private access modifier as Encapsulation
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id , String name , int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 15000;
    }

    /**
    Cause we aren't change Student id and name , so no need for set method
    for id and name
    */

    public void payFees(int fees) {
        feesPaid += fees;
        School.setTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * For updating the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    /**
     * Keep adding the fees to feesPaid Field
     *  @param fees the fees that the student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid+=fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
