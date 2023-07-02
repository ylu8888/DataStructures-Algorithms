class setMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> xset = new HashSet<>();
        HashSet<Integer> yset = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    xset.add(i);
                    yset.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if( xset.contains(i) || yset.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }


    }

    
}
