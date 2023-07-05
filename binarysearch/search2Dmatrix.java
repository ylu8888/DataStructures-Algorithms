class search2Dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int mid = 0;

        while(left < right){
            mid = (left + right) / 2;
            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1]){
                left = mid;
                break;
            }
            else if(matrix[mid][0] > target && target < matrix[mid][matrix[0].length-1]){
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        } 

        int rowLeft = 0;
        int rowRight = matrix[0].length - 1;
        while(rowLeft <= rowRight){
            int mid2 = (rowLeft + rowRight) / 2;
            if(matrix[left][mid2] == target){
                return true;
            }
            else if(matrix[left][mid2] > target){
                rowRight = mid2 - 1;
            }
            else{
                rowLeft = mid2 + 1;
            }
        }

    return false;
    }

}
