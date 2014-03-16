package list.queue;

import list.Node;

/**
 * 链式队列
 * 
 * @author hp
 * @param <E>
 * 
 */
public class LinkedQueue<E> implements QQueue<E> {

	private Node<E> front;

	private Node<E> rear;

	/**
	 * 构造空队列
	 */
	public LinkedQueue() {
		this.front = this.rear = null;
	}

	@Override
	public boolean isEmpty() {
		return this.front == null && this.rear == null;
	}

	@Override
	public boolean enqueue(E element) {
		if (element == null) {
			return false;
		}
		Node<E> node = new Node<E>(element);
		if (!isEmpty()) {
			this.rear.next = node;

		} else {
			this.front = node;
		}
		this.rear = node;
		return true;
	}

	@Override
	public E dequeue() {
		if(!isEmpty()){
			E data = this.front.data;
			this.front = this.front.next;
			if(this.front == null){
				this.rear = null;
			}			
			return data;
		}
		return null;
	}

}
