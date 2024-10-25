
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
    public void display()
    {
     
        System.out.println("color of pen is:- "+ this.color); 
        // this refer to the caller object 
        System.out.println("type of pen is:- "+ this.type);
        
    }
}
public class oops{
    public static void main(String args[])
    {
        pen p1=new pen();  
         // new keyword allocate the memory at heap  // pen is constructor here
        
        p1.color="blue";
        p1.type="ball point";
        p1.write();
        p1.display();
        pen p2=new pen();
        p2.color="red";
        p2.type="ball point";
        p2.write();
        p2.display();
    }
}