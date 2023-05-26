package fsd1com.simplearn.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueCollectionsEg {
	
	

	public static void main(String[] args) {
		
		Queue<String> stringQueue = new  PriorityQueue<>();
		
		stringQueue.add("Ram");
		stringQueue.add("Kumar");
		stringQueue.add("Arun");
		stringQueue.add("Suresh");
		stringQueue.add("Sam");
		
		System.out.println("Before using remove:" + stringQueue);
		
		System.out.println("Head of the Queue: " + stringQueue.element());
		
		System.out.println("Head of the Queue:" + stringQueue.peek());
		
		System.out.println("Remove elements using poll:" + stringQueue.poll());
		
		System.out.println("After using poll:" + stringQueue);
		
		System.out.println("Remove elements using remove: " + stringQueue.remove());
	
		System.out.println("After using remove:" + stringQueue);
		
		
		Iterator<String> queueItr = stringQueue.iterator();
		
		System.out.println("Queue Elements usung Iterator:: ");
		
		
		while(queueItr.hasNext()) {
			System.out.println(queueItr.next());
			
		}
		
		
		
		
	}

}
