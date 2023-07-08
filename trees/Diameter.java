class Diameter {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        getHeight(root);

        return max;
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        int temp = left + right;
        if(temp > max){
            max = temp;
        }

        return Math.max(left, right) + 1;
    }
}
