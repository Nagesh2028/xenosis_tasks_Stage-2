package org.task.assignment4;

class Node{
	int val;
	Node left;
	Node right;
 public Node(int x) {
		val = x;
		left = null;
		right = null;
		}	
	}
public class BinarySearchTree {
    private Node root;
    public void insert(int val) {
       root= insertRec(root, val);
    }

    private Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void delete(int val) {
        root = deleteRec(root, val);
    }

    private Node deleteRec(Node root, int val) {
        if (root == null) return root;

        if (val < root.val) {
            root.left = deleteRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRec(root.right, val);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.val = minValue(root.right);
            root.right = deleteRec(root.right, root.val);
        }
        return root;
    }

    private int minValue(Node root) {
        int minValue = root.val;
        while (root.left != null) {
            root = root.left;
            minValue = root.val;
        }
        return minValue;
    }

    public boolean search(int val) {
        return searchRec(root, val);
    }

    private boolean searchRec(Node root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        return val < root.val ? searchRec(root.left, val) : searchRec(root.right, val);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.val + " ");
            inOrderRec(root.right);
        }
    }
    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.val + " ");
        }
    }

		public static void main(String[] args) {
			 BinarySearchTree tree = new BinarySearchTree();

		        tree.insert(50);
		        tree.insert(30);
		        tree.insert(20);
		        tree.insert(40);
		        tree.insert(70);
		        tree.insert(60);
		        tree.insert(80);
		        System.out.println("In-order traversal:");
		        tree.inOrder();

		        System.out.println("Pre-order traversal:");
		        tree.preOrder();

		        System.out.println("Post-order traversal:");
		        tree.postOrder();

		        System.out.println("Delete 20:");
		        tree.delete(20);
		        tree.inOrder();

		        System.out.println("Search for 40:");
		        System.out.println(tree.search(40));
		        
		        System.out.println("In-order traversal:");
		        tree.inOrder();



		}

	}

