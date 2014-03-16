/**
 * 
 */
package list;

/**
 * @author hp
 *单链表的节点类
 */
public class Node<E> {
	
	public E data;
	
	public Node<E> next;
	
	public Node(E data, Node<E> next){//构造节点
		this.next = next;
		this.data = data;
	}
	
	public Node(E data){
		this(data, null);
	}
	
	public Node(){
		this(null, null);
	}

}
