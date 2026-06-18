package Week_3.Day_4;

import java.util.Stack;

public class DailyTemperatures {
    public int [] dailytemperature(int [] temp){
int n= temp.length;
int [] ans= new int [n];
Stack <Integer> stack = new Stack<>();
for(int i=0;i<n;i++){
    while(!stack.isEmpty()&& temp[i]>temp[stack.peek()]){
        int idx=stack.pop();
        ans[idx]=i-idx;
    }
stack.push(i);
}
return ans;
    }
}
