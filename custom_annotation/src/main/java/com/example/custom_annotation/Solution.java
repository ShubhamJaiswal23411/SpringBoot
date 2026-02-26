package com.example.custom_annotation;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    // 🔹 Build tree using LEVEL ORDER
    public static TreeNode buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < arr.length && arr[i] != -1) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != -1) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public ArrayList<Integer> solve(TreeNode a, int b) {
        ArrayList<Integer> ans = getPath(a, b);
        Collections.reverse(ans);
        return ans;
    }

    public ArrayList<Integer> getPath(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            ArrayList<Integer> test = new ArrayList<>(Arrays.asList(val));
            return test;
        }

        ArrayList<Integer> leftList = getPath(root.left, val);
        if (leftList != null) {
            leftList.add(root.val);
            return leftList;
        }
        ArrayList<Integer> rightList = getPath(root.right, val);
        if (rightList != null) {
            rightList.add(root.val);
            return rightList;
        }
        return null;

    }

    // 🔹 MAIN
    public static void main(String[] args) {

        // 🔹 Level Order Input (-1 means null)
        int[] arr = { 1, 2, 3, -1, -1, 4, -1, -1, 5, -1, -1 };

        // 🔹 Target value
        int target = 5;

        TreeNode root = buildTree(arr);

        Solution sol = new Solution();
        ArrayList<Integer> result = sol.solve(root, target);

        System.out.println(result);
    }
}