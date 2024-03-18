package Week8;

public class Student {

    private String studentName;
    private double gpa;
    public Student (){
        studentName = "No name yet...";
        gpa = 4.0;
    } //end of default constructor

    public Student (String theName, double theGPA) {
        studentName = theName;
        gpa = theGPA;
    }

    public String getStudentName (){
        return studentName;
    }

    public void setStudentName (String theName){
        studentName = theName;
    }

} //end of Student class
