public class BinarySearchTree{
    TreeNode root;
    
    private class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode BinarySearchTree(){
        this.root = null;
        return this.root;
    }

    public TreeNode BinarySearchTree(int val){
        this.root = new TreeNode(val);
        return this.root;
    }

    public void add(int val){
        if (root == null) {
            root = new TreeNode(val);
        } else {
            insertNode(root, val);
        }
    }


    private void insertNode(TreeNode node, int val){
        if(val > node.val){
            if(node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insertNode(node.right, val);
            }
        } else {
            if(node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insertNode(node.left, val);
            }
        }
    }

    public void inorderTraversal(){}

    public void preorderTraversal(){}

    public void postorderTraversal(){}

    public boolean contains(int val){
        TreeNode curr = this.root;
        while(curr!=null){
            if(curr.val == val) return true;
            if(curr.val > val) curr = curr.left;
            if(curr.val < val) curr = curr.right;
        }
        return false;
    }
}
