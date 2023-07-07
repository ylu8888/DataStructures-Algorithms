class spiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows * cols;
        int count = 0;

        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = cols-1;

        while(count < total){
            for(int i = left; count < total && i <= right; i++){
                arr.add(matrix[top][i]);
                count++;
            }
            top++;

            for(int i = top; count < total && i <= bottom; i++){
                arr.add(matrix[i][right]);
                count++;
            }
            right--;

            for(int i = right; count < total && i >= left; i--){
                arr.add(matrix[bottom][i]);
                count++;
            }
            bottom--;

            for(int i = bottom; count < total && i >= top; i--){
                arr.add(matrix[i][left]);
                count++;
            }

            left++;
        }

        return arr;

    }
}
