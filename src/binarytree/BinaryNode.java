/**
 * 
 */
package binarytree;

/**
 * @author hp
 * 二叉链表节点
 * 包括：数据域,左子树,右子书
 *
 */
public class BinaryNode<E> {
	
	public E data;
	
	public BinaryNode<E> left;
	
	public BinaryNode<E> right;
	
	/**
	 * 构造节点，指定元素的左节点和右节点
	 * @param data
	 * @param left
	 * @param right
	 */
	public BinaryNode(E data, BinaryNode<E> left, BinaryNode<E> right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * 构造有值的叶子节点
	 * @param data
	 */
	public BinaryNode(E data){
		this(data,null,null);
	}
	
	public BinaryNode(){
		this(null,null,null);
	}
	
	/**
	 * 记住当前的对象就是一个节点
	 * @return
	 */
	public boolean isLeaf(){
		return this.left == null && this.right == null;
	}
	
	public String toString(){
		return this.data.toString();
	}
	
	
}
