class Demo{
    void replaceElement(int[] myArray,int position){
        int x;
        try {
            if(myArray[position]==0){
                x=myArray[position];
                myArray[position]=myArray[position+1];
                myArray[position+1]=x;
                replaceElement(myArray, position+1);
            }
            else{
                replaceElement(myArray, position+1);
            }
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        int []myArray={2,5,0,-3,4,67,0,12,0,2};
        Demo obj=new Demo();
        for (int i = 0; i < myArray.length; i++) {
            obj.replaceElement(myArray, i);  
        }
        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+",");
        }
        System.out.print("]");
    }
}
