import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Chapter23 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

     class Solution {
        ListNode result = new ListNode();
        ListNode lastNode = result;

        public void append(ListNode node) {
            lastNode.next = node;
            lastNode = lastNode.next;
        }

        public ListNode mergeKLists(ListNode[] lists) {

            TreeMap<Node, Object> treeMap = new TreeMap();
            for (ListNode node : lists) {
                if (node != null) {
                    treeMap.put(new Node(node),null);
                }
            }


            while (treeMap.size() > 0) {
                Map.Entry<Node,Object> node = treeMap.pollFirstEntry();
                append(node.getKey().node);
                if (node.getKey().node.next != null) {
                    treeMap.put(new Node(node.getKey().node.next),null);
                }
            }
            return result.next;
        }

         class Node implements Comparable<Node>{
            private ListNode node;

            public  Node(ListNode node){
                this.node=node;
            }
            @Override
            public int compareTo(Node o) {
                return this.node.val-o.node.val>0? 1:-1;
            }
        }
    }

}
