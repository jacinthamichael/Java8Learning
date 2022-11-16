import java.util.List;

class Student{
    int id;
    String name;
    List<String> sports;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSports() {
        return sports;
    }

    public void setSports(List<String> sports) {
        this.sports = sports;
    }

    public Student(int id, String name, List<String> sports) {
        this.id = id;
        this.name = name;
        this.sports = sports;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sports=" + sports +
                '}';
    }

    public Student(){

    }
}