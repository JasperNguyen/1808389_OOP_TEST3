
package bai3;

import java.util.Iterator;
import java.util.PriorityQueue;


public class TestBai3 {
    public TestBai3(){
    PriorityQueue<Task> queue=new PriorityQueue<>();
    Task t1=new Task("Di Hoc",10, 0);
    Task t2=new Task("Di Lam",2, 0);
    Task t3=new Task("Di Choi",5, 3);
    Task t4=new Task("Di Choi Tet",5, 1);
    
    queue.add(t1);
    queue.add(t2);
    queue.add(t3);
    queue.add(t4);
    Task t=queue.poll();
    System.out.println(t);
    System.out.println(queue.poll());
    //hoa dung vong lap ben duoi de duyet cac task
    Iterator<Task> itor=queue.iterator();
    while(itor.hasNext())
    {
    Task x=itor.next();
    System.out.println(x);
    }

    }
}
