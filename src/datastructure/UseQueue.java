package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();

		queue.add("John");
		queue.add("Marry");
		queue.add("Harold");
		queue.add("Joe");


		System.out.println("Elements in queue are: " + queue);

		queue.remove();
		System.out.println("Elements in queue after using remove: " + queue);

		System.out.println("The head element of queue is: "+ queue.peek());

		queue.poll();
		System.out.println("Elements in queue after using pool: " + queue);

		System.out.print("____using for each loop_____");
		for(String item: queue)
			System.out.print(item + ", ");

		System.out.print("____using while loop with Iterator____");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
	}

}
