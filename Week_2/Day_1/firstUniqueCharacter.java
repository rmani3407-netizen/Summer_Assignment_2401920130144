package Week_2.Day_1;

public class firstUniqueCharacter {
    public  int  isUnique(String s){
        int [] count = new int[26];
        for(int i=0; i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
