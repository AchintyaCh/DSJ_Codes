class SeleSort {
    static void minimumElement(int []myArray,int start){
        int min=myArray[start];
        int index=start;
        for (int i = start; i < myArray.length; i++) {
            if(min>myArray[i]){
                min=myArray[i];
                index=i;
            }
            swapElement(myArray, index, start);
        }
    }
    static void swapElement(int []myArray,int pos1,int pos2){
        int x=0;
        x=myArray[pos1];
        myArray[pos1]=myArray[pos2];
        myArray[pos2]=x;
    }
    public static void main(String[] args) {
        int myArray[]={3,4,5234,524,43};
        for (int i = 0; i < myArray.length; i++) {
            minimumElement(myArray, i);
        }
        for (int i : myArray) {
            System.out.println(i);
        }

    }   
}
