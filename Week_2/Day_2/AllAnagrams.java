package Week_2.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {
    public List<Integer> findAnagram(String s,String p){
        List <Integer> result= new ArrayList<>();
        int n=s.length();
        int m=p.length();
        if(m>n){
            return result;
        }
         int[] pCount= new int[26];
         int [] windowCount= new int[26];
         for(int i=0;i<m;i++){
            pCount[p.charAt(i)-'a']++;
            windowCount[s.charAt(i)-'a']++;
         }
         if(Arrays.equals(pCount,windowCount)){
            result.add(0);
         }
         for(int i=m;i<n;i++){
            windowCount[s.charAt(i)-'a']++;
            windowCount[s.charAt(i-m)-'a']--;
         
         if(Arrays.equals(pCount,windowCount)){
            result.add(i-m+1);
         }
        }
         return result;
    }
    
}
