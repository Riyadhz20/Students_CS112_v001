package test2;

public class Staff extends Employee{
    private String Title;
    
    Staff(String ObjName, int ObjEmployeeID, String ObjTitle){
        setName(ObjName);
        setEmployeeID(ObjEmployeeID);
        Title = ObjTitle;
    }
    
    @Override
    public String toString(){
        
        return "Staff Name is "+getName()
                +"\nStaff Employee ID is "+getEmployeeID() 
                +"\nStaff Title is "+Title;
    }
    
}
