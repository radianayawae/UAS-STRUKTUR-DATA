/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binary.tree.java;

/**
 *
 * @author ASUS
 */
public class BinaryTreeJava {

    public static void main(String[] args) {
	    Tree IntTree = new Tree();
	    IntTree.insert(25);
	    IntTree.insert(20);
	    IntTree.insert(15);
	    IntTree.insert(27);
	    IntTree.insert(30);
        IntTree.insert(29);
        IntTree.insert(26);
        IntTree.insert(22);
        IntTree.insert(32);

        //IntTree.traverseInOrder();

        System.out.println(IntTree.get(27));
        System.out.println(IntTree.get(30));
        System.out.println(IntTree.get(99));
        System.out.println(IntTree.max());
        System.out.println(IntTree.min());

    }
}
