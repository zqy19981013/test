package p6;

public class MyThread extends Thread{
	private int ticket=50;
public void run() {
	while(true) {
		if(ticket>0) {
			Thread th=Thread.currentThread();//��ȡ��ǰ�߳�
			String th_name=th.getName();//��ȡ��ǰ�̵߳�����
			System.out.println(th_name+"���ڷ���"+ticket--+"Ʊ");
		}
	}
}
}
