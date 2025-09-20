public class Student {
    // Thuoc tinh name
    private String name;
    // Thuoc tinh id
    private String id;
    // Thuoc tinh group
    private String group;
    // Thuoc tinh email
    private String email;

    // getter, setter of each instance variable
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Get info method
    public String getInfo() {
        String c = " - ";
        String ans = name + c + id + c + group + c + email + "\n";
        return ans;
    }

    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    Student(String _name, String _id, String _email ) {
            name = _name;
            id = _id;
            email = _email;
            group = "K62CB";
    }

    Student(Student s) {
        this.email = s.email;
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
    }



}
