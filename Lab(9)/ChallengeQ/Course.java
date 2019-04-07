package testdeepcopy;


public class Course implements Cloneable{
    
    private  String courseName= null;
    private  String[] students = new String[100];
    private int numberOfStudents = 0 ;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setStudents(String[] students) {
        this.students = students;
        
        for(int i = 0; i < students.length; i++)
            this.students[i]=students[i];
        
        
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
    
    
    

    /*public Object clone()throws CloneNotSupportedException{
        
        
        
        
        return super.clone();
    }*/
    
    
    public Object clone()throws CloneNotSupportedException{
        Object obj = super.clone(); //utilize clone Object method

	Course emp = (Course) obj;

        
	// deep cloning for immutable fields
	emp.setCourseName(this.courseName);
        emp.setNumberOfStudents(this.numberOfStudents);
        
        
        String[] studentsObj = new String[100];
        emp.setStudents(this.students);
        
        
        
        
	return emp;
        
        
    
    }

    
}
