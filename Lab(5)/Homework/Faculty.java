package test2;

public class Faculty extends Employee{
    private String Rank;
    
    Faculty(String ObjName, int ObjEmployeeID, String ObjRank){
        setName(ObjName);
        setEmployeeID(ObjEmployeeID);
        Rank = ObjRank;
    }
    
    @Override
    public String toString(){
        
        return "Faculty Name is"+getName()
                +"\nFaculty Employee ID is" +getEmployeeID()
                +"\nFaculty Rank is "+Rank;
    }
    
}
