/*
Matthew Younan
CSC 236-C1
Lab 6 Program #1
 */
public class TreeNode<T>
{
    private T value;
    private TreeNode left;
    private TreeNode right;
    public TreeNode()
    {
        value = null;
        left = null;
        right = null;
    }
    public TreeNode(T value)
    {
        this.value = value;
        left = null;
        right = null;
    }
    public TreeNode(TreeNode left, T value, TreeNode right)
    {
        this.left = left;
        this.value = value;
        this.right = right;
    }
    public TreeNode(TreeNode copy)
    {
        left = copy.left;
        value = (T) copy.value;
        right = copy.right;
    }
    public T getValue()
    {
        return value;
    }
    public void setValue(T value)
    {
        this.value = value;
    }
    public TreeNode getLeft()
    {
        return left;
    }
    public void setLeft(TreeNode left)
    {
        this.left = left;
    }
    public TreeNode getRight()
    {
        return right;
    }
    public void setRight(TreeNode right)
    {
        this.right = right;
    }
}
