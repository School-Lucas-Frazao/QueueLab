/*
    		Write a program that implements a Queue data structure.
          Given an initial myQueue, create two new queues, 
          oddQueue and evenQueue, so that oddQueue contains the odd
          elements of myQueue and evenQueue contains the even elements.

  e.g.
      as in dealing a deck of cards

  e.g.
      myQueue   -->   43 92 41 39 10 32 62 17 29 51 35 44 24 15 73 66

      oddQueue  -->   43 41 39 17 29 51 35 15 73
      evenQueue -->   92 10 32 62 44 24 66
*/

/*
 * LinkedListReplicated.java, Lucas Frazao, Period 7, file will serve to test all methods in
 * LinkedIntList.java
 * 
 */

//import java.io.File;
//import java.io.IOException;


public class Queue1
{
 
    public static void main(String s[]) 
    {
    	
		//Creates a queue object
    	
    	Queue myQueue = new Queue();
    	Queue evenQueue = new Queue();

    	//Queue<Integer> evenQueue = new Queue<Integer>();
    	//Queue<Integer> oddQueue = new Queue<Integer>();
    	
    	//code
    	
    	myQueue.enqueue(1);
    	myQueue.enqueue(2);
    	myQueue.enqueue(3);
    	myQueue.enqueue(4);
    	
    	System.out.println(myQueue);
    	
    	
    	evenQueue.returnEvenNodes(myQueue);
    	
    	System.out.println(evenQueue);
   
    	
    	
    	
    	
    }
    

}








