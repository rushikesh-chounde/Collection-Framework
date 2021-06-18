
package collectionframework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args)
    {
//        Being an interface the queue needs a concrete class for the declaration and the 
//        most common classes are the PriorityQueue and LinkedList in Java.It is to be noted 
//        that both the implementations are not thread safe. PriorityBlockingQueue is one alternative 
//        implementation if thread safe implementation is needed.

//          Queue<Integer> q=new LinkedList<>();
//          q.add(10);
//          q.offer(20);
//          q.add(30);
//          q.add(30);
//          q.add(50);
//          System.out.println(q);
//          
//          System.out.println(q.size());
//          System.out.println(q.contains(30));
//          System.out.println(q.element());//head element i.e. at front 
//          System.out.println(q);
//          System.out.println(q.isEmpty());
//          System.out.println(q.peek());
//          System.out.println(q.poll());//removes element from front
//          System.out.println(q);
//          System.out.println(q.remove());
//          System.out.println(q);
          //difference between poll() and remove()
          
          
//          
//           PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//           pq.add(10);
//           pq.add(20);
//           pq.add(15);
//           pq.add(5);
//           //sabse chote element ki sabse jyada priority hai by default
//            System.out.println(pq.peek());
//           System.out.println(pq);
//           System.out.println(pq.remove());
//           System.out.println(pq);
//           System.out.println(pq.remove());
//           System.out.println(pq);
//           System.out.println(pq.peek());
           
           PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());
            pq1.add(10);
           pq1.add(20);
           pq1.add(15);
           pq1.add(5);
            System.out.println(pq1);
            System.out.println(pq1.peek());
           
    }
}
