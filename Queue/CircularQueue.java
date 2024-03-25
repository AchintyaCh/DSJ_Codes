import java.util.Scanner;

class CircularQueue {
    public static void main(String[] args) {
        Operations op=new Operations();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1)Insert Data\n2)Delete Element\n3)Display Elements\n4)Exit\nEnter Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Your Data to be Inserted: ");
                    int data=sc.nextInt();
                    op.insert(data);
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
                    break;
                    
            }
            
        } while (ch!=4);
    }
}
class Operations{
    int front = -1;
    int rear = -1;
    int cQueue[] = new int[3];
    int size = cQueue.length;
void insert(int data){
    if(front==(rear+1)%size){
        System.out.println("Queue is Full");
    }
    else{
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        cQueue[rear]=data;
        System.out.println("Data Added: "+cQueue[rear]);
    }
}

void delete(){
    if(front==-1){
        System.out.println("Queue is Empty");
    }
    else{
        int ele=cQueue[front];
        front=(front+1)%size;
        System.out.println("Data deleted: "+ele);
    }
}

void display(){
    if(front==-1 || rear==-1){
        System.out.println("Queue is Empty");
    }
    else{
        for(int i=front;i!=rear;i=(i+1)%size){
            System.out.println(cQueue[i]);
        }
        System.out.println(cQueue[rear]);
    }
}
}


