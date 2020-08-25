
public class ArrayQ {
	int stack[]=new int[6];	
	int front=0;
	int rear=0;
	int size = 0;
	
	//Shows our elements in our array stack
	public void show() {
		System.out.print("Queued stack elements: ");
		for (int i=0;i<size;i++) {
			System.out.print(stack[front+i] + " ");
		}
	}
	
	//Adds a number to the back of the queue
	public void enqueue(int numEnqueue) {
		stack[rear] = numEnqueue;
		rear = rear + 1;
		size = size + 1;		
	}
	
	//removes a number from front of queue
	public void dequeue() {
		for(int i=0;i<stack.length;i++) {
		int numEnqueue=stack[front];
		front=front+1;
		size--;
		System.out.print("\nDequeueing: "+numEnqueue);
		}	
	}

}
