package pattern.consumer;

/**
 * 仓库
 * 
 * @author hp
 * 
 */
public class Godown {

	public static final int max_size = 100;

	public int curnum;// 当前库存

	Godown() {
	}

	Godown(int curnum) {
		this.curnum = curnum;
	}

	public synchronized void produce(int neednum) {
		while (neednum + curnum > max_size) {
			try {
				System.out.println("要生产的产品数量" + neednum + "超过剩余库存量"
						+ (max_size - curnum) + "，暂时不能执行生产任务!");
				wait();// 让当前访问该对象的生产线程释放锁,等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		 //满足生产条件，则进行生产，这里简单的更改当前库存量 
        curnum += neednum; 
        System.out.println("已经生产了" + neednum + "个产品，现仓储量为" + curnum); 
        //唤醒在此对象监视器上等待的所有线程 
        notifyAll(); 
	}

	public synchronized void consume(int neednum) {
		while(neednum > curnum){
			try {
				wait();				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		 //满足消费条件，则进行消费，这里简单的更改当前库存量 
        curnum -= neednum; 
        System.out.println("已经消费了" + neednum + "个产品，现仓储量为" + curnum); 
        //唤醒在此对象监视器上等待的所有线程 
        notifyAll(); 
	}

}
