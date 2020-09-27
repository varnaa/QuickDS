package com.varnaa;

/**
 * @Author: swethavarnaa
 */
public class TreeNode {

     int value;
     TreeNode left;
     TreeNode right;


     public TreeNode() {
     }

     public TreeNode(int value) {
          this.value = value;
     }

     public TreeNode(int value, TreeNode left, TreeNode right) {
          this.value = value;
          this.left = left;
          this.right = right;
     }

}
