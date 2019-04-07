package test2;

public class Student extends Person{
    private long StudentID;
    
    Student(String name, long NewStudentID){
        setName(name);
        StudentID = NewStudentID;
    }
    
    
    
    @Override
    public String toString() {
        return "name Student is "+getName()+"\nStudent ID is "+StudentID ;
    }
}
