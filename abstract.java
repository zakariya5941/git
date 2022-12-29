package abstraction_mca;

abstract class parent
{
    abstract void display();
    parent()
    {
        System.out.println("Parent constructor");
        
    }
    
}
class child extends parent
{
    @Override
    void display()
    {
        System.out.println("This is child class");
    }
    child()
    {
        System.out.println("child Teacher");
    }
}


public class Abstraction_mca {


    public static void main(String[] args) {
        parent p1 = new child();
        p1.display();
        
      
 
    }
    
}