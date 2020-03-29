package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
public class MyMain
{
    public static void main(String[] args) {
        MyBinarySearchTree mytree=new MyBinarySearchTree();
        mytree.insert(100);
        mytree.insert(20);
        mytree.insert(200);
        mytree.insert(300);
        mytree.insert(150);
        mytree.insert(30);
        mytree.insert(10);
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        System.out.println("InOrder Traversal : ");
        mytree.traverseInOrder();
        System.out.println("PostOrder Traversal : ");
        mytree.traversePostOrder();
        System.out.println("Condition A : Root element is placed at opposite end," +"\n"+
                "i.e. in pre order root is the first element where as in post order root is the last element. is TRUE");
        System.out.println("Condition B :They have common mid point,\n"+
                "i.e. both the traversal will give same element at the mid position for odd number of nodes. is TRUE");
    }
}
