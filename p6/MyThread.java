package p6;

public class MyThread extends Thread{
	private int ticket=50;
public void run() {
	while(true) {
		if(ticket>0) {
			Thread th=Thread.currentThread();//获取当前线程
			String th_name=th.getName();//获取当前线程的名字
			System.out.println(th_name+"正在发第"+ticket--+"票");
		}
	}
}
}
