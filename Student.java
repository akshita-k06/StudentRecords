package treePractice;

public class Student {
    private final int rollNumber;
    private String name;
    private String surname;
    private int grade;
    private String city;

    Student(int rollNumber, String name, String surname, int grade, String city){
        this.rollNumber=rollNumber;
        this.name =name;
        this.surname =surname;
        this.grade =grade;
        this.city =city;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
