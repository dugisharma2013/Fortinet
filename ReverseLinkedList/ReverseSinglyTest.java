import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseSinglyTest {

	@Test
	public void test() {
		//check if reverse of 10->5->null is 5->10->null
	
		ReverseSinglyList test = new ReverseSinglyList();
		test.head = test.new Node(10);
		test.head.next = test.new Node(5);
		test.head = test.reverseList(test.head);
		assertEquals("5->10->null",test.returnList(test));
		
	}
	
	@Test
	public void test1() {
		//checking null reverse linked list
		
		ReverseSinglyList test = new ReverseSinglyList();
		assertNull(test.head);
		
	}
	
	@Test
	public void test2(){
		//check if list is circular
		
		ReverseSinglyList test = new ReverseSinglyList();
		test.head = test.new Node(10);
		test.head.next = test.new Node(5);
		test.head.next.next = test.head;
		assertEquals(true,test.detectLoop(test.head));
	}

}
