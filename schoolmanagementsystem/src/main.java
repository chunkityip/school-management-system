import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Teacher lawrence = new Teacher(1 , "Lawrence" , 75000);
        Teacher alex = new Teacher(2 , "Alex" , 50000);

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(lawrence);
        teacherList.add(alex);


        Student ethan = new Student(1 , "Ethan" , 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ethan);

        School bmcc = new School(teacherList , studentList);
        System.out.println(bmcc.getTotalMoneyEarned());

        ethan.payFees(5000);


    }
}
