import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> ALL_MARKS;

    public Student() {
        ALL_MARKS = new ArrayList<>();
        ALL_MARKS.add(90);
        ALL_MARKS.add(85);
        ALL_MARKS.add(78);
        ALL_MARKS.add(92);
    }

    public List<Integer> getAllMarks() {
        return ALL_MARKS;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getAllMarks());
    }
}
