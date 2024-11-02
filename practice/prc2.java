import java.util.*;
class prc2{
    public static void main(String args[])
    {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        HashSet<Integer> s=new HashSet<>();
        HashMap<Integer,Integer> m=new HashMap<>();

        
        for(int i=0;i<arr1.length;i++)
        {
            s.add(arr1[i]);
            if(m.containsKey(arr1[i]))
            {
                m.put(arr1[i],m.get(arr1[i])+1);
            }
            else
            {
                m.put(arr1[i],1);
            }
        
        }
        for(int i=0;i<arr2.length;i++)
        {
            s.add(arr2[i]);
            if(m.containsKey(arr2[i]))
            {
                m.put(arr2[i],m.get(arr2[i])+1);
            }
            else
            {
                m.put(arr2[i],1);
            }
        }

        for(int key:m.keySet())
        {
            if(m.get(key)>=2)
            {
                System.out.println(key);
            }
        }
        // System.out.println(s);

        System.out.println("Union values:");
        
        Iterator it=s.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(s.size());
    }
}

