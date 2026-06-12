package Week_2.Day_5;
import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String [] strs){
        Map <String,List<String>> map= new HashMap<>();
        for(String str:strs){
            int [] count= new int [26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder key= new StringBuilder();
            for(int num:count){
                key.append(num).append("#");
            }
             if(!map.containsKey(key.toString()))
{
    map.put(key.toString(), new ArrayList<>());
}

map.get(key.toString()).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
