public class dNode {

     int data;
    dNode next;
    dNode prev;

    public dNode()
    {
    	data = 0;
    	next = null;
    	prev = null;
    }
    
    public dNode(int data)
    {
    	this.data = data;
    	next = null;
    	prev = null;
    }
 
    public dNode(int data, dNode next, dNode prev)
    {
    	this.data = data;
    	this.next = next;
    	this.next = next;
    }  
}