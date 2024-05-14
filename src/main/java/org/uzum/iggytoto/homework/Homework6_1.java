package org.uzum.iggytoto.homework;


import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;

public class Homework6_1 {

    // Definition for a Node.
    public static class Node {
        public int val;
        public List<Node> children = new ArrayList<>();

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    int ans;
    public int maxDepth(Node root) {
        if(root==null){
            throw new IllegalArgumentException();
        }
        ans=dfs(root);
        return ans;
    }
    public int dfs(Node root){
        if(root==null){
            return 0;
        }
        int maxDepth=0;
        for(Node i : root.children){
            maxDepth=Math.max(maxDepth,dfs(i));
        }
        return 1+maxDepth;
    }
}
