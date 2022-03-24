package Semestrovka;

import java.io.File;
import java.io.FileNotFoundException;

public class GFG {
    // Class containing left and
    // right child of current
    // node and key value
    static int counter = 0;
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    GFG()
    {
        root = null;

    }

    // This method mainly
    // calls insertRec()
    void insert(int key)
    {
        root = insertRec(root, key);

    }

    /* A recursive function to
    insert a new key in BST */
    Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
        return a new node */
        if (root == null)
        {

            root = new Node(key);
            counter++;
            return root;
        }

        /* Otherwise, recur
        down the tree */
        if (key < root.key) {

            root.left = insertRec(root.left, key);
            counter++;
        }
        else if (key > root.key) {

            root.right = insertRec(root.right, key);
            counter++;
        }
        /* return the root */

        return root;
    }

    // A function to do
    // inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
           //System.out.print(root.key + " ");
            inorderRec(root.right);

        }
    }
    void treeins(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            insert(arr[i]);

        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        GFG tree = new GFG();
        for (int i = 0; i < 51 ; i++) {
            int[] arr =  CreationMassive.creationMassive(new File("elements\\Data" + i + ".txt"));
            long timeE = System.nanoTime();
            tree.treeins(arr);
            long timeS = System.nanoTime();
            tree.inorderRec(tree.root);
            System.out.println(timeS-timeE + " " + counter  + " " + arr.length);
            counter = 0;

        }








    }

}
