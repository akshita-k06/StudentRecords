package treePractice;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {
    private List<Student> students =new ArrayList<>();
    public int rollNumber=0;


    public int addStudent(String name, String surname, int grade, String city){
        rollNumber+=1;
        Student newStudent=new Student(rollNumber,name,surname,grade,city);
        students.add(newStudent);
        return rollNumber;
    }
    public void removeStudent(int removeRollNumber){
        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getRollNumber()==removeRollNumber){
                students.remove(i);
                break;
            }
        }
    }
    public void updateStudent(int updateRollNumber, String updateColumn, String updateValue){
        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getRollNumber()==updateRollNumber){
                if(updateColumn.equals("name")){
                    students.get(i).setName(updateValue);
                }
                else if(updateColumn.equals("surname")){
                    students.get(i).setSurname(updateValue);
                }
                else if(updateColumn.equals("grade")){
                    students.get(i).setGrade(Integer.parseInt(updateValue));
                }
                else if(updateColumn.equals("city")){
                    students.get(i).setCity(updateValue);
                }
                break;
            }
        }
    }
    public void printStudentDetails(){
        for (Student student : students) {
            System.out.println(student.getRollNumber() + " " + student.getName() + " " + student.getSurname() + " " + student.getGrade() + " " + student.getCity());
        }
    }
}
