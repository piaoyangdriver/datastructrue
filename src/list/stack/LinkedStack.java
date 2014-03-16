package list.stack;

import list.Node;

/**
 * 链式栈有个栈顶节点
 * @author hp
 *
 * @param <E>
 */
public class LinkedStack<E> implements SStack<E> {
	
	private Node<E> top;//指向头节点
	
	public LinkedStack(){
		this.top = null;
	}

	@Override
	public boolean isEmpty() {
		return this.top == null;
	}

	@Override
	public boolean push(E data) {
		if(data == null){
			return false;
		}
		Node<E> node = new Node(data, top);
		this.top = node;
		return true;
	}

	@Override
	public E pop() {
		if(isEmpty()){
			E temp = this.top.data;
			this.top = this.top.next;
			return temp;
		}
		return null;
	}

	@Override
	public E get() {
		if(!isEmpty()){
			return this.top.data;
		}
		return null;
	}

}
