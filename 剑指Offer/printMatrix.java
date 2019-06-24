 /*
    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
    例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

    解题思路：采用旋转魔方的方式 一次取一行，然后旋转
 */
 public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        if(matrix==null) return list;
        
        int row=matrix.length;
        while(true){
            for(int i=0;i<matrix[0].length;++i) list.add(matrix[0][i]);
            if(row==1) return list;
            matrix = turnMatrix(matrix);
            row = matrix.length;
            
        }
       
    }
    //旋转矩阵的函数
    public int[][] turnMatrix(int matrix[][]){
        int col = matrix[0].length;
        int row = matrix.length;
        
        int newMatrix[][] = new int[col][row-1];
        
        int newRow = 0;
        int newCol = 0;
        for(int i=col-1;i>=0;--i){
            for(int j=1;j<row;++j){
                newMatrix[newRow][newCol++] = matrix[j][i];
            }
            ++newRow;
            newCol = 0;
        }
        return newMatrix;
    }