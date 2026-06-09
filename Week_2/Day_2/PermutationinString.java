package Week_2.Day_2;
import java.util.Arrays;

public class PermutationinString {
   


    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
      int n2=s2.length();

        if(n1>n2){
            return false;
        }
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < n1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Count, windowCount)) {
            return true;
        }

        for (int i = n1; i < n2; i++) {

            // Add new character
            windowCount[s2.charAt(i) - 'a']++;

            // Remove old character
            windowCount[s2.charAt(i - n1) - 'a']--;

            if (Arrays.equals(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }
}

