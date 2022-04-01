import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Chapter101 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static  class Solution {
        public static boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (root.left == null && root.right == null) {
                return true;
            }
            if (root.left == null || root.right == null) {
                return false;
            }

            LinkedList<TreeNode> list = new LinkedList<TreeNode>();
            list.push(root.left);
            list.offer(root.right);

            while (list.size() > 0) {

                TreeNode head = list.poll();
                TreeNode tail = list.pollLast();
                if (head.val != tail.val) {
                    return false;
                }
                if (head.left == null && tail.right == null) {
                } else if (head.left == null || tail.right == null) {
                    return false;
                } else {
                    list.push(head.left);
                    list.offer(tail.right);
                }

                if (head.right == null && tail.left == null) {
                } else if (head.right == null || tail.left == null) {
                    return false;
                } else {
                    list.push(head.right);
                    list.offer(tail.left);
                }
            }
            return true;
        }


        public static void main(String[] args) {
            //[1,2,2,3,4,4,3]
            TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
            Solution.isSymmetric(node);
        }
    }
}



