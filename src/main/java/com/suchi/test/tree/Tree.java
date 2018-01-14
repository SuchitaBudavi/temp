package com.suchi.test.tree;

public class Tree {

	TreeNode root;
	
	private TreeNode rightRotate(TreeNode root){
		TreeNode newRoot = root.left;
		root.left = newRoot.right;
		newRoot.right = root;
		root.height = getHeight(root)+1;
		newRoot.height = getHeight(newRoot)+1;	
		return newRoot;
	}
	
	private TreeNode leftRotate(TreeNode root){
		TreeNode newRoot = root.right;
		root.right = newRoot.left;
		newRoot.left = root;
		root.height = getHeight(root)+1;
		newRoot.height = getHeight(newRoot)+1;	
		return newRoot;
	}
	
	private int getBalance(TreeNode node){
		return (node.left==null?0:node.left.height) - (node.right==null?0:node.right.height);
	}
	
	private int getHeight(TreeNode node){
		if(node == null ||(node.left==null && node.right==null)){
			return 0;
		}
		return Math.max(node.left==null?1:node.left.height,node.right==null?1:node.right.height);		
	}
	
	TreeNode insert(TreeNode root, int n){
		TreeNode newRoot=null;
		if(root == null)
			return new TreeNode(n);
		else{
			if(n<root.data){
				newRoot = insert(root.left,n);
				root.left = newRoot;
			}
			else{
				newRoot = insert(root.right,n);
				root.right = newRoot;
			}
		}
		
		root.height = 1 + getHeight(root);
		int balance = getBalance(root);
		if(balance > 1){
			//LL & LR
			if(getHeight(root.left.left) >= getHeight(root.left.right)){
				root = rightRotate(root);
			}else{
				root.left = leftRotate(root.left);
				root = rightRotate(root);
			}
		}
		if(balance < -1){
			//RR & RL
			if(getHeight(root.right.right) >= getHeight(root.right.left)){
				root = leftRotate(root);
			}else{
				root.right = rightRotate(root.right);
				root = leftRotate(root);
			}
		}
		return root;
	}
	
	
	//return the parentNode of the next highest node of root
	private TreeNode nextHighest(TreeNode root){						
		if(root.left !=null && root.left.left != null){
			return nextHighest(root.right);			
		}
		return root;
	}
	
	TreeNode delete(TreeNode root, TreeNode parentNode,int n){		
		if(root == null){
			System.out.println("Number not present in tree");
			return root;			
		}
		if(n < root.data){
			delete(root.left,root,n);
			return root;
		}else if(n > root.data){
			delete(root.right,root,n);
			return root;
		}
		
		//When node is found
		//Case 1. Leaf node
		if(root.left == null && root.right == null){
			if(parentNode.left == root){
				parentNode.left = null;
			}else{
				parentNode.right = null;
			}			
		}
		
		//Case 2. Node has only one child
		if((root.left!=null && root.right==null) || (root.left==null && root.right!=null)){
			if(parentNode.left==root){
				parentNode.left = root.left==null?root.right:root.left;
			}else{
				parentNode.right = root.left==null?root.right:root.left;
			}
		}
		
		//Case 3. Node has both children
		if(root.left!=null && root.right!=null){						
			TreeNode tempNode =  nextHighest(root.right);
			if(tempNode.left == null){
				root.data = tempNode.data;
				root.right = null;
			}else{
				root.data = tempNode.left.data;
				tempNode.left = null;
			}			
		}
		return root;
	}
	
	TreeNode deleteFromGeek(TreeNode root, int n){
		/* Base Case: If the tree is empty */
        if (root == null){
        	System.out.println("Number is not present in tree");
        	return root;
        }
 
        /* Otherwise, recur down the tree */
        if (n < root.data)
            root.left = deleteFromGeek(root.left, n);
        else if (n > root.data)
            root.right = deleteFromGeek(root.right, n);
         
        else
        {
        	// node with only one child or no child
            if ((root.left == null) || (root.right == null))
            {
                TreeNode temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
 
                // No child case
                if (temp == null)
                {
                    temp = root;
                    root = null;
                }
                else   // One child case
                    root = temp; // Copy the contents of
                                 // the non-empty child
            }
            else
            {
 
                // node with two children: Get the inorder
                // successor (smallest in the right subtree)
            	TreeNode temp = nextHighest(root.right);
 
                // Copy the inorder successor's data to this node
                root.data = temp.data;
 
                // Delete the inorder successor
                root.right = deleteFromGeek(root.right, temp.data);
            }
        }
        // If the tree had only one node then return
        if (root == null)
            return root;
 
        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = getHeight(root)+1;
 
        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        //  this node became unbalanced)
        int balance = getBalance(root);
 
        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);
 
        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
 
        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);
 
        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
 
        return root;
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
