
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
    student(String name, int age){
        this.name=name;
        this.age=age;
    }
        
}
class constr{
    public static void main(String args[])
    {
        student s1=new student("Vishvam Salwan",23);
        s1.printInfo();

    }
}