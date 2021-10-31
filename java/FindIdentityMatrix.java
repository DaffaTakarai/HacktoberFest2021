public class FindIdentityMatrix
{    
    public static void main(String[] args){
        int row, column;
        boolean flag = true;
        int a[][] = { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} };
        row = a.length;    
        column = a[0].length;
        if(row != column){
            System.out.println("Matrix should be a square matrix");
        }
        else{
            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    if(i == j && a[i][j] != 1){
                        flag = false;
                        break;
                    }
                    if(i != j && a[i][j] != 0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
                System.out.println("Given Matrix is an Identity Matrix");
            else
                System.out.println("Given Matrix is not an Identity Matrix");
        }
    }
}