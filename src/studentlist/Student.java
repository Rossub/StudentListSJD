package studentlist;

public class Student {
    String name;
    String ID;

    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    
    public String getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

}
