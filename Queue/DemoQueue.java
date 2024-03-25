import java.util.Scanner;
class DemoQueue {
    public static void main(String[] args) {
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        int ch;
        do {
            System.out.print("1)Insert Into Queue\n2)Delete From Queue\n3)Display the Queue\n4)Exit\nEnter Your Choice : ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Element to be inserted: ");
                    int data=sc.nextInt();
                    op.insert(data);
                    System.out.println();
                    break;
                case 2:
                    op.delete();
                    System.out.println();
                    break;
                case 3:
                    op.display();
                    System.out.println();
                    break;
            
                default:
                return;
            }
            
        } while (ch!=4);
    }
}

class Operations{
    int front = -1;
    int rear = -1;
    int myQueue[]=new int[3];
    int size=myQueue.length;
    void insert(int data){
        //Full Condition
        if(rear==size-1){
            System.out.println("Queue is Full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear=rear+1;
            myQueue[rear]=data;
            System.out.println("Data Inserted: "+myQueue[rear]);
        }
    }
    void delete(){
        //Empty Condition
        if(front==-1 || front>rear){
            System.out.println("Queue is Empty");
        }
        else{
            int ele=myQueue[front];
            front+=1;
            System.out.println("Data deleted: "+ele);
        }
    }
    void display(){
        if(front==-1 || front>rear){
            System.out.println("Queue is Empty");
        }
        else{

            for(int i=front;i<=rear;i++){
                System.out.print("->"+myQueue[i]);
            }
        }
    }
}