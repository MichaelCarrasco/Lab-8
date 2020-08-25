
public class Driver {

	public static void main(String[] args) {
		ArrayQ stack=new ArrayQ();
		stack.enqueue(1);
		stack.enqueue(7);
		stack.enqueue(3);
		stack.enqueue(4);
		stack.enqueue(9);
		stack.enqueue(2);
		stack.show();
		stack.dequeue();


		LinkedQueue link=new LinkedQueue();
		link.enqueue(1);
		link.enqueue(7);
		link.enqueue(3);
		link.enqueue(4);
		link.enqueue(9);
		link.enqueue(2);
		link.show();
		link.dequeue();
		

		link.enqueue(1);
		link.enqueue(7);
		link.enqueue(3);
		link.enqueue(4);
		link.enqueue(9);
		link.enqueue(2);
		link.removeMiddle();
		link.show();

	}

	

}