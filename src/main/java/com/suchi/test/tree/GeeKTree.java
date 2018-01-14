package com.suchi.test.tree;

public class GeeKTree {

	TreeNode root;
	
	 // A utility function to get height of the tree
    int height(TreeNode N) {
        if (N == null)
            return 0;
 
        return N.height;
    }
 
    // A utility function to get maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    // A utility function to right rotate subtree rooted with y
    // See the diagram given above.
    TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        // Return new root
        return x;
    }
 
    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
 
        // Return new root
        return y;
    }
 
    // Get Balance factor of TreeNode N
    int getBalance(TreeNode N) {
        if (N == null)
            return 0;
 
        return height(N.left) - height(N.right);
    }
 
    TreeNode insert(TreeNode TreeNode, int data) {
 
        /* 1.  Perform the normal BST insertion */
        if (TreeNode == null)
            return (new TreeNode(data));
 
        if (data < TreeNode.data)
            TreeNode.left = insert(TreeNode.left, data);
        else if (data > TreeNode.data)
            TreeNode.right = insert(TreeNode.right, data);
        else // Duplicate datas not allowed
            return TreeNode;
 
        /* 2. Update height of this ancestor TreeNode */
        TreeNode.height = 1 + max(height(TreeNode.left),
                              height(TreeNode.right));
 
        /* 3. Get the balance factor of this ancestor
              TreeNode to check whether this TreeNode became
              unbalanced */
        int balance = getBalance(TreeNode);
 
        // If this TreeNode becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && data < TreeNode.left.data)
            return rightRotate(TreeNode);
 
        // Right Right Case
        if (balance < -1 && data > TreeNode.right.data)
            return leftRotate(TreeNode);
 
        // Left Right Case
        if (balance > 1 && data > TreeNode.left.data) {
            TreeNode.left = leftRotate(TreeNode.left);
            return rightRotate(TreeNode);
        }
 
        // Right Left Case
        if (balance < -1 && data < TreeNode.right.data) {
            TreeNode.right = rightRotate(TreeNode.right);
            return leftRotate(TreeNode);
        }
 
        /* return the (unchanged) TreeNode pointer */
        return TreeNode;
    }
 
    // A utility function to print preorder traversal
    // of the tree.
    // The function also prints height of every TreeNode
    void preOrder(TreeNode TreeNode) {
        if (TreeNode != null) {
            System.out.print(TreeNode.data + " ");
            preOrder(TreeNode.left);
            preOrder(TreeNode.right);
        }
    }
    
    void inOrder(TreeNode root){		
		if(root.left != null){			
			inOrder(root.left);
		}
		System.out.println(root.data+" height "+root.height);
		if(root.right != null){
			inOrder(root.right);
		}
	}
}
