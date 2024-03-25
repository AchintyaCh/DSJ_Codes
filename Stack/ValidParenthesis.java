//This is a code for checking Valid parenthesis of Input String.
import java.util.Scanner;
class ValidParenthesis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Operations op=new Operations();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //If Character is Opening Bracket '(' we will push it to stack
            if(ch=='(' || ch=='{' || ch=='['){
                op.push(ch);
            }
            //If Character is Closing Bracket ')' we will pop it from stack
            else if(ch==')' || ch=='}' || ch==']'){
                op.pop();
                        }
        }
        //To check if it's valid we will check if stack is empty or not. 
        if(op.flag==true){
        if(op.top==-1){
            //If stack is empty we will print the message Valid
            System.out.println("Valid Parenthesis");
        }
        else{
            //If stack is not empty then it is not valid
            System.out.println("Invalid Parenthesis");
        }
    }
        
    }
}
class Operations{
    int top=-1;
    boolean flag=false;
    char c;
    char mystack[]=new char[100];
    int size=mystack.length;
    void push(char data){
        if(top==size-1){
            System.out.println("Stack is Full");
        }
        else{
            top+=1;
            mystack[top]=data;
        }
    }
    void pop(){
        if(top==-1){
            flag=false;
            System.out.println("Invalid Parenthesis");
            
        }
        else{
            flag=true;
            c=mystack[top];
            top-=1;
        }
    }
}