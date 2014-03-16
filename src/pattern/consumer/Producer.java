package pattern.consumer;

/**
 * 生产者
 * @author hp
 *
 */
public class Producer extends Thread {
	
	private int neednum;//生产的数量
	
	private Godown godown;//仓库
	
	public Producer(int neednum, Godown godown) {
		super();
		this.neednum = neednum;
		this.godown = godown;
	}

	public void run(){
		godown.produce(neednum);
	}

}
