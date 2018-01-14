package com.suchi.test.tree;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = tree.insert(null, 5);
		tree.root = tree.insert(tree.root, 4);
		tree.root = tree.insert(tree.root, 2);
		tree.root = tree.insert(tree.root, 1);
		tree.root = tree.insert(tree.root, 3);
		tree.root = tree.insert(tree.root, 0);
		tree.root = tree.insert(tree.root, 6);
		tree.root = tree.insert(tree.root, 8);
		tree.root = tree.insert(tree.root, 7);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 15);			
		
		System.out.println("InOrder traversal of tree");			
		tree.inOrder(tree.root);
				
		/*System.out.println("After deleting 15");
		 * tree.root = tree.delete(tree.root, null, 15);
		tree.inOrder(tree.root);*/		
		/*System.out.println("After deleting 20");
		tree.root = tree.delete(tree.root, null, 20);
		tree.inOrder(tree.root);*/
		System.out.println("After deleting 4");
		tree.root = tree.deleteFromGeek(tree.root,15);
		tree.root = tree.deleteFromGeek(tree.root,20);
		tree.root = tree.deleteFromGeek(tree.root,7);
		tree.root = tree.deleteFromGeek(tree.root,8);
		tree.root = tree.deleteFromGeek(tree.root,0);
		tree.inOrder(tree.root);
	}

}
