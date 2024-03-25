import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String inputString=sc.nextLine();
        for(int i=0;i<inputString.length();i++){
            op.push(inputString.charAt(i));
        }
        String s=op.display();
        System.out.println(s);
    }
}
class Operations{
    int top=-1;
    String []mystack=new String[100];
    int size=mystack.length;
    void push(char data){
        if(top==size-1){
            System.out.println("Stack is Full");
        }
        else{
            top=top+1;
            mystack[top]=String.valueOf(data);
            System.out.println("Pushed" + mystack[top]);
        }
    }
    String pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return "\0";
        }
        else{
            String ele=mystack[top];
            top=top-1;
            System.out.println("Popped" + ele);
            return ele;
        }
    }
    String display(){
        String s="";
        if(top==-1){
            System.out.println("No input entered");
        }
        else{
            for(int i=top;i>=0;i--){
                s+=pop();
            }
        }
        return s;
    }
}
