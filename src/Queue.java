//Lucas Frazao, Period 7, Queue file, Meant to manipulate doubly list nodes based on what is called in TestDLists
public class Queue 
{
	dNode head = new dNode();//creates the two reference nodes
	dNode tail = new dNode();
	private int capacity = Integer.MAX_VALUE;
	
	public Queue()//constructors
	{
		head = null;
		tail = null;
	}
	
	public Queue(int t)
	{
		head = new dNode(t);
		tail = head;
	}
	
	public Queue(int t, int cap)//constructor with capacity
	{
		head = new dNode(t);
		tail = head;
		capacity = cap;
	}
	
	public void enqueue(int value)
	{
		dNode Value = new dNode();//dnode with parameter
		dNode temp = new dNode();
		temp = head;//sets temp to head
		Value.data = value;
		
		if( capacity == size())//evaluates the capacity
		{
			throw new IllegalStateException();
		}
		
		else
		{
			if(head == null)
			{
				head = Value;
				tail = Value;
			}
			else//adds value if list is not null
			{
			
				while(temp != tail )
				{
					temp = temp.next;
				}
				
				temp.next = Value;
				tail = Value;
			}
		}
	}
	
	public void NodeEnqueue(dNode value)
	{
		dNode temp = new dNode();
		temp = head;//sets temp to head
		
		if( capacity == size())//evaluates the capacity
		{
			throw new IllegalStateException();
		}
		
		else
		{
			if(head == null)
			{
				head = value;
				tail = value;
			}
			else//adds value if list is not null
			{
			
				while(temp != tail )
				{
					temp = temp.next;
				}
				
				temp.next = value;
				tail = value;
			}
		}
	}
	
	
	public int Capacity()//returns capacity
	{
		return capacity;
	}
	
	public void changeCapacity(int value)//changes the capacity value
	{
		capacity = value;
	}
	
	public int dequeue()//method to remove first node
	{
		
		int t = 0;//any info var
	
		
		if (head == null)//what happens when head is null
		{
			return 0;
		}
		if(head == tail)
		{
			t = head.data;
			head = null;
			tail = head;
		}
		else
		{
			t = head.data;
			head = head.next;
			tail.next = head;
			head.prev = head;
		}
		return t;
	}
	
	public boolean isEmpty()//simple code to check if code empty
	{
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void sendToBack()
	{
		
		dNode temp = new dNode();
		temp = head;
		if(temp == null)
		{
			System.out.println("List is null, nothing to send back");
		}
		else
		{
			while(temp != tail)
			{
				temp = temp.next;
			}
			
			tail.next = head;
			head.prev = tail;
			tail = head;
			head = head.next;
		}
		 
	}
	
	public int size()
	{
		int count = 0;//counts the size
		dNode temp = new dNode();
		temp = head;
		
		if(head == null)
		{
			count = -1;
		}
		else
		{
			while(temp != tail)
			{
				count ++;
				temp = temp.next;
			}
		}
		
		return count+1;//compensates for code not reaching tail
	}
	
	public dNode returnEvenNodes(Queue value)
	{
		
		dNode even = new dNode(); //store all even nodes
		dNode temp = new dNode();
		temp = head;
		
		while( temp.next != tail)
		{
			if(temp.data % 2 == 0)
			{
				value.NodeEnqueue(temp.next);
			}
			temp = temp.next;
		}
		
		
		return even;
		
	}
	

	
	public String toString()
	{
		String x = "";//var that will be returned
		dNode temp = new dNode();
		temp = head;
		
		
		if(temp == null)
		{
			x = " There is nothing in the list ";
		}
		else
		{
		
			while(temp != tail)
			{
				x = x + temp.data + "|";
				temp = temp.next;
			}
			if (temp == tail && temp != null)
			{
				x = x + temp.data;
			}
		}
		return x;
	}	

}
