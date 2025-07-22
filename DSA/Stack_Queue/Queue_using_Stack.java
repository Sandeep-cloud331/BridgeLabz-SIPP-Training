package Stack_Queue;
import java.util.*;

public class Queue_using_Stack {
	Stack<Integer> st;
	Stack<Integer> hlp;
	public Queue_using_Stack() {
		st = new Stack<>();
		hlp = new Stack<>();
	}

	public void push(int x) {
		st.push(x);
	}

	public int pop() {
		while(st.size()>1) {
			hlp.push(st.pop());
		}
		int rv = st.pop();
		while(!hlp.isEmpty()) {
			st.push(hlp.pop());
		}
		return rv;
	}

	public int peek() {
		while(st.size()>1) {
			hlp.push(st.pop());
		}
		int rv = st.peek();
		while(!hlp.isEmpty()) {
			st.push(hlp.pop());
		}
		return rv;
	}

	public boolean empty() {
		return st.isEmpty();
	}
	public int size() {
		return st.size();
	}
	public void display() {
		System.out.println(st);
	}
	public static void main(String[] args) {
		Queue_using_Stack q = new Queue_using_Stack();
		q.push(1);
		q.push(2);
		q.push(3);
		q.display();
		System.out.println(q.pop());
		q.display();
		q.push(4);
		q.display();
		
	}
}
