
class student{

    // in java constructor function is to construct object
    // constructor has no return type
    // constructor is called when object is created
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);    
    }
    //constructor
    student(){
        System.out.println("Constructor Called");
    }
        
}
class constr{
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="Vishvam Salwan";
        s1.age=23;
        s1.printInfo();

    }
}