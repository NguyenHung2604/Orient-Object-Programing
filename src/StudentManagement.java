import java.util.Objects;

public class StudentManagement {
    private final int MAXSIZE = 100;
    private Student[] students;
    private int cnt;

    public StudentManagement() {
        students = new Student[MAXSIZE];
        this.cnt = 0;
    }

    public void addStudent(Student newStudent) {
        if (cnt > MAXSIZE) {
            System.out.println("Cannot add a new student into class");
        } else {
            students[cnt] = newStudent;
            cnt++;
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return Objects.equals(s1.getGroup(), s2.getGroup());
    }

    public String studentsByGroup() {
        if (cnt == 0) {
            return "";
        }
        String ans = "";
        String curclass = students[0].getGroup();
        ans += curclass + "\n";
        for (int i = 0; i < cnt; i++) {
            if(students[i].getGroup() != curclass) {
                curclass = students[i].getGroup();
                ans += curclass + "\n";
            }
            ans += students[i].getInfo();
        }
        return ans;
    }

    public void removeStudent(String _id) {
        for (int i = 0; i < cnt; i++) {
            if(students[i].getId() == _id) {
                for (int j = i; j < cnt - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[cnt - 1] = null;
                cnt --;
            }
        }
    }


}
