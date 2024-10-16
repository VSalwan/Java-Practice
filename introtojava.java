
// How java code run
// their is java development kit which include {jvm+libraries==jre}+development tools
// jvm=java virtual macine, jre=java run time environment
//1. process=compliation- source code{.java} with the help of compiler in jdk converted into byte code
// byte code can be run on any machine which make java as portable language
// 2. execution- byte code is converted to native code with help of jvm


// first prog to print hello world
import java.util.*; // include all packages

class introtojava{
    public static void main(String args[]){
        System.out.println("Hello World"); // use to print in next line
        //in above after printing it go to next line
        // we can also use '/n'to go to next line
        System.out.print("first program"); //used to print in same line
        // here system is a class 
        System.out.println("");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        // to take input
        Scanner sc= new Scanner(System.in);// it will not consider space as input
        String name=sc.next();  // sc is object of scanner class which is calling next function
        System.out.println(name); 

        Scanner sc2= new Scanner(System.in);
        String name2=sc2.nextLine(); // to consider space as input
        System.out.println(name2); 
        // nextInt() // to take integer input
        //nextFloat() // to take float as input


        // practice ques Take two no as input and print their sum
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int su=n1+n2;
        System.out.println(su);
        
    } 
}

