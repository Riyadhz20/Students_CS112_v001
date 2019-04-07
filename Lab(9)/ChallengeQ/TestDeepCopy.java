package testdeepcopy;

public class TestDeepCopy  {

    
    public static void main(String[] args) throws CloneNotSupportedException  {
        
            Course a = new Course("Math");
            a.addStudent("Raiydh");
            a.addStudent("Ahmad");
            a.addStudent("yzed");
            
            System.out.println("Object A >>>\nCourseName: " +a.getCourseName()
            +"\nNumber Of Students: "+ a.getNumberOfStudents()
            +"\nStudents: ");
            for (String student : a.getStudents()) {
                if (student != null) {
                    System.out.print(student + " ");
                }
            }
            
            
            Course b = (Course) a.clone();
            
            System.out.println("\n\nObject B >>>\nCourseName: " +b.getCourseName()
            +"\nNumber Of Students: "+ b.getNumberOfStudents()
            +"\nStudents: ");
            for (String student : b.getStudents()) {
            if (student != null) {
                System.out.print(student + " ");
            }
        }
            
            System.out.println("\n\nwe add Student in Object B: Esam and Osama So...");
            
            
            
            
            System.out.println("\nAgain Object A >>>\nCourseName: " +a.getCourseName()
            +"\nNumber Of Students: "+ a.getNumberOfStudents()
            +"\nStudents: ");
            for(int i = 0; i<a.getStudents().length; i++)
                if(a.getStudents()[i] != null)
                    System.out.print(a.getStudents()[i] + " ");
                    

            System.out.println("\n\nAgain Object B >>>\nCourseName: " +b.getCourseName()
            +"\nNumber Of Students: "+ b.getNumberOfStudents()
            +"\nStudents: ");
            for(int i = 0; i<b.getStudents().length; i++)
                if(b.getStudents()[i] != null)
                    System.out.print(b.getStudents()[i] + " ");
        }
            
    }
    
    

