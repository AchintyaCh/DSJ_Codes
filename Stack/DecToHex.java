import java.util.Scanner;
class DecToHex{
    public static void main(String[] args) {
        DectoHex obj=new DectoHex();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Decimal: ");
        int num=sc.nextInt();
        int R;
        while(num!=0){
            R=num%16;
            obj.push(R);
            num=num/16;
        }
        obj.display();
        System.out.println();
    }
}
class DectoHex{
    int top=-1;
    int[] mystack=new int[100];
    int size=mystack.length;
    void push(int element){
        if(top==(size-1)){
            System.out.println("Stack is Full");
        }
        else{
            top += 1;
            mystack[top]=element;
        }
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                if(mystack[i]>9){
                    System.out.print((char)(mystack[i]+55));
                }
                else{
                    System.out.print(mystack[i]);
                }
            }
        }
    }
}
