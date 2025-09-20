

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        // set name cho Nguyen Van An
        s1.setName("Nguyen Van An");
        s1.setId("17020001");
        s1.setGroup("K62CC");
        s1.setEmail("17020001@vnu.edu.vn");

        System.out.println(s1.getInfo());

        Student s2 = new Student();
        s2.setName("Nguyen Van B");
        s2.setId("17020002");
        s2.setGroup("K62CC");
        s2.setEmail("17020002@vnu.edu.vn");

        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn" );

        // add students
        StudentManagement stds = new StudentManagement();
        stds.addStudent(s1);
        stds.addStudent(s2);
        stds.addStudent(s3);
        stds.addStudent(s4);

        System.out.println(stds.sameGroup(s1, s2));
        stds.removeStudent("17020004");
        System.out.println(stds.studentsByGroup());

    }
}