import java.util.Scanner;
class StringReversing{
    public static void main(String[] args) {
        String Name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        Name = scan.nextLine();
        Operations op = new Operations(Name);
        
    }
}
class Operations{
    int size;
    int top=-1;
    String[] mystack;
    public Operations(String Name){
       size=Name.length();
        mystack=new String[size];
        for(int i=0;i<size;i++){
            push(Name.charAt(i));
        }
        display();
        System.out.println("");
    } 
    void push(char data){
        if(top==size-1){
            System.out.println("Stack is Full");
        }
        else{
            top+=1;
            mystack[top] = String.valueOf(data);
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(mystack[i]);
        }
    }   
}