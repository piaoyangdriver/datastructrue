/**
 * 
 */
package binarytree;

/**
 * @author hp
 *线索二叉树节点类
 */
public class ThreadBinaryNode<E> {
	
	public E data;
	
	public ThreadBinaryNode<E> left;
	
	public ThreadBinaryNode<E> right;
	
	public int ltag;
	
	public int rtag;

	public ThreadBinaryNode(E data, ThreadBinaryNode<E> left,
			ThreadBinaryNode<E> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
		this.ltag = 0;
		this.rtag = 0;
	}
	
	//构造有值节点
	public ThreadBinaryNode(E data){
		this(data, null, null);
	}
	
	public ThreadBinaryNode(){
		this(null, null, null);
	}

}
