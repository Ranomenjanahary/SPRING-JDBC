package school.hei.hellowordapi.Model;


public class Student {
    private String idStudent;
    private String name;
    private boolean active;

    public Student(String idStudent, String name, boolean active) {
        this.idStudent = idStudent;
        this.name = name;
        this.active = active;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return idStudent+ name + active;
    }
}
