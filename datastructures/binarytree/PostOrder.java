package com.vortex.learningjava.datastructures.binarytree;

public class PostOrder {

    public static void main(String[] args) {
       BinaryTreeNode root = getTree1();
       getLR(root);
    }

    static void getLR(BinaryTreeNode root1){
        BinaryTreeNode ptr;
        if (root1.getLeft() != null){
            ptr = root1.getLeft();
            getLR(ptr);
        }
        if (root1.getRight() != null) {
            ptr = root1.getRight();
            getLR(ptr);
        }
        System.out.print(root1.getData() + " ");
    }

    public static BinaryTreeNode getTree1() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        root.setLeft(new BinaryTreeNode<>(2));
        root.setRight(new BinaryTreeNode<>(3));
//        root.getLeft().setLeft(new BinaryTreeNode<>(4));
//        root.getLeft().setRight(new BinaryTreeNode<>(5));
        root.getRight().setLeft(new BinaryTreeNode<>(6));
        root.getRight().setRight(new BinaryTreeNode<>(7));
//        root.getLeft().getLeft().setLeft(new BinaryTreeNode<>(8));
//        root.getLeft().getLeft().setRight(new BinaryTreeNode<>(9));
//        root.getLeft().getRight().setLeft(new BinaryTreeNode<>(10));
//        root.getLeft().getRight().setRight(new BinaryTreeNode<>(11));
        root.getRight().getLeft().setLeft(new BinaryTreeNode<>(12));
        root.getRight().getLeft().setRight(new BinaryTreeNode<>(13));
        root.getRight().getRight().setLeft(new BinaryTreeNode<>(14));
        root.getRight().getRight().setRight(new BinaryTreeNode<>(15));
        return root;
    }
}
