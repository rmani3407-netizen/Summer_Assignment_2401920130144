package Summer_Assignment_2401920130144.Week_1.Day_3;

public class SortedSquare {
   
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] result = new int [n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare > rightSquare){
                result[index]=leftSquare;
                left++;
            }
            else{
              result[index]=rightSquare;
              right--;  
            }
            index--;
        }
        return result;
    }
}

