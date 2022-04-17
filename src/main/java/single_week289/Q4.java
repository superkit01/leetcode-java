package single_week289;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//NOT FINISHED
public class Q4 {
    class TreeNode {
        int val;
        char c;
        List<TreeNode> children = new ArrayList<>();

        TreeNode(int val, char c) {
            this.val = val;
            this.c = c;
        }

    }

    int temp1 = 0;
    int temp2 = 0;
    Map<Integer,Integer> map=new HashMap<>();
    public int longestPath(int[] parent, String s) {
        TreeNode root = new TreeNode(0, s.charAt(0));
        buildTree(root, parent, s);
        return temp2 + temp1;
    }


    private void buildTree(TreeNode root, int[] parent, String s) {
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == root.val) {
                TreeNode node = new TreeNode(parent[i], s.charAt(i));
                root.children.add(node);
                break;
            }
        }
        if (root.children.size() == 0) {
            return;
        }
        for (TreeNode node : root.children) {
            buildTree(node, parent, s);
        }
    }


}
