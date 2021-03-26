package hw_3.Student;

class Student {

    private int course;
    private String name;
    private String surname;
    private String dateOfBirthday;

    public Student(int course, String name, String surname, String dateOfBirthday) {
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
}
