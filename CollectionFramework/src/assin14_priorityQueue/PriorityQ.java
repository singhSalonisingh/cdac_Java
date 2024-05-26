package assin14_priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
public static void main(String[] args) {
	Queue<String> queue=new PriorityQueue<>();
	queue.add("static");
	queue.add("default");
	queue.add("public");
	queue.add("private");
	queue.add("try");
	queue.add("catch");
	queue.add("throw");
	queue.add("finally");
	queue.add("throws");
	System.out.println(queue);
	System.out.println(" Size: "+queue.size());
	System.out.println(queue.peek());
	System.out.println(queue.poll());
	System.out.println(queue);
	System.out.println(" Size: "+queue.size());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(".........");
	System.out.println(queue);
	System.out.println("removing**********");
	while(queue.size()>0){
		System.out.println(queue.poll());
	}
	
}
}
