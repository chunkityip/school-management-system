public class Teacher {

    //Using private access modifier as Encapsulation
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id , String name , int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
    Cause we aren't change teacher id and name , so no need for set method
    for id and name
    */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Add to the salary
     * Removes from the total money earned by the school
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.setTotalMoneyEarned(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
