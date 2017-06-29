/*
Matthew Younan
CSC 236-C1
Lab 6 Program #1
 */
public abstract class BinaryTree implements BTInterface<TreeNode>
{
    private TreeNode node;
    private TreeNode root;
    public BinaryTree()
    {
    }
    public TreeNode getRoot()
    {
        return root;
    }
    public void setRoot(TreeNode root)
    {
        this.root = root;
    }
    public boolean isEmpty()
    {
        return root == null;
    }
    public void swapSubtrees(TreeNode root)
    {
    }
    public int singleParent()
    {
        return 0;
    }
    private void checkNode()   //private helper method for singleParent()
    {
    }
    public String preOrder()
    {
        return "Hi";
    }
    public String postOrder()
    {
        return "Hi";
    }
    public String inOrder()
    {
        return "Hi";
    }
    public String toString()
    {
        return "Hi";
    }
    public abstract void insert(TreeNode node);
}
