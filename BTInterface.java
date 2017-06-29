/*
Matthew Younan
CSC 236-C1
Lab 6 Program #1
 */
public interface BTInterface<T>
{
    T getRoot();
    //method to return a reference to the binary tree's root
    //pre-condition: tree is initialized and there is a root node in the tree
    //post-condition: returns but doesn't remove a reference to the root
    //                node in the binary tree. If there is no root node, method
    //                throws an underflow exception
    void setRoot(T root);
    //method to set the pointer to root to the node passed in the arguement
    //post-condition: the pointer is now pointing to the object passed
    boolean isEmpty();
    //method to check if the tree is empty
    //returns false if the tree has a root node. Otherwise, returns true.
    void swapSubtrees(T root);
    //method to swap the left and right subtrees of the node
    //pre-condition: the tree must be instantiated and have a root node
    //post-condition: the left and right subtrees of the each subtree in the 
    //                tree have been swapped.
    int singleParent();
    //method to return the number of nodes that only have one child node
    //post-condition: the method returns a count of the nodes in the tree that
    //                only have one child node.
    String preOrder();
    //method to return a string object of all the nodes' value's in pre-order
    //post-condition: returns a string object of all the nodes' value's in 
    //                pre-order
    String postOrder();
    //method to return a string object of all the nodes' value's in post-order
    //post-condition: returns a string object of all the nodes' value's in 
    //                post-order
    String inOrder();
    //method to return a string object of all the nodes' value's in order
    //post-condition: returns a string object of all the nodes' value's in order
    void insert(T node);
    //method to insert a node to the the tree.
    //post-condition: inserts the node passed in the arguement to the binary tree
}
