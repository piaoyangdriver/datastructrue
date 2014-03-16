package list.queue;

/**
 * 队列的接口
 * @author hp
 *
 */
public interface QQueue<E> {
	
	boolean isEmpty();
	
	boolean enqueue(E element);

	E dequeue();
}
