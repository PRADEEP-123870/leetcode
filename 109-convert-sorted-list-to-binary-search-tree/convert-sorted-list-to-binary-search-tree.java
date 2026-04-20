class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        
        // If only one node
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        // Find middle
        ListNode mid = findMiddle(head);
        
        TreeNode root = new TreeNode(mid.val);
        
        // Right subtree
        root.right = sortedListToBST(mid.next);
        
        // Left subtree (cut list)
        if (head != mid) {
            root.left = sortedListToBST(head);
        }
        
        return root;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Cut the left half
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}