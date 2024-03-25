import java.util.Scanner;

class DemoStack{
    public static void main(String[] args) {
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do {
            System.out.println("1)Push Element\n2)Pop Element\n3)Display\n4)Exit\nEnter Your Choice: ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data to be pushd: ");
                    int data=sc.nextInt();
                    op.push(data);
                    break;
                case 2:
                    op.pop();
                case 3:
                    op.display();
                case 4:
                    return;           
                default:
                    return;
            }
            
        } while (ch!=4);
    }
}
class Operations{
    int top=-1;
    int []mystack=new int[3];
    int size=mystack.length;
    //Pushing the element into the Stack
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is Full");
        }
        else{
            top=top+1;
            mystack[top]=data;
            System.out.println("Data pushed: "+mystack[top]);
        }
    }
    //Popping the element from the Stack
    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            int element=mystack[top];
            top=top-1;
            System.out.println("Data Popped: "+element);
        }
    }
    //Displaying the Stack's elements
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(mystack[i]);
        }
    }
}