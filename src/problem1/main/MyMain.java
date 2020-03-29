package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree mytree=new MyBinarySearchTree();
        mytree.insert(50);
        mytree.insert(30);
        mytree.insert(20);
        mytree.insert(40);
        mytree.insert(70);
        mytree.insert(60);
        mytree.insert(80);
        mytree.insert(90);
        mytree.insert(10);
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        System.out.println("Left children Only : ");
        System.out.println("No of nodes not having Left Subchild:          "+mytree.traverseLeft());
    }
}

