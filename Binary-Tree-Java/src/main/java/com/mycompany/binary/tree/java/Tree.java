/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binary.tree.java;

/**
 *
 * @author ASUS
 */
public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        } else{
            root.insert(value);
        }
    }
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
    public TreeNode get(int value) {
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }
}
