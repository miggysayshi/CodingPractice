class Solution{
    public int maximalSquare(char[][] matrix){
        if(matrix.length<=0) return 0;
        //create a new value matrix
        int[][] value = new int[matrix.length][matrix[0].length];
        //iterate through the entire matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == '0'){
                    value[i][j] = 0;
                }
                if(matrix[i][j] == '1'){
                    int bottom = checkBounds(value, i, j-1);
                    int right = checkBounds(value, i-1, j);
                    int diagonal = checkBounds(value, i-1,j-1);
                    value[i][j] = Math.min(Math.min(bottom, right), diagonal) + 1;
                }
            }
        }
        int max =0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                max = Math.max(value[i][j], max);
            }
        }
        return max*max;
            //check if 0
                //set value in value matrix to 0
            //check if 1 and add one to the value
                // check if neighboring ones are all ones


        // interate through the entire value matrix and return the largest square
    }
    public int checkBounds(int[][] value, int i, int j){
        if(i<0 || j<0 || i>value.length || j>value[0].length) return 0;
        else return value[i][j];
    }

}
