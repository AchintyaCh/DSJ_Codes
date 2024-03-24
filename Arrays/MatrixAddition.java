class MatrixAddition{
    public static void main(String[] args) {
        int [][]matrix1={{1,2,3},{1,2,3},{1,2,3}};
        int [][]matrix2={{4,5,6},{4,5,6},{4,5,6}};
        int [][]results=new int[matrix1.length][matrix2.length];
        for(int i=0;i<matrix1.length;i++){
            System.out.print("| ");
            for(int j=0;j<matrix2.length;j++){
                results[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(results[i][j]);
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println("");
        }
               
        
    }
}