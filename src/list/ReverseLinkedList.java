package list;

/**
 * 单链表的反转
 * @author hp
 *
 * @param <E>
 */
public class ReverseLinkedList<E> extends SinglyLinkedList<E> {
	
	public ReverseLinkedList(){
		super();
	}
	
	public void reverse(){
		Node<E> p = this.head;
		Node<E> front = null;
		Node<E> q = null;
		while(p != null){
			q = p.next;//设置q是p的后置节点 
			p.next = front;//使p.next指向p节点的前驱节点
			
			//front和p向后移动
			front = p;
			p = q;
		}
		this.head = front;
	}

	public static void main(String[] args){
		Node<Integer> one = new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3, new Node<Integer>(4,null))));
		SinglyLinkedList<Integer> sl = new SinglyLinkedList<Integer>(one);
		System.out.print(sl.toString());
		sl.reverse();
		System.out.print(sl.toString());
	}
}
