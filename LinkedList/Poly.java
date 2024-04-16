import java.util.Scanner;
class Poly{
    public static void main(String[] args) {
        
    
    Polynomial1 obj=new Polynomial1();
    Polynomial2 obj2=new Polynomial2();
    Scanner sc=new Scanner(System.in);
    int ch=0;
    do{
        System.out.println("1)Add Polynomial Term\n2Exit\nEnter your input:");
    ch=sc.nextInt();
    switch(ch){
        case 1:
        System.out.println("Enter Your Co-efficient:");
        int coeff=sc.nextInt();
        System.out.println("Enter Your degree:");
        int degree=sc.nextInt();
        obj.insertAtEnd(coeff, degree);
        break;
        
        case 2:
            return;
        default:
            return;
    }
}while(ch!=2);
System.out.println("Next Polynomial");

    do{
        System.out.println("1)Add Polynomial Term\n2)Add\n3)Exit\nEnter your input:");
    ch=sc.nextInt();
    switch(ch){
        case 1:
        System.out.println("Enter Your Co-efficient:");
        int coeff=sc.nextInt();
        System.out.println("Enter Your degree:");
        int degree=sc.nextInt();
        obj.insertAtEnd(coeff, degree);
        break;
        
        case 2:
            System.out.println("Enter Your Co-efficient:");
            coeff=sc.nextInt();
            System.out.println("Enter Your degree:");
            degree=sc.nextInt();
            obj.insertAtEnd(coeff, degree);
        default:
            return;
    }
}while(ch!=3);
        Add obj3=new Add();
        obj3.addNode(null, null);
}
}
class Node{
    Node next=null;
    Node prev=null;
    int degree;
    int coeff;
}
class Polynomial1{
    Node varStart1;
    Node newNode;
    Node start=null;
    Node p=null;
    void createNewNode(int coeff,int degree){
        newNode= new Node();
        newNode.coeff=coeff;
        newNode.degree = degree;
    }
    void insertAtEnd(int coeff,int degree){
        createNewNode(coeff,degree);
        Node p=start;
        if(p==null){
            start=newNode;
        }
        else{
            while(p.next!=null){
            p=p.next;
            }
            p.next=newNode;
        }
    }
    void startRet(){
        varStart1=start;
    }
}
class Polynomial2{
    Node newNode2;
    Node start2=null;
    Node p=null;
    void createNewNode(int coeff,int degree){
        newNode2= new Node();
        newNode2.coeff=coeff;
        newNode2.degree = degree;
    }
    Node insertAtEnd(int coeff,int degree){
        createNewNode(coeff,degree);
        Node p=start2;
        if(p==null){
            start2=newNode2;
        }
        else{
            while(p.next!=null){
            p=p.next;
            }
            p.next=newNode2;
        }
        return start2;
    }
}
class Add{
    void addNode(Node start1,Node start2){

    }

}
