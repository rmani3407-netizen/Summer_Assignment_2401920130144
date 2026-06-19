package Week_3.Day_5;

import java.util.Stack;

public class ImplementQueueusingStacks {
    Stack <Integer> input;
     Stack <Integer> output;
     public ImplementQueueusingStacks(){
        input= new Stack<>();
        output=new Stack<>();
     }
     public  void push(int x){
        input.push(x);
     }
     public int pop(){
        peek();
        return output.pop();
     }
     public int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
     }
     public boolean empty(){
        return input.isEmpty() && output.isEmpty();
     }
}
