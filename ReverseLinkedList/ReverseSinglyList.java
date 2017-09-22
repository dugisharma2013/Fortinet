// Time Complexity : O(n)
// Space complexity : O(1)

public class ReverseSinglyList {

    Node head;

    class Node {

        Node next;
        int value;

        Node(int var) {
            value = var;
            next = null;
        }
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void printList(ReverseSinglyList rev) {
        Node node = rev.head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.print("null");

    }
    
    public static String returnList(ReverseSinglyList rev){
    	StringBuilder sb = new StringBuilder();
    	Node node = rev.head;
        while (node != null) {
            sb.append(node.value + "->");
            node = node.next;
        }
        sb.append("null");
    	return sb.toString();
    }
    
    boolean detectLoop(Node node) {
        Node nodefirst = node, nodesecond = node;
        while (nodefirst != null && nodesecond != null && nodesecond.next != null) {
        	nodefirst = nodefirst.next;
        	nodesecond = nodesecond.next.next;
 
            if (nodefirst == nodesecond) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ReverseSinglyList rev = new ReverseSinglyList();
        rev.head = rev.new Node(10);
        rev.head.next = rev.new Node(5);
        rev.head.next.next = rev.new Node(22);
        rev.head.next.next.next = rev.new Node(15);
        rev.head.next.next.next.next = rev.new Node(32);
        rev.head.next.next.next.next.next = rev.new Node(2);
        rev.head.next.next.next.next.next.next = rev.new Node(15);
        rev.head.next.next.next.next.next.next.next = rev.new Node(34);

        printList(rev);
        System.out.println();
        rev.head = rev.reverseList(rev.head);
        printList(rev);


    }

}
