import java.util.*;
class arrays{
    public static void main(String args[])
    {
        int arr[]= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[2]);

        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }

        // other way of declaration i.e intializing while declaring
        int arr2[]={2,6,7,8};
        System.out.println();
        // if we dont intialize it is by default intilized with
        // 0 for int 
        // 0.0 for float
        // false for boolean
        //empty string for string
        System.out.println(arr2.length); // to calculate length of array

        // ques Take input from user and check if it is present in array

        int arr3[]={1,2,3,4,5};
        int no=sc.nextInt();
        int index=0;
        for(int j=0;j<arr3.length;j++)
        {
            if(no==arr[j])
            {
                index=j;
                break;
            }
        }
        System.out.println("The no is present at index" + index);

        //maximum and minimun in array
        int size=sc.nextInt();
        int ar3[]=new int[size]; 
        for(int i=0;i<size;i++)
        {
            ar3[i]=sc.nextInt();
        }
        int maxi=0;
        int mini=100000;

        for(int i=0;i<size;i++)
        {
            if(ar3[i]>maxi)
            {
                maxi=ar3[i];
            }
            if(ar3[i]<mini)
            {
                mini=ar3[i];
            }
        }
        System.out.println(maxi);
        System.out.println(mini);
        

    }
}