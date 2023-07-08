class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set;
        HashSet<Character> rowSet;
        HashSet<Character> colSet;

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = 3;
        int colEnd = 3;

        for(int i = 0; i < board.length; i++){
            rowSet = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                if(rowSet.contains(board[i][j])){
                    return false;
                }
                else{
                    if(board[i][j] != '.'){
                        rowSet.add(board[i][j]);
                    }
                }
            }
        }

        for(int i = 0; i < board[0].length; i++){
            colSet = new HashSet<>();
            for(int j = 0; j < board.length; j++){
                if(colSet.contains(board[j][i])){
                    return false;
                }
                else{
                    if(board[j][i] != '.'){
                        colSet.add(board[j][i]);
                    }
                }
            }
        }
        

    for(int k = 0; k < 9; k++){
        set = new HashSet<>();
        for(int i = rowStart; i < rowEnd; i++){
            for(int j = colStart; j < colEnd; j++){
                if(set.contains(board[i][j])){
                    return false;
                }
                else{
                    if(board[i][j] != '.'){
                        set.add(board[i][j]);
                    }
                }
            }
            
        }
        colStart +=3;
        colEnd += 3;
            if(colEnd == 12){
                rowStart += 3;
                rowEnd += 3;
                colStart = 0;
                colEnd = 3;
                
            }
    }
        return true;
    }

}
