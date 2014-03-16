package list;

import java.util.Iterator;

/**
 * 单链表类
 * 
 * @author hp
 * 
 * @param <E>
 */
public class SinglyLinkedList<E> {

	/**
	 * 单链表提供迭代器对象
	 * @return
	 */
	public Iterator<E> iterator() {
		return new Itr();
	}

	private class Itr implements Iterator<E> {
		private Node<E> cursor = head;

		public boolean hasNext() {
			return cursor != null && cursor.next != null;
		}

		public E next() {
			if (cursor != null && cursor.next != null) {
				E e = cursor.next.data;
				cursor = cursor.next;
				return e;
			}
			return null;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	protected Node<E> head;// 头指针

	public SinglyLinkedList() {
		//this.head = new Node<E>(null, null);
		this.head = null;
	}

	public SinglyLinkedList(Node<E> head) {// 构造指定头指针的单链表
		this.head = head;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public int length() {
		int count = 0;
		Node<E> p = this.head;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}

	// 递归的toString()算法
	public String toString(Node<E> p) {
		if (p != null) {
			return p.data.toString() + "," + this.toString(p.next);
		}
		return "";
	}

	public String toString(){
		StringBuffer sb  = new StringBuffer();
		Node<E> p = this.head;
		while(p != null){
			sb.append(p.data.toString() + " ");
			p = p.next;
		}
		return sb.toString();
	}
	
	public void reverse(){
		Node<E> p1 = this.head;
		Node<E> p2 = p1.next;
		Node<E> p3 = null;
		while(p2 != null){
			p3 = p2.next;
			p2.next = p1;
			
			//向后移动
			p1 = p2;
			p2 = p3;
		}
		this.head.next = null;
		head = p1;
	}
}