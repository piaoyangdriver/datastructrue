/**
 * 
 */
package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author hp
 *二叉树类
 *构造一个根节点,对根节点进行操作
 */
public class BinaryTree<E> {
	
	public BinaryNode<E> root;//根节点
	
	/**
	 * 构造空二叉树
	 */
	public BinaryTree(){
		this.root = null;
	}
	
	public BinaryTree(BinaryNode<E> root){
		this.root = root;
	}
	
	/**
	 * 构造二叉树，构造二叉树,只需要返回根节点就可
	 * @param preorder
	 */
	public BinaryTree(E[] preorder){
		root = create(preorder);
	}
	
	private int i = 0;
	private BinaryNode<E> create(E[] preorder) {
		BinaryNode<E> p = null;
		if(i < preorder.length){
			E element = preorder[i];
			i++;
			if(element != null){
				p = new BinaryNode<E>(element);
				p.left = create(preorder);
				p.right = create(preorder);
			}
		}
		return p;
	}

	/*private int i = 0;//对于creat方法是全局变量
	private BinaryNode<E> creat(E[] preorder) {
		BinaryNode<E> p = null;
		if(i < preorder.length){
			E elem = preorder[i];
			i++;
			if(elem != null){
				p = new BinaryNode<E>(elem);//建立p节点
				p.left = creat(preorder);
				p.right = creat(preorder);
			}
		}
		return p;
	}*/

	public boolean isEmpty(){
		return this.root == null;
	}
	
	public BinaryNode<E> getRoot(){
		return this.root;
	}
	
	//先
	public void preOrder(){
		preOrder(this.root);
	}	
	private void preOrder(BinaryNode<E> node){
		if(node != null){
			System.out.print(node.data + " ");//遍历节点做的事情
			preOrder(node.left);
			preOrder(node.right);			
		}
	}
	
	//中
	public void inOrder(){
		inOrder(this.root);
	}
	private void inOrder(BinaryNode<E> node){
		if(node != null){
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}
	
	//后
	public void postOrder(){
		postOrder(this.root);
	}
	private void postOrder(BinaryNode<E> node){
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	//得到二叉树节点的个数
	public int getCountNode(){		
		return this.getCountNode(root);
	}
	private int getCountNode(BinaryNode<E> node){
		int count = 0;
		if(node != null){
			count = count + 1;
			int leftCount = getCountNode(node.left);
			int rightCount = getCountNode(node.right);
			count = count + leftCount + rightCount;
		}
		return count;
	}
	
	//查找value 为key 的节点
	public BinaryNode<E> search(E key){
		return this.search(key, root);
	}
	private BinaryNode<E> search(E key, BinaryNode<E> node){
		BinaryNode<E> find = null;
		if(node != null && key != null){
			if(node.data.equals(key)){
				find = node;
			}else{
				find = search(key, node.left);
				if(find == null){
					find = search(key, node.right);
				}
			}
		}
		return find;
	}
	
	//获得node节点的父母节点,就是看p的孩子是不是node, 注意递归
	public BinaryNode<E> getParentNode(BinaryNode<E> node){
		return this.getParentNode(root, node);
	}
	private BinaryNode<E> getParentNode(BinaryNode<E> p, BinaryNode<E> node){
		BinaryNode<E> find = null;
		if(p != null){
			if(p.left == node || p.right == node){
				find = p;
			}else{
				find = getParentNode(p.left, node);
				if(find == null){
					find = getParentNode(p.right, node);
				}
			}
		}
		return find;
	}
	
	
	
	//在而插入数中,p节点后插入一个元素为element的的节点,leftChild默认为true;
	public void insert(BinaryNode<E> p, E element, boolean leftChild){
		if(p != null){
			if(leftChild){
				p.left = new BinaryNode<E>(element, p.left, null);
			}else{
				p.right = new BinaryNode<E>(element, null, p.right);
			}
		}
	}
	public void insert(BinaryNode<E> p, E element){
		this.insert(p, element, true);
	}
	
	//删除一颗子树
	public void remove(BinaryNode<E> p, boolean leftChild){
		if(p != null){
			if(leftChild){
				p.left = null;
			}else{
				p.right = null;
			}
		}
	}
	
	public void remove(BinaryNode<E> p){
		this.remove(p, true);
	}
	
	
	//二叉树遍历的中序列非递归算法,需要用到栈(先进后出)
	/**
	 * 如果不为空,表示刚刚达到一个结点,将p结点入栈,进入左子树
	 * 如果p为空并且栈不为空,表示已经走出一条路径,此刻必须返回
	 * 寻找另外一条路径。而返回的结点就是刚刚入栈的结点,它已保存
	 * 在栈顶,所以由p指向栈的结点,访问p结点,再进入p的右子树
	 */
	public void inorderThraverse(){
		Stack<BinaryNode<E>> stack = new Stack<BinaryNode<E>>();
		BinaryNode<E> p = this.root;
		while(p != null || !stack.isEmpty()){
			if(p != null){
				stack.push(p);
				p = p.left;
			}else{
				p = stack.pop();
				System.out.print(" " + p.data);
				p = p.right;
			}
			System.out.println();
		}
	}
	
	//二叉树的层次遍历
	/**
	 * 访问p结点,将p结点的左右孩子存到队列中(如果有)
	 * 由p指向队列的结点,继续直到队列为空
	 */
	public void levelOrder(){
		Queue<BinaryNode<E>> que = new LinkedList<BinaryNode<E>>();
		BinaryNode<E> p = this.root;
		while(p != null){
			System.out.println(" " + p.data);
			if(p.left != null){
				que.add(p.left);
			}
			if(p.right != null){
				que.add(p.right);
			}
			p = que.poll();//p指向出对的结点
		}
		System.out.println();
	}
	
}
