import java.util.*;
class anagram{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        // //m1 using hashmap

        // if(str1.length()!=str2.length())
        // {
        //     System.out.println("Not anagram");
        // }
        // HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        // for(int i=0;i<str1.length();i++)
        // {
        //     if(!m.containsKey(str1.charAt(i)))
        //     {
        //         m.put(str1.charAt(i),1);
        //     }
        //     else{
        //         m.put(str1.charAt(i), m.get(str1.charAt(i))+1);
        //     }
               
        // }
        // for(int i=0;i<str2.length();i++)
        // {
        //     if(!m.containsKey(str2.charAt(i)))
        //     {
        //         m.put(str2.charAt(i),1);
        //     }
        //     else{
        //         m.put(str2.charAt(i), m.get(str2.charAt(i))+1);
        //     }
               
        // }
        // for(char key: m.keySet())
        // {
        //     if(m.get(key)%2!=0)
        //     {
        //         System.out.println("Not Anagram");
        //         break;
        //     }
        // }
        // System.out.println("Anagram");

        //m2 using sorting char array
        // if(str1.length()!=str2.length())
        // {
        //     System.out.println("Not anagram");
        // }
        //     char[] arr1=str1.toCharArray();
        //     char[] arr2=str2.toCharArray();

        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);
        //     if(Arrays.equals(arr1,arr2))
        //     {
        //         System.out.println("Anagrams");
        //     }
        //     else
        //     {
        //         System.out.println("Not Anagrams");
        //     }
        

        // m3 using frequency array
        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            freq[ch-'a']++;

        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            freq[ch-'a']--;
            
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
                System.out.println("Not Anagrams");
                break;
            }
            
        }
       
    
        System.out.println("Anagrams");
        

        }
    }
