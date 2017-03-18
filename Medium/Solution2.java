package Medium;

import java.util.Random;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { 
    	 val = x; 
    	 next = null;
     }
}

public class Solution2 {
	public static ListNode betterAddTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
        ListNode root = res;
        int temp = 0;
        while (l1 != null || l2 != null || temp != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + temp;
            cur.val = sum % 10;
            temp = sum / 10;
            res.next = cur;
            res = res.next;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return root.next;
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
		ListNode root = res;
		int temp = 0;
        while (l1 != null && l2 != null) {
        	System.out.println("test " + l1.val + " " + l2.val);
        	int nowValue = (temp + l1.val + l2.val) % 10;
        	temp = (temp + l1.val + l2.val) / 10;
        	ListNode newNode = new ListNode(nowValue);
        	newNode.next = null;
        	res.next = newNode;
        	res = newNode;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        
        while (l1 != null) {
        	int nowValue = (temp + l1.val) % 10;
        	temp = (temp + l1.val) / 10;
        	res.next = new ListNode(nowValue);
        	res = res.next;
        	l1 = l1.next;
        }
        
        while (l2 != null) {
        	int nowValue = (temp + l2.val) % 10;
        	temp = (temp + l2.val) / 10;
        	res.next = new ListNode(nowValue);
        	res = res.next;
        	l2 = l2.next;
        }
        
        if (temp == 1) {
        	res.next = new ListNode(1);
        	res = res.next;
        }
        return root.next;
    }
	
	public static ListNode addNode(ListNode node, int val) {
		ListNode root = node;
		ListNode temp = new ListNode(val);
		while (node.next != null) {
			node = node.next;
		}
		node.next = temp;
		return root;
	}
	
	public static void main(String args[]) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		
		l1 = addNode(l1, 1);
		l2 = addNode(l2, 9);
		l2 = addNode(l2, 9);
		
		ListNode res = addTwoNumbers(l1.next, l2.next);
		
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
		
	}
}
