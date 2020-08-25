

public class LinkedQueue {
	Node front;
	Node rear;
	int count;
	int elements;
	
	

	//Adds a number to the back of the queue
	public void enqueue(int numEnqueue) {
		Node node = rear;
		rear=new Node();
		rear.numEnqueue=numEnqueue;
		rear.next=null;
		if (front==null) 
			front = rear;
			else 	
				node.next = rear;
		count++;
		elements=count;
		}
    
	//removes a number from front of queue
	public void dequeue() {
		for(int i=0;i<6;i++) {
		int numEnqueue = front.numEnqueue;
        front = front.next;
        count--;
        System.out.print("\nDequeueing: "+numEnqueue);
		}

	}
	
	//Shows our current linked list
	public void show() {
		Node node = front;
		System.out.print("\n\nQueued linked elements: ");
		while(node!=null) {
			System.out.print(node.numEnqueue+" ");
			node=node.next;
			
		}
		
		
	}
	
	//Removes our middle integer by setting it to null
	void removeMiddle() {  
		Node prev; 
		Node curr; 
		System.out.print("\n\nRemoving middle integer...");
		if ( elements % 2 == 0 )
			count = elements/2;
		else count=(elements+1)/2;  
		prev = front;  
		curr = null;  
			for(int i = 0; i < count-1; i++){  
				curr = prev;  
				prev = prev.next;  
			}  
		if(curr != null) {  
		curr.next = prev.next;    
		prev = null;  
		}   
	}  
}
