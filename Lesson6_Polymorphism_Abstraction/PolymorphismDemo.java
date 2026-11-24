package polymorphismdemo;

public class PolymorphismDemo {

    public static void main(String[] args){
        
        Student stud1 = new BSIT();
        Student stud2 = new ITE();
        
        stud1.studentSection();
        stud2.studentSection();
        
    }
    
}
