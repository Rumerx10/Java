package Stack;
import java.util.*;

public class StackClass{

    public static void pushAtBottom(int val, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAtBottom(val, s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);

    }


    public static void main(String[] args) {       

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        //pushAtBottom(4, s);


        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
        System.out.println(s.empty());
    }
}