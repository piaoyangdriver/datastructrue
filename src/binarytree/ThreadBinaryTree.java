/**
 * 
 */
package binarytree;

/**
 * @author hp 线索二叉树类
 * 
 */
public class ThreadBinaryTree<E> {

	public ThreadBinaryNode<E> root;

	// 构造根节点
	public ThreadBinaryTree(ThreadBinaryNode<E> p) {
		this.root = p;
	}

	public ThreadBinaryTree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public ThreadBinaryNode<E> getRoot() {
		return this.root;
	}

	// 构造二叉树,只需要返回根节点就可
	public ThreadBinaryTree(E[] preorder) {
		this.root = create(preorder);
		inorderThread(root);
	}

	private int i = 0;

	private ThreadBinaryNode<E> create(E[] preorder) {
		ThreadBinaryNode<E> p = null;
		if (i < preorder.length) {
			E elem = preorder[i];
			i++;
			if (elem != null) {
				p = new ThreadBinaryNode<E>(elem);
				p.left = create(preorder);
				p.right = create(preorder);
			}
		}
		return p;
	}
	
	//中序线索话以p节点为根的子树,p的前驱节点是front
	ThreadBinaryNode<E> front = null;
	private void inorderThread(ThreadBinaryNode<E> p){
		if(p != null){
			inorderThread(p.left);
			
			if(p.left == null){
				p.ltag = 1;
				p.left = front;
			}
			if(p.right == null){
				p.rtag = 1;
			}
			if(front != null && front.rtag == 1){
				front.right = p;
			}
			front = p;
			
			inorderThread(p.right);
		}
	}
}
