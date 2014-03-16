package list.stack;

/**
 * 顺序栈,top为栈顶元素的下标
 * @author hp
 *
 * @param <E>
 */
public class SeqStack<E> implements SStack<E> {
	
	private Object[] value;
	
	private int top;
	
	public SeqStack(int capacity){
		this.value = new Object[Math.abs(capacity)];
		this.top = -1;
	}

	public SeqStack(){
		this(10);
	}
	
	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}

	@Override
	public boolean push(E data) {
		if(data == null){
			return false;
		}
		if(this.top == this.value.length - 1){
			Object[] temp = this.value;
			this.value = new Object[temp.length*2];
			for(int i = 0; i<temp.length; i++){
				this.value[i] = temp[i];
			}
		}
		this.top++;
		this.value[top] = data;
		return true;
	}

	@Override
	public E pop() {
		if(!isEmpty()){
			return (E)this.value[this.top--];
		}else{
			return null;
		}
	}

	@Override
	public E get() {
		if(!isEmpty()){
			return (E) this.value[this.top];
		}else{
			return null;
		}
	}

}
